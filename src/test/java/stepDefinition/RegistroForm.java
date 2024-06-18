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

public class RegistroForm {
    private WebDriver driver;

    @Given("Ingresar a {string}")
    public void ingresar_a(String myUrl) {
        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(myUrl);
    }
    @When("Introducir {string} en Username")
    public void introducir_en_username(String username) {
        driver.findElement(By.id("usuario")).sendKeys(username);
    }
    @When("Introducir {string} en Contraseña")
    public void introducir_en_contraseña(String password) {
        driver.findElement(By.id("password-login")).sendKeys(password);
    }
    @When("Seleccionar {string} en rol")
    public void seleccionar_en_rol(String rol) {
        WebElement combo = driver.findElement(By.id("rol"));
        // Crea una instancia de la clase Select
        Select select = new Select(combo);

        // Selecciona la opción por el texto visible
        select.selectByVisibleText(rol);
    }
    @When("Click en el boton iniciar sesion")
    public void click_en_el_boton_iniciar_sesion() {
        driver.findElement(By.id("submit-login")).click();
    }
    @When("Click en el boton registrar curso")
    public void click_en_el_boton_registrar_curso() {
        driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a")).click();
    }
    @When("Introducir {string} en Titulo")
    public void introducir_en_titulo(String titulo) {
        driver.findElement(By.id("titulo")).sendKeys(titulo);
    }
    @When("Click en el boton cancelar")
    public void click_en_el_boton_cancelar() {
        driver.findElement(By.xpath("//*[@id=\"miFormulario\"]/div[7]/button[1]")).click();
    }
    @Then("Mostrar mensaje de confirmacion de cancelacion")
    public void mostrar_mensaje_de_confirmacion_de_cancelacion() {
        // cancelModalLabel
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        System.out.println("Current URL: " + driver.getCurrentUrl());
        WebElement homeElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cancelModalLabel")));
        assert(homeElement.isDisplayed());
        driver.quit();
    }
}
