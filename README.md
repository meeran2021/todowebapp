# My Todo Manager - Web Application

![Project Logo/Icon/Image]

**Description:**
My Todo Manager is a feature-rich web application developed using the Spring Boot framework. This application provides a secure and efficient task management solution, emphasizing user-friendly interfaces and dynamic views.

## Table of Contents

1. [Getting Started](#getting-started)
2. [Key Features](#key-features)
3. [Technologies Used](#technologies-used)
4. [Classes Overview](#classes-overview)
5. [JSP File Explanations](#jsp-file-explanations)
6. [Conclusion](#conclusion)


## Getting Started

Follow these steps to set up and run the Todo web application locally:

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/meeran2021/todowebapp.git
   ```

2. **Navigate to the Project Directory:**
   ```bash
   cd todowebapp
   ```

3. **Set Up and Configure the Database:**
   - Ensure you have MySQL installed and running.
   - Open the `application.properties` file in the `src/main/resources` directory.
   - Configure the MySQL connection properties, including URL, username, and password.

4. **Build and Run the Application:**
   - Build the application using Maven:
     ```bash
     ./mvnw clean install
     ```
   - Run the application:
     ```bash
     ./mvnw spring-boot:run
     ```

5. **Access the Application:**
   - Once the application is running, open your web browser and navigate to:
     ```
     http://localhost:8080
     ```

6. **Explore the Todo Web Application:**
   - Use the provided functionalities to add, update, and delete Todo items.
   - Access the Todo list and navigate through the user-friendly interface.



## Key Features

### Secure Authentication
- Implemented secure user authentication using Spring Security with BCrypt for password encryption.
- Ensured a highly secure user environment for seamless task management.

### Efficient CRUD Operations and Database Integration
- Utilized Spring Data JPA for streamlined CRUD operations on Todo items.
- Maintained data integrity through a well-structured entity model with JPA annotations.
- Integrated MySQL via Docker for efficient data storage and management.

## Technologies Used

- **Spring Boot:** For building and developing the web application framework.
- **Spring Security:** For implementing secure user authentication.
- **Spring Data JPA:** For facilitating efficient CRUD operations on Todo items and interacting with the relational database.
- **BCrypt:** For password encryption within Spring Security.
- **MySQL (Docker):** For efficient data storage and management.
- **JavaScript, HTML, CSS, Bootstrap:** For Webapp user interface.


## Classes Overview

The Todo web application utilizes a set of classes to implement various functionalities, including user authentication, data persistence, and web page rendering. Here's an overview of key classes:

1. **TodowebappApplication:**
   - *Description:* The main class that serves as the entry point of the Spring Boot application. It initializes and runs the application using the `SpringApplication.run` method.

2. **SpringSecurityConfiguration:**
   - *Description:* A configuration class for Spring Security. It defines user details, password encoding, security filter chain, and authorization rules for securing the application.

   - *Key Methods and Beans:*
     - `configureUserDetailsManager`: Configures in-memory user details manager with sample user data.
     - `passwordEncoder`: Provides a BCrypt password encoder bean.
     - `filterSecurityChain`: Configures security filter chain with authorization rules.

3. **WelcomeController:**
   - *Description:* A controller class responsible for handling requests related to the welcome page. It retrieves the logged-in username and makes it available to the model.

   - *Key Methods:*
     - `goToLoginPage`: Handles GET requests for the root path ("/") and returns the "Welcome" view.
     - `getLoggedInUsername`: Retrieves the logged-in username using Spring Security's `SecurityContextHolder`.

4. **Todo:**
   - *Description:* An entity class representing a Todo item. It is annotated with JPA annotations for database persistence.

   - *Key Fields:*
     - `id`: Unique identifier for each Todo item.
     - `username`: Username associated with the Todo.
     - `description`: Description of the Todo task.
     - `targetDate`: Target date for completing the Todo task.
     - `isDone`: Boolean indicating whether the Todo task is marked as done.

5. **TodoControllerJpa:**
   - *Description:* A controller class handling requests related to Todo items using Spring Data JPA. It interacts with the database to perform CRUD operations on Todo items.

   - *Key Methods:*
     - `listAllTodos`: Displays a list of all Todos retrieved from the database.
     - `showAddTodoPage`: Displays the form for adding a new Todo.
     - `addTodo`: Handles the submission of the new Todo form.
     - `deleteTodo`: Handles the deletion of a Todo item.
     - `showUpdateTodoPage`: Displays the form for updating a Todo.
     - `updateTodo`: Handles the submission of the updated Todo form.
     - `getLoggedInUsername`: Retrieves the logged-in username using Spring Security's `SecurityContextHolder`.

6. **TodoRepository:**
   - *Description:* An interface extending `JpaRepository` for Todo entities. It provides methods for querying and managing Todo items in the database.

   - *Key Methods:*
     - `findByUsername`: Retrieves a list of Todo items based on the username.

These classes collectively form the backbone of the Todo web application, handling user authentication, data persistence, and the presentation of Todo items on the web pages.


## JSP File Explainations

List of JSP files with descriptions:

1. **AddTodo.jsp:**
   - This JSP file represents the form for adding a new Todo item. It includes fields for the description and target date, allowing users to submit new tasks.

2. **TodoList.jsp:**
   - This JSP file displays a list of Todos in a table format. It includes columns for the username, description, target date, and whether the task is marked as done. Users can also update or delete individual Todo items.

3. **common/header.jspf:**
   - This JSP fragment file contains the header section for your web pages. It includes a navigation bar with links for Home, Todos, and Logout.

4. **common/footer.jspf:**
   - This JSP fragment file contains common footer content shared across your web pages. It may include scripts or additional content applicable to the bottom of your pages.

5. **common/navigation.jspf:**
   - This JSP fragment file includes common navigation elements, such as links to Home, Todos, and Logout. It is used within other JSP files to maintain consistent navigation.

These files collectively contribute to the structure and functionality of the web application, providing a user-friendly interface for managing Todos.


## Conclusion

Thank you for exploring My Todo Manager, a web application designed to simplify task management with security and efficiency in mind. Whether you are a user looking to organize your tasks or a developer interested in the project, we appreciate your interest.

Feel free to contribute, report issues, or provide feedback. Your input is valuable in enhancing the functionality and usability of this project. Connect with us and be part of the growing community.

Happy task managing!

**Connect with Me:**
- [GitHub Issues](https://github.com/meeran2021/todowebapp/issues)



