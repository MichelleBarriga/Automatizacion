package utility;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    public static BrowserDriver driver;


    @Before
    public void setUp() {
        driver = new BrowserDriver();
    }

    @After
    public void tearDown() {
        // Cerrar el navegador después de cada escenario
        driver.clear();
    }
}
