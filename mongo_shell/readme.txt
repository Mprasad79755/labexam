Question:- crud operation on document using mongo db 

1. Open mongoDBcompass
2. Connect 
3.Click "MONGOSH" in the bottom (Down)
4. Type the below commands and press enter 


// First Step 
use your_database_name 

//Create Collection/Tables 
db.createCollection("student")

//Adding single record
db.student.insertOne({"id" : 1 , "name" : "punith" , "sem" : 5 })

//Adding many records 
db.student.insertMany([{"id" : 1 , "name" : "punith" , "sem" : 5 } , {"id" : 3 , "name" : "ram" , "sem" : 8 } , {"id" : 21 , "name" : "krishna" , "sem" : 1 }])

//View all records
db.student.find()

//viewing  record by id 
db.student.find({"id" : 21})

db.student.find({"name" : "punith"})

//Updating record 
db.student.updateOne({"name" : "ram"} , {$set : {"name" : "madhu" , "sem" : 0}})

//Delete record by id 
db.student.deleteOne({"name" : "krishna"})

//Remove all document 
db.student.remove({})