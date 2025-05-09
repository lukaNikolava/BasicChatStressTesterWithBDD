package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class MainPage extends Form {

    private final ITextBox registerInput = getElementFactory().getTextBox(By.xpath("//input[@placeholder='Enter your username...']") , "Register Input");
    private final IButton submitRegisterBtn = getElementFactory().getButton(By.xpath("//button[text()='Apply Username']") , "Submit Register");
    private final ITextBox inputMessage = getElementFactory().getTextBox(By.xpath("//input[@placeholder='Type a message...']") , "Type Message");
    private final IButton sendMessage = getElementFactory().getButton(By.xpath("//button[text()='Send']"), "Send Button");

    public MainPage(){
        super(By.className("header") , "Main Page");
    }

    public void register(String username){
        registerInput.clearAndType(username);
        submitRegisterBtn.click();
    }

    public void sendMessage(String message) {
        for (int i = 0; i < 3; i++) {
            inputMessage.clearAndType(message);
            sendMessage.click();
        }
    }
}
