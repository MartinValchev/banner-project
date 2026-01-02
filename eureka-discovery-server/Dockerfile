# Stage 1: Build the application
FROM maven:3.9-eclipse-temurin-17-alpine AS build

#copy pom.xml and download depedndencies \
WORKDIR /eureka
COPY eureka-discovery-sever/pom.xml .
RUN mvn dependency:go-offline -B

# Copy Sources
COPY eureka-discovery-sever/src ./src
RUN mvn clean package -DskipTests

# Stage 2: Create runtime image
FROM eclipse-temurin:17-jre-alpine

WORKDIR /eureka
# Copy source code and build
COPY --from=build /eureka/target/*.jar eureka.jar
EXPOSE 8761

ENTRYPOINT ["java",  "-jar", "eureka.jar"]