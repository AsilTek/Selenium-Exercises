package Day05_Maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

//ClassWork Amazon Search Test
// 1- Go to https://www.amazon.com/
// 2- let's locate the search box
// 3- Let's search with "Samsung headphones"
// 4- Let's print the number of results found
// 5- Let's click the first product
// 6- Let's print all the titles on the page
public class C01_MavenFirstTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1- Go to https://www.amazon.com/
        String amazonURL = "https://www.amazon.com/";
        driver.get(amazonURL);

        // 2- let's locate the search box
        WebElement searchBox = driver.findElement(By.cssSelector("[id='twotabsearchtextbox']"));

        // 3- Let's search with "Samsung headphones"
        searchBox.sendKeys("Samsung headphones" + Keys.ENTER);


        // 4- Let's print the number of results found
        WebElement printResult = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
        System.out.println(printResult.getText());

        // 5- Let's click the first product
        WebElement firstItem = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
        firstItem.click();

        // 6- Let's print all the titles on the page
        List<WebElement> titleList = driver.findElements(By.xpath("//span[@class='a-size-base a-color-base']"));
        for (WebElement each : titleList){
            System.out.println(each.getText());
        }

        Thread.sleep(2000);
        driver.close();


    }
}

