package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginCorrect {
    WebDriver driver;
    String baseUrl = "https://www.saucedemo.com/";
    @Given("I am on log in page")
    public void i_am_on_log_in_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); // set timeout for web driver on waiting element
        driver.get(baseUrl);
    }

    @And("Input username")
    public void input_username() {
        driver.findElement(By.id("email")).sendKeys("standard_user");
    }

    @And("Input password")
    public void input_password() {
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @When("Click log in button")
    public void click_log_in_button() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("Dashboard website swag labs")
    public void dashboard_website_swag_labs() {
        driver.findElement(By.xpath("//div[contains(text(), 'dashboard')]"));
        String username = driver.findElement(By.xpath("//div[contains(text(),'hai')]/preceding-sibling::dt")).getText();
        Assert.assertEquals(username, "secret_sauce");
        driver.close();
    }
}
