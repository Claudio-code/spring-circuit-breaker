FROM amazoncorretto:21-alpine-jdk AS builder

WORKDIR /builder

COPY . .

RUN ./gradlew build -x test --no-daemon

FROM amazoncorretto:21-alpine-jdk

ENV SPRING_PROFILES_ACTIVE=prod

COPY --from=builder /builder/build/libs/circuit-0.0.1-SNAPSHOT.jar /app.jar

ENTRYPOINT ["java", "-jar", "app.jar", "-Xms128m", "-Xmx600m"]