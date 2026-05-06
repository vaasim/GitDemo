package WebDriverPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignementTwo {
	
	public static void main(String[] args) throws InterruptedException {
	//WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/angularpractice/");
	Thread.sleep(3000);

    driver.findElement(By.name("email")).sendKeys("vaasim@gamil.com");
    driver.findElement(By.id("exampleInputPassword1")).sendKeys("vaasim@123");
    driver.findElement(By.id("exampleCheck1")).click();
    Thread.sleep(3000);
    WebElement gender= driver.findElement(By.id("exampleFormControlSelect1"));
    Select gDp = new Select(gender);
    
    gDp.selectByIndex(1);
    //selecting radio button
    driver.findElement(By.id("inlineRadio1")).click();
    driver.findElement(By.name("bday")).sendKeys("04/12/1998");
    driver.findElement(By.xpath("//input[@type='submit']")).click();
    
    
    
    
    
    
    
	
	}

}
