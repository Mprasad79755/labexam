Question: CRUD OPERATIONS IN SQL 

How to Run:-

*IN ECLIPSE
1. Open ECLIPSE
2. File->Open project from file->Directory->Select Project
3. Select maven and Add project to working Set 
4. Wait for few minutes [Everything needs to download]
5. open src/main/java -> CrudApplication 
6. Right Click -> Run as -> Java Application
7. Check for error, if not found
8. open chrome
9. Type localhost:8080

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

Postman
1. open Postman

//get all records 
method: get 
url:  localhost:8080
SEND 

//Get only one record 
method: get 
url:  localhost:8080/id 
SEND 

//Update record
method: put 
url:  localhost:8080/id
Body: {
        "id": "5",
        "name": ashok,
        "email": "ashok@gmail.com"
    }, 
SEND 

//Delete record
method: delete 
url:  localhost:8080/id
SEND 

//Adding
method: post 
url:  localhost:8080
body: {
        "id": "5",
        "name": manoj,
        "email": "ashok@gmail.com"
    }, 
SEND 