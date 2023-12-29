FROM maven:3-amazoncorretto-17 AS build
WORKDIR /usr/src/app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests  # Ensure the build includes packaging the JAR

FROM openjdk:17-jdk-slim
WORKDIR /usr/src/app
COPY --from=build /usr/src/app/target/*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]