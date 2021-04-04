FROM java:8-jdk-alpine

COPY ./target/bookservice-1.0.0-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch bookservice-1.0.0-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","bookservice-1.0.0-SNAPSHOT.jar"]