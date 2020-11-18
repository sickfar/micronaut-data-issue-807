FROM openjdk:14-alpine
COPY target/uclass-sample-*.jar uclass-sample.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "uclass-sample.jar"]