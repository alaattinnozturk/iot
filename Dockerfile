FROM maven:latest AS build
WORKDIR /app
COPY . /app
RUN mvn clean package

FROM openjdk:17-jdk
WORKDIR /app
COPY --from=build /app/target/*.jar /app/app.jar
ENTRYPOINT ["java","-jar","/app/app.jar"]
