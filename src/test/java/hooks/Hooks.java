package hooks;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.browser.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    protected final Browser browser = AqualityServices.getBrowser();

    @Before
    public void setup(){
        browser.maximize();
        browser.goTo("https://chatdemoversion.netlify.app/");
    }

    @After
    public void teardown(){
        if (AqualityServices.isBrowserStarted()) {
            browser.quit();
        }
    }
}
