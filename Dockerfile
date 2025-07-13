# --- Build Stage ---
FROM maven:3.9.6-eclipse-temurin-23-alpine AS build
WORKDIR /app
COPY . .
RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests

# --- Run Stage ---
FROM eclipse-temurin:23-jdk-alpine
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
