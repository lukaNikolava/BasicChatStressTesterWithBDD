package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.MainPage;

public class MainPageSteps {

    MainPage mainPage = new MainPage();

    @Given("Chat application page is displayed")
    public void isChatApplicationPageDisplayed(){
        Assert.assertTrue(mainPage.state().waitForDisplayed(), "Main page is not displayed" );
    }

    @And("I register with username {string}")
    public void iRegister(String registerUsername){
        mainPage.register(registerUsername);
    }

    @Then("I send a message {string}")
    public void iSendMessage(String sendMessage){
        mainPage.sendMessage(sendMessage);
    }
}
