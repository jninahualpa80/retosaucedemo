package co.com.screemplay.project.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OpenCartPage {

//    localizadores para el login
    public static final Target USERNAME = Target.the("campo nombre de usuario")
            .located(By.id("user-name"));

    public static final Target PASSWORD = Target.the("campo contraseña")
            .located(By.id("password"));

    public static final Target LOGIN_BUTTON = Target.the("botón de inicio de sesión")
            .located(By.id("login-button"));
//localizadores para añadir al carrito
    public static final Target ADD_RIB_SNAP_INFANT = Target.the("añadir ropa al carrito")
            .located(By.id("add-to-cart-sauce-labs-onesie"));

    public static final Target ADD_JACKET = Target.the("añadir Jacket al carrito")
            .located(By.id("add-to-cart-sauce-labs-fleece-jacket"));

    public static final Target SHOPPING_CART = Target.the("icono del carrito")
            .located(By.className("shopping_cart_link"));

    public static final Target PRODUCT_NAME = Target.the("nombre del producto en el carrito")
            .located(By.className("inventory_item_name"));

    //localizadores para el checkout y formulario
    public static final Target CHECKOUT_BUTTON = Target.the("botón de checkout")
        .located(By.id("checkout"));

    public static final Target FIRST_NAME = Target.the("nombre")
            .located(By.id("first-name"));

    public static final Target LAST_NAME = Target.the("apellido")
            .located(By.id("last-name"));

    public static final Target ZIP_CODE = Target.the("código postal")
            .located(By.id("postal-code"));

    public static final Target CONTINUE_BUTTON = Target.the("botón continuar")
            .located(By.id("continue"));

    // Pantalla Final
    public static final Target FINISH_BUTTON = Target.the("botón finalizar")
            .located(By.id("finish"));

    public static final Target THANK_YOU_HEADER = Target.the("mensaje de agradecimiento")
            .located(By.className("complete-header"));



}
