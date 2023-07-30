FROM openjdk:18-jdk-alpine
COPY target/WebScrapAPI-0.0.1-SNAPSHOT.jar WebScrapAPI-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/WebScrapAPI-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080