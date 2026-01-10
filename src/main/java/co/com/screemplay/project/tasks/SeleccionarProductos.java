package co.com.screemplay.project.tasks;

import co.com.screemplay.project.ui.OpenCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


public class SeleccionarProductos implements Task {

    private final String prod1;
    private final String prod2;

    // Constructor para recibir los productos del Step Definition
    public SeleccionarProductos(String prod1, String prod2) {
        this.prod1 = prod1;
        this.prod2 = prod2;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(OpenCartPage.ADD_RIB_SNAP_INFANT, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(OpenCartPage.ADD_RIB_SNAP_INFANT),

                WaitUntil.the(OpenCartPage.ADD_JACKET, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(OpenCartPage.ADD_JACKET),

                Click.on(OpenCartPage.SHOPPING_CART)
        );
    }

    // Método estático "builder" para facilitar el llamado
    public static SeleccionarProductos paraElCarrito(String prod1, String prod2) {
        return instrumented(SeleccionarProductos.class, prod1, prod2);
    }
}