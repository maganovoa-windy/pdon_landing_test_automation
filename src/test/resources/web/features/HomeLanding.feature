Feature: Como usuario quiero dirigirme a la pantalla de Donaciones de PedidosYa

  Background:
    Given el usuario ingresa en la pantalla de donaciones

  @Login-Exitoso
  Scenario: El cliente se dirigia la pantalla de Donaciones

    Then se verifica el correcto ingresoa la pantalla de donaciones

  @Caso-nro2
  Scenario: Usuario selecciona una ONG del listado correctamente

    When selecciono la primera ONG del listado
    Then me redirijo a nueva pantalla
