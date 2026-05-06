package WebDriverPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calenderrepractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//input[@placeholder='Date of travel']"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		Thread.sleep(3000);
		element.click();
		driver.findElement(By.xpath("//span[@class='flatpickr-next-month'] //*[name()='svg']"));
		
		
		

	}

}
