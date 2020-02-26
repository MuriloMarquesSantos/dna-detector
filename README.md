# Dna Detector
This project was created to satisfy Mercado Livre back-end challenge requirements.

Its purpose is to make possible to check mutations in DNAs. With it you will be able to send a DNA sample and check whether it belongs to a simian or to a human and also check its stats.

### Tools

This project is developed using the following technologies:
- **Java;**
- **Spring Boot;**
- **Spring Data** for DB access;
- **MySQL** as database;
- **JUnit4**, **Mockito** and **MockMVC** for tests;
- **Swagger** for API Documentation;

## Package Structure

```
Project
├── com.meli.dnadetector
│   ├── configuration: shared configuration files, such as Swagger and JPA
│   ├── controller: external UI communication
│   ├── dto - data transfer objects to UI (API responses and requests)
│   ├── entity: domain objects with database annotations.
│   ├── exception: Exception classes that help spring to handle Errors.
│   ├── repository: Spring Data interfaces to communicate with MySQL
│   ├── service: Spring components with business logic.          
│   ├── utils : utilities that can be shared cross application
│       
```

# Requirements / Dependencies
- [Java 8](https://www.java.com/pt_BR/download/)
- [Maven](https://maven.apache.org/) to manage the project's build, reporting and documentation from a central piece of information;
- [Spring boot](https://spring.io/projects/spring-boot) for project setup and run;
- [Lombok](https://projectlombok.org/) To help with some Java boilerplates such as: Getter, Setter, Constructor, etc.. Also automate the creation of a Builder;
- [Model Mapper](http://modelmapper.org/) to make object mapping easy, by automatically determining how one object model maps to another, based on conventions;
- [JUnit4](https://junit.org/junit4/) for unit tests;
- [Mockito](https://site.mockito.org/) for general tests;
- [MockMVC](https://spring.io/guides/gs/testing-web/) from Spring for Rest Tests;
- [Swagger](https://swagger.io/) for really useful and simple API documentation;

# Running the application locally

  ### With Maven  

- Run the command below to compile the project  

```
$ mvn clean install
```

- You can run it with the command below. If you are using modern IDEs such as IntelliJ and Spring Tool Suite, they have built-in spring-boot startup tools.

```
$ mvn spring-boot:run
```

You can build the project with:
 ```
$ mvn clean package
```

## Tests

The project is 90% covered with tests.

## Swagger
- Swagger is already configured in this project in SwaggerConfig.java.
- The API can be seen at http://localhost:8081/swagger-ui.html.
- You can also try the entire REST API directly from the Swagger interface!

## Postman Documentation

Alternatively to swagger, I have prepared a postman documentation, in which you will be able to check in details each endpoint and possible Requests and responses.

Please access it by link below:

```
https://documenter.getpostman.com/view/4694407/SzKYNGSz?version=latest
```

### Contributors

- Murilo M. Santos <murilommms@gmail.com>

---


## Support

* If you have any query or doubt, please, feel free to contact me by e-mail.



