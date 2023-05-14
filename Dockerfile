FROM maven:3.8.1-jdk-17 AS build
WORKDIR /app

# Copy the pom.xml file to the container
COPY pom.xml .

# Download and install the dependencies
RUN mvn dependency:go-offline

# Copy the rest of the project to the container
COPY . .

# Build the application
RUN mvn package -DskipTests

# Use a lightweight image of the JRE as the base image
FROM adoptopenjdk:11-jre-hotspot-bionic

# Set the working directory to /app
WORKDIR /app

# Copy the packaged JAR file from the build image to the container
COPY --from=build /app/target/my-application.jar .

# Expose port 8080 for the application
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "my-application.jar"]

#FROM openjdk:21
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} app.jar
#CMD ["java", "-jar", "app.jar"]
