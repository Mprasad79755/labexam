Question: CRUD OPERATIONS IN SQL 

How to Run:-

*IN ECLIPSE
1. Open ECLIPSE
2. File->Open project from file->Directory->Select Project
3. Select maven and Add project to working Set 
4. Wait for few minutes [Everything needs to download]
5. open src/java/Test -> JunitTestApplication 
6. Right Click -> Run as -> Junit Test
7. Check for error, if not found

Configuration:- 
1.open SQL WORKBENCH
2. Connect 

//Create New database
//Copy the commands paste in mysql workbench -> select -> Ctrl+enter

3. create database demodb;

//Select database
4. USE  demodb;

//Create TABLE
5. CREATE TABLE Student (
    id INT  PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL
);

//Display all records
6. SELECT * FROM Student;

//Insert records 
7. INSERT INTO Student (id, name, email) VALUES
(1, 'Aarav Patel', 'aarav.patel@example.com')


//in ECLIPSE
3. open src/main/resources -> Application.properties
4. Change database name,username,password
7. Save  
