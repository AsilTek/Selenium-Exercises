package Day04_Locators_Xpath_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C03_RelativeLocators {
//1) Go to https://www.diemol.com/selenium-4-demo/relative-locators-demo.html
//2) Locate Berlin with 3 different relative locators
//3) Test that the Relative locators are working correctly
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000); //Hard wait
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //Soft wait

        //1) Go to https://www.diemol.com/selenium-4-demo/relative-locators-demo.html
        String diemolURL = "https://www.diemol.com/selenium-4-demo/relative-locators-demo.html";
        driver.get(diemolURL);

        //2) Locate Berlin with 3 different relative locators
        WebElement bayArea = driver.findElement(By.cssSelector("#pid8_thumb")); //with id attribute
        WebElement LeftOfBerlin = driver.findElement(RelativeLocator.with(By.id("pid7_thumb")).toLeftOf(bayArea));

        WebElement boston = driver.findElement(By.cssSelector("#pid6_thumb")); //with id attribute
        WebElement RightOfBerlin = driver.findElement(RelativeLocator.with(By.id("pid7_thumb")).toRightOf(boston));

        WebElement nyc = driver.findElement(By.cssSelector("#pid3_thumb")); //with id attribute
        WebElement belowOfBerlin = driver.findElement(RelativeLocator.with(By.id("pid7_thumb")).below(nyc));

        //3) Test that the Relative locators are working correctly

        String expectedValue = "pid7_thumb";
        String actualIDofBerlin = belowOfBerlin.getAttribute("Id");

        if(actualIDofBerlin.equals(expectedValue)){
            System.out.println("Test is passed");
        }else{
            System.out.println("Test is failed");
        }




        Thread.sleep(2000);
        driver.close();


    }
}
