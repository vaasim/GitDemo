package Techniques;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Exercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        // printing the count of links
        System.out.println(driver.findElements(By.tagName("a")).size());
        //*printing the count of links in the footer
       
        System.out.println(driver.findElements(By.xpath("//div[@id='gf-BIG']//a")).size());
        // or by limiting the search of driver
        WebElement footer = driver.findElement(By.xpath("(//li[@class='gf-li']/parent::ul)[1]"));
        int b =  footer.findElements(By.tagName("a")).size();
       System.out.println(b);
       
       //opening links in new tabs
       Actions a = new Actions(driver);
       //a.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Free Access to InterviewQues/ResumeAssistance/Mate')]"))).
       //keyDown(Keys.CONTROL).click().build().perform();
       
      // opening all links
//       List<WebElement> ft = footer.findElements(By.tagName("a"));
//       for(int i=0; i<ft.size();i++) {
//    	   a.moveToElement(ft.get(i)).
//           keyDown(Keys.CONTROL).click().build().perform();
//       }
       
       

       //opening some links and Getting Titles of child 

       for(int i=0;i<b;i++) {
    	   String clickTabLink = Keys.chord(Keys.CONTROL,Keys.ENTER);
    	   footer.findElements(By.tagName("a")).get(i).sendKeys(clickTabLink);
       }
      Set<String> w =  driver.getWindowHandles();
      Iterator<String> window= w.iterator();
      
      while(window.hasNext()) {
    	  driver.switchTo().window(window.next());
    	  System.out.println(driver.getTitle());
      }
        
	}

}
