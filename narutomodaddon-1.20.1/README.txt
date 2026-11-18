NarutoModAddon 1.20.1 - API-independent build

This patched source removes runtime/compile-time references to:
- net.narutomod.Chakra
- net.narutomod.Chakra$Pathway
- net.narutomod.Chakra$PathwayPlayer
- net.narutomod.PlayerTracker

Removed addon features:
- Chakra charging effect, keybind, overlay, and charge item
- Chakra-block effect/item
- Ninja XP item and /addchakra and /fillchakra commands
- /ninjastart and automatic ninja-start-on-join
- Keep Ninja XP on death setting

Preserved:
- /changekkg [kkg]
- /changekkg for <player> <kkg> (operator)
- /addonsettings and /addonsettings rerollkkg <true|false>
- Kekkei Genkai advancement/item assignment logic

Build:
- Minecraft 1.20.1
- Forge 47.4.28
- Java 17
- Gradle 8.1.1 or compatible Gradle 8.x

Run `gradle build` in this project folder. The reobfuscated mod JAR will be in build/libs/.
