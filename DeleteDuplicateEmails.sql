# Please write a DELETE statement and DO NOT write a SELECT statement.
# Write your MySQL query statement below

#196

DELETE t1 FROM Person t1
INNER JOIN Person t2 
WHERE t1.email = t2.email AND t1.id > t2.id;