select product_name, year, price 
from Sales right join Product on Sales.product_id = Product.product_id 
where Sales.product_id = Product.product_id 
