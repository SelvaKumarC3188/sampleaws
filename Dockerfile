FROM eclipse-temurin:17
COPY target/sampleaws.jar sampleaws.jar
CMD ["java","-jar","sampleaws.jar"]