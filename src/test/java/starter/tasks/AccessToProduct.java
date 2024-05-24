package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.ui.ProductsView;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AccessToProduct implements Task {
    public static Task navegarAlProducto() { return instrumented(AccessToProduct.class);}
    @Override
    public <T extends Actor> void performAs(T miActor) {
        miActor.attemptsTo(
                Click.on(ProductsView.productos),
                        Click.on(ProductsView.productos_elemento)
                //comprobaremos que el usuario pudo acceder a la pantalla de productos si es que puede dar click en productos y luego dar clic en uno de ellos
        );
    }
}
