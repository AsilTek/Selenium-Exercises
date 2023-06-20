package Day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

//Automation Exercise Category Test
//1- Create a test class and set the relevant settings
//2- Go to https://www.automationexercise.com/
//3- Locate the elements in the category section
//4- Test that there are 3 elements in the Category section
//5- Print the category names
//6- Close the page

public class C01_Question1 {

    public static void main(String[] args) throws InterruptedException {

        //1- Create a test class and set the relevant settings
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to https://www.automationexercise.com/
        String autoExerciseURL = "https://www.automationexercise.com/";
        driver.get(autoExerciseURL);

        //3- Locate the elements in the category section
        List<WebElement> categoryNames = driver.findElements(By.className("panel-title"));

        //4- Test that there are 3 elements in the Category section
        int actualResult = categoryNames.size();
        int expectedResult = 3;

        if(actualResult == expectedResult){
            System.out.println("Test is passed!");
            System.out.println("There are "+categoryNames.size()+" Category Sections.");
        }else{
            System.out.println("Test is failed!");
        }

        //5- Print the category names
        for (int i = 0; i <categoryNames.size(); i++) {
            System.out.println(categoryNames.get(i).getText());
        }

        //6- Close the page
        Thread.sleep(2000);
        driver.close();




    }
}
