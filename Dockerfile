FROM openjdk:17
ADD build/libs/newbookstore-0.0.1.war newbookstore-0.0.1.war
EXPOSE 8080
ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar newbookstore-0.0.1.war"]