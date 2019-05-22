FROM maven:3-jdk-8 AS build
COPY pom.xml /build/pom.xml
RUN mvn -f /build/pom.xml dependency:go-offline
COPY src /build/src
RUN mvn -f /build/pom.xml package

FROM openjdk:8
COPY --from=build /build/target/timesheet-1.0-SNAPSHOT.jar /opt/timesheet/timesheet.jar
EXPOSE 80
ENTRYPOINT ["java", "-jar", "/opt/timesheet/timesheet.jar"]