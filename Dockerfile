FROM openjdk:17-jdk-slim

WORKDIR /app

COPY build/libs/hashtag-0.0.1-SNAPSHOT.jar hashtag-service.jar

EXPOSE 10200

ENTRYPOINT ["java", "-jar", "hashtag-service.jar"]

ENV TZ=Asia/Seoul