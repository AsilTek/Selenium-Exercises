package Day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_Xpath {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();
        Thread.sleep(3000);
        String amazonURL = "https://www.amazon.com/";
        driver.get(amazonURL);

        //finding Amazon Search box with using Xpath
        WebElement amazonSearchBox = driver.findElement(By.xpath("//input[@dir='auto']"));
        amazonSearchBox.sendKeys("nutella");
        amazonSearchBox.submit();

        Thread.sleep(2000);
        driver.close();

    }
}
