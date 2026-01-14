package co.com.screemplay.project.stepdefinition;

import co.com.screemplay.project.questions.TheCartItems;
import co.com.screemplay.project.questions.TheOrder;
import co.com.screemplay.project.tasks.Login;
import co.com.screemplay.project.utils.Time;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import org.hamcrest.Matchers;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.hasItems;
import static co.com.screemplay.project.utils.Constants.TIME_SHORT;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import co.com.screemplay.project.tasks.SeleccionarProductos;
import co.com.screemplay.project.tasks.FinalizarCompra;

public class OpenWebStepShop {


    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }




    @When("Selecciono un producto del catalogo {string} y {string}")
    public void seleccionoUnProductoDelCatalogoY(String prod1, String prod2) {
            theActorInTheSpotlight().attemptsTo(
                        SeleccionarProductos.paraElCarrito(prod1, prod2)

        );
    }

    @Then("agrego el producto al carito {string} y {string}")
    public void agregoElProductoAlCaritoY(String prod1, String prod2) {
        theActorInTheSpotlight().should(
                seeThat(TheCartItems.names(), hasItems(prod1,prod2))
        );
    }
    @Then("debería ver el mensaje de confirmación {string}")
    public void deberíaVerElMensajeDeConfirmación(String mensaje) {
        theActorInTheSpotlight().should(
                seeThat(TheOrder.status(), Matchers.containsString(mensaje))
        );
    }

    @Given("{string} ingreso a la pagina con {string} y {string}")
    public void ingresoALaPaginaConY(String actor, String user, String password) {
        OnStage.theActorCalled(actor).attemptsTo(
                //   OpenWeb.browserURL(WEB_URL)
                Open.url("https://www.saucedemo.com/")
        );
        Time.waiting(TIME_SHORT);
        theActorInTheSpotlight().should(
                seeThat(
                        TheWebPage.title(),
                        Matchers.containsString("Swag Labs")
                )

        );
        theActorInTheSpotlight().attemptsTo(
                Login.conCredenciales(user, password)
        );
    }

     @And("finaliza la compra con los datos requeridos {string} y {string} y {string}")
    public void finalizaLaCompraConLosDatosRequeridosYY(String firstName, String lastName, String zipCode) {

        theActorInTheSpotlight().attemptsTo(
                FinalizarCompra.conDatos(firstName,lastName,zipCode)
        );
    }
}
