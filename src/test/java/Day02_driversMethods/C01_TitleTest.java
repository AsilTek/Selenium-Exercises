package Day02_driversMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_TitleTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        String amazonURL = "https://www.amazon.com/";
        driver.get(amazonURL);

        System.out.println(driver.getTitle()); //Amazon.com. Spend less. Smile more.

        String expectedTitle = "Amazon";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedTitle)){
            System.out.println("Test is passed");
        }else{
            System.out.println("Test is failed");
        }
        driver.close();

    }

}
