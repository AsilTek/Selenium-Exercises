package Day02_driversMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_WindowHandleValue {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        String windowsHandleValue = driver.getWindowHandle();
        System.out.println(windowsHandleValue); //C5F5B9077025AE7565B5E6BEC4121D87

        Thread.sleep(3000);
        driver.close();




    }
}
