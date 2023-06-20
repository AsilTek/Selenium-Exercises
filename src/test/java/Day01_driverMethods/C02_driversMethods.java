package Day01_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_driversMethods {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");

        //lets test URL = "http://www.amazon.com" com'dan sonra / olduguna dikkat et, ve https olacak.

        String expectedURL = "https://www.amazon.com/";

        String actualURL = driver.getCurrentUrl();

        if (actualURL.equals(expectedURL)) {
            System.out.println("URL Test is passed");
        } else {
            System.out.println("URL Test is failed ");
        }

        driver.close();


    }
}
