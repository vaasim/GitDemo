package WebDriverPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBoxesAssesment {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	Thread.sleep(3000);
	// Select the check box
	driver.findElement(By.id("checkBoxOption1")).click();
	
	// to verify the check boxes is selected.
	Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
	
	Thread.sleep(2000);
      
	driver.findElement(By.id("checkBoxOption1")).click();
	Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
	// Count the check boxes
	int a = driver.findElements(By.xpath("//legend[text()='Checkbox Example']/following-sibling::label/input")).size();
     Assert.assertEquals(a, 3);
	
	
	
	
		
	}

}
