## Simple SpringBoot REST application with using MongoDB

---
### To run the application locally you need:
1. [Download](https://www.mongodb.com/try/download/community) and install MongoDB.
2. Run MongoDB server.
3. Import [data](src/main/resources/mongodb_dump/student.json) to your local MongoDB.
4. Run the application from the [MongodbLearningApplication](src/main/java/com/dc14/mongodb_learning/MongodbLearningApplication.java) file.
5. Use Postman (or other tool for sending requests) to check how the [controller](src/main/java/com/dc14/controller/StudentController.java)'s endpoints work.