FROM openjdk

RUN mkdir -p /app/trabalho

ENV APP_NAME=trabalho.zip

COPY ${APP_NAME} /app/trabalho

EXPOSE 8080

ENTRYPOINT ["java", "trabalho.java" , "javac", "trabalho" "app/trabalho/trabalho.zip"]
