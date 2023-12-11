Question: CRUD OPERATIONS IN MONGO DB

How to Run:-

*IN ECLIPSE
1. Open ECLIPSE
2. File->Open project from file->Directory->Select Project
3. Select maven and Add project to working Set 
4. Wait for few minutes [Everything needs to download]
5. open src/main/java -> MongoCrudApplication 
6. Right Click -> Run as -> Java Application
7. Check for error, if not found
8. open chrome
9. Type localhost:8080

Configuration:- 
1.open mongodb
2.create new database and collection
//in ECLIPSE
3. open src/main/resources -> Application.properties
4. Change database name at end of url  
5.open src/main/java -> Product.java 
6. Change Collection name 
7. Save both files   

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
        "id": "6560505f82c87c58c3382f7d",
        "product_name": iphone,
        "product_price": 12000
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
        "id": "6560505f82c87c58c3382f7d",
        "product_name": iphone,
        "product_price": 12000
    },
SEND 