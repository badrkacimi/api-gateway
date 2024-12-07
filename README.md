# API Gateway

This project serves as an API Gateway, routing requests to various microservices and incorporating cross-cutting concerns such as security and tracing.

## Prerequisites

- **Java Development Kit (JDK) 8 or higher**: Ensure that JDK is installed on your system.
- **Maven**: Required for building the application.

## Getting Started

### Clone the Repository

```
git clone https://github.com/badrkacimi/api-gateway.git
cd api-gateway
```
### Build the Application

```
./mvnw clean install
```

### Run the Application

```
./mvnw spring-boot:run
```

The application will start and be accessible at http://localhost:8765.

### Routing Examples

Currency Conversion Service:
Feign Client: /currency-conversion-service/currency-conversion/feign/from/{from}/to/{to}/quantity/{quantity}
New Endpoint: /currency-conversion-new/from/{from}/to/{to}/quantity/{quantity}

Currency Exchange Service:
Endpoint: /currency-exchange/from/{from}/to/{to}
Replace {from}, {to}, and {quantity} with appropriate currency codes and amounts.

###  Features
Routing: Directs incoming requests to the appropriate microservices.
Security: Implements security measures to protect the services.
Tracing: Enables tracing of requests across services for monitoring and debugging.

### Configuration
Port: The application runs on port 8765 by default. This can be configured in the application.properties file.
Dependencies
Spring Boot: Framework for building Java applications.
Spring Cloud Gateway: Provides a library for building API gateways on top of Spring and Java.
Maven: Build automation tool.


### Acknowledgements
This project is inspired by the "Mastering Microservices" series.
