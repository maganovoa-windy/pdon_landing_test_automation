Feature: Como usuario de Pedidos Ya quiero dirigirme a la pantalla de Donaciones

  @Caso-IngresoExitoso
  Scenario Outline: ingreso exitoso a la pantalla de donaciones con diferentes paises
    Given el usuario ingresa en la pantalla de donaciones
    When el usuario ingresa al pais <pais>
    Then accedo a la pantalla dona un plato de comida

    Examples:
      | pais                 |
      | Argentina            |
      | Uruguay              |
      | Paraguay             |
      | Bolivia              |
      | Venezuela            |
      | Ecuador              |
      | Perú                 |
      | Chile                |
      | Panamá               |
      | Costa Rica           |
      | República Dominicana |
      | El Salvador          |
      | Nicaragua            |
      | Guatemala            |
      | Honduras             |


  @Caso-OngExitosa
  Scenario Outline: Seleccion de ONG exitosa
    Given el usuario ingresa en la pantalla de donaciones del pais <pais>
    When hace click en la primera <ONG> del listado
    Then al hacer click en el boton ONG se visualiza una nueva <pantalla>

    Examples:
      | pais                 | ONG                                   | pantalla                           |
      | Argentina            | Colaborá con la Fundación Sí          | Ayudemos Juntos                    |
      | Bolivia              | Ayuda a niños y niñas de Bolivia.     | EntregamosSonrisas                 |
      | Uruguay              | Colaborá con Canastas UY              | Canastas UY                        |
      | Paraguay             | Apoya al Banco de Alimentos           | Dona alimentos                     |
      | Perú                 | Colabora con Banco de Alimentos Perú  | Banco de Alimentos Perú            |
      | Chile                | Colabora con Red de Alimentos         | Combate el hambre                  |
      | Panamá               | Apoya al Banco de Alimentos de Panamá | Banco de Alimentos                 |
      | Costa Rica           | Apoya al Banco de Alimentos           | Hambre Cero                        |
      | República Dominicana | Apoya al Banco de Alimentos           | Comparte un plato                  |
      | El Salvador          | Apoya al Banco de Alimentos           | Colabora con el Banco de Alimentos |
      | Guatemala            | Colabora con Nutriendo nuestro futuro | Nutriendo nuestro futuro           |


  @Caso-integracionDeEscenarios @Ale
  Scenario Outline: Mensaje exitoso al seleccionar el importe con el boton "btn_monto"
    Given el usuario ingresa en la pantalla de donaciones del pais <pais>
    When hace click en la primera <ONG> del listado
    And hace click en el boton <btn_monto>
    Then se visualiza el <mensaje> asociado al importe del boton monto

    Examples:
      | pais                 | ONG                                  | btn_monto | mensaje                                            |
      | Argentina            | Colaborá con la Fundación Sí         | $ 70      | Equivale a 2 platos de comida para un estudiante.  |
      | Argentina            | Colaborá con la Fundación Sí         | $ 140     | Equivale a 4 platos de comida para un estudiante.  |
      | Argentina            | Colaborá con la Fundación Sí         | $ 350     | Equivale a 10 platos de comida para un estudiante. |
      | Paraguay             | Apoya al Banco de Alimentos          | Gs. 2500  | Contribuye con un plato de comida.                 |
      | Paraguay             | Apoya al Banco de Alimentos          | Gs. 5000  | Contribuye con dos platos de comida.               |
      | Paraguay             | Apoya al Banco de Alimentos          | Gs. 7500  | Contribuye con tres platos de comida.              |
      | Uruguay              | Colaborá con Canastas UY             | $ 15      | Equivale a 1 plato de comida.                      |
      | Uruguay              | Colaborá con Canastas UY             | $ 30      | Equivale a 2 platos de comida.                     |
      | Uruguay              | Colaborá con Canastas UY             | $ 45      | Equivale a 3 platos de comida.                     |
      | Bolivia              | Ayuda a niños y niñas de Bolivia.    | Bs. 4     | Contribuye con un plato de comida.                 |
      | Bolivia              | Ayuda a niños y niñas de Bolivia.    | Bs. 8     | Contribuye con dos platos de comida.               |
      | Bolivia              | Ayuda a niños y niñas de Bolivia.    | Bs. 12    | Contribuye con tres platos de comida.              |
      | Perú                 | Colabora con Banco de Alimentos Perú | S/. 5     | Contribuye con un plato de comida.                 |
      | Perú                 | Colabora con Banco de Alimentos Perú | S/. 10    | Contribuye con dos platos de comida.               |
      | Perú                 | Colabora con Banco de Alimentos Perú | S/. 20    | Contribuye con cuatro platos de comida.            |
      | Perú                 | Colabora con Banco de Alimentos Perú | S/. 50    | Contribuye con diez platos de comida.              |
      | Chile                | Colabora con Red de Alimentos        | $ 800     | Un plato de comida.                                |
      | Chile                | Colabora con Red de Alimentos        | $ 1600    | Dos platos de comida.                              |
      | Chile                | Colabora con Red de Alimentos        | $ 2400    | Tres platos de comida.                             |
      | Panamá               | Banco de Alimentos                   | $ 1       | Contribuye con tres platos de comida.              |
      | Panamá               | Banco de Alimentos                   | $ 3       | Contribuye con nueve platos de comida.             |
      | Panamá               | Banco de Alimentos                   | $ 5       | Contribuye con quince platos de comida.            |
      | Costa Rica           | Apoya al Banco de Alimentos          | ¢ 1000    | Contribuye con 1 plato de comida.                  |
      | Costa Rica           | Apoya al Banco de Alimentos          | ¢ 2000    | Contribuye con 2 platos de comida.                 |
      | Costa Rica           | Apoya al Banco de Alimentos          | ¢ 5000    | Contribuye con 5 platos de comida.                 |
      | República Dominicana | Apoya al Banco de Alimentos          | $ 50      | Contribuye con un plato de comida.                 |
      | República Dominicana | Apoya al Banco de Alimentos          | $ 250     | Contribuye con cinco platos de comida.             |
      | República Dominicana | Apoya al Banco de Alimentos          | $ 500     | Contribuye con diez platos de comida.              |
      | El Salvador          | Apoya al Banco de Alimentos          | $ 2       | 1 plato de comida.                                 |
      | El Salvador          | Apoya al Banco de Alimentos          | $ 4       | 2 platos de comida.                                |
      | El Salvador          | Apoya al Banco de Alimentos          | $ 6       | 3 platos de comida.                                |
      | Guatemala            | Nutriendo nuestro futuro             | Q 4       | 1 plato de comida.                                 |
      | Guatemala            | Nutriendo nuestro futuro             | Q 12      | 3 platos de comida.                                |
      | Guatemala            | Nutriendo nuestro futuro             | Q 40      | 10 platos de comida.                               |


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
    Then Se visualiza que el usuario fue redirigido a la pantalla "pantalla"











