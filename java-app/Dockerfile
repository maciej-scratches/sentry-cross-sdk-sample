FROM maven:3.6.1-jdk-11-slim as maven
WORKDIR /spring
COPY src src
COPY pom.xml pom.xml
RUN mvn package

FROM openjdk:11.0.3-jdk-slim
WORKDIR /spring
COPY --from=maven /spring/target/hello-service-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]

