CREATE TABLE emp (empid INTEGER NOT NULL PRIMARY KEY, empname TEXT NOT NULL, email NOT NULL);
INSERT INTO emp (empid, empname, email)
VALUES (1, "Sam", "test1@test.com");
SELECT * From emp;