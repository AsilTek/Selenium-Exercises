package Day02_driversMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C09_IphoneSearch {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        String googleURL = "https://www.google.com/";
        driver.get(googleURL);

        WebElement searchBox = driver.findElement(By.id("APjFqb"));


        searchBox.sendKeys("Iphone");
        Thread.sleep(1000);
        searchBox.submit();
        Thread.sleep(1000);
        driver.close();

    }
}
