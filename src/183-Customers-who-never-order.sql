SELECT c.name AS Customers
FROM customers c
LEFT JOIN orders o
ON o.customerId = c.id
WHERE o.customerId IS NULL
