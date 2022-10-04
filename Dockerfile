FROM maven:latest
COPY . .
COPY /target/Calculator-0.0.1-SNAPSHOT.jar calculator.jar
CMD java -jar calculator.jar