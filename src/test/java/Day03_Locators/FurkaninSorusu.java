package Day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FurkaninSorusu {

    public static void main(String[] args) throws InterruptedException {

        //1 - set the relevant settings and maximize window
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //2- Go to https://www.automationexercise.com/
        String autoExerciseURL = "https://www.automationexercise.com/";
        driver.get(autoExerciseURL);
        Thread.sleep(2000); // to see better.


        //click women tab and hard wait to see
        WebElement women = driver.findElement(By.xpath("(//i[@class='fa fa-plus'])[1]"));
        women.click();
        Thread.sleep(2000);

        //Printing subcategories for women
        List<WebElement> subCategory = driver.findElements(By.xpath("(//div[@class='panel-body'])[1]"));
        for (int i = 0; i <subCategory.size(); i++) {
            System.out.println(subCategory.get(i).getText());
        }

        //close thw window
        Thread.sleep(2000);
        driver.close();
    }
}

