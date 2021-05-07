DROP TABLE IF EXISTS student;
--DROP TABLE IF EXISTS account;
DROP TABLE IF EXISTS contact;
CREATE TABLE student(id serial PRIMARY KEY, name VARCHAR(255));
--CREATE TABLE account(id serial PRIMARY KEY, uuid VARCHAR(255), name VARCHAR(255), account_number VARCHAR(255));
CREATE TABLE contact(id serial PRIMARY KEY, uuid VARCHAR(255), name VARCHAR(255), lastname VARCHAR(255), linenumber VARCHAR(255), address VARCHAR(255), city VARCHAR(255));