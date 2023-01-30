FROM eclipse-temurin:17-jdk-alpine
ENV PORT=9090
COPY target/api-1.0.0.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]