FROM openjdk:17
EXPOSE 8080
ADD target/newbookstore.jar newbookstore.jar
ENTRYPOINT ["java","-jar","/newbookstore.jar"]