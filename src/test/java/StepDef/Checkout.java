package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkout {
    WebDriver driver;
    @Given("click add to cart button on the product")
    public void click_add_to_cart_button_on_the_product(String buttonName) {
        WebElement addToCartButton = driver.findElement(By.xpath("//button[text()='" + buttonName + "']"));
        addToCartButton.click();
    }

    @And("click basket button")
    public void click_basket_button(String buttonName) {
        WebElement button = driver.findElement(By.xpath("//button[text()='" + buttonName + "']"));
        button.click();
    }

    @When("click checkout button")
    public void click_checkout_button(String buttonName) {
        WebElement buttonCheckout = driver.findElement(By.xpath("//button[text()='" + buttonName + "']"));
        buttonCheckout.click();
    }

    @And("Input first name")
    public void input_First_Name(String inputField) {
        WebElement inputElement = driver.findElement(By.id(inputField.toLowerCase().replace(" ", "_")));
        inputElement.sendKeys("Your input data");
    }

    @And("Input last name")
    public void input_Last_Name(String inputField) {
        WebElement inputLastName = driver.findElement(By.id(inputField.toLowerCase().replace(" ", "_")));
        inputLastName.sendKeys("Your input data");
    }

    @When("Input postal code")
    public void input_Postal_Code(String inputField) {
        WebElement inputCode = driver.findElement(By.id(inputField.toLowerCase().replace(" ", "_")));
        inputCode.sendKeys("Your input data");
    }

    @Then("click finish button")
    public void click_Finish_Button(String buttonName) {
        WebElement finishButton = driver.findElement(By.xpath("//button[text()='" + buttonName + "']"));
        finishButton.click();
    }
}
