FROM openjdk:8-jdk-alpine
VOLUME /tmp

COPY service_A/service_A/target/service_A-0.0.1-SNAPSHOT.jar app.jar
COPY service_B/service_B/target/service_B-0.0.1-SNAPSHOT.jar app2.jar

COPY invoke.sh invoke.sh

ENTRYPOINT ["sh","/invoke.sh","-b"]
