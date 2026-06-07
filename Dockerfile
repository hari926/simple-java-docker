# Base Java image
FROM eclipse-temurin:17-jdk

# Working directory
WORKDIR /app

# Copy source code
COPY src/Main.java /app/Main.java

# Compile Java
RUN javac Main.java

# Run application
CMD ["java", "Main"]
