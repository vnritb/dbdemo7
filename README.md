This is a Kotlin Multiplatform project targeting Android, Web, Desktop.

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.


Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html),
[Compose Multiplatform](https://github.com/JetBrains/compose-multiplatform/#compose-multiplatform),
[Kotlin/Wasm](https://kotl.in/wasm/)…

We would appreciate your feedback on Compose/Web and Kotlin/Wasm in the public Slack channel [#compose-web](https://slack-chats.kotlinlang.org/c/compose-web).
If you face any issues, please report them on [GitHub](https://github.com/JetBrains/compose-multiplatform/issues).

You can open the web application by running the `:composeApp:wasmJsBrowserDevelopmentRun` Gradle task.

# Passos que s'ha de seguir per a executar el projecte:
Aquest projecte s'ha creat des de la plantilla de kotlin amb  android+desktop+wasm
S'ha obert iteliJ IDEA i s'ha selecionat l'opció de crear nou projecte, i s'ha seleccionat l'enllaç del wizard
Posteriorment, s'ha descomprimit el projecte, s'ha obert amb IntelliJ IDEA, s'ha configurat, i s'ha pujat al repositori

Per poder treballar amb InteliJ, s'ha deseguir els següents passos:

1. Instalar els plugins a InteliJ IDEA
    1. Gradle
    2. Android
    3. Jetpack Compose
    4. Compose Multiplatform IDE suport
    5. SQL Delight
    6. Viual Studio Key map
2. Verificar que està instal·lat l'Android Studio (es pot fer servir JetBrains Toolbox)
3. Comprova on s'ha instal·lat l'Android SDK (normalment a la carpeta de l'Android Studio)
4. Configurar l'SDK d'Android a IntelliJ IDEA (Cercar Android Project Structurea Settings)
5. Configurar l'atribut sdk.dir del local.properties amb el mateix Android SDK
6. Si el projecte el demana, actualitzar l'AGP (Android Gradle Plugin)
7. Configurar un dispositiu mòvil a running devices (per emular l'aplicació android)
8. Si editeu aquest mateix read.md, en alun moment, l'entorn detectarà que estas escrivint en català, i et demanarà si vols baixar-te el diccionari

Amb tot això, ja es pot reiniciar l'InteliJ, i anar a Gradle i fer 'download sources', i sincronitzar el projecte

Per executar la versió *web*, s'ha de fer servir el plugin de Gradle de la versió web, i executar la tasca de `:composeApp:wasmJsBrowserDevelopmentRun`
A la versió *Android*, hauria d'aparèixer una fletxa verda que configurarà i executarà una run configuration d'Android
A la de *desktop*, hauria d'aparèixer una fletxa verda que configurarà i executarà una run configurationde Gradle per laversió d'escriptori
Es generarà aquesta configuració de Gradle: desktopRun -DmainClass=cat.itb.damv2.m78.dbdemo.MainKt --quiet
Enrecordar-se de guardar laconfiguració del desktopRun, perquè no es guarda automàticament


També es poden configurar les run configurations manualment. 
És recomanable tenir un clean, un build, i un assemble de Gradle.

