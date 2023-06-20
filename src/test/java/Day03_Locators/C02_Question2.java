package Day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

//Automation Exercise Link Test
//1- Create a test class and set the relevant settings
//2- Go to https://www.automationexercise.com/
//3- Test that there are 147 links on the page.
//4- Click on Products link
//5- Test that the special offer text appears
//6- Close the page
public class C02_Question2 {
    public static void main(String[] args) {

        //1- Create a test class and set the relevant settings
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to https://www.automationexercise.com/
        String autoExerciseURL = "https://www.automationexercise.com/";
        driver.get(autoExerciseURL);

        //3- Test that there are 147 links on the page.
        List<WebElement> links = driver.findElements(By.tagName("a"));

        int actualResult = links.size();
        int expectedResult = 147;

        if(actualResult == expectedResult){
            System.out.println("Test is passed!");
            System.out.println("There are "+links.size()+" Category Sections.");
        }else{
            System.out.println("Test is failed!");
        }

        //4- Click on Products link
        WebElement productLink = driver.findElement(By.partialLinkText("Products"));
        productLink.click();

        //5- Test that the special offer text appears
        WebElement specialOffer = driver.findElement(By.id("sale_image"));

        if(specialOffer.isDisplayed()){
            System.out.println("Test is passed!");
        }else{
            System.out.println("Test is failed!");
        }

        //6- Close the page
        driver.close();
    }
}
