package stepDefiniton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjectModel.contactUsPage;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class contactUs {
    private WebDriver driver;
    pageObjectModel.contactUsPage contactUsPage = new contactUsPage();
    @Given("navigate to website")
    public void navigate_to_website() {
        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @Given("type email")
    public void type_email() {
        contactUsPage.setMail();
    }
    @Given("type password")
    public void type_password() {
        contactUsPage.setPassword();
    }
    @When("click on send button")

    public void click_on_send_button() {
        contactUsPage.clickLoginButton();
    }
    @Then("verify success message")
    public void verify_success_message() {

    }
}
