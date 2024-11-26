# Write your MySQL query statement below
select product_name , year , price from sales join product using (product_id) where product_name is not null