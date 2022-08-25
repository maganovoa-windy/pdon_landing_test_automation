Feature: Como usuario quiero dirigirme a la pantalla de Donaciones de PedidosYa

  Background:
    Given el usuario ingresa en la pantalla de donaciones

  @Login-Exitoso
  Scenario: El cliente se dirigia la pantalla de Donaciones

    Then se verifica el correcto ingresoa la pantalla de donaciones

  @Caso-nro2 @Ale
  Scenario: Usuario selecciona una ONG del listado correctamente
    When selecciono la primera ONG del listado
    Then me redirijo a nueva pantalla

  @Caso-nro3 @Ale
    #CONSULTAR POR PARAMETRO EN SCENARIO Outline
  Scenario Outline:  Usuario selecciona un monto <btn_monto> a donar
    When selecciono la primera ONG del listado
    Then al hacer click en el boton <btn_monto> se muestra el mensaje <mensaje>

    Examples:
      | btn_monto | mensaje                        |
      | $1        | Equivale a 3 platos de comida  |
      | $5        | Equivale a 15 platos de comida |
      | $10       | Equivale a 30 platos de comida |
      | $15       | Equivale a 45 platos de comida |

  @Caso-nro4 @Ale
  Scenario Outline:  El usuario valida el funcionamiento de boton "Atras"
    When selecciono la primera ONG del listado
    Then al hacer click en el boton <btn_monto> se muestra el mensaje <mensaje>
    And hago click en el boton "Atras"
    Then el usuario se redirige a pantalla landing

    Examples:
      | btn_monto | mensaje                       |
      | $1        | Equivale a 3 platos de comida |
      | $5        | Equivale a 15 platos de comida |
      | $10       | Equivale a 30 platos de comida |
      | $15       | Equivale a 45 platos de comida |