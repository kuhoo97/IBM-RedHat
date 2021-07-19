FROM openjdk:latest
EXPOSE 8082
ADD target/gadget-service.jar gadget-service.jar
ENTRYPOINT ["sh", "-c", "java -jar /gadget-service.jar"]