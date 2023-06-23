package Day04_Locators_Xpath_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
//1- Go to https://the-internet.herokuapp.com/add_remove_elements/
//2- Press the Add Element button
//3- Test that the Delete button is visible
//4- Press the delete key
//5- Test that the text “Add/Remove Elements“ is visible
public class C01_Question1 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //2- Go to https://www.automationexercise.com/
        String weirdURL = "https://the-internet.herokuapp.com/add_remove_elements/";
        driver.get(weirdURL);


        WebElement addElement = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        addElement.click();

        Thread.sleep(3000);
        WebElement deleteButton = driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));

        boolean actualResult = deleteButton.isDisplayed();
        boolean expectedResult = true;

        if(expectedResult == actualResult){
            System.out.println("Delete is real");
        }else{
            System.out.println("There is no Delete button");
        }
        Thread.sleep(3000);

        deleteButton.click();

        Thread.sleep(3000);
        driver.close();

    }
}
