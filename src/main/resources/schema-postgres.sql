DROP TABLE IF EXISTS student;
DROP TABLE IF EXISTS account;
CREATE TABLE student(id serial PRIMARY KEY, name VARCHAR(255));

CREATE TABLE account(id serial PRIMARY KEY, name VARCHAR(255), account_number VARCHAR(255), uuid VARCHAR(255));