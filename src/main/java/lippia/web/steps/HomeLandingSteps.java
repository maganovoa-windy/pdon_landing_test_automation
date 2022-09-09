package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.HomeLandingService;

public class HomeLandingSteps extends PageSteps {

    @Given("el usuario ingresa en la pantalla de donaciones")
    public void elUsuarioIngresaEnLaPantallaDeDonaciones() {
        HomeLandingService.navegarWeb();
    }

    @Then("se verifica el correcto ingreso la pantalla de donaciones")
    public void seVerificaElCorrectoIngresoLaPantallaDeDonaciones() {
        HomeLandingService.verificoTituloHome();
    }

    @When("selecciono la primera ONG del listado")
    public void seleccionoLaPrimeraONGDelListado() {
        HomeLandingService.seleccionarOng();
    }
    @Then("me redirijo a nueva pantalla")
    public void meRedirijoANuevaPantalla() {
        HomeLandingService.verificoNuevaPantalla();
    }


    @Then("al hacer click en el boton (.*) se muestra el mensaje (.*)")
    public void alHacerClickEnElBotonBtn_montoSeMuestraElMensajeMensaje(String monto , String mensaje) {
        HomeLandingService.seleccionMonto(monto);
        HomeLandingService.verificarMensaje(monto , mensaje);
    }


    @And("^hago click en el boton \"(.*)\"$")
    public void hagoClickEnElBoton(String boton) {
        HomeLandingService.clickBoton(boton);
    }

    @Then("el usuario se redirige a pantalla landing")
    public void elUsuarioSeRedirigeAPantallaLanding() {
        HomeLandingService.verificoTituloHome();
    }
}


