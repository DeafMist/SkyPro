CREATE TABLE city(
    city_id BIGSERIAL NOT NULL PRIMARY KEY,
    city_name VARCHAR(60) NOT NULL

);
ALTER TABLE employee ADD COLUMN city_id INT;
ALTER TABLE employee ADD FOREIGN KEY (city_id) REFERENCES city(city_id);
INSERT INTO city(city_name) VALUES ('Moscow'), ('Saint-Petersburg'), ('Kaliningrad'), ('Sochi');
UPDATE employee SET city_id = 1 WHERE id = 5 OR id = 1;
UPDATE employee SET city_id = 3 WHERE id = 3;
UPDATE employee SET city_id = 4 WHERE id = 4 OR id = 6;


SELECT first_name, last_name, city_name FROM employee JOIN city ON employee.city_id = city.city_id;
SELECT city_name, first_name, last_name FROM employee RIGHT JOIN city ON employee.city_id = city.city_id;
SELECT first_name, last_name, city_name FROM employee FULL JOIN city ON employee.city_id = city.city_id;
SELECT first_name, last_name, city_name FROM employee CROSS JOIN city;