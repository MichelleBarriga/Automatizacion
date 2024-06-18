package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserDriver {
    private static WebDriver driver;
    private static ChromeOptions options;

    private BrowserDriver() {
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe"); // Ensure this path is correct
        driver = new ChromeDriver(options);
        driver.get("https://campusalalay.pythonanywhere.com/login");
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            new BrowserDriver();
        }
        return driver;
    }

    public static void clear() {
        if (driver != null) {
            driver.quit();
            driver = null; // Clean up the driver
        }
    }
}
