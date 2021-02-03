# Stock On Hand Schemas

Avro Schemas with validation and build jar.

To build, you can use either Gradle or Maven, depending upon preferences.

## Gradle Build

```shell
./gradlew clean build jar
```

Generated classes will be in `build/generated-main-avro-java`

The packaged jar will be in `build/libs`

## Maven Build

```shell
mvn clean package
```

Generated classes will be in `target/generated-sources/avro`

The packaged jar will be in `target`

