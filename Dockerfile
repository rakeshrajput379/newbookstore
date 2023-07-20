FROM openjdk:17
ADD newbookstore.jar newbookstore.jar
EXPOSE 8080
ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar newbookstore-0.0.1.jar"]