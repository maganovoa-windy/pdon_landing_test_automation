Feature: Como usuario quiero dirigirme a la pantalla de Donaciones de PedidosYa

  Background:
    Given el usuario ingresa en la pantalla de donaciones

  @Login-Exitoso @Ale
  Scenario Outline: ingreso exitoso a la pantalla de donaciones con diferentes paises
    Given el usuario ingresa en la pantalla de donaciones del pais <pais>
    When ingreso a la landing
    Then accedo a la pantalla dona un plato de comida

    Examples:
      | pais      |
      | Argentina |
      | Chile     |
      | Uruguay   |
      | Paraguay  |
      | Bolivia   |


  @Caso-nro2 @Ale
  Scenario: seleccion de ONG exitosa
    Given el usuario ingresa en la pantalla de donaciones
    When selecciono la primera ONG del listado
    Then me redirijo a nueva pantalla

  @Caso-nro3 @Ale
  Scenario Outline: Mensaje exitoso al seleccion importe <btn_monto>
    Given el usuario ingresa en la pantalla de donaciones
    When selecciono la primera ONG del listado
    And se hace click en el boton <btn_monto>
    Then se muestra el mensaje <mensaje> asociado al importe boton <btn_monto>
    #Then al hacer click en el boton <btn_monto> se muestra el mensaje <mensaje>

    Examples:
      | btn_monto | mensaje                                           |
      | $70       | Equivale a 2 platos de comida para un estudiante  |
      | $140      | Equivale a 4 platos de comida para un estudiante  |
      | $350      | Equivale a 10 platos de comida para un estudiante |


  @Caso-nro4 @Ale
  Scenario: Navegacion con boton "Atras" exitosa
    Given el usuario ingresa en la pantalla de donaciones
    When selecciono la primera ONG del listado
    And hago click en el boton "Atras"
    Then el usuario se redirige a pantalla landing

  @Caso-nro5 @Ale
  Scenario: Funcionamiento del boton donar exitoso
    Given el usuario ingresa en la pantalla de donaciones
    When selecciono la primera ONG del listado
    And hace click en el boton "$70"
    And hace click en el boton "Donar"
    Then Se visualiza que el usuario fue redirigido a la pantalla <pantalla>


  Scenario Outline: Ingreso exitoso a la pantalla donaciones con diferentes paises
    Given el usuario ingresa en la pantalla de donaciones del pais <pais>
    When hace click en la primera <ONG> del listado
    And hace click en el boton <btn_monto>
    Then se visualiza el <mensaje> asociado al importe del boton "btn_monto"

    Examples:
      | pais      | ONG                              | btn_monto | mensaje                                          |
      | Argentina | Colabora con la Fundacion Si     | $70       | Equivale a 2 platos de comida para un estudiante |
      | Argentina | Colabora con la Fundacion Si     | $140      | Equivale a 4 platos de comida para un estudiante |
      | Argentina | Colabora con la Fundacion Si     | $350      | Equivale a 10platos de comida para un estudiante |
      | Paraguay  | Apoya el Banco de Alimentos      | Gs 2500   | Contribuye con un plato de comida                |
      | Paraguay  | Apoya el Banco de Alimentos      | Gs 5000   | Contribuye con un plato de comida                |
      | Paraguay  | Apoya el Banco de Alimentos      | Gs 7500   | Contribuye con un plato de comida                |
      | Uruguay   | Colabora con Canastas UY         | $15       | Equivale a 1 plato de comida                     |
      | Uruguay   | Colabora con Canastas UY         | $30       | Equivale a 2 plato de comida                     |
      | Uruguay   | Colabora con Canastas UY         | $45       | Equivale a 3 plato de comida                     |
      | Bolivia   | Ayuda a niños y niñas de bolivia | Bs. 4     | Contribuye con un plato de comida                |
      | Bolivia   | Ayuda a niños y niñas de bolivia | Bs. 8     | Contribuye con un plato de comida                |
      | Bolivia   | Ayuda a niños y niñas de bolivia | Bs. 12    | Contribuye con un plato de comida                |











  #Cuando se ingresa a las donaciones del pais X


#  Scenario Outline: Usuario valida las ONG de la consulta segun pais <pais>
#
#    When se ingresa al flujo desde el pais <pais>
#    Then se listan las ONG correspondientes
#
#    Examples:
#      | pais      |
#      | Argentina |
#      | Chile     |
#      | Uruguay   |
#      | Paraguay  |
#      | Bolivia   |
