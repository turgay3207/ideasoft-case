package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {
    private Driver(){}

    private static WebDriver driver;
    //getDriver() is used to instantiate the driver object
    public static WebDriver getDriver(){
        if (driver==null){
            switch (ConfigReader.getProperty("browser")) {
                case "chrome":
                     driver = new ChromeDriver();
                    break;
                case "firefox":
                     driver = new FirefoxDriver();
                    break;
                case "chrome-headless":
                     driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                case "edge":
                     driver = new EdgeDriver();
                    break;
            }

        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        return driver;
    }

    //closeDriver() is used to close the driver
    public static void closeDriver(){
        //if driver is already being used(pointing an object) then quit the driver
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }

}
