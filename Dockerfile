FROM openjdk:17
#ADD target/springboot-k8s-demo.jar springboot-k8s-demo.jar

WORKDIR /app
COPY ./target/spring-boot-docker-demo.jar  /app

EXPOSE 8080

CMD ["java","-jar","spring-boot-docker-demo.jar"]

#ENDPOINT ["java","-jar","spring-boot-docker-demo.jar"]



