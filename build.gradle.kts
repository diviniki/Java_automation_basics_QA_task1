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

    testImplementation("junit:junit:4.13")
    //testImplementation("org.testng:testng:7.1.0")


}

tasks.test {
    useJUnit()
    //useJUnitPlatform()
    //useTestNG()
}