FROM maven
LABEL authors="srinadhpodhili"
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests
RUN cp target/*.jar App.jar
ENTRYPOINT ["java", "-jar","App.jar"]