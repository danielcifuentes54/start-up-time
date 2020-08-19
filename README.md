# start-up-time
Hello World on spring boot to compare start-up time between Spring and Micronaut on GraalVM

### [Micronaut on GraalVM](https://github.com/danielcifuentes54/micronaut-graalvm)

### Docker

```sh
$ docker build -t spring-boot-app .
```

### Results
### start-up time

| Spring Boot App on JVM | Micronaut on Graalvm |
| ------ | ------ |
| 6404 ms | 129 ms |

### docker image size

| Spring Boot App on JVM | Micronaut on Graalvm |
| ------ | ------ |
| 121 MB | 72.5 MB |
