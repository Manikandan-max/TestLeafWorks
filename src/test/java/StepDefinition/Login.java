package StepDefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Login {

    public ChromeDriver driver;

    @Given("Launch the browser")
    public void launchBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @And("Load the url")
    public void loadTheUrl() {
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @And("Enter the Username as {string}")
    public void enterTheUsername(String username) {
        driver.findElement(By.id("username")).sendKeys(username);
    }

    @And("Enter the Password as {string}")
    public void enterThePassword(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @When("click on the login Button")
    public void clickOnTheLoginButton() {
        driver.findElement(By.className("decorativeSubmit")).click();
    }

    @Then("WelcomePage is Displayed")
    public void welcomepageIsDisplayed() {
        System.out.println("Welcome Page");
    }

    @But("Error Message is Displayed")
    public void errorMessageIsDisplayed() {
        System.out.println("Error Message");
    }
}
