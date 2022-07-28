package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class contactUsPage extends AbstractClass{
    WebDriver driver;

    public  contactUsPage (){
        driver = Driver.getDriver();
        //for using FindBy, FindAll etc. keys
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "login-button")
    private WebElement loginButton;

    public void clickLoginButton(){
        clickFunction(loginButton);
    }

    @FindBy(id = "user-name")
    private WebElement username;

    public void setMail(){
        sendKeysFunction(username,"standard_user");
    }

    @FindBy(id = "password")
    private WebElement password;

    public void setPassword(){
        sendKeysFunction(password,"secret_sauce");
    }

}
