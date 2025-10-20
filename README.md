# TaskManager Application - Task 1

Hi! 👋 This repository contains my implementation for **Task 1** of the Kaiburr assignment.  
The backend is built using **Java Spring Boot** and stores data in **MongoDB**.

---

## Project Structure

```
taskmanager-task1/
├── .gitignore
├── pom.xml
├── README.md
├── mvnw
├── mvnw.cmd
├── .mvn/
├── src/
│   ├── main/
│   │   ├── java/com/kaiburr/taskmanager/
│   │   │   ├── TaskManagerApplication.java
│   │   │   ├── controller/TaskController.java
│   │   │   ├── model/Task.java
│   │   │   └── repository/TaskRepository.java
│   │   └── resources/application.properties
│   └── test/java/com/kaiburr/taskmanager/TaskManagerApplicationTests.java
└── screenshots/
    ├── 1_create_task.png
    ├── 2_get_tasks.png
    ├── 3_get_task_by_id.png
    ├── 4_search_task.png
    └── 5_delete_task.png
```

---

## How to Run

1. Clone the repo:

```bash
git clone https://github.com/PavanBoggavarapu/taskmanager-task1.git
cd taskmanager-task1
```

2. Start the application:

```bash
./mvnw spring-boot:run
```

3. Open your browser or Postman at **http://127.0.0.1:8080/**

4. Make sure **MongoDB** is running locally on port **27017**.

---

## API Endpoints

### 1️⃣ Create a Task (POST)

```bash
curl -X POST http://127.0.0.1:8080/tasks \
-H "Content-Type: application/json" \
-d '{"name":"Task1","description":"Test task","status":"Pending"}'
```

**Response:**
```json
{
  "id": "68f6203855b72c3fc61a4812",
  "name": "Task1",
  "description": "Test task",
  "status": "Pending"
}
```

**Screenshot:**
![Create Task](screenshots/1_create_task.png)

---

### 2️⃣ Get All Tasks (GET)

```bash
curl http://127.0.0.1:8080/tasks
```

**Screenshot:**
![Get All Tasks](screenshots/2_get_tasks.png)

---

### 3️⃣ Get Task by ID (GET)

```bash
curl http://127.0.0.1:8080/tasks/68f6203855b72c3fc61a4812
```

**Screenshot:**
![Get Task by ID](screenshots/3_get_task_by_id.png)

---

### 4️⃣ Search Task by Name (GET)

```bash
curl http://127.0.0.1:8080/tasks/search/Task1
```

**Screenshot:**
![Search Task](screenshots/4_search_task.png)

---

### 5️⃣ Delete Task by ID (DELETE)

```bash
curl -X DELETE http://127.0.0.1:8080/tasks/68f6203855b72c3fc61a4812
```

**Screenshot:**
![Delete Task](screenshots/5_delete_task.png)

---

## Notes

- All screenshots include **current date/time** and my **username** to verify authenticity.  
- The APIs have been tested using **curl** on Windows Git Bash.  
- MongoDB must be running locally for the app to function.  

Thanks for checking out my Task 1 submission! 😊
