## Covid Watch v0.0.1
### Overview

A Java web application for getting the users updated on the current rate of COVID-19 cases and the number of active cases reported worldwide.  

The application uses data from a  Third Party API ([Open Disease Data API](https://disease.sh/)) for reliable global disease information.

### Covid Watch Web App Architecture Overview

The application uses the standard MVC architecture. The controller layer consisting of the Spring Controllers receives the client's requests. It then passes the requests to the Service Layer for processing. The Service layer will then give the results to the Controller, which sends it to a templating engine called Thymeleaf Template before being rendered on the screen. 

![](./README/Covid-Watch-MVC-Project-Structure.png)

### Features

- The app utilizes Open Disease Data API for Covid-19 data which is updated every 10 minutes
- The Home page that displays details regarding worldwide Covid-19 cases
- A list of Continents that links to a specific Continent page
- Continent Page that displays details regarding Covid-19 infections for that particular continents
- Continent Page also displays a table of countries with its corresponding details
- The Country Page displays details such as total cases, new cases, active cases, etc

### Screens

#### Home

<img src="./README/index.png" alt="index" style="zoom:50%;" />

------

#### Continent Page

<img src="./README/continental.png" alt="continental" style="zoom:50%;" />



------

#### Country Page

<img src="./README/international.png" alt="international" style="zoom:50%;" />



------

#### Error Page

<img src="./README/404.png" alt="404 Error Page" style="zoom:40%;" />

------

### Exception Handling

Exceptions are being handled inside GlobalExceptionHandler class which uses the Spring's  @ControllerAdvice annotation to capture exceptions in the application and to be handled accordingly.

### Project Structure

<img src="./README/image-20210824122513721.png" alt="image-20210824122513721" style="zoom: 80%;" />

### Source Packages

The packages below contains the application logic for Covid Watch Web Application.

<img src="./README/image-20210824122325243.png" alt="image-20210824122325243" style="zoom:80%;" />

- **client** - contains classes for consuming the Open Diseases API
- **config** - contains the Java Configuration files
- **constant** - contains Constants class
- **controller** - contains the Controller classes
- **domain** - contains the domain objects or POJOs
- **enums** - contains Java enumeration classes
- **exception** contains custom java exceptions
- **service** - contains the Service classes
- **utility** - contains utility class

### Test Packages

The Test Package contains all tests that are used in this project such as the Unit tests, Integration Tests.

<img src="./README/image-20210824122358889.png" alt="image-20210824122358889" style="zoom:80%;" />



## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

What things you need to install the software and how to install them

```
GitHub Account
Java 11
IDE (Developed using Netbeans 12.1)
```

## Installing

1. Checkout code from GitHub repository:

   ```
   https://github.com/medinar/covid-watch.git
   ```

2. Open project in your IDE of choice as a maven project.

3. Clean and Build the project so that all required dependencies will be downloaded.

4. Run the project.

## Running the tests

1. Right click on the project then click Run Tests.
2. Check the results.

## Built With

- [Java](https://www.java.com/en/)
- [Spring](https://spring.io/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Thymeleaf](https://www.thymeleaf.org)
- [Bootstrap](https://getbootstrap.com/)

## Author

- **Rommel D. Medina** - [Profile: medinar](https://github.com/medinar)

## License

## Acknowledgments
