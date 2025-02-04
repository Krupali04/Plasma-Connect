CREATE DATABASE AEDProject;
USE AEDProject;

CREATE TABLE doctor(
doc_id INT PRIMARY KEY
);

CREATE TABLE donor(
donor_id INT PRIMARY KEY,
name VARCHAR(255),
age INT,
gender VARCHAR(50),
bloodgroup varchar(50),
contact VARCHAR(50),
address VARCHAR(255)
);

CREATE TABLE hospital(
hos_id INT PRIMARY KEY
);

DROP TABLE hospital;

CREATE TABLE hospital(
hos_id INT PRIMARY KEY,
hos_name VARCHAR(255),
address VARCHAR(255),
zipcode CHAR(6),
mobile VARCHAR(10)
);


CREATE TABLE ngo(
ngo_id INT PRIMARY KEY,
ngo_name VARCHAR(255), 
address VARCHAR(255),
zipcode CHAR(6),
user_id INT,
contact VARCHAR(50)
);

CREATE TABLE plasmacenter(
pc_id INT PRIMARY KEY
);

DROP TABLE plasmacenter;

CREATE TABLE plasmaC(
pc_id  INT,
pc_name VARCHAR(255),
address VARCHAR(255),
mobile VARCHAR(10),
zipcode CHAR(6)
);

CREATE TABLE logins
(user_id INT,
 pass_word VARCHAR(255),
 role_id INT);
 
ALTER TABLE logins
MODIFY COLUMN user_id VARCHAR(255);


 CREATE TABLE vdonor (
    vdonor_id INT,
    user_id INT,
    vname VARCHAR(100),
    age INT,
    gender VARCHAR(10),
    contact VARCHAR(15),
    address VARCHAR(255),
    blood_group VARCHAR(5),
    ngo_id INT,
    email VARCHAR(255)
);

CREATE TABLE all_stock (
    pc_id INT NOT NULL, 
    vdonor_id INT NOT NULL, 
    quantity INT NOT NULL
);

ALTER TABLE all_stock
ADD COLUMN stock_id INT;

ALTER TABLE all_stock
ADD COLUMN date_donation DATE;

ALTER TABLE all_stock
MODIFY COLUMN date_donation DATE;

CREATE TABLE emphos
(emp_id INT,
 hos_id VARCHAR(255),
 employee_name VARCHAR(255),
 user_id VARCHAR(255));
 
 CREATE TABLE roles(
 role_id INT,
 role_name VARCHAR(255));

DROP TABLE plasmac;
INSERT INTO logins(user_id,pass_word,role_id)VALUES ('admin','admin123',1);
INSERT INTO logins(user_id,pass_word,role_id)VALUES ('hosadmin','hosadmin123',2);
SELECT * FROM emphos;
SELECT * FROM logins;
SELECT * FROM ngo;

CREATE TABLE doctors(
doc_id INT, 
doc_name VARCHAR(255), 
spec VARCHAR(255),
pager_id VARCHAR(255));

ALTER TABLE doctors
ADD COLUMN hos_id INT;

ALTER TABLE doctors
ADD COLUMN user_id INT;

CREATE TABLE patients
(pat_id INT,
pat_name VARCHAR(255),
age VARCHAR(20),
gender VARCHAR(20), 
doc_id INT,
address VARCHAR(255));

CREATE TABLE HPCRequest
(
request_id VARCHAR(255), 
pat_id INT,
qty VARCHAR(255), 
status VARCHAR(255), 
blood_group VARCHAR(20));

ALTER TABLE HPCRequest
MODIFY COLUMN qty INT;
SELECT * FROM doctors;

CREATE TABLE emppc(
emp_id INT,
pc_id INT,
employee_name VARCHAR(255),
 user_id INT);
 
 SELECT * FROM emppc;
  SELECT * FROM vdonor;
  
  SELECT * FROM plasmaC;
  
  DELETE FROM plasmaC WHERE pc_id=53;
   DELETE FROM plasmaC WHERE pc_id=96;