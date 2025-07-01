FROM openjdk:17
ADD target/spring-boot-eks.jar spring-boot-eks.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","spring-boot-eks.jar"]