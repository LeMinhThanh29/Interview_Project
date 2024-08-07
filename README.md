Dưới đây là phần README cho dự án của bạn:

---

# Employee Management API

This project demonstrates how to build a RESTful API for managing employee data using Spring Boot, Hibernate, and Oracle. It includes functionality to retrieve a list of employees from an Oracle database.

## Technologies Used

- **Spring Boot**: Framework for developing Java applications with a focus on productivity and ease of configuration.
- **Hibernate**: Object-Relational Mapping (ORM) tool for Java, used to interact with the Oracle database.
- **Oracle Database**: Relational database management system where employee data is stored.

## Getting Started

### Prerequisites

- Java 11 or later
- Maven or Gradle (for building the project)
- Oracle Database (running and accessible)
- An IDE or text editor (e.g., IntelliJ IDEA, VSCode)

### Installation

1. **Clone the Repository**

   ```bash
   git clone <repository-url>
   cd <project-directory>
   ```

2. **Configure Oracle Database**

   - Ensure you have an Oracle database running.
   - Create a database schema and table for employee data.

3. **Update Application Properties**

   Edit the `src/main/resources/application.properties` file to include your Oracle database connection details:

   ```properties
   spring.datasource.url=jdbc:oracle:thin:@<host>:<port>:<service>
   spring.datasource.username=<username>
   spring.datasource.password=<password>
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.Oracle12cDialect
   ```

4. **Build the Project**

   Use Maven or Gradle to build the project:

   **Maven:**
   ```bash
   mvn clean install
   ```

   **Gradle:**
   ```bash
   gradle build
   ```

5. **Run the Application**

   ```bash
   mvn spring-boot:run
   ```

   or

   ```bash
   gradle bootRun
   ```

### API Endpoints

- **Get List of Employees**

  **URL:** `/employees`

  **Method:** `GET`

  **Query Parameters:**
  - `page`: The page number for pagination (default is 0).
  - `size`: The number of employees per page (default is 10).

  **Response:**
  ```json
  {
    "totalElements": 107,
    "totalPages": 11,
    "size": 10,
    "content": [
        {
            "employeeId": 100,
            "firstName": "Steven",
            "lastName": "King",
            "email": "SKING",
            "phoneNumber": "515.123.4567",
            "jobId": "AD_PRES",
            "salary": 24000.0,
            "commissionPct": null,
            "managerId": null,
            "departmentId": 90,
            "hireDate": "2003-06-17"
        },
        {
            "employeeId": 101,
            "firstName": "Neena",
            "lastName": "Kochhar",
            "email": "NKOCHHAR",
            "phoneNumber": "515.123.4568",
            "jobId": "AD_VP",
            "salary": 17000.0,
            "commissionPct": null,
            "managerId": 100,
            "departmentId": 90,
            "hireDate": "2005-09-21"
        },
        {
            "employeeId": 102,
            "firstName": "Lex",
            "lastName": "De Haan",
            "email": "LDEHAAN",
            "phoneNumber": "515.123.4569",
            "jobId": "AD_VP",
            "salary": 17000.0,
            "commissionPct": null,
            "managerId": 100,
            "departmentId": 90,
            "hireDate": "2001-01-13"
        },
        {
            "employeeId": 103,
            "firstName": "Alexander",
            "lastName": "Hunold",
            "email": "AHUNOLD",
            "phoneNumber": "590.423.4567",
            "jobId": "IT_PROG",
            "salary": 9000.0,
            "commissionPct": null,
            "managerId": 102,
            "departmentId": 60,
            "hireDate": "2006-01-03"
        },
        {
            "employeeId": 104,
            "firstName": "Bruce",
            "lastName": "Ernst",
            "email": "BERNST",
            "phoneNumber": "590.423.4568",
            "jobId": "IT_PROG",
            "salary": 6000.0,
            "commissionPct": null,
            "managerId": 103,
            "departmentId": 60,
            "hireDate": "2007-05-21"
        },
        {
            "employeeId": 105,
            "firstName": "David",
            "lastName": "Austin",
            "email": "DAUSTIN",
            "phoneNumber": "590.423.4569",
            "jobId": "IT_PROG",
            "salary": 4800.0,
            "commissionPct": null,
            "managerId": 103,
            "departmentId": 60,
            "hireDate": "2005-06-25"
        },
        {
            "employeeId": 106,
            "firstName": "Valli",
            "lastName": "Pataballa",
            "email": "VPATABAL",
            "phoneNumber": "590.423.4560",
            "jobId": "IT_PROG",
            "salary": 4800.0,
            "commissionPct": null,
            "managerId": 103,
            "departmentId": 60,
            "hireDate": "2006-02-05"
        },
        {
            "employeeId": 107,
            "firstName": "Diana",
            "lastName": "Lorentz",
            "email": "DLORENTZ",
            "phoneNumber": "590.423.5567",
            "jobId": "IT_PROG",
            "salary": 4200.0,
            "commissionPct": null,
            "managerId": 103,
            "departmentId": 60,
            "hireDate": "2007-02-07"
        },
        {
            "employeeId": 108,
            "firstName": "Nancy",
            "lastName": "Greenberg",
            "email": "NGREENBE",
            "phoneNumber": "515.124.4569",
            "jobId": "FI_MGR",
            "salary": 12008.0,
            "commissionPct": null,
            "managerId": 101,
            "departmentId": 100,
            "hireDate": "2002-08-17"
        },
        {
            "employeeId": 109,
            "firstName": "Daniel",
            "lastName": "Faviet",
            "email": "DFAVIET",
            "phoneNumber": "515.124.4169",
            "jobId": "FI_ACCOUNT",
            "salary": 9000.0,
            "commissionPct": null,
            "managerId": 108,
            "departmentId": 100,
            "hireDate": "2002-08-16"
        }
    ],
    "number": 0,
    "sort": {
        "empty": true,
        "sorted": false,
        "unsorted": true
    },
    "first": true,
    "last": false,
    "numberOfElements": 10,
    "pageable": {
        "pageNumber": 0,
        "pageSize": 10,
        "sort": {
            "empty": true,
            "sorted": false,
            "unsorted": true
        },
        "offset": 0,
        "paged": true,
        "unpaged": false
    },
    "empty": false
}
  ```

### Project Structure

Service Layer
File: src/main/java/com/interview/api/application/service/EmployeeService.java
Description: Contains business logic for managing employees.

Entity Layer
File: src/main/java/com/interview/api/infrastructure/entity/Employee.java
Description: Represents the employee entity mapped to the database.

Repository Layer
File: src/main/java/com/interview/api/infrastructure/repository/EmployeeRepository.java
Description: Interface for data access operations on the Employee entity.

Controller Layer
File: src/main/java/com/interview/api/presentation/controller/EmployeeController.java
Description: Handles HTTP requests and maps them to service methods.


### License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

Feel free to modify the content according to your project's specific details and requirements.
