SELECT sp.name 
FROM SalesPerson sp
WHERE sp.sales_id NOT IN (
    SELECT o.sales_id FROM orders o
    JOIN company c ON c.com_id = o.com_id
    WHERE c.name = 'RED'
)
