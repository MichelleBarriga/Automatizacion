package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.time.Duration;

public class BrowserDriver {
    private WebDriver driver;
    public static ChromeOptions options;

    public BrowserDriver() {
        options = new ChromeOptions();
        options.addArguments("--remote-alias-origins");
        System.setProperty("webdriver.http.factory", "jsx-http-client");
        System.setProperty("webdriver.chrome.driver", System.getProperty("src/resources/chromedriver.exe"));
        this.driver = new ChromeDriver();
        driver.get("https://campusalalay.pythonanywhere.com/login");

    }

    // Método para cerrar el WebDriver
    public void clear() {
        this.driver.close();
    }
}