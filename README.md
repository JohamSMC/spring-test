# Spring Boot App - Docker

[![GitHub User](https://img.shields.io/badge/GitHub-JohamSMC-red?style=plastic&logo=github&link=https://github.com/JohamSMC)](https://github.com/JohamSMC)

## API Rest

API REST desarrollada con [Java <code><img width="2%" src="https://www.vectorlogo.zone/logos/java/java-ar21.svg"></code>](https://www.java.com/es/)
y [Spring Boot <code><img width="2%" src="https://www.vectorlogo.zone/logos/springio/springio-ar21.svg"></code>](https://spring.io/projects/spring-boot)

## Tests en GitHub Actions

[Enlace Tests en GitHub Actions](https://github.com/JohamSMC)

##  :one: Pasos para ejecutar la Aplipación :page_facing_up:


### Primer paso:
Crear jar del proyecto:
```
mvn clean package
```

### Segundo paso:
Crear imagen docker del proyecto:
```
docker build -t spring-app:v1 .
```

### Tercer paso:
Correr contenedor docker con la imagen generada en el paso 2:
```
docker run -p 9090:9090 spring-test:v1
```