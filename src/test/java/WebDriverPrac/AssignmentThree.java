package WebDriverPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentThree {

	public static void main(String[] args) throws InterruptedException {
	

		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\53353\\eclipse-workspace\\SeleniumJavaPractice\\src\\test\\resources\\chromedriver.exe");
		//ChromeOptions chromeOptions = new ChromeOptions();
		//WebDriverManager.chromedriver().driverVersion("116.0.5845.96").setup();

		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		
		driver.findElement(By.xpath("//input[@value='user']/following-sibling::span[@class='checkmark']")).click();
		Thread.sleep(2000);
		
//System.out.println(driver.findElement(By.xpath("//input[@value='user']/following-sibling::span[@class='checkmark']")).);
		//driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
		WebElement user = driver.findElement(By.xpath("//select[@class='form-control']"));
		
		Select dp = new Select(user);
		dp.selectByIndex(2);
		
		
		
		
		
		
	}

}
