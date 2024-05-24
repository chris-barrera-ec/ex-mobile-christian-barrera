package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class LoginView {
    public static Target texto_usuario = Target.the("texto_usuario").located(AppiumBy.accessibilityId("test-Username"));
    public static Target texto_clave = Target.the("texto_clave").located(AppiumBy.accessibilityId("test-Password"));
    public static Target boton_login = Target.the("boton_login").located(AppiumBy.accessibilityId("test-LOGIN"));
}
