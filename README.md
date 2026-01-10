🛠️ Tecnologías utilizadas



Pagina automatizada: https://www.saucedemo.com/



Lenguaje: Java 17



Framework de automatización: Serenity BDD



Gestor de dependencias: Gradle



Patrón de diseño: Screenplay



ID: IntelliJ IDEA 2025.3.1.1



Navegador: Microsoft Edge



📋 Requisitos previos

Tener instalado openjdk version "17.0.0.1" 2024-07-02 .



Tener instalado Gradle 7.6.1



Microsoft Edge actualizado (Version 143.0.3650.139 (Official build) (64-bit)





🚀 Instalación y Ejecución

Para clonar y ejecutar las pruebas, sigue estos pasos:



Clonar el repositorio:



Bash



git clone https://github.com/jninahualpa80/retosaucedemo.git



cd tu-repositorio



Nota Importante:



Esta configurado para poder ejecutar con webdriver descargado manualmente, se debe descargar el webdriver para edge y pegar el .exe en la carpeta



src\\test\\resources\\drivers



Si se desea ejecutar con otro explorador se debe realizar cambios en el archivo



\\src\\test\\resources\\serenity.conf



comentar de la linea 1 a la 28



colocar la configuracion para otro explorador para más referencia visite : https://serenity-bdd.github.io/docs/guide/driver\_config



Comando para limpiar el proyecto y luego ejecuta TODOS los escenarios uno por uno



./gradlew clean test



Comando para ejecutar por feature



./gradlew test --tests "co.com.screemplay.project.runners.RunnerShop"



📊 Reportes



Una vez finalizada la ejecución, puedes ver el detalle de las pruebas en el reporte de Serenity:



Ruta: build/reports/tests/test/index.html

