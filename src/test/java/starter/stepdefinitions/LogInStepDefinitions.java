package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import starter.questions.OpenedProductsQuestion;
import starter.tasks.AccessToProduct;
import starter.tasks.BackToProducts;
import starter.tasks.LoginTask;
import starter.tasks.OpenLogin;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class LogInStepDefinitions {


    @Managed(driver = "Appium")
    public WebDriver hisMobileDevice;

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("Christian wants to access to sauce app")
    public void christian_wants_to_access_to_sauce_app() {
        theActorCalled("Christian")
                .attemptsTo(
                        OpenLogin.colocarseEnUsername()
                );
    }

    @When("he sends his credentials")
    public void he_sends_his_credentials(){
        theActorInTheSpotlight().attemptsTo(
                LoginTask.ingresaUsuarioClave()
        );
    }

    @Then("he should see the products")
    public void he_should_see_the_products(){
        String textoEsperado = "PRODUCTS";  //texto a comparar en la asercion

        theActorInTheSpotlight().should(
                seeThat("El texto en el titulo es: ", OpenedProductsQuestion.value(), equalTo(textoEsperado))
        );
    }

    @And("access to a product")
    public void access_to_a_product()
    {
        theActorInTheSpotlight().attemptsTo(
                AccessToProduct.navegarAlProducto()
        );
    }

    @And("back to the products view again")
    public void back_to_the_products_view_again(){
        theActorInTheSpotlight().attemptsTo(
                BackToProducts.regresarAProductos()
        );
    }
}
