FROM openjdk:8-jdk-alpine
COPY target/start-up-time-0.0.1-SNAPSHOT.jar app.jar
WORKDIR /app
ENTRYPOINT ["java","-jar","/app.jar"]