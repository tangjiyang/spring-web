FROM dockette/jdk8:latest
WORKDIR /root
ADD ./spring-web-1.0-SNAPSHOT.jar /root/app.jar
EXPOSE 9001
ENTRYPOINT ["java" "-jar" "/root/app.jar"]
