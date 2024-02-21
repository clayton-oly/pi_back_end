# Use uma imagem base que contenha o ambiente Java
FROM openjdk:11-jre-slim

# Define o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copia o arquivo JAR do seu aplicativo para o diretório de trabalho no contêiner
COPY target/nsg-0.0.1-SNAPSHOT.jar /app/app.jar

# Define o comando padrão a ser executado quando o contêiner for iniciado
CMD ["java", "-jar", "app.jar"]
