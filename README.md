URL Shortener Project

Overview

The URL Shortener project is a web application that allows users to shorten long URLs for easy sharing and readability. The project uses a combination of Spring Boot as the backend and Thymeleaf as the frontend to provide a user-friendly interface.

Features

URL Shortening: Users can enter a long URL to generate a shortened version of it.

User Interface: The application provides a simple and intuitive user interface using Thymeleaf templates.

Redirection: The shortened URL redirects the user to the original long URL when accessed.

Backend and Frontend Integration: Seamlessly integrates backend logic with Thymeleaf views.

Animation Effects: Includes some animations to enhance the user experience.

Technologies Used

Spring Boot: Backend framework to handle URL generation and redirection logic.

Thymeleaf: Template engine for rendering HTML on the frontend.

H2 Database: Used for storing long URLs and their corresponding shortened URLs.

Java 17: Programming language version used for development.

Lombok: To reduce boilerplate code.

Project Structure

Controller Layer: Handles HTTP requests and manages URL generation and redirection.

Service Layer: Implements the business logic, including generating short URLs and retrieving original URLs.

Repository Layer: Manages database operations for storing and retrieving URL records.

Frontend: Thymeleaf templates to create a clean and simple user interface for URL input and result display.

How It Works

Input Long URL: The user enters a long URL into the input field on the main page.

Shorten URL: When the user submits, the backend processes the request and generates a unique shortened version of the URL.

Store URLs: The original and shortened URLs are stored in the H2 database.

Redirect on Access: When a user visits the shortened URL, they are redirected to the original URL.

Running the Project

Clone the Repository: Clone the repository from GitHub.

Set Up Dependencies: Ensure Java 17 and Maven are installed. Run mvn clean install to set up the dependencies.

Run the Application: Use your IDE or mvn spring-boot:run to start the server.

Access the Application: Open your browser and navigate to http://localhost:8080.

Example Usage

Enter Long URL: Enter a long URL, such as https://example.com/some/long/path, in the input field.

Generate Shortened URL: Click the Shorten URL button to generate a link, like http://localhost:8080/abc123.

Access Original URL: When visiting the shortened URL, the application will redirect you to the original long URL.

Contributing

Feel free to fork the repository and submit pull requests for any improvements or bug fixes.

License

This project is licensed under the MIT License. See the LICENSE file for more details.
