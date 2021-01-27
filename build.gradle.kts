plugins {
    `java-library`
    id("com.commercehub.gradle.plugin.avro") version "0.9.1"
}

repositories {
    jcenter()
}

val avroRuntime by configurations.creating

configurations {
    compileClasspath.get().extendsFrom(avroRuntime)
}

sourceSets.create("avroGenerated") {
    java.srcDir("build/generated-main-avro-java")
    compileClasspath = avroRuntime
}

dependencies {
    avroRuntime("org.apache.avro:avro:1.10.0")
    api("org.apache.avro:avro:1.10.0")
    api(sourceSets["avroGenerated"].output)
}
