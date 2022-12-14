package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.HomeLandingService;
import org.testng.Assert;

public class HomeLandingSteps extends PageSteps {

    @Given("el usuario ingresa en la pantalla de donaciones")
    public void elUsuarioIngresaEnLaPantallaDeDonaciones() {
        HomeLandingService.navegarWeb();
    }

    @And("^hago click en el boton \"(.*)\"$")
    public void hagoClickEnElBoton(String boton) {
        HomeLandingService.clickBoton(boton);
    }

    //NUEVO ESCENARIO//

    @Given("el usuario ingresa en la pantalla de donaciones del pais (.*)")
    public void elUsuarioIngresaEnLaPantallaDeDonacionesDelPaisPais(String pais) {
        HomeLandingService.navegarWebPorPais(HomeLandingService.EvaluarPais(pais));

    }

    @When("hace click en la primera (.*) del listado")
    public void haceClickEnLaPrimeraONGDelListado(String ong) {
        HomeLandingService.seleccionarOng(ong);
    }

    @And("hace click en el boton (.*)")
    public void haceClickEnElBotonBtn_monto(String botonMonto) {
        HomeLandingService.clickBotonMonto(botonMonto);
    }

    @Then("se visualiza el (.*) asociado al importe del boton monto")
    public void seVisualizaElMensajeAsociadoAlImporteDelBoton(String mensaje) {
        HomeLandingService.validarMensaje(mensaje);
    }

    @Then("al hacer click en el boton ONG se visualiza una nueva (.*)")
    public void alHacerClickEnElBotonSeVisualizaUnaNuevaPantalla(String mensajePantalla) {
        HomeLandingService.validarIngresoOng(mensajePantalla);

    }

    @When("selecciono la primera ONG del listado")
    public void seleccionoLaPrimeraONGDelListado() {
        HomeLandingService.clickPrimeraOng();
    }

    @Then("el usuario se redirige a pantalla principal")
    public void elUsuarioSeRedirigeAPantallaPrincipal() {
        HomeLandingService.validarPantallaPrincipal();
    }

    @Then("accedo a la pantalla dona un plato de comida")
    public void accedoALaPantallaDonaUnPlatoDeComida() {
        HomeLandingService.validarPantallaPrincipal();
    }

    @When("el usuario ingresa al pais (.*)")
    public void elUsuarioIngresaAlPaisPais(String pais) {
        HomeLandingService.navegarWebPorPais(HomeLandingService.EvaluarPais(pais));
    }
}


