FROM openjdk:17

EXPOSE 8080

ADD target/demo-1.jar demo-1.jar

CMD ["java", "-jar", "demo-1.jar"]
