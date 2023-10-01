# Spring Boot 3 Demos

## Observability

### Demo project for Spring Boot 3 Observability

* Zipkin
* Docker Compose Support (To run Zipkin without having local setup)
* Spring Boot Actuator

### Additional new features of Spring Boot 3.2.0 M3 (milestone)

* The New Rest Client and HttpInterfaces 

---

## Dependencies

* Docker along with docker-compose must be installed and set to PATH

---

## How to run and see observability into action

* Run spring-boot application with ./mvnw spring-boot:run or through IDE
* Execute the Rest APIs on browser or preferably using some Rest Client like Postman or use the swagger at http://localhost:8080/swagger-ui.html
* Open http://localhost:9411/zipkin and click on Run Query to see the traces
* To see the all the available metrics which are being traced, check out http://localhost:8080/actuator/metrics


---
