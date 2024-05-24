# Challenge Ejercicio de Automatizacion de una app movil con Serenity BDD con Cucumber y Appium

## Requisitos Previos

Para poder ejecutar el proyecto se debe instalar previamente las siguientes herramientas:
- JDK 15 – Java Development Kit (jdk-15.0.2)
- Gradle v7.6.1
- IntelliJ IDEA (versión usada para desarrollar el proyecto: 2024.1.1 (Community Edition))
- Appium Sever
- Android Studio

## Instrucciones para ejecutar las pruebas
* Ejecutar Appium Sever escuchando en el puerto 4723
* En Device Manager de Android Studio agregar un dispositivo de version 12 u otra (si configura un dispositivo de version distinta a la 12, debe modificarse appium.platformVersion = 12.0 colocando la version que corresponda en el archivo serenity.properties)
* Clonar el repositorio desde https://github.com/chris-barrera-ec/challenge-EjercicioSerenity-open-cart.git
* Abrir la carpeta del proyecto con IntelliJ IDEA y abrir el proyecto por medio del archivo **build.gradle**
* Copiar el path completo de _resources/Android.SauceLabs.Mobile.Sample.app.2.7.1.apk_ y reemplazar el que se encuentra delante de _appium.app =_ del archivo _serenity.properties_
* Una vez cargadas las dependencias dirigirse a la clase java/starter/runners/**CucumberTestSuite**.java
* Y dar clic en Run Test sobre _public class CucumberTestSuite_
* O tambien puede ir a la parte superior de la pantalla y dar clic en Run '**log_in**'
* El escenario de prueba que se ejecutara es el siguiente:
  Scenario: Try to log in with valid credentials and go to products
        - Given Christian wants to access to sauce app
        - When he sends his credentials
        -Then he should see the products
        - And access to a product
        - And back to the products view again

## Instrucciones para visualizar Reporte de Resultado del test ejecutado
- Luego de haber ejecutado un test se puede visualizar el reporte accediendo desde la ventana de herramientas _Project_ de IntelliJ IDEA, ubicando el archivo _build/reports/tests/test/index.html_, dar clic derecho del mouse sobre el archivo -> Open in -> Browser y seleccionar un navegador.

