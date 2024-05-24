package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AreaProductsView {
    public static Target tituloPantalla = Target.the("tituloPantalla").located(By.xpath("//android.widget.TextView[@text=\"PRODUCTS\"]"));
}
