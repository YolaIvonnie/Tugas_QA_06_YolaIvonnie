package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginIncorrect {
    WebDriver driver;
    @And("Input invalid password")
    public void input_invalid_password() {
        driver.findElement(By.id("password")).sendKeys("123456789");
    }

    @Then("User get error message")
    public void user_get_error_message() {
        String errorLogin = driver.findElement(By.xpath("//div[@role='alert']")).getText();
        Assert.assertEquals(errorLogin, "kredensial yang anda berikan salah");
        driver.close();
    }

}
