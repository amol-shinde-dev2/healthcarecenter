FROM openjdk:17-jdk
COPY /target/management.jar management.jar
EXPOSE 8089:8089
ENTRYPOINT [ "java","-jar","/app/management.jar" ]