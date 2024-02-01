package org.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class NegativeUserReg extends BasePage {

    @FindBy(id = "username")
    private WebElement SukurtiNaujaPaskyra;

    @FindBy(id = "username")
    private WebElement InputUserName;

    @FindBy(id = "password")
    private WebElement InputPassword;

    @FindBy(id = "passwordConfirm")
    private WebElement ConfirmPassword;

    @FindBy(id = "submit")
    private WebElement Sukurti;

    @FindBy(id = "error-message")
    private WebElement ErrorMessage;

    public NegativeUserReg(WebDriver driver) {
        super(driver);
    }

    public void registruoti() {
        SukurtiNaujaPaskyra.click();
    }

    public void setUserName(String username) {
        InputUserName.sendKeys(username);
    }

    public void setPassword(String password) {
        InputPassword.sendKeys(password);
    }

    public void setConfirmPassword(String passwordConfirm) {
        ConfirmPassword.sendKeys(passwordConfirm);
    }

    public void submit() {
        Sukurti.click();
    }

    public String getErrorMessage() {
        return ErrorMessage.getText();
    }

    public void wait5sec() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
}
