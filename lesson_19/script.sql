-- 1. Liệt kê tất cả sách và tên nhà xuất bản của các quyển sách, sao cho quyển sách đó có ít nhất một hóa đơn mượn sách.
SELECT b.Book_Id,
       b.Type,
       b.Price,
       b.Title,
       pub.name AS publisher
FROM book b
         JOIN publisher pub ON pub.Pub_Id = b.Pub_Id
         JOIN book_invoice bi ON bi.Book_Id = b.Book_Id
GROUP BY b.Book_Id, b.Type, b.Price, b.Title, pub.name
HAVING COUNT(bi.invoice_no) > 0;

-- 2. Tính tổng số quyển sách mà mỗi nhà xuất bản đã xuất bản.
SELECT DISTINCT pub.Pub_Id,
                pub.Name,
                COUNT(b.Book_Id) AS tong_so_sach
FROM publisher pub
         JOIN book b ON b.Pub_Id = pub.Pub_Id
GROUP BY pub.Pub_Id, pub.Name;

-- 3. Liệt kê tên sách và tên nhà xuất bản của sách có giá lớn hơn giá trung bình của tất cả quyển sách.
SELECT b.Title,
       pub.Name
FROM book b
         JOIN publisher pub ON pub.Pub_Id = b.Pub_Id
WHERE b.Price > (SELECT AVG(Price)
                 FROM book);

-- 4. Liệt kê thông tin của tất cả các thành viên và số lượng quyển sách mà họ đã mượn
SELECT m.*,
       COUNT(bi.Invoice_No) AS total_book_borrowed
FROM member m
         LEFT JOIN book_invoice bi ON bi.CardNo = m.CardNo
GROUP BY m.CardNo;

-- 5. Liệt kê tên sách và tên nhà xuất bản của quyển sách có giá cao nhất và giá thấp nhất.
SELECT b.Book_Id,
       b.Title,
       b.Type,
       pub.name AS publisher,
       b.Price
FROM book b
         LEFT JOIN publisher pub ON pub.Pub_Id = b.Pub_Id
WHERE b.Price = (SELECT MAX(Price)
                 FROM book)
   OR b.Price = (SELECT MIN(Price)
                 FROM book);

-- 6. Đếm tổng số các quyển sách mà các nhà xuất bản đã xuất bản
SELECT pub.Pub_Id,
       pub.Name,
       COUNT(b.Book_Id) AS total_book
FROM publisher pub
         LEFT JOIN book b ON b.Pub_Id = pub.Pub_Id
GROUP BY pub.Pub_Id, pub.Name;

-- 7. Liệt kê tên sách và tên nhà xuất bản của sách, sao cho sách đó có ít nhất một hóa đơn mượn và hóa đơn đó không bị trễ hạn.
SELECT DISTINCT b.Book_Id,
                b.Title,
                b.Type,
                b.Price,
                p.Name AS publisher
FROM Book b
         JOIN Publisher p ON b.Pub_Id = p.Pub_Id
         JOIN Book_Invoice bi ON b.Book_Id = bi.Book_Id
WHERE bi.Penalty = 0
ORDER BY b.Book_Id;

-- 8. Liệt kê tất cả thông tin của các thành viên mà đã mượn sách và số lượng sách mà họ đã mượn, sắp xếp theo số lượng sách giảm dần.
SELECT m.*,
       COUNT(bi.Invoice_No) AS num_borrow
FROM member m
         JOIN book_invoice bi ON bi.CardNo = m.CardNo
GROUP BY m.CardNo
ORDER BY num_borrow DESC;

-- 9. Tính tổng số quyển sách mà mỗi nhà xuất bản đã xuất bản, kết quả chỉ bao gồm những nhà xuất bản đã xuất bản ít nhất hai sách.
SELECT pub.Pub_Id,
       pub.Name,
       COUNT(b.Book_Id) AS num_publish
FROM publisher pub
         JOIN book b ON b.Pub_Id = pub.Pub_Id
GROUP BY pub.Pub_Id, pub.Name
HAVING num_publish >= 2;

-- 10. Liệt kê tất cả thông tin của các thành viên mà đã mượn sách loại 'crime story' và số lượng sách mà họ đã mượn ít nhất là quyển.
SELECT m.*,
       b.Type           AS book_type,
       COUNT(b.Book_Id) AS num_borrow
FROM member m
         JOIN book_invoice bi ON bi.CardNo = m.CardNo
         JOIN book b ON b.Book_Id = bi.Book_Id
WHERE b.Type = 'crime story'
GROUP BY m.CardNo
HAVING num_borrow >= 1;

-- 11. Liệt kê tên sách và ngày mượn của sách có hóa đơn mượn nhưng chưa được trả và số lượng ngày quá hạn (số ngày giữa Due_Date và ngày hiện tại).
SELECT b.Title,
       bi.Date_out,
       DATEDIFF(CURRENT_DATE, bi.Due_Date) AS overdue_days
FROM book b
         JOIN book_invoice bi ON bi.Book_Id = b.Book_Id
WHERE bi.Date_out IS NOT NULL
  AND bi.Due_Date < CURRENT_DATE;

-- 12. Liệt kê tên sách và tên nhà xuất bản của sách có hóa đơn mượn nhưng chưa được trả và số lượng ngày quá hạn lớn hơn 7.
SELECT b.Title,
       pub.Name AS publisher
FROM book b
         JOIN book_invoice bi ON bi.Book_Id = b.Book_Id
         JOIN publisher pub ON pub.Pub_Id = b.Pub_Id
WHERE bi.Due_Date < CURRENT_DATE
  AND DATEDIFF(CURRENT_DATE, bi.Due_Date) > 7;


-- 13. Đếm xem ngày hôm nay mỗi nhân viên có bao nhiêu hóa đơn.
SELECT e.Emp_Id,
       e.Name,
       COUNT(bi.Invoice_No) AS num_invoice
FROM employee e
         JOIN book_invoice bi ON bi.Emp_Id = e.Emp_Id
WHERE DATE(bi.Date_Out) = CURRENT_DATE
GROUP BY e.Emp_Id, e.Name;

-- 14. Liệt kê tên sách và số lượng quyển sách mà sách đó có ít nhất một hóa đơn mượn và được xuất bản trong thành phố 'Hanoi'.
SELECT b.Title,
       COUNT(bi.Invoice_No) AS num_borrow
FROM book b
         JOIN book_invoice bi ON bi.Book_Id = b.Book_Id
         JOIN publisher pub ON pub.Pub_Id = b.Pub_Id
WHERE pub.City = 'Hanoi'
GROUP BY b.Title;

-- 15. Liệt kê tên sách và giá của quyển sách có giá thấp hơn giá trung bình của tất cả quyển sách và được xuất bản trong thành phố 'Hanoi'.
SELECT b.Title,
       b.Price
FROM book b
         JOIN publisher pub ON pub.Pub_Id = b.Pub_Id
WHERE b.Price < (SELECT AVG(book.Price)
                 FROM book)
  AND pub.City = 'Hanoi';