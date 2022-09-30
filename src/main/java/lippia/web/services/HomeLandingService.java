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




    //METODOS DEL ESCENARIO NUEVO//

    //METODO QUE REALIZA INGRESO A BASE URL ARG
    public static void navegarWeb() {
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    //ENTRAR A LANDING POR PAIS
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

    //SELECCIONAR ONG ENVIADA POR PARAMETRO
    public static void seleccionarOng(String ong) {
        waitClickable(HomeLandingConstants.BOTON_ONG_XPATH,ong);
        click(HomeLandingConstants.BOTON_ONG_XPATH,ong);
    }

    //METODO PARA SELECCIONAR MONTO A DONAR
    public static void WaitAndClick(String indice) {
        String xpath = String.format(HomeLandingConstants.BOTON_MONTO_A_DONAR_XPATH, indice);
        scroll(xpath);
        waitClickable(xpath);
        click(xpath);
    }

    public static void clickBotonMonto(String botonMonto) {
        WaitAndClick(botonMonto);
    }


    //METODO PARA VALIDAR MENSAJE CORRESPONDIENTE AL MONTO A DONAR
    public static void validarMensaje(String mensaje) {
        Assert.assertEquals(getText(HomeLandingConstants.H3_PLATOS_XPATH), mensaje);
    }


    //VALIDAR INGRESO A LA ONG
    public static void validarIngresoOng(String tituloPantalla) {
        Assert.assertEquals(getText(HomeLandingConstants.H1_DONAR_XPATH, tituloPantalla), tituloPantalla);
    }

    //CLICK AL BOTON DE LA PRIMERA ONG
    public static void clickPrimeraOng() {
        waitPresence(HomeLandingConstants.BOTON_ONG_XPATH , "Colaborá con la Fundación Sí");
        click(HomeLandingConstants.BOTON_ONG_XPATH , "Colaborá con la Fundación Sí");
    }

    //VALIDAR INGRESO A LA LANDING
    public static void validarPantallaPrincipal() {
        Assert.assertEquals(getText(HomeLandingConstants.H2_DONAR_XPATH), "Elige en qué ONG colaborar");
    }

    //CLICK A BOTON ESPECIFICO ENVIADO POR PARAMETRO
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

}

