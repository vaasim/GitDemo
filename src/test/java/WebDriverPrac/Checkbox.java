package WebDriverPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[text()='Family & Friends']/parent::div/preceding-sibling::div //*[name()='svg']")).click();
		

	}

}
