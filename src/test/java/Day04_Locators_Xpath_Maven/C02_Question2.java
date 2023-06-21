package Day04_Locators_Xpath_Maven;
//1- create a class
//2- Go to https://www.amazon.com/
//3- Make the browser full page
//4- Refresh the page
//5- Test if the page title contains the phrase “Spend less”
//6- Press the Gift Cards tab
//7- Press the Birthday button
//8- Click the first product from the Best Seller section
//9- Select $25 from Gift card details
//10-Test the product price is $25
//11-Close the page

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_Question2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to https://www.amazon.com/
        String amazonURL = "https://www.amazon.com/gift-cards/b/?ie=UTF8&node=2238192011&ref_=nav_cs_gc";
        driver.get(amazonURL);

        //3- Make the browser full page
        driver.manage().window().maximize();

        //4- Refresh the page
        Thread.sleep(2000);
        driver.navigate().refresh();

        //5- Test if the page title contains the phrase “Spend less”
        String expectedTitle = "Gift Card";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedTitle)){
            System.out.println("Test is passed");
        }else{
            System.out.println("Test is failed");
        }

        //6- Press the Gift Cards tab.
        //If there are more than one in our xpath, you can add smt like [16] to make it individual.
        WebElement  giftCard =driver.findElement(By.xpath("(//a[@data-csa-c-type='link'])[16]"));
        giftCard.click();

        //7- Press the Birthday button
        WebElement birthdayButton = driver.findElement(By.xpath("//img[@alt = 'Birthday']"));
        birthdayButton.click();

        //8- Click the first product from the Best Seller section
        WebElement firstProduct = driver.findElement(By.xpath("(//img[@alt='Amazon.com eGift Card'])[1]"));
        firstProduct.click();

        //9- Select $25 from Gift card details
        WebElement twentyFive = driver.findElement(By.xpath("//button[@value='25']"));
        twentyFive.click();

        //10-Test the product price is $25
        WebElement selectedPrice = driver.findElement(By.xpath("//span[@class='a-color-price a-text-bold']"));
        System.out.println(selectedPrice.getText());

        String expectedPrice = "$25.00";
        String actualPrice = selectedPrice.getText();
        if(expectedPrice.equals(selectedPrice)){
            System.out.println("Price Test is Passed!");
        }else{
            System.out.println("Price Test is Failed");
        }

        Thread.sleep(3000);
        driver.close();

    }
}
