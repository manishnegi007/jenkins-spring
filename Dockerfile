FROM openjdk:latest
EXPOSE 8080
ADD target/jenkins-spring.jar jenkins-spring.jar
ENTRYPOINT ["java","-jar","/jenkins-spring.jar"]