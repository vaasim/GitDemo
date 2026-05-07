package Techniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AssignmentSixPracticePage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		String selectedBox = driver.findElement(By.xpath("//input[@id='checkBoxOption2']/parent::label")).getText();
		System.out.println(selectedBox);
		WebElement a =driver.findElement(By.id("dropdown-class-example"));
		Select s = new Select(a);
	s.selectByVisibleText(selectedBox);
	
	driver.findElement(By.xpath("//input[@id='name']")).sendKeys(selectedBox);
	driver.findElement(By.id("alertbtn")).click();
	String verify = driver.switchTo().alert().getText().split(",")[0].split(" ")[1];
	System.out.println(verify);
	Assert.assertEquals(verify, selectedBox);
	
	driver.switchTo().alert().accept();
	
	System.out.println("Creating branch from GitDemo and psuhing this to development branch");
	System.out.println("updating the code from git practice and getting the latest code from dev and pushing this code");

	}

}
