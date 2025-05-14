FROM eclipse-temurin:21-alpine

WORKDIR /app

COPY src/ ./src/

RUN mkdir -p out

RUN sh -c "javac -d out \$(find src -name '*.java')"

CMD ["java", "-cp", "out", "com.duggavamshidhar.Main"]
