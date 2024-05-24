package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.ui.LoginView;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenLogin implements Task {
    public static Task colocarseEnUsername() { return instrumented(OpenLogin.class);}
    @Override
    public <T extends Actor> void performAs(T miActor) {
        miActor.attemptsTo(
                Click.on(LoginView.texto_usuario)
                //comprobaremos que el usuario pudo acceder a la pantalla de login si es que puede dar click y siturase en la caja de texto de usuario
        );
    }
}
