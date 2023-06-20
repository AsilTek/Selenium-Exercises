package Day01_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Driver_Get {

    public static void main(String[] args) throws InterruptedException{  //this exception is for Thread.sleep

        // left side, put the browser we want to use
        // right side, put the copy of path of our chromedriver.exe
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();  // to create Web driver object

        driver.get("https://www.amazon.com/"); // to open www.amazon.com

        Thread.sleep(5000); // to wait 5 seconds

        driver.close(); // to close the driver

    }

}
