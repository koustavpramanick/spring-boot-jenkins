FROM openjdk:18
LABEL authors="kouprama"
EXPOSE 8081
ADD target/customer-0.0.1-SNAPSHOT.jar customerservice.jar
ENTRYPOINT ["java", "-jar","/customerservice.jar"]