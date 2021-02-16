select * from employees; --fetch the whole data from "employees" table 

select * from HR.employees; --Another method to fetch the whole data, but schema name can be skipped.

select * from employees where employee_id >= 120 and employee_id < 130; -- "where" clause is used to specify a condition

select * from employees where salary > 20000 or salary < 3000; 

select * from employees where salary between 3000 and 5000;

select * from employees where first_name like '%a%' order by salary desc, employee_id desc; --fetch the data including the letter 'a' in first name and sorted in descending order by salary and employee ID. 

select distinct hire_date from employees; --fetch the data of hire date in the condition of "distinct" which makes no overlap.

select hire_date from employees; --fetch the data of hire date including overlap.

select * from employees where first_name = 'Adam'; --fetch all employees whose first name is "Adam".

Select department_name, department_id FROM departments; --You can also fetch multiple columns.

/* 
output will be generated in order of column.
The enummeration of column can be used by a comma.
*/