package Day02_driversMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class C05_DriversNavigateMethods {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        String amazonURL = "https://www.amazon.com/";
        driver.get(amazonURL);

        Thread.sleep(3000);

        String wiseURL = "https://www.wisequarter.com/";


        driver.navigate().to(wiseURL);

        Thread.sleep(3000);
        driver.navigate().back();

        Thread.sleep(3000);
        driver.navigate().forward();

        Thread.sleep(3000);
        driver.navigate().refresh();


        Thread.sleep(3000);
        driver.close();

    }
}
