SELECT * FROM kh.employee;

SELECT * FROM employee_copy;

CREATE TABLE employee_copy
SELECT * FROM employee;

INSERT INTO employee_copy(emp_id, emp_name, emp_no)
VALUES ("900", "테스트", 000000-0000000);

UPDATE employee_copy
SET emp_name = "테스트 02"
WHERE emp_id = 900;

SET AUTOCOMMIT = 1;

DELETE FROM employee_copy WHERE emp_id = 700;

SET AUTOCOMMIT = 1;

DELETE FROM employee_copy WHERE emp_id = 900;


CREATE TABLE person(
id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(20),
address VARCHAR(30)
);

INSERT INTO person VALUES(999, 'name', 'address');

SELECT * FROM person;

UPDATE person SET address='충청도' WHERE id = 999;

DELETE FROM person WHERE id = 333;

SELECT * FROM person WHERE id = 111;

CREATE TABLE member(
id VARCHAR(20) PRIMARY KEY,
password VARCHAR(20),
name VARCHAR(20)
);

SELECT * FROM member;