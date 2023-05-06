FROM openjdk:21
WORKDIR /app
COPY target/app.jar /app
CMD ["java", "-jar", "app.jar"]