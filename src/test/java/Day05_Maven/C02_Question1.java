package Day05_Maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class C02_Question1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1. Go to http://zero.webappsecurity.com
        String zeroSec = "http://zero.webappsecurity.com/";
        driver.get(zeroSec);

        // 2. Click the Signin button
        WebElement signIn = driver.findElement(By.xpath("//button[@id='signin_button']"));
        Thread.sleep(2000);
        signIn.click();

        // 3. Write “ username ” in the Login field
        WebElement login = driver.findElement(By.id("user_login"));
        login.sendKeys("username");
        Thread.sleep(2000);


        // 4. Write “ password ” in the password field
        WebElement passWord = driver.findElement(By.xpath("//input[@type='password']"));
        passWord.sendKeys("password");
        Thread.sleep(2000);



        // 5. Click the Sign in button
        WebElement clickSignIn = driver.findElement(By.xpath("//input[@type='submit']"));
        clickSignIn.click();
        Thread.sleep(2000);

        driver.navigate().back();

        // 6. Go to the Pay Bills page
        WebElement onlineBanking = driver.findElement(By.xpath("//li[@id='onlineBankingMenu']"));
        onlineBanking.click();
        Thread.sleep(2000);

        WebElement payBills = driver.findElement(By.cssSelector("[id='pay_bills_link']"));
        payBills.click();
        Thread.sleep(2000);


        // 7. Type any amount you want to deposit in the amount
        WebElement amount = driver.findElement(By.xpath("//input[@id='sp_amount']"));
        amount.sendKeys("4000");
        Thread.sleep(2000);


        // 8. Write “2020-0 9 - 10 ” on the 8th date part
        WebElement date = driver.findElement(By.xpath("//input[@id='sp_date']"));
        date.sendKeys("2020-09-10");
        Thread.sleep(2000);


        // 9. Click on the Pay button
        WebElement payButton = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
        payButton.click();
        Thread.sleep(2000);


        // 10. “The payment was successfully submitted.” test that the it appears
        WebElement test = driver.findElement(By.xpath("//div[@id='alert_content']"));
        System.out.println(test.getText());

        String actualResult =  test.getText();
        String expectedResult = "The payment was successfully submitted.";

        if(expectedResult.equals(actualResult)){
            System.out.println("Test is Passed!");
        }else{
            System.out.println("Test is Failed!");
        }

        Thread.sleep(2000);
        driver.close();
    }
}
