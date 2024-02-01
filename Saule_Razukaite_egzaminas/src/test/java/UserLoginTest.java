import org.Pages.UserLogin;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UserLoginTest {
    private WebDriver driver;
    private UserLogin userLogin;

    @BeforeEach
    public void setUp() {

        driver = new ChromeDriver();
        userLogin = new UserLogin(driver);
        driver.get("http://localhost:8080/prisijungti");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    @Test
    public void testLogin() throws InterruptedException {
        userLogin.login("SauleTest", "Lietuva123");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}