FROM eclipse-temurin:21-alpine

WORKDIR /app

COPY src/ ./src/

RUN mkdir -p out
RUN mkdir -p releases

RUN sh -c "javac -d out \$(find src -name '*.java')"
RUN sh -c  "jar --create --verbose --file=releases/Exercises.jar --main-class=com.duggavamshidhar.Main -C out ."

CMD ["java", "-jar", "releases/Exercises.jar"]
