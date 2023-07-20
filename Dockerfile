FROM openjdk:17
ADD target/newbookstore.jar newbookstore.jar
EXPOSE 8081
ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar newbookstore-0.0.1.jar"]