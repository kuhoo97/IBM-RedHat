FROM openjdk
EXPOSE 8081
ADD target/hello-world.jar hello-world.jar
ENTRYPOINT ["sh", "-c", "java -jar /hello-world.jar"]