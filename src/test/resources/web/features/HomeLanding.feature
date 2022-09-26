# modifique titulo del feature
Feature: Como usuario de Pedidos Ya quiero dirigirme a la pantalla de Donaciones
  @Caso-IngresoExitoso
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

  @Caso-OngExitosa
  Scenario Outline: Seleccion de ONG exitosa
    Given el usuario ingresa en la pantalla de donaciones del pais <pais>
    When hace click en la primera <ONG> del listado
    Then al hacer click en el boton ONG se visualiza una nueva <pantalla>

    Examples:
      | pais        	| ONG								|pantalla				|
      | Argentina   	|Colabora con la Fundacion Si		|Ayudemos Juntos		|
      |	Bolivia			|Ayuda a niños y niñas de bolivia	|EntregamosSonrisas	|
      |	Uruguay			|Colabora con Canastas UY			|Canastas UY			|
      |	Paraguay		|Apoya el Banco de Alimentos 		|Dona alimentos			|



  @Caso-integracionDeEscenarios @Ale
  Scenario Outline: Mensaje exitoso al seleccionar el importe con el boton "btn_monto"
    Given el usuario ingresa en la pantalla de donaciones del pais <pais>
    When hace click en la primera <ONG> del listado
    And hace click en el boton <btn_monto>
    Then se visualiza el <mensaje> asociado al importe del boton <btn_monto>

    Examples:
      | pais      | ONG                              | btn_monto | mensaje                                            |
      | Argentina | Colabora con la Fundacion Si     | $70       | Equivale a 2 platos de comida para un estudiante.  |
      | Argentina | Colabora con la Fundacion Si     | $140      | Equivale a 4 platos de comida para un estudiante.  |
      | Argentina | Colabora con la Fundacion Si     | $350      | Equivale a 10 platos de comida para un estudiante. |
      | Paraguay  | Apoya el Banco de Alimentos      | Gs 2500   | Contribuye con un plato de comida.                 |
      | Paraguay  | Apoya el Banco de Alimentos      | Gs 5000   | Contribuye con dos platos de comida.               |
      | Paraguay  | Apoya el Banco de Alimentos      | Gs 7500   | Contribuye con tres platos de comida.              |
      | Uruguay   | Colabora con Canastas UY         | $15       | Equivale a 1 plato de comida.                      |
      | Uruguay   | Colabora con Canastas UY         | $30       | Equivale a 2 platos de comida.                     |
      | Uruguay   | Colabora con Canastas UY         | $45       | Equivale a 3 platos de comida.                     |
      | Bolivia   | Ayuda a niños y niñas de bolivia | Bs. 4     | Contribuye con un plato de comida.                 |
      | Bolivia   | Ayuda a niños y niñas de bolivia | Bs. 8     | Contribuye con dos platos de comida.               |
      | Bolivia   | Ayuda a niños y niñas de bolivia | Bs. 12    | Contribuye con tres platos de comida.              |


  @Caso-BotonAtras
  Scenario: Navegacion con boton "Atras" exitosa
    Given el usuario ingresa en la pantalla de donaciones
    When selecciono la primera ONG del listado
    And hago click en el boton "Atras"
    Then el usuario se redirige a pantalla principal

  @Caso-BotonDonar
  Scenario: Funcionamiento del boton "Donar" exitoso
    Given el usuario ingresa en la pantalla de donaciones
    When selecciono la primera ONG del listado
    And hace click en el boton "$70"
    And hace click en el boton "Donar"
    Then Se visualiza que el usuario fue redirigido a la pantalla <pantalla>
#










