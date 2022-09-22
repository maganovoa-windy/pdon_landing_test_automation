package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.HomeLandingConstants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static com.crowdar.core.actions.WebActionManager.*;

public class HomeLandingService extends WebActionManager {

    public static void navegarWeb() {
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void verificoTituloHome() {
        ActionManager.waitVisibility(HomeLandingConstants.TITULO_PRINCIPAL);
        WebActionManager.scroll(HomeLandingConstants.TITULO_PRINCIPAL);
        Assert.assertTrue(ActionManager.isPresent(HomeLandingConstants.TITULO_PRINCIPAL));
    }


    public static void verificoNuevaPantalla() {
        waitPresence(HomeLandingConstants.BOTON_DONAR_XPATH);
        Assert.assertTrue(isPresent(HomeLandingConstants.BOTON_DONAR_XPATH));
    }

    public static void seleccionMonto(String monto) {
        switch (monto) {
            case "$70":
                WaitAndClick("1");
                break;
            case "$140":
                WaitAndClick("2");
                break;
            case "$350":
                WaitAndClick("3");
                break;
//            case "$15":
//                    WaitAndClick("4");
//                    break;
        }
    }

    public static void WaitAndClick(String indice) {
        String xpath = String.format(HomeLandingConstants.BOTON_MONTO_A_DONAR_XPATH, Integer.parseInt(indice));
        waitClickable(xpath);
        click(xpath);
    }
//
//    public static void verificarMensaje(String monto, String mensaje) {
//        System.out.println(getText(HomeLandingConstants.H3_PLATOS_XPATH));
//        switch (monto) {
//            case "$1":
//                Assert.assertEquals(getText(HomeLandingConstants.H3_PLATOS_XPATH), mensaje);
//                break;
//            case "$5":
//                Assert.assertEquals(getText(HomeLandingConstants.H3_PLATOS_XPATH), mensaje);
//                break;
//            case "$10":
//                Assert.assertEquals(getText(HomeLandingConstants.H3_PLATOS_XPATH), mensaje);
//                break;
//            case "$15":
//                Assert.assertEquals(getText(HomeLandingConstants.H3_PLATOS_XPATH), mensaje);
//                break;
//        }
//    }

    public static void clickBoton(String boton) {
        seleccionarBoton(boton);
    }

    public static void seleccionarBoton(String boton) {
        switch (boton) {
            case "Atras":
                waitClickable(HomeLandingConstants.BOTON_ATRAS_XPATH);
                click(HomeLandingConstants.BOTON_ATRAS_XPATH);
                break;
            case "Donar":
                waitClickable(HomeLandingConstants.BOTON_DONAR_XPATH);
                click(HomeLandingConstants.BOTON_DONAR_XPATH);
                break;
        }
    }

    //METODOS DEL ESCENARIO NUEVO//

    public static String EvaluarPais(String pais) {
        String valorPais;
        switch (pais) {
            case "Argentina":
                valorPais = "ar";
                break;
            case "Paraguay":
                valorPais = "py";
                break;
            case "Uruguay":
                valorPais = "uy";
                break;
            case "Bolivia":
                valorPais = "bo";
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + pais);
        }
        return valorPais;
    }

    public static void navegarWebPorPais(String valorPais) {
        navigateTo(("https://stg-web-apps.pedidosya.com/checkout-webview/donations?c=." + valorPais));

    }

    public static void seleccionarOng(String ong) {
        switch (ong) {
            case "Colabora con la Fundacion Si":
            case "Apoya el Banco de Alimentos":
            case "Colabora con Canastas UY":
            case "Ayuda a niños y niñas de bolivia":
                waitPresence(HomeLandingConstants.BOTON_BANCO_DE_ALIMENTOS_PARAGUAY_XPATH);
                click(HomeLandingConstants.BOTON_BANCO_DE_ALIMENTOS_PARAGUAY_XPATH);
                break;
        }
    }

    public static void clickBotonMonto(String botonMonto) {
        switch (botonMonto) {
            case "$70":
            case "Gs 2500":
            case "$15":
            case "Bs. 4":
                WaitAndClick("1");
                break;
            case "$140":
            case "Gs 5000":
            case "$30":
            case "Bs. 8":
                WaitAndClick("2");
                break;
            case "$350":
            case "Gs 7500":
            case "$45":
            case "Bs. 12":
                WaitAndClick("3");
                break;

        }
    }


    public static void validarMensaje(String mensaje, String monto) {
//        System.out.println(getText(HomeLandingConstants.H3_PLATOS_XPATH));

        switch (monto) {
            case "$70":
                Assert.assertEquals(getText(HomeLandingConstants.H3_PLATOS_XPATH), mensaje);
                break;
            case "Gs 2500":
                Assert.assertEquals(getText(HomeLandingConstants.H3_PLATOS_XPATH), mensaje);
                break;
            case "$15":
                Assert.assertEquals(getText(HomeLandingConstants.H3_PLATOS_XPATH), mensaje);
                break;
            case "Bs. 4":
                Assert.assertEquals(getText(HomeLandingConstants.H3_PLATOS_XPATH), mensaje);
                break;
            case "$140":
                Assert.assertEquals(getText(HomeLandingConstants.H3_PLATOS_XPATH), mensaje);
                break;
            case "Gs 5000":
                Assert.assertEquals(getText(HomeLandingConstants.H3_PLATOS_XPATH), mensaje);
                break;
            case "$30":
                Assert.assertEquals(getText(HomeLandingConstants.H3_PLATOS_XPATH), mensaje);
                break;
            case "Bs. 8":
                Assert.assertEquals(getText(HomeLandingConstants.H3_PLATOS_XPATH), mensaje);
                break;
            case "$350":
                Assert.assertEquals(getText(HomeLandingConstants.H3_PLATOS_XPATH), mensaje);
                break;
            case "Gs 7500":
                Assert.assertEquals(getText(HomeLandingConstants.H3_PLATOS_XPATH), mensaje);
                break;
            case "$45":
                Assert.assertEquals(getText(HomeLandingConstants.H3_PLATOS_XPATH), mensaje);
                break;
            case "Bs. 12":
                Assert.assertEquals(getText(HomeLandingConstants.H3_PLATOS_XPATH), mensaje);
                break;

        }
    }
}

