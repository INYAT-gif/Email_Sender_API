# G46 Email Sender API

The G46 Email Sender API is a Java-based application designed to provide a robust and user-friendly interface for programmatically sending emails. Built on Spring Boot, it offers scalable and reliable email communication capabilities.

## Features

- **RESTful API**: Provides REST endpoints for sending emails with customizable configurations.
- **Customizable Properties**: Configure email settings via `email.properties` and application-wide properties in `application.properties`.
- **Exception Handling**: Robust exception handling (`RESTExceptionHandler.java`) ensures reliable operation.
- **Data Transfer Objects (DTOs)**: Uses `EmailDTO.java` for structured data exchange between the API and clients.
- **Persistence**: Utilizes `Email.java` entities and `EmailRepository.java` for storing and managing email data.
- **Maven-based Build**: Dependency management and build automation using Maven (`pom.xml`).

## Getting Started

### Prerequisites

Ensure you have the following installed:

- Java 8 or higher
- Maven

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/INYAT-gif/Email_Sender_API
   cd Email_Sender_API
