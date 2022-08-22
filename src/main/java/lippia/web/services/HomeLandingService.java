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
}
