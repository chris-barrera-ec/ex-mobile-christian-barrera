package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import starter.ui.AreaProductsView;

public class OpenedProductsQuestion implements Question {

    @Override
    public String answeredBy(Actor miActor) {
        return AreaProductsView.tituloPantalla.resolveFor(miActor).getText();

    }
    public static Question<String> value() {
        return new OpenedProductsQuestion();
    }
}
