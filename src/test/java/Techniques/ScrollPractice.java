package Techniques;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        
        JavascriptExecutor js = (JavascriptExecutor) driver; // casting driver to javascript executor.
        
        //window scroll in browser
        js.executeScript("window.scrollBy(0,500)");
        // Scroll on specific element
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
        
        List<WebElement> values = driver.findElements(By.xpath("(//table[@id='product'])[2]//descendant::td[4]"));
        int v = values.size();
        int sum =0;
         for(int i=0; i<v; i++) {
        	 String a = values.get(i).getText();
        	 System.out.println(a);
        	 int b = Integer.parseInt(a);
        	 sum+= b;
        	 
        	 
         }
         
         System.out.println(sum);
         
         String c = driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim();
         System.out.println(c);
        int z = Integer.parseInt(c);
         Assert.assertEquals(sum, z);
	}

}
