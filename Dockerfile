FROM nginx:latest
ADD app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"] 