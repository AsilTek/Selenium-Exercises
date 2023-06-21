package Day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FurkaninSorusu {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to https://www.automationexercise.com/
        String autoExerciseURL = "https://www.automationexercise.com/";
        driver.get(autoExerciseURL);

        List<WebElement> subCategory = driver.findElements(By.xpath("//div[@id='accordian']"));
        for (int i = 0; i <subCategory.size(); i++) {
            System.out.println(subCategory.get(i).getText());
        }


    driver.close();
    }
}
