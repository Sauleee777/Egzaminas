package org.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.time.Duration;

    public class UserLogin extends BasePage {
//        @FindBy(id = "username")
//        private WebElement InputUserName;
//
//        @FindBy(id = "password")
//        private WebElement InputPassword;

        public UserLogin(WebDriver driver) {
            super(driver);
        }

        public void login(String username, String password) {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));


            driver.findElement(By.cssSelector("body > div > form > div > input:nth-child(2)")).sendKeys(username);
            driver.findElement(By.cssSelector("body > div > form > div > input:nth-child(3)")).sendKeys(password);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.findElement(By.cssSelector("body > div > form > div > button")).click();
        }
    }
