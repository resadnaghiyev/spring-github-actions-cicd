FROM openjdk:11
EXPOSE 8080
ADD target/spring-github-actions.jar spring-github-actions.jar
ENTRYPOINT ["java","-jar","/spring-github-actions.jar"]