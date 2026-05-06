package Techniques;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowsAssessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.xpath("//a[contains(text(),'Free Access to InterviewQues/ResumeAssistance/Mate')]")).click();
		
		Set<String> windows = driver.getWindowHandles(); //[parentID,childID1,ChildID2....]
		Iterator<String> it = windows.iterator();
		String parentID=it.next();
		String childID = it.next();
		
		driver.switchTo().window(childID);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='im-para red']")));
		String a = driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().
				split(" ")[0].trim();
         	System.out.println(a);
       driver.switchTo().window(parentID);
       driver.findElement(By.xpath("//input[@id='username']")).sendKeys(a);
		
		
	}

}
