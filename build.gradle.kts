import xyz.srnyx.gradlegalaxy.enums.Repository
import xyz.srnyx.gradlegalaxy.enums.repository
import xyz.srnyx.gradlegalaxy.utility.setupAnnoyingAPI
import xyz.srnyx.gradlegalaxy.utility.spigotAPI


plugins {
    java
    id("xyz.srnyx.gradle-galaxy") version "1.1.2"
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

setupAnnoyingAPI("4.1.0", "xyz.srnyx", "1.2.0", "Plugin used for GeekSMP's voting system")
spigotAPI("1.19")
repository(Repository.DV8TION, Repository.SCARSZ)
dependencies.compileOnly("com.discordsrv", "discordsrv", "1.25.1")
