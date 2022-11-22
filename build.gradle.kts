description = "GeekSMP3"
version = "1.0.1"
group = "xyz.srnyx"

plugins {
    java
}

repositories {
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots") // org.spigotmc:spigot-api
    maven("https://m2.dv8tion.net/releases") // com.discordsrv:discordsrv
    maven("https://nexus.scarsz.me/content/groups/public") // com.discordsrv:discordsrv
    mavenCentral() // org.spigotmc:spigot-api
}

dependencies {
    compileOnly("org.spigotmc:spigot-api:1.19.2-R0.1-SNAPSHOT")
    compileOnly("com.discordsrv:discordsrv:1.25.1")
    implementation("org.jetbrains:annotations:23.0.0")
}

tasks {
    compileJava {
        options.encoding = "UTF-8"
    }

    processResources {
        inputs.property("version", project.version)
        filesMatching("**/plugin.yml") {
            expand("version" to project.version)
        }
    }
}