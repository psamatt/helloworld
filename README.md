### Hello World example application

Spring Boot app build using Gradle with Docker / Docker compose, API documented using Swagger

#### Gradle
Build Jar
```shell
./gradlew clean assemble
```

Execute tests
```shell
./gradlew test
```

Run locally
```shell
./gradlew bootrun
```

#### Docker Compose
Run Docker image
```shell
docker-compose up -d --build 
```

#### Docker
Build Docker image
```shell
docker build -f Dockerfile -t psamatt/helloworld .
```

Run Docker image (without compose)
```shell
docker run -d -p 8080:8080 psamatt/helloworld
```

View Docker logs
```shell
docker logs -f <container_id>
```

#### Swagger

Open Browser, visit: http://localhost:8080/swagger-ui.html