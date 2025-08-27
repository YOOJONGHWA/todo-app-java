# Todo Management Application

## 1. Project Overview
**Project Name:** Todo Management Application  
**Purpose:** Allow users to create, update, delete, and complete tasks, and optionally synchronize them with Google Tasks API.

---

## 2. Functional Requirements

| ID   | Feature           | Description | Priority |
|------|------------------|-------------|----------|
| FR-1 | Create Task       | Register a task with title, description, due date, and domain.status (In Progress/Completed) | ★★★ |
| FR-2 | View Tasks        | View all tasks and task details | ★★★ |
| FR-3 | Update Task       | Modify title, description, due date, and domain.status | ★★☆ |
| FR-4 | Delete Task       | Delete an existing task | ★★☆ |
| FR-5 | Filtering/Sorting | Use Stream API to filter/sort tasks by domain.status and due date | ★★☆ |
| FR-6 | Google Tasks Sync | Synchronize selected tasks with Google account | ★☆☆ |

---

## 3. Non-Functional Requirements (NFR)

| ID     | Category   | Description |
|--------|------------|-------------|
| NFR-1  | Performance | The system should handle at least 1,000 tasks efficiently |
| NFR-2  | Validation  | Title must not be empty; due date must not be in the past |
| NFR-3  | Exception Handling | Invalid input should be handled using Custom Exceptions |
| NFR-4  | Testing     | Unit tests using JUnit are mandatory |
| NFR-5  | Architecture | Use Layered Architecture (Controller → service → Repository) with Dependency Inversion Principle applied |

---

## 4. Business Rules
1. **Task title is mandatory** (cannot be empty)
2. **Due date must be after the current time**
3. **Task domain.status must be either [In Progress / Completed]**
4. **Deleted tasks cannot be restored**

---

## 5. Future Enhancements
- Add user accounts (sign up, login)
- Notification feature (reminder one day before the due date)
- Provide REST API for frontend or mobile app integration




