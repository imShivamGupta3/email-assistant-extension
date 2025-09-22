# Use an official OpenJDK runtime as a parent image
FROM openjdk:21-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the Maven wrapper files
COPY .mvn/ .mvn
COPY mvnw pom.xml ./

# Make the Maven Wrapper executable
RUN chmod +x ./mvnw

# Download dependencies
RUN ./mvnw dependency:go-offline

# Copy the rest of the source code
COPY src ./src

# Package the application into a JAR file
RUN ./mvnw package -DskipTests

# Set the command to run the application
ENTRYPOINT ["java","-jar","target/Email-assistant-0.0.1-SNAPSHOT.jar"]