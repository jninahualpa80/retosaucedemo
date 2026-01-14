package co.com.screemplay.project.tasks;
import co.com.screemplay.project.ui.OpenCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class FinalizarCompra implements Task {

    private final String firstName;
    private final String lastName;
    private final String zipCode;

    // Constructor para recibir los datos dinámicos
    public FinalizarCompra(String firstName, String lastName, String zipCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.zipCode = zipCode;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OpenCartPage.CHECKOUT_BUTTON),


                // Formulario de datos
                Enter.theValue(firstName).into(OpenCartPage.FIRST_NAME),
                Enter.theValue(lastName).into(OpenCartPage.LAST_NAME),
                Enter.theValue(zipCode).into(OpenCartPage.ZIP_CODE),
                Click.on(OpenCartPage.CONTINUE_BUTTON),
                Click.on(OpenCartPage.FINISH_BUTTON),
                WaitUntil.the(OpenCartPage.THANK_YOU_HEADER, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(OpenCartPage.THANK_YOU_HEADER)
        );
    }


    public static FinalizarCompra conDatos(String firstName, String lastName, String zipCode) {
        return instrumented(FinalizarCompra.class, firstName, lastName, zipCode);
    }

 }