FROM openjdk:20-jdk-slim
LABEL maintainer=justin
COPY target/*.jar   /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]