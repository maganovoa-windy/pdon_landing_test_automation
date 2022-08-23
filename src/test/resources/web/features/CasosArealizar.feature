Feature: Realizar una donacion

  Background:
    Given el usuario ingresa en la pantalla de donaciones

  Scenario: Usuario selecciona una ONG del listado correctamente

    When selecciono la primera ONG del listado
    Then me redirijo a nueva pantalla


  Scenario Outline: Usuario valida las ONG de la consulta segun pais <pais>

    When se ingresa al flujo desde el pais <pais>
    Then se listan las ONG correspondientes

    Examples:
      | pais      |
      | Argentina |
      | Chile     |
      | Colombia  |
      | Uruguay   |


  Scenario Outline:  Usuario selecciona un monto <btn_monto> a donar

    When selecciono la primera ONG del listado
    #And hago click en el boton <btn_monto> a donar
    #Then se muestra el mensaje <mensaje>
    Then al hacer click en el boton <btn_monto> se muestra el mensaje <mensaje>

    Examples:
      | btn_monto | mensaje                        |
      | $1        | Equivale a 3 platos de comida  |
      | $5        | Equivale a 15 platos de comida |
      | $10       | Equivale a 30 platos de comida |
      | $15       | Equivale a 45 platos de comida |


  Scenario Outline:  Usuario realiza una donacion

    When selecciono la primera ONG del listado
    #And hago click en el boton <btn_monto> a donar
    #And se muestra el mensaje <mensaje>
    And hago click en el boton "Donar"
    Then el usuario se redirige a pantalla de pago

    Examples:
      | btn_monto | mensaje                        |
      | $1        | Equivale a 3 platos de comida  |
      | $5        | Equivale a 15 platos de comida |
      | $10       | Equivale a 30 platos de comida |
      | $15       | Equivale a 45 platos de comida |


  Scenario Outline:  El usuario valida el funcionamiento de boton "Atras"

    When selecciono la primera ONG del listado
    #And hago click en el boton <btn_monto> a donar
    #And se muestra el mensaje <mensaje>
    Then al hacer click en el boton <btn_monto> se muestra el mensaje <mensaje>
    And hago click en el boton "Atras"
    Then el usuario se redirige a pantalla landing

    Examples:
      | btn_monto | mensaje                        |
      | $1        | Equivale a 3 platos de comida  |
      | $5        | Equivale a 15 platos de comida |
      | $10       | Equivale a 30 platos de comida |
      | $15       | Equivale a 45 platos de comida |