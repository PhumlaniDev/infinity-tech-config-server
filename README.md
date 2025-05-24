# Config Server

[![CI Workflow](https://github.com/PhumlaniDev/infinity-tech-config-server/actions/workflows/ci-cd.yml/badge.svg)](https://github.com/PhumlaniDev/infinity-tech-config-server/actions/workflows/ci-cd.yml)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=PhumlaniDev_infinity-tech-config-server&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=PhumlaniDev_infinity-tech-config-server)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=PhumlaniDev_infinity-tech-config-server&metric=bugs)](https://sonarcloud.io/summary/new_code?id=PhumlaniDev_infinity-tech-config-server)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=PhumlaniDev_infinity-tech-config-server&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=PhumlaniDev_infinity-tech-config-server)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=PhumlaniDev_infinity-tech-config-server&metric=coverage)](https://sonarcloud.io/summary/new_code?id=PhumlaniDev_infinity-tech-config-server)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=PhumlaniDev_infinity-tech-config-server&metric=duplicated_lines_density)](https://sonarcloud.io/summary/new_code?id=PhumlaniDev_infinity-tech-config-server)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=PhumlaniDev_infinity-tech-config-server&metric=ncloc)](https://sonarcloud.io/summary/new_code?id=PhumlaniDev_infinity-tech-config-server)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=PhumlaniDev_infinity-tech-config-server&metric=reliability_rating)](https://sonarcloud.io/summary/new_code?id=PhumlaniDev_infinity-tech-config-server)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=PhumlaniDev_infinity-tech-config-server&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=PhumlaniDev_infinity-tech-config-server)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=PhumlaniDev_infinity-tech-config-server&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=PhumlaniDev_infinity-tech-config-server)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=PhumlaniDev_infinity-tech-config-server&metric=vulnerabilities)](https://sonarcloud.io/summary/new_code?id=PhumlaniDev_infinity-tech-config-server)

## Overview

The `config-server` is a Spring Boot-based microservice that acts as a centralized configuration server for managing application properties across multiple services. It integrates with Git for storing configuration files and supports encryption for sensitive data.

## Features

- Centralized configuration management.
- Integration with Git for version-controlled configuration files.
- Encryption and decryption of sensitive properties.
- Integration with SonarCloud for code quality analysis.
- Dockerized for easy deployment.
- CI/CD pipeline with GitHub Actions.

## Prerequisites

- Java 21
- Maven
- Docker
- GitHub account with necessary secrets configured for CI/CD.

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/PhumlaniDev/infinity-tech-config-server.git
cd infinity-tech-config-server
```

### Build the Project

```bash
mvn clean install -DskipTests
```

### Run the Application

```bash
java -jar target/config-server-<version>.jar
```

### Run with Docker

```bash
docker build -t config-server .
docker run -p 8888:8888 config-server
```

## CI/CD Pipeline

The project uses GitHub Actions for CI/CD. The pipeline includes:

- **Checkstyle**: Ensures code adheres to style guidelines.
- **Build**: Compiles and packages the application.
- **SAST**: Static Application Security Testing.
- **SCA**: Software Composition Analysis.
- **Notifications**: Sends status updates to Discord.

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request.

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.
```