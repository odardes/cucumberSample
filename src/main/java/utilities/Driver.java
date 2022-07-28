package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    public static WebDriver driver;

    public static WebDriver getDriver(){
        if(driver==null){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\testinium\\IdeaProjects\\AutomationSample\\src\\main\\java\\utilities\\chromedriver.exe");
            driver= new ChromeDriver();
        }
        return driver;
    }
    public static void closeDriver(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }
    }
}
