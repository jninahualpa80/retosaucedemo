Feature: Colocar productos en opencart
    @happypath
    Scenario: Proceso de compra
        Given "Juan" ingreso a la pagina con "standard_user" y "secret_sauce"
        When Selecciono un producto del catalogo "Sauce Labs Onesie" y "Sauce Labs Fleece Jacket"
        Then agrego el producto al carito "Sauce Labs Onesie" y "Sauce Labs Fleece Jacket"
        And  finaliza la compra con los datos requeridos
        Then debería ver el mensaje de confirmación "Thank you for your order!"



