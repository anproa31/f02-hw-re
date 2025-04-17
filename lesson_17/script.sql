SELECT *
FROM products
WHERE category IN ('BOOKS', 'ELECTRONICS', 'OTHERS');

SELECT *
FROM users
WHERE fullname LIKE 'a%';


SELECT COUNT(*) AS active_user_count
FROM users
WHERE status = 'ACTIVE';

SELECT COUNT(*) AS out_of_stock_products
FROM products
WHERE stock <= 0;


SELECT *
FROM products
ORDER BY price DESC
LIMIT 10;

