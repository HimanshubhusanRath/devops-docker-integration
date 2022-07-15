FROM openjdk:17-oracle
EXPOSE 8080
ADD target/devops-docker-integration.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]