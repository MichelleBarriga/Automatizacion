package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginForm {

    private WebDriver driver;
    @Given("Ingresar a la pagina {string}")
    public void ingresar_a_la_pagina(String myUrl) {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome,driver", "src/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(myUrl);
    }
    @When("Introducir el usuario {string} en username")
    public void introducir_el_usuario_en_username(String username) {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("usuario")).sendKeys(username);
    }
    @When("Introducir {string} en Contraseña")
    public void introducir_en_contraseña(String password) {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("password-login")).sendKeys(password);
    }
    @When("Seleccionar {string} en rol")
    public void seleccionar_en_rol(String rol) {
        // Write code here that turns the phrase above into concrete actions
        WebElement combo = driver.findElement(By.id("rol"));
        // Crea una instancia de la clase Select
        Select select = new Select(combo);

        // Selecciona la opción por el texto visible
        select.selectByVisibleText(rol);
    }
    @When("Click en el boton iniciar sesion")
    public void click_en_el_boton_iniciar_sesion() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("submit-login")).click();
    }
    @Then("Se muestra la pagina del home")
    public void se_muestra_la_pagina_del_home() {
        // Write code here that turns the phrase above into concrete actions
        // Espera a que se cargue la página del home
//        WebElement homeElement = driver.findElement(By.id("categoria"));
//        assert(homeElement.isDisplayed());
//        driver.quit();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        System.out.println("Current URL: " + driver.getCurrentUrl());
        WebElement homeElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("categoria")));
        assert(homeElement.isDisplayed());
        driver.quit();
    }
    @Then("Se muestra la pagina del homeDocente")
    public void se_muestra_la_pagina_del_home_docente() {
        // Write code here that turns the phrase above into concrete actions
//        WebElement homeElement = driver.findElement(By.id("navbarNav"));
//        assert(homeElement.isDisplayed());
//        driver.quit();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        System.out.println("Current URL: " + driver.getCurrentUrl());
        WebElement homeElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("navbarNav")));
        assert(homeElement.isDisplayed());
        driver.quit();
    }
}
