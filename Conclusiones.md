# Conclusiones

- La herramienta Serenity permitió realizar correctamente y de manera eficiente las pruebas de la app Sauce Labs.
- En el archivo _serenity.properties_ fue necesario agregar las siguientes capabilities appium.appPackage = com.swaglabsmobileapp y  appium.appActivity = com.swaglabsmobileapp.SplashActivity, debido a que sin ellas la app fallaba al momento de empezar el test
- Algunas de los elementos de las interfaces probadas no tenían un id por lo que fue necesario hacer referencia con xpath.
- Por medio de net.serenitybdd.screenplay.Question fue posible implementar una asercion y verificar que efectivamente se abria la pantalla esperada de productos.
