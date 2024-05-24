package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductsView {
    public static Target productos = Target.the("productos").located(AppiumBy.accessibilityId("test-PRODUCTS"));
    public static Target productos_elemento = Target.the("productos_elemento").located(By.xpath("(//android.view.ViewGroup[@content-desc=\"test-Item\"])[1]"));
}
