package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import lippia.web.services.HomeLandingService;

public class HomeLandingSteps extends PageSteps {

    @Given("el usuario ingresa en la pantalla de donaciones")
    public void elUsuarioIngresaEnLaPantallaDeDonaciones() {
        HomeLandingService.navegarWeb();
    }

    @Then("se verifica el correcto ingresoa la pantalla de donaciones")
    public void seVerificaElCorrectoIngresoaLaPantallaDeDonaciones() {
        HomeLandingService.verificoTituloHome();
    }
}
