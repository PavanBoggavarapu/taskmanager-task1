# Use full OpenJDK runtime
FROM openjdk:20-jdk

# Set working directory
WORKDIR /app

# Copy the JAR built by Maven
COPY target/taskmanager-1.0-SNAPSHOT.jar app.jar

# Expose port
EXPOSE 8080

# Run the JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
