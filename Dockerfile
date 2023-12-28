FROM maven:3-amazoncorretto-17
VOLUME /tmp
COPY pom.xml .
COPY src ./src
RUN mvn clean install
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]