package WebDriverPrac;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsPractice {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("blinkingText")).click();
		
		Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId]

		Iterator<String> it = windows.iterator();

		String parentId = it.next();

		String childId = it.next();
		
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1]);
		driver.close();
		//driver.switchTo().d
		
		 
	}

}
