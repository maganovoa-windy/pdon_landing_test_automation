package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.HomeLandingConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class HomeLandingService extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void verificoTituloHome(){
        ActionManager.waitVisibility(HomeLandingConstants.TITULO_PRINCIPAL);
        Assert.assertTrue(ActionManager.isPresent(HomeLandingConstants.TITULO_PRINCIPAL));
    }

    public static void seleccionarOng() {
        waitPresence(HomeLandingConstants.BOTON_BANCO_DE_ALIMENTOS_PARAGUAY_XPATH);
        click(HomeLandingConstants.BOTON_BANCO_DE_ALIMENTOS_PARAGUAY_XPATH);
    }


    public static void verificoNuevaPantalla() {
        waitPresence(HomeLandingConstants.BOTON_DONAR_XPATH);
        Assert.assertTrue(isPresent(HomeLandingConstants.BOTON_DONAR_XPATH));
    }

    public static void seleccionMonto(String monto) {
        switch (monto) {
            case "$1":
                waitClickable(HomeLandingConstants.BOTON_MONTO_A_DONAR_XPATH, "0");
                click(HomeLandingConstants.BOTON_MONTO_A_DONAR_XPATH, "0");
                break;
            case "$5":
                waitClickable(HomeLandingConstants.BOTON_MONTO_A_DONAR_XPATH, "1");
                click(HomeLandingConstants.BOTON_MONTO_A_DONAR_XPATH, "1");
                break;
            case "$10":
                waitClickable(HomeLandingConstants.BOTON_MONTO_A_DONAR_XPATH, "2");
                click(HomeLandingConstants.BOTON_MONTO_A_DONAR_XPATH, "2");
                break;
            case "$15":
                waitClickable(HomeLandingConstants.BOTON_MONTO_A_DONAR_XPATH, "3");
                click(HomeLandingConstants.BOTON_MONTO_A_DONAR_XPATH, "3");
                break;
        }
    }


    public static void verificarMensaje(String monto , String mensaje) {
        switch(monto){
            case "$1":  Assert.assertEquals(getText(HomeLandingConstants.H3_PLATOS_XPATH) , mensaje);
                        break;
            case "$5":  Assert.assertEquals(getText(HomeLandingConstants.H3_PLATOS_XPATH), mensaje);
                        break;
            case "$10": Assert.assertEquals(getText(HomeLandingConstants.H3_PLATOS_XPATH), mensaje);
                        break;
            case "$15": Assert.assertEquals(getText(HomeLandingConstants.H3_PLATOS_XPATH), mensaje);
                        break;
        }
    }
}

