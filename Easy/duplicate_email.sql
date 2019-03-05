# Write your MySQL query statement below
select Email
from Person
group By Email
having count(Email) > 1; 