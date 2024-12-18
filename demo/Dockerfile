FROM openjdk:17
VOLUME /tmp
ADD demo/target/demo-0.0.1-SNAPSHOT.jar demo.jar
ENTRYPOINT ["java","-jar","/demo.jar"]