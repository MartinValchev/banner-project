# Stage 1: Build the application
FROM maven:3.9-eclipse-temurin-17-alpine AS build

#copy pom.xml and download depedndencies \
WORKDIR /home/vagrant/app
COPY banner-project/banner-project/pom.xml .
RUN mvn dependency:go-offline -B

# Copy Sources
COPY banner-project/banner-project/src ./src
RUN mvn clean package -DskipTests

# Stage 2: Create runtime image
FROM eclipse-temurin:17-jre-alpine

WORKDIR /home/vagrant/app
# Copy source code and build
COPY --from=build /home/vagrant/app/target/*.jar app.jar
EXPOSE 8080

ENV SPRING_DATASOURCE_URL=jdbc:postgresql://postgres:5432/banner_campaign_db
ENV SPRING_DATASOURCE_USERNAME=martinv
ENV SPRING_DATASOURCE_PASSWORD=Password123@

ENTRYPOINT ["java",  "-jar", "app.jar"]

