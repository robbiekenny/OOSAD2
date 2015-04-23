use test;
DROP TABLE IF EXISTS Employee;
DROP TABLE IF EXISTS Sales;
CREATE TABLE Employee (ID int(11) NOT NULL AUTO_INCREMENT, Name varchar(255), Address varchar(255), Pps varchar(255), Mobile varchar(255), Salary double NOT NULL, YearsExperience int(11) NOT NULL, PRIMARY KEY (ID));
CREATE TABLE Sales (ID int(11) NOT NULL AUTO_INCREMENT, NumSales int(11) NOT NULL, Profit double NOT NULL, Expenses double NOT NULL, PRIMARY KEY (ID));
