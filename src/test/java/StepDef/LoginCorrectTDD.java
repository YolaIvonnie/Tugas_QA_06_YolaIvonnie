package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginCorrectTDD {
    WebDriver driver;
    @And("I Input (.*) as username")
    public void user_input_tdd_selenium_username(String username) {
        driver.findElement(By.id("username")).sendKeys(username);
    }

    @And("I Input (.*) as password")
    public void user_input_tdd_selenium_password(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @Then("I verify (.*) login result$")
    public void user_verify_success_login_result(String status) {
        driver.findElement(By.xpath("//div[contains(text(), 'dashboard')]"));
        String username = driver.findElement(By.xpath("//dd[contains(text(),'hai')]/preceding-sibling::dt")).getText();
        Assert.assertEquals(username, "secret_sauce");
        driver.close();
    }
}
