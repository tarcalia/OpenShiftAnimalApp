FROM openjdk:21
WORKDIR /app
COPY target/*.jar /app
CMD ["java", "-jar", "app.jar"]