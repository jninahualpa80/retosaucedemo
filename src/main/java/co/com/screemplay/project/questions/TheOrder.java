package co.com.screemplay.project.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import co.com.screemplay.project.ui.OpenCartPage;
import org.openqa.selenium.By;

public class TheOrder {
    public static Question<String> status() {
        // En OpenCart, el h1 suele tener el mensaje de éxito al final
        return actor -> Text.of(OpenCartPage.THANK_YOU_HEADER).answeredBy(actor);
    }
}
