package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice {

    public static void main(String[]args) throws InterruptedException {
      /*  System.setProperty("webdriver.chrome.driver","D:\\SPSingh Backup\\RShetty_SeleniumAutomation_Dec2022\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice");
        driver.manage().window().maximize();
        driver.findElement(By.id("inputUsername")).sendKeys("Ramji");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        driver.findElement(By.cssSelector("button[type='submit']")).click();*\



       */
        System.setProperty("webdriver.chrome.driver","D:\\SPSingh Backup\\RShetty_SeleniumAutomation_Dec2022\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://phptravels.com/demo");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='jfHeader-menuListLink jfHeader-dynamicLink jfHeader-signup-action signup']")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("inputFirstName")).sendKeys("Sudh");
        driver.findElement(By.id("inputLastName")).sendKeys("Singh");
        driver.findElement(By.id("inputPhone")).sendKeys("9879879876");
        driver.findElement(By.name("email")).sendKeys("abc@gmail.com");


        Thread.sleep(20000);
        driver.close();



    }
}
