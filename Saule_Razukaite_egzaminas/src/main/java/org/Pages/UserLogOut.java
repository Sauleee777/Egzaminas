package org.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class UserLogOut extends BasePage {

     @FindBy(css = "body > nav > div > ul.nav.navbar-nav.navbar-right > a")
    private WebElement loginButton;
    private WebElement logOutButton;
    public UserLogOut(WebDriver driver) {
        super(driver);
    }
    public void logout() {
        logOutButton.click();
    }

    public void login(String saule, String lietuva123) {
    }
}
