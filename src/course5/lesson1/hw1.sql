CREATE DATABASE skypro;
\c skypro


CREATE TABLE employee (
    id BIGSERIAL NOT NULL PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    gender VARCHAR(6) NOT NULL,
    age INT NOT NULL
);


INSERT INTO employee (first_name, last_name, gender, age) VALUES
                                                              ('Vlad', 'Dracula', 'man', 1087),
                                                              ('Tony', 'Stark', 'man', 31),
                                                              ('Anna', 'Karenina', 'woman', 25);
SELECT * FROM employee;
UPDATE employee SET (first_name, last_name, gender, age) = ('Magnus', 'Karlsen', 'man', 32)
                WHERE first_name = 'Anna';
SELECT * FROM employee;
DELETE FROM employee WHERE last_name = 'Stark';