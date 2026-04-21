from gradle:7.5-jdk17 as build
WORKDIR /app
COPY . .
RUN ./gradlew clean build -x test --no-daemon


FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY --from=build /app/build/libs/*.jar  /app/agendador-tarefas.jar

EXPOSE 8081

CMD ["java", "-jar", "/app/agendador-tarefas.jar"]