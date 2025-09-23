# Etapa 1: Compilar con Maven
FROM maven:3.9-eclipse-temurin-21 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Etapa 2: Crear imagen ligera con solo el JAR
FROM openjdk:21-jdk-slim
WORKDIR /app

# Copia el JAR generado (¡con el nombre correcto y escapando el espacio!)
COPY --from=build /app/target/sena.SpringbootApp-version\ 1.jar app.jar

EXPOSE 8080

# Configura Spring Boot para escuchar en el puerto dinámico de Render
ENTRYPOINT ["java", "-jar", "app.jar", "--server.port=${PORT:8080}", "--logging.level.root=DEBUG"]