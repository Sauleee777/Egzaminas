import org.Pages.NegativeUserReg;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NegativeUserRegTest {

    private NegativeUserReg negativeUserReg;
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/prisijungti");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test
    public void testNegativeUserRegistration() {
        negativeUserReg = new NegativeUserReg(driver);
        negativeUserReg.registruoti();
        negativeUserReg.setUserName("SauleTest");
        negativeUserReg.setPassword("Lietuva123");
        negativeUserReg.setConfirmPassword("Lietuva123");
        negativeUserReg.submit();


        assertEquals("Toks vartotojo vardas jau egzistuoja", negativeUserReg.getErrorMessage());
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }
}
