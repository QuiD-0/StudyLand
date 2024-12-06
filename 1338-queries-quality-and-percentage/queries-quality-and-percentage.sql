# Write your MySQL query statement below
select 
query_name, 
round(sum(rating / position) / count(1),2) as quality, 
round(sum(if(rating >= 3,0,100))/count(1) ,2) as poor_query_percentage from Queries
where query_name is not null
group by query_name