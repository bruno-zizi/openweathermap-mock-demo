FROM amazoncorretto:17-alpine-jdk
WORKDIR /weatherApp
COPY . .
RUN chmod 775 ./mvnw
RUN ./mvnw -DskipTests=true package
WORKDIR /weatherApp/target
EXPOSE 8080
ENTRYPOINT ["java","-jar","openweathermap-mock-demo-0.0.1-SNAPSHOT.jar"]