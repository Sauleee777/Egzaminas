
import org.Pages.UserLogOut;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class UserLogOutTest {

    private WebDriver driver;
    private UserLogOut userLogOut;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/prisijungti");
        userLogOut = new UserLogOut(driver);
        userLogOut.login("Saule", "Lietuva123");
        userLogOut = new UserLogOut(driver);
    }

    @Test
    public void testUserLogout() {
        userLogOut = new UserLogOut(driver);
        userLogOut.logout();

    }
    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
