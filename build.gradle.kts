plugins {
    id("java")
}

group = "org.somethings"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    //testImplementation(platform("org.junit:junit-bom:5.9.1"))
    //testImplementation("org.junit.jupiter:junit-jupiter")

    //testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
    testImplementation("org.testng:testng:7.1.0")


}

tasks.test {
    //useJUnitPlatform()
    useTestNG()
}