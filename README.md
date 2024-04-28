**Order Service**

The Order Service is a microservice designed to manage orders within a larger e-commerce platform. It handles creating orders based on product availability and updating inventory accordingly.


**Technologies Used**

_**Java**_: Programming language.

_**Spring Boot**_: Framework used to create stand-alone, production-grade Spring based applications easily.

**_Lombok_**: Java library tool to minimize/remove boilerplate code.

**_Log4j2_**: Logging framework for monitoring and debugging the application.

**_Maven_**: Dependency management and build automation tool.

**Getting Started**

_Prerequisites_

Java 11 or higher

Maven 3.6 or higher

**Setup Instructions**

_Clone the repository_



git clone https://github.com/aleempasha2772/order-service

cd order-service

Build the project




mvn clean install

Run the application



java -jar target/order-service-0.0.1-SNAPSHOT.jar

Alternatively, if you have Spring Boot's Maven plugin configured, you can use:


mvn spring-boot:run

**Features**

Order Creation: Accept order requests and create orders with status "CREATED".

Inventory Update: Automatically update the product inventory upon placing an order.

**Contributing**

Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are greatly appreciated.

**Fork the Project**

Create your Feature Branch (git checkout -b feature/AmazingFeature)

Commit your Changes (git commit -m 'Add some AmazingFeature')

Push to the Branch (git push origin feature/AmazingFeature)

Open a Pull Request
