package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductView {
    public static Target boton_regresar_a_productos = Target.the("boton_regresar_a_productos").located(By.xpath("//android.view.ViewGroup[@content-desc=\"test-BACK TO PRODUCTS\"]"));

}
