package co.com.screemplay.project.tasks;

import co.com.screemplay.project.ui.OpenCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {

    private final String usuario;
    private final String password;

    public Login(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public static Login conCredenciales(String usuario, String password) {
        return instrumented(Login.class, usuario, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario).into(OpenCartPage.USERNAME),
                Enter.theValue(password).into(OpenCartPage.PASSWORD),
                Click.on(OpenCartPage.LOGIN_BUTTON)
        );
    }
}