# Primeiro estágio: Construir a aplicação com Maven e Java 17
FROM maven:3.8.4-openjdk-17 AS builder

WORKDIR /app

# Copiar o arquivo pom.xml para baixar as dependências
COPY pom.xml .

# Baixar as dependências do Maven
RUN mvn dependency:go-offline

# Copiar o código-fonte da aplicação
COPY src ./src

# Compilar a aplicação
RUN mvn clean install

# Segundo estágio: Executar o JAR gerado
FROM openjdk:17-slim

WORKDIR /app

# Copiar o JAR gerado do primeiro estágio
COPY --from=builder /app/target/java-serpro-1.0.0-SNAPSHOT.jar .

# Executar o JAR
CMD ["java", "-jar", "java-serpro-1.0.0-SNAPSHOT.jar"]
