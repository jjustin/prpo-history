FROM adoptopenjdk:14-jre-openj9

WORKDIR /app

ADD ./api/target/api-1.0-SNAPSHOT.jar /app

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "api-1.0-SNAPSHOT.jar"]