package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.HomeLandingConstants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

import static com.crowdar.core.actions.WebActionManager.deselectDropdownByValue;
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
                    WaitAndClick("1");
                    break;
            case "$5":
                    WaitAndClick("2");
                    break;
            case "$10":
                    WaitAndClick("3");
                    break;
            case "$15":
                    WaitAndClick("4");
                    break;
        }
    }

    public static void WaitAndClick(String indice){
        String xpath = String.format(HomeLandingConstants.BOTON_MONTO_A_DONAR_XPATH, Integer.parseInt(indice));
        waitClickable(xpath);
        click(xpath);
    }

    public static void verificarMensaje(String monto , String mensaje) {
        System.out.println(getText(HomeLandingConstants.H3_PLATOS_XPATH));
        switch(monto){
            case "$1":  Assert.assertEquals(getText(HomeLandingConstants.H3_PLATOS_XPATH), mensaje);
                        break;
            case "$5":  Assert.assertEquals(getText(HomeLandingConstants.H3_PLATOS_XPATH), mensaje);
                        break;
            case "$10": Assert.assertEquals(getText(HomeLandingConstants.H3_PLATOS_XPATH), mensaje);
                        break;
            case "$15": Assert.assertEquals(getText(HomeLandingConstants.H3_PLATOS_XPATH), mensaje);
                        break;
        }
    }

    public static void clickBoton(String boton) {
        seleccionarBoton(boton);
    }

    public static void seleccionarBoton(String boton){
        switch(boton){
            case "Atras":waitClickable(HomeLandingConstants.BOTON_ATRAS_XPATH);
                         click(HomeLandingConstants.BOTON_ATRAS_XPATH);
                         break;
            case "Donar":waitClickable(HomeLandingConstants.BOTON_DONAR_XPATH);
                         click(HomeLandingConstants.BOTON_DONAR_XPATH);
                         break;
        }
    }

}

