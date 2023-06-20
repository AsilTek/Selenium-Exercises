package Day02_driversMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C10_FindElementById {

    public static void main(String[] args) throws InterruptedException {



        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // 1- go to the https://www.amazon.com/
        String amazonURL = "https://www.amazon.com/";
        driver.get(amazonURL);

        // 2- found the element by using id (By.id)
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

        searchBox.sendKeys("java");
        Thread.sleep(1000);
        searchBox.submit();


        driver.close();


    }
}
