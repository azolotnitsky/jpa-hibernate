### Usage

- Run the application and go on http://localhost:8080/
- Use the following urls to invoke controllers methods and see the interactions
  with the database:
    * `/drivers`: to see the list of drivers
    * `/orders/{driverId}`: to see the list of orders assigned to a particular driver

### Build and run

#### Configurations

Open the `application.properties` file and set your own configurations for the
database connection.

#### Prerequisites

- Java 7
- Maven 3

#### From terminal

Go on the project's root folder, then type:

    $ mvn spring-boot:run

or

   $java -jar spring-boot-mysql-jpa-hibernate2-0.0.1-SNAPSHOT.jar

#### From Eclipse (Spring Tool Suite)

Import as *Existing Maven Project* and run it as *Spring Boot App*.
