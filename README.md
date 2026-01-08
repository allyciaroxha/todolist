# Todolist

Projeto Spring Boot com Lombok, compilado com **Java 17**.

## Requisitos locais
1. Instale um JDK 17 (Eclipse Temurin / Adoptium, por exemplo).
2. Garanta que o `java` do terminal aponta para essa instalação antes de rodar o Maven:
   ```powershell
   $env:JAVA_HOME='C:\Program Files\Eclipse Adoptium\jdk-17.0.9.1-hotspot'
   $env:PATH="$env:JAVA_HOME\bin;$env:PATH"
   java -version  # confirme que mostra Java 17
   ```
3. Lombok depende dessa versão; o compilador do Java 21 gera `TypeTag :: UNKNOWN` e quebra o build.

## Como compilar local
```powershell
mvn clean package
java -jar target/todolist-1.0.0.jar
```
