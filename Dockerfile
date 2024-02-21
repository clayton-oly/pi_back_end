# Use a imagem oficial do OpenJDK para Java 11
FROM openjdk:11-jdk

# Define a variável de ambiente para indicar que a aplicação está rodando no Render
ENV RENDER true

# Copie o arquivo JAR da sua aplicação Spring Boot para o diretório /app dentro do container
COPY target/nsg-0.0.1-SNAPSHOT.jar /app/nsg.jar

# Exponha a porta em que a sua aplicação Spring Boot está rodando
EXPOSE 8080

# Comando para iniciar a aplicação quando o container for iniciado
CMD ["java", "-jar", "/app/nsg.jar"]
