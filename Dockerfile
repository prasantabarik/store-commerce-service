FROM openjdk:11-jre-slim
COPY store-commerce-service-1.0-SNAPSHOT app.jar
ENTRYPOINT ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar","app.jar"]
EXPOSE 8098
