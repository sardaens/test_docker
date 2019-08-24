FROM openjdk:11-jre-slim

LABEL maintainer="ardaens.stephane@gmail.com"

COPY ./target/test_docker-0.0.1-SNAPSHOT-jar-with-dependencies.jar /app.jar

COPY run.sh /run.sh

# test_docker
ENTRYPOINT ["/run.sh"]
