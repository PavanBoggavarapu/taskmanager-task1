# Task 2: Kubernetes Deployment & Updated TaskExecution

This explains how TaskManager (from Task1) is deployed on Kubernetes and how TaskExecution endpoint is updated.

---

## 1. Overview

- TaskManager now runs in **Kubernetes**.
- MongoDB runs in a **separate pod** with persistent storage.
- TaskExecution endpoint runs commands inside a **Kubernetes pod** instead of locally.

---

## 2. Docker

- Built Docker image for the app:

```bash
docker build -t taskmanager:task2 .
Tested locally before deploying to Kubernetes.

3. Kubernetes Deployment
MongoDB pod with persistent volume.

TaskManager pod deployed with environment variables for MongoDB connection.

Commands used:

bash
Copy code
kubectl apply -f mongodb-pvc.yaml
kubectl apply -f mongodb-deployment.yaml
kubectl apply -f taskmanager-deployment.yaml
kubectl apply -f taskmanager-service.yaml
kubectl get pods
kubectl get svc
4. TaskExecution Endpoint
Endpoint: PUT /tasks/{id}/execute

Runs commands in a new Kubernetes pod.

Stores the output in MongoDB.

Example command:

json
Copy code
{
  "command": "echo Hello from Kubernetes pod!"
}
5. Screenshots
Pods running:


Service exposing TaskManager:


TaskExecution tested: