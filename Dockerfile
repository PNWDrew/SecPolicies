FROM open jdk
EXPOSE 8080
COPY target/*.jar /
ENTRYPOINT ["java","-jar", "/webgoat.jar"]