package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.ui.ProductView;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BackToProducts implements Task {
    public static Task regresarAProductos() { return instrumented(BackToProducts.class);}
    @Override
    public <T extends Actor> void performAs(T miActor) {
        miActor.attemptsTo(
                Click.on(ProductView.boton_regresar_a_productos)
        );
    }
}
