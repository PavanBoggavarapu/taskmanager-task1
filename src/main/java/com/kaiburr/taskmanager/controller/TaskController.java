package com.kaiburr.taskmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.kaiburr.taskmanager.model.Task;
import com.kaiburr.taskmanager.repository.TaskRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tasks")  // base path for all task endpoints
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    // Home endpoint (optional, can be /tasks/home)
    @GetMapping("/home")
    public String home() {
        return "Welcome to Task Manager API!";
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Task> getTaskById(@PathVariable String id) {
        return taskRepository.findById(id);
    }

    @GetMapping("/search/{name}")
    public List<Task> getTaskByName(@PathVariable String name) {
        return taskRepository.findByName(name);
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskRepository.save(task);
    }

    @PutMapping("/{id}")
    public Task updateTask(@PathVariable String id, @RequestBody Task taskDetails) {
        Task task = taskRepository.findById(id).orElse(null);
        if (task != null) {
            task.setName(taskDetails.getName());
            task.setDescription(taskDetails.getDescription());
            task.setStatus(taskDetails.getStatus());
            return taskRepository.save(task);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable String id) {
        taskRepository.deleteById(id);
    }
}
