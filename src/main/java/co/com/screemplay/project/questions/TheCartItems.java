package co.com.screemplay.project.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import co.com.screemplay.project.ui.OpenCartPage;
import java.util.Collection;
import org.openqa.selenium.By;

public class TheCartItems {
    public static Question<Collection<String>> names() {
        // Localiza todos los nombres de productos en la tabla del carrito
        return actor -> Text.ofEach(OpenCartPage.PRODUCT_NAME)
                .answeredBy(actor);
    }

}


