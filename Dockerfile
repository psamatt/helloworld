FROM openjdk:11

COPY build/libs/*.jar app.jar

CMD ["java", "-jar", "app.jar"]
EXPOSE 8080