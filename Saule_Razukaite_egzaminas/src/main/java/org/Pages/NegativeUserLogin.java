package org.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NegativeUserLogin extends BasePage {

    @FindBy(id = "username")
    private WebElement inputUserName;

    @FindBy(id = "password")
    private WebElement inputPassword;

    @FindBy(css = "body > div > form > div > button")
    private WebElement loginButton;

    @FindBy(id = "error-message")
    private WebElement errorMessage;

    public NegativeUserLogin(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        inputUserName.sendKeys(username);
        inputPassword.sendKeys(password);
        loginButton.click();
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }
}
