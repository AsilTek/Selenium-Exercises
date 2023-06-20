package Day02_driversMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C08_NutellaTest {

    public static void main(String[] args) throws InterruptedException {



        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();

        // 1- go to the https://www.amazon.com/
        String amazonURL = "https://www.amazon.com/";
        driver.get(amazonURL);

        // 2- search for mutella
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

        searchBox.sendKeys("java");
        Thread.sleep(1000);
        searchBox.clear(); // clear inside the searchBox
        Thread.sleep(1000); // we are adding too much sleep to see it clearly otherwise will go so fast.
        searchBox.sendKeys("nutella");
        Thread.sleep(1000);
        searchBox.submit();

        // 3- test that you have searched for nutella

        String pageSource = driver.getPageSource();
        String expectedSearch = "1-48 of 146 results for";

        if(pageSource.contains(expectedSearch)){
            System.out.println("Test is passed!");
        }else{
            System.out.println("Test is failed!");
        }

        driver.close();


    }
}
