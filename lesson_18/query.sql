

-- 1. Tính tổng số tiền các sản phẩm user đã thêm vào giỏ hàng.
SELECT
    u.id AS user_id,
    u.fullname AS ten_nguoi_dung,
    SUM(p.price * ci.quantity) AS tong_tien_gio_hang
FROM
    users u
        JOIN carts c ON u.id = c.user_id
        JOIN cart_items ci ON c.id = ci.cart_id
        JOIN products p ON ci.product_id = p.id
GROUP BY
    u.id, u.fullname
ORDER BY
    u.id;

-- 2. Lấy ra danh sách người dùng đã từng có đơn hàng trên 50 nghìn.
SELECT DISTINCT
    u.id AS user_id,
    u.fullname AS ten_nguoi_dung,
    u.email
FROM
    users u
        JOIN orders o ON u.id = o.user_id
WHERE
    o.total_amount > 500000
ORDER BY
    u.id;

-- 3. Lấy ra danh sách các sản phẩm đã hết hàng ở trong kho.
SELECT
    id,
    name AS ten_san_pham,
    description AS mo_ta,
    stock AS so_luong_trong_kho,
    price AS gia_ban
FROM
    products
WHERE
    stock = 0 OR stock IS NULL
ORDER BY
    id;

-- 4. Lấy ra danh sách người dùng và số lượng mặt hàng người dùng đó đang có trong giỏ hàng.
SELECT
    u.id AS user_id,
    u.fullname AS ten_nguoi_dung,
    SUM(ci.quantity) AS so_luong_mat_hang
FROM
    users u
        JOIN carts c ON u.id = c.user_id
        LEFT JOIN cart_items ci ON c.id = ci.cart_id
GROUP BY
    u.id, u.fullname
ORDER BY
    u.id;

-- 5. Tính tổng số tiền lãi sẽ thu được nếu như bán hết các sản phẩm còn lại.
SELECT
    SUM((price - original_price) * stock) AS tong_lai_du_kien
FROM
    products
WHERE
    stock > 0;

