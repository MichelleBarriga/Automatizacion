package utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp() {
        BrowserDriver.getDriver(); // Initialize the driver
    }

    @After
    public void tearDown() {
        BrowserDriver.clear(); // Clear the driver
    }
}
