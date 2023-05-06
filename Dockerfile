FROM openjdk:21
WORKDIR /app
COPY target/*.jar /app
CMD ["java", "-jar", "animal-1.0.0.jar"]