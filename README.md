# APIAutomationE2E

APIAutomationE2E is a Java-based framework designed for end-to-end API testing. It leverages Rest Assured for HTTP request handling and TestNG for test execution and reporting.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Configuration](#configuration)
- [Running Tests](#running-tests)
- [Project Structure](#project-structure)
- [Contributing](#contributing)
- [License](#license)

## Introduction

This project provides a robust framework for automating API tests, ensuring that your APIs function as expected. By integrating Rest Assured and TestNG, it offers a comprehensive solution for writing and executing API tests.

## Features

- **Rest Assured Integration**: Simplifies the process of making HTTP requests and validating responses.
- **TestNG Integration**: Provides a flexible test configuration and execution environment.
- **Configuration Management**: Centralized management of API endpoints and other configurations via `application.properties`.
- **Extensible Structure**: Easily add new tests and extend existing ones.

## Prerequisites

Before setting up the project, ensure you have the following installed:

- **Java Development Kit (JDK)**: Version 8 or above.
- **Apache Maven**: For project build and dependency management.
- **Git**: To clone the repository.

## Installation

1. **Clone the Repository**:

   ```bash
   git clone https://github.com/iamniket/APIAutomationE2E.git
   ```

2. **Navigate to the Project Directory**:

   ```bash
   cd APIAutomationE2E
   ```

3. **Build the Project Using Maven**:

   ```bash
   mvn clean install
   ```

## Configuration

The project uses an `application.properties` file located in `src/test/resources/` to manage configurations. Key configurations include:

- **Base URI**: The root URL for the API under test.
- **Authentication Details**: Credentials or tokens required for API access.

Ensure that the `application.properties` file is correctly configured before running the tests.

## Running Tests

Execute the following Maven command to run the tests:

```bash
mvn test
```

Test results will be displayed in the console and can also be found in the `target/surefire-reports` directory.

## Project Structure

```plaintext
APIAutomationE2E/
├── pom.xml
├── src/
│   ├── test/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── tests/
│   │   │               └── ApiTest.java
│   │   └── resources/
│   │       └── application.properties
```

- `pom.xml`: Maven configuration file containing project dependencies.
- `ApiTest.java`: Contains the API test cases.
- `application.properties`: Configuration file for test parameters.

## Contributing

Contributions are welcome! Please fork the repository and create a new branch for any feature additions or bug fixes. Submit a pull request with a detailed description of your changes.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.

---

This `README.md` provides a comprehensive overview of the APIAutomationE2E project, guiding users from setup to execution. 
