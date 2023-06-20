package Day02_driversMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C12_FindElementByClassName {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // 1- go to the https://www.amazon.com/
        String amazonURL = "https://www.amazon.com/";
        driver.get(amazonURL);

        // 2- found the element by using name (By.name)
        WebElement amazonSearchBox = driver.findElement(By.id("twotabsearchtextbox"));

        amazonSearchBox.sendKeys("nutella");
        Thread.sleep(1000);
        amazonSearchBox.submit();
        Thread.sleep(1000);

        //3- print the highest price in the first page
        List<WebElement> priceList = driver.findElements(By.className("a-price-whole"));
        //System.out.println(priceList);

        //getText: we cannot directly print web element so we need to reach each element text contents

        for (int i = 0; i <priceList.size(); i++) {
            System.out.println(priceList.get(i).getText());
        }

        //to print the highest value
            String strNumber = "";
            int number = 0;
            int highestNumber = 0;

        for (int i = 0; i < priceList.size(); i++) {
            strNumber = priceList.get(i).getText();
                number = Integer.parseInt(strNumber);

                if(number > highestNumber){
                    highestNumber = number;
                }
            }
            System.out.println("the highest price is "+highestNumber);





        driver.close();


    }
}
