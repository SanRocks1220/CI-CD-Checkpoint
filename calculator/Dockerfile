FROM openjdk:17-alpine
EXPOSE 8081
ADD target/calculator-1.0-SNAPSHOT.jar calculator-1.0-SNAPSHOT.jar
ENTRYPOINT [ "java", "-jar", "calculator-1.0-SNAPSHOT.jar"]