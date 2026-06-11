FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY target/*.jar app.jar
#COPY target/myapp.jar app.jar

CMD ["java", "-jar", "app.jar"]