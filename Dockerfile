FROM openjdk:8-jdk-alpine
COPY target/WebScrapAPI-1.0.0.jar WebScrapAPI-1.0.0.jar
ENTRYPOINT ["java","-jar","/message-server-1.0.0.jar"]