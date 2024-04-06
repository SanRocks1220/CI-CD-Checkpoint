FROM maven:3.8-openjdk-11-slim AS build

COPY pom.xml /usr/src/app/
RUN mvn -f /usr/src/app/pom.xml dependency:go-offline -B
COPY src /usr/src/app/src
RUN mvn -f /usr/src/app/pom.xml package -DskipTests
FROM openjdk:11-jre-slim
COPY --from=build /usr/src/app/target/*.jar /usr/app/app.jar
CMD ["java", "-jar", "/usr/app/app.jar"]