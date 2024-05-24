package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import starter.ui.LoginView;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginTask implements Task {
    public static Task ingresaUsuarioClave() { return instrumented(LoginTask.class);}
    @Override
    public <T extends Actor> void performAs(T miActor) {
        miActor.attemptsTo(
                SendKeys.of("standard_user").into(LoginView.texto_usuario),
                SendKeys.of("secret_sauce").into(LoginView.texto_clave),
                Click.on(LoginView.boton_login)
        );
    }
}
