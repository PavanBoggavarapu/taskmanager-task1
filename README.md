\# Task Manager Backend - Task 1 



This repository contains the \*\*Java Spring Boot backend\*\* for the Task Manager application.  

The application provides REST APIs to \*\*create, get, search, and delete tasks\*\* stored in MongoDB.  



---



\## 🛠️ Prerequisites



\- Java 20

\- Maven

\- MongoDB running on `localhost:27017`

\- Git (for version control)

\- cURL or Postman (to test APIs)



---



\## 🚀 How to Run



1\. Clone the repository:

```bash

git clone https://github.com/PavanBoggavarapu/taskmanager-task1.git

cd taskmanager-task1

Build the project using Maven:



bash

Copy code

mvn clean install

Run the Spring Boot application:



bash

Copy code

mvn spring-boot:run

The server will start on http://127.0.0.1:8080.



📦 API Endpoints

1️⃣ Create a Task (POST)

bash

Copy code

curl -X POST http://127.0.0.1:8080/tasks \\

-H "Content-Type: application/json" \\

-d '{"name":"Task1","description":"Test task","status":"Pending"}'

Screenshot:





2️⃣ Get All Tasks (GET)

bash

Copy code

curl http://127.0.0.1:8080/tasks

Screenshot:





3️⃣ Get Task by ID (GET)

bash

Copy code

curl http://127.0.0.1:8080/tasks/68f6203855b72c3fc61a4812

Screenshot:

!\[Get Task by ID](Images/Get Task by ID.png)



4️⃣ Search Task by Name (GET)

bash

Copy code

curl http://127.0.0.1:8080/tasks/search/Task1

Screenshot:

!\[Search Task](Images/Search Task by Name.png)



5️⃣ Delete Task by ID (DELETE)

bash

Copy code

curl -X DELETE http://127.0.0.1:8080/tasks/68f6203855b72c3fc61a4812

Screenshot:

!\[Delete Task](Images/Delete Task by ID.png)



🗂️ Project Structure

css

Copy code

taskmanager-task1/

│

├── src/main/java/com/kaiburr/taskmanager/

│   ├── TaskManagerApplication.java

│   ├── controller/

│   │   └── TaskController.java

│   ├── model/

│   │   └── Task.java

│   └── repository/

│       └── TaskRepository.java

│

├── src/main/resources/application.properties

├── pom.xml

└── README.md

📸 Screenshots

All screenshots are located in the Images folder.



1\_create\_task.png → Create task POST request



get.png → Get all tasks



Get Task by ID.png → Get task by ID



Search Task by Name.png → Search task by name



Delete Task by ID.png → Delete task by ID



✅ Notes

MongoDB must be running locally for the application to work.



The application validates the command input to prevent unsafe execution.



You can test endpoints via cURL or Postman.

