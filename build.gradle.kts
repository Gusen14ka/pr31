plugins {
    application
    java
}

group = "com.task31"
version = "1.0"

repositories {
    mavenCentral()
}


sourceSets {
    getByName("main").java.srcDirs("src")
}


application {
    mainClass.set("com.Main")
}