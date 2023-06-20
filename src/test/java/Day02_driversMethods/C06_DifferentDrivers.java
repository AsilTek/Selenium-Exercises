package Day02_driversMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_DifferentDrivers {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        String amazonURL = "https://www.amazon.com/";
        driver.get(amazonURL);

        WebDriver driver2 = new ChromeDriver();
        driver2.get(amazonURL); //opens second Amazon page.

        driver.close();
        driver2.close();
    }
}
