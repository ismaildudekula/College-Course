# College and Course API

This project is an application for displaying college and course details using **React.js** for the frontend and **Spring Boot, JPA, MySQL** for the backend. It exposes APIs for fetching a list of colleges and detailed information about each college, including associated courses, fees, and accommodation options.

## Table of Contents
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Installation](#installation)
- [API Endpoints](#api-endpoints)
  - [Get All Colleges](#get-all-colleges)
  - [Get College Details by ID](#get-college-details-by-id)
- [Database Structure](#database-structure)
- [Frontend Setup](#frontend-setup)
- [Backend Setup](#backend-setup)

## Features
- Get a list of all colleges with relevant details.
- Get detailed information on a specific college, including course names, fees, and accommodation options.
- Frontend UI using React.js with Material UI for design.
- Backend API implemented with Spring Boot and JPA for database interactions.

## Tech Stack

### Frontend
- **React.js** - JavaScript library for building user interfaces.
- **Material UI** - React component library for UI design.
- **Axios** - HTTP client to send API requests.

### Backend
- **Java 11** - Core programming language for backend development.
- **Spring Boot** - Framework for building Java-based applications.
- **Spring Data JPA** - ORM to interact with the database.
- **MySQL** - Database used to store college and course details.
- **Hibernate** - JPA implementation for ORM.
  
## Installation

### Prerequisites
- **Java 11**
- **Maven**
- **MySQL**
- **Node.js** and **npm**

## Frontend Setup

1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/college-course-api.git
    ```

2. Navigate to the frontend directory:
    ```bash
    cd frontend
    ```

3. Install dependencies:
    ```bash
    npm install
    ```

4. Start the frontend development server:
    ```bash
    npm run dev
    ```
    
The frontend should now be available at `http://localhost:3000`.


### Backend Setup

1. Clone the repository (if not already cloned in the Frontend Setup step):
    ```bash
    git clone https://github.com/yourusername/college-course-api.git
    ```

2. Navigate to the backend directory:
    ```bash
    cd backend
    ```

3. Install dependencies and build the project using Maven:
    ```bash
    mvn clean install
    ```

4. Set up MySQL database and update your `application.properties` with the correct credentials:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/college_db
    spring.datasource.username=root
    spring.datasource.password=yourpassword
    ```

5. Run the Spring Boot application:
    ```bash
    mvn spring-boot:run
    ```

The backend should now be running at `http://localhost:8080`.


## API Endpoints

### Get All Colleges

- **Endpoint:** `/api/colleges`
- **Method:** `GET`
- **Description:** Fetches a list of all colleges with basic details (college name, accommodation options).
- **Response Example:**
  ```json
  [
  {
    "id": 1,
    "name": "Harvard University",
    "courses": [
      {
        "id": 1,
        "name": "Computer Science",
        "duration": "4 years",
        "accommodationType": "AC",
        "courseFee": {
          "id": 1,
          "feeAmount": 50000,
          "accommodationFee": 10000
        }
      },
      {
        "id": 2,
        "name": "Business Administration",
        "duration": "3 years",
        "accommodationType": "Non-AC",
        "courseFee": {
          "id": 2,
          "feeAmount": 45000,
          "accommodationFee": 8000
        }
      }
    ]
  }
  ]
  ```

### Get College Details by ID

- **Endpoint:** `/api/colleges/{id}`
- **Method:** `GET`
- **Description:** Fetches detailed information for a college, including courses and fees.
- **Response Example:**
    ```json
    {
  "id": 1,
  "name": "Harvard University",
  "address": "Cambridge, MA",
  "courses": [
    {
      "id": 1,
      "name": "Computer Science",
      "duration": "4 years",
      "accommodationType": "AC",
      "courseFee": {
        "id": 1,
        "feeAmount": 50000,
        "accommodationFee": 10000
      }
    }
  ]
  }
    ```

## Database Structure

### College Table
| Column         | Type          |
|----------------|---------------|
| id             | Long (PK)     |
| name           | String        |


### Course Table
| Column      | Type          |
|-------------|---------------|
| id          | Long (PK)     |
| name        | String        |
| accommodationType| Double        |
| duration    | String        |
| college_id  | Long (FK)     |
| course_fee_id | Long (FK)   |

### Course Fee Table
| Column      | Type          |
|-------------|---------------|
| id          | Long (PK)     |
| accommodationFee | DOUBLE   |
| feeAmount   | DOUBLE        |

## Screenshots

### React frontend
![Screenshot 2024-09-25 173912](https://github.com/user-attachments/assets/7ba79a6f-8983-4001-bb29-e3a51b2c01a4)
![Screenshot 2024-09-25 173925](https://github.com/user-attachments/assets/2636f60f-6a6e-4dca-a380-c1a950555375)

### Spring boot Backend in PostMan
![Screenshot 2024-09-25 173941](https://github.com/user-attachments/assets/9c4b54c4-9c78-40fb-b78b-ec6ec51f14b6)
![Screenshot 2024-09-25 174002](https://github.com/user-attachments/assets/c5f7b2ec-05a8-42ea-b1e1-ce4e678b5517)

---
By following the steps above, the application should be running locally, with the frontend served at `http://localhost:3000` and the backend API available at `http://localhost:8080/api`.
