package org.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

    public class NewUserReg extends BasePage {

        @FindBy(id = "registruoti")
        private WebElement SukurtiNaujaPaskyra;
        @FindBy(id = "username")
        private WebElement InputUserName;

        @FindBy(id = "password")
        private WebElement InputPassword;

        @FindBy(id = "passwordConfirm")
        private WebElement ConfirmPassword;

        @FindBy(id = "submit")
        private WebElement Sukurti;

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

        public void wait5sec() {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        }

        public NewUserReg(WebDriver driver) {
            super(driver);
        }
        public void InputUserName(String saule) {
        }

        public void InputPassword(String lietuva123) {
        }

        public void ConfirmPassword(String lietuva123) {
        }

        public void Sukurti() {
        }

    }
