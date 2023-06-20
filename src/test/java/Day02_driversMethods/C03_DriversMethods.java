package Day02_driversMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.sound.midi.Soundbank;

public class C03_DriversMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        String amazonURL = "https://www.amazon.com/";
        driver.get(amazonURL);
        driver.manage().window().maximize(); // maximize window

        // to get all html codes from the page
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);

        //lets check if Clinic word(tab) is in the Amazon page

        String expectedWord = "Clinic";

        if(pageSource.contains(expectedWord)){
            System.out.println("Test is passed!");
        }else{
            System.out.println("Test is failed!");
        }








    }
}
