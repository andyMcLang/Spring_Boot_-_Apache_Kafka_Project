# Spring Boot Kafka Projects

This repository contains two Spring Boot projects demonstrating the use of Apache Kafka for event-driven microservices communication.

## Project Overview
This project showcases how to use Apache Kafka with Spring Boot to build producer-consumer applications. It includes:

1. **springboot-kafka-demoproject** - A basic Kafka producer-consumer example using Spring Boot.
2. **springboot-kafka-real-world-project** - A real-world Kafka example with a Wikimedia event stream producer and a database consumer.

These projects illustrate how to send messages to Kafka topics, consume them efficiently, and integrate with external data sources.

---

## 1. Spring Boot Kafka Demo Project

### Overview
A simple Spring Boot application to demonstrate Kafka producer and consumer functionality.

### Features
- Kafka producer and consumer setup
- JSON message handling
- REST API endpoints to send messages

### Project Structure
```
├── .mvn/wrapper
├── src
│   ├── main/java/net/andylang/springboot
│   │   ├── config/KafkaTopicConfig.java
│   │   ├── controller/
│   │   │   ├── JsonMessageController.java
│   │   │   ├── MessageController.java
│   │   ├── dto/User.java
│   │   ├── kafka/SpringbootKafkaDemoprojectApplication.java
│   ├── resources/application.properties
│   ├── test/java/net/andylang/springboot/SpringbootKafkaDemoprojectApplicationTests.java
├── pom.xml
```

### Running the Project
1. Start a Kafka broker on `localhost:9092`.
2. Configure `application.properties` if necessary.
3. Build and run the application:
   ```sh
   mvn spring-boot:run
   ```
4. Use the following endpoints to test:
   - **Send a text message:** `GET http://localhost:8080/api/v1/kafka/publish?message=Hello`
   - **Send a JSON message:** `POST http://localhost:8080/api/v1/kafka/publish` with a JSON body.

---

## 2. Spring Boot Kafka Real-World Project

### Overview
A real-world Kafka project featuring:
- **Producer:** Fetches live Wikimedia event stream and publishes it to Kafka.
- **Consumer:** Reads and logs events from Kafka and stores them in a database.

This project simulates a real-time event processing system, demonstrating how Kafka can be used to handle large-scale streaming data.

### Project Structure
```
├── .mvn/wrapper
├── kafka-consumer-database
│   ├── src/main/java/com/andylang/springboot
│   │   ├── KafkaDatabaseConsumer.java
│   │   ├── SpringBootConsumerApplication.java
│   ├── resources/application.properties
│   ├── pom.xml
├── kafka-producer-wikimedia
│   ├── src/main/pom.xml
├── src/main/java/com/andylang/springboot/SpringbootKafkaRealWorldProjectApplication.java
├── resources/application.properties
├── pom.xml
```

### Running the Project
1. Start a Kafka broker on `localhost:9092`.
2. Configure `application.properties`.
3. Run the **Kafka Producer**:
   ```sh
   mvn spring-boot:run -pl kafka-producer-wikimedia
   ```
4. Run the **Kafka Consumer**:
   ```sh
   mvn spring-boot:run -pl kafka-consumer-database
   ```
5. The consumer will log received events and store them in a database.

---

## Requirements
- Java 17+
- Apache Kafka
- Maven 3.9.5+

## License
This project is licensed under the MIT License.

