FROM openjdk:8-jdk-alpine
MAINTAINER dmjadhav
COPY target/dockerjenkins.jar dockerjenkins.jar
ENTRYPOINT ["java","-jar","./dockerjenkins.jar"]