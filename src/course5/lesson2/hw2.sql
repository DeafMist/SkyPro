INSERT INTO employee (first_name, last_name, gender, age) VALUES
                                                              ('Peter', 'Krasnov', 'man', 39),
                                                              ('Faina', 'Fadina', 'woman', 24),
                                                              ('Ylya', 'Dubrova', 'woman', 47);
SELECT first_name AS Имя, last_name AS Фамилия FROM employee;
SELECT * FROM employee WHERE age < 30 or age > 50;
SELECT * FROM employee WHERE age BETWEEN 30 AND 50;
SELECT * FROM employee ORDER BY last_name DESC;
SELECT * FROM employee WHERE first_name LIKE '_____%';


UPDATE employee SET first_name = 'Faina' WHERE first_name = 'Ylya';
UPDATE employee SET first_name = 'Vlad' WHERE first_name = 'Peter';
SELECT first_name, SUM(age) FROM employee GROUP BY first_name;
SELECT first_name, age FROM employee WHERE age = (SELECT MIN(age) FROM employee);
SELECT first_name, MAX(age) FROM employee
                            GROUP BY first_name
                            HAVING COUNT(first_name) > 1
                            ORDER BY MAX(age);