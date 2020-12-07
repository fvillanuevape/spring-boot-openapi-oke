FROM openjdk:8-jdk-alpine
LABEL Description="Image API REST Article Demo" Vendor="ACME Products" Version="1.0.0"
LABEL maintainer="villanuevafidelid@gmail.com"
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]