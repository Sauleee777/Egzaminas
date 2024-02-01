import org.Pages.NegativeUserLogin;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NegativeUserLoginTest {

    private WebDriver driver;
    private NegativeUserLogin negativeUserLogin;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        negativeUserLogin = new NegativeUserLogin(driver);
        driver.get("http://localhost:8080/prisijungti");
        driver.manage().window().maximize();
    }

    @Test
    public void testNegativeLogin() {
        negativeUserLogin.login("NeteisingasVartotojas", "NeteisingasSlaptazodis");


        assertEquals("Neteisingas vartotojo vardas arba slaptažodis", negativeUserLogin.getErrorMessage());
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
