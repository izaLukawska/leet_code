--https://leetcode.com/problems/employees-earning-more-than-their-managers/description/
SELECT e.name AS Employee FROM Employee e LEFT JOIN Employee m ON m.id = e.managerId WHERE e.salary > m.salary;
