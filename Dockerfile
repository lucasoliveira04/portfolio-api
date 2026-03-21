FROM eclipse-temurin:21-jre-alpine
WORKDIR /app

COPY quarkus-app/lib/ ./lib/
COPY quarkus-app/*.jar ./
COPY quarkus-app/app/ ./app/
COPY quarkus-app/quarkus/ ./quarkus/

EXPOSE 8081

ENV QUARKUS_PROFILE=prod

ENTRYPOINT ["java", "-jar", "quarkus-run.jar"]