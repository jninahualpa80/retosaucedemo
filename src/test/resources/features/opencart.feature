Feature: Colocar productos en opencart
    @happypath
    Scenario Outline:Proceso de compra
        Given "<nombre_actor>" ingreso a la pagina con "<usuario>" y "<password>"
        When Selecciono un producto del catalogo "<producto1>" y "<producto2>"
        Then agrego el producto al carito "<producto1>" y "<producto2>"
        And  finaliza la compra con los datos requeridos "<firstName>" y "<lastName>" y "<zipCode>"
        Then debería ver el mensaje de confirmación "Thank you for your order!"
        Examples:
            | nombre_actor | usuario       | password     | producto1         | producto2                | firstName | lastName   | zipCode   |
            | Juan         | standard_user | secret_sauce | Sauce Labs Onesie | Sauce Labs Fleece Jacket | Juan      | Ninahualpa | 022600425 |