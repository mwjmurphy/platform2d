plugins {
    id("java")
    kotlin("jvm")
    id("io.freefair.lombok") version "8.11"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation(kotlin("stdlib-jdk8"))
    implementation("org.apache.maven:maven-slf4j-provider:3.9.9")

}

tasks.test {
    useJUnitPlatform {
        excludeTags( "integration-test")
    }
}
//def testIntegration = tasks.register("testIntegration", Test) {
//    useJUnitPlatform {
//        includeTags( "integration-test")
//    }
//    shouldRunAfter test
//    ignoreFailure true
//}

kotlin {
    jvmToolchain(21)
}