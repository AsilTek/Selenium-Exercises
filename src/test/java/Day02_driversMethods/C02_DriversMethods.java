package Day02_driversMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriversMethods {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        String amazonURL = "https://www.amazon.com/";
        //driver.get(amazonURL);


//        driver.manage().window().maximize();
//        System.out.println("maximized window screen : "+driver.manage().window().getSize());//(2576, 1408)

        driver.manage().window().fullscreen();
        System.out.println("full size screen: "+driver.manage().window().getSize());//(2560, 1440)


        driver.close();
    }
}
