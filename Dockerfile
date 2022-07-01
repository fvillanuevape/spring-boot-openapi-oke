FROM openjdk:8-jdk-alpine
LABEL Description="Image API Article" Vendor="ACME Products" Version="1.0.0"
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app-api.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app-api.jar"]