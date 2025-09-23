# Imagen base de Java
FROM openjdk:21-jdk-slim

# Directorio de trabajo dentro del contenedor
copy target/sena.SpringbootApp-version%201.jar /api-v1.jar

# Comando para ejecutar la aplicación
CMD ["java", "-jar", "/api-v1.jar"]