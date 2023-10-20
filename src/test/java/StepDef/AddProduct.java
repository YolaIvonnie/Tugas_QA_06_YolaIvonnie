package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class AddProduct {
    WebDriver driver;
    @Given("click name of product")
    public void click_name_of_product() {
        WebElement productNameLink = driver.findElement(By.xpath("//a[@class='product-name']"));
        productNameLink.click();
    }

    @And("click add to cart button")
    public void click_add_to_cart_button(String buttonName) {
        WebElement button = driver.findElement(By.xpath("//button[text()='" + buttonName + "']"));
        button.click();
    }

    @Then("shopping cart in website swag labs")
    public void shopping_cart_in_website_swag_labs() {
        WebElement shoppingCart = driver.findElement(By.id("shopping-cart"));
        assertTrue(shoppingCart.isDisplayed());
        driver.quit();
    }
}
