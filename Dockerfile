FROM openjdk:8-jdk-alpine
ARG JAR_FILE=/build/libs/*.jar
COPY ${JAR_FILE} /base-service.jar
ENTRYPOINT ["java","-jar","/base-service.jar"]


