package WebDriverPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class Calender {
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.path2usa.com/travel-companion/");
		driver.manage().window().maximize();
		WebDriverWait w =new WebDriverWait(driver,Duration.ofSeconds(30));
		//driver.manage().timeouts().implicitlyWait(Duration);
		w.until(ExpectedConditions
	             .presenceOfElementLocated(By.xpath("//input[contains(@name,'form_fields[travel_comp_date')]")));
		
		//  w.until(ExpectedConditions .elementToBeClickable(By.xpath(
		//  "//input[contains(@name,'form_fields[travel_comp_date')]")));
		  
		 
		// Thread.sleep(30000); 
		 WebElement element = driver.findElement(By.xpath(
				  "//input[contains(@name,'form_fields[travel_comp_date')]"));
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();", element);
		 Thread.sleep(5000);
		 driver.findElement(By.xpath(
		 "//input[contains(@name,'form_fields[travel_comp_date')]")).click();
		 
			//getting all the active days and comparing it with the date to be clicked
	//	List<WebElement> activeDates= driver.findElements(By.xpath("//div[@class='dayContainer']/child::span[@class='flatpickr-day today' or @class='flatpickr-day ']"));
       //for(int i=0;i<activeDates.size();i++) {
    	//   String day = activeDates.get(i).getText(); // get(index) starts from "0"
    	 //  System.out.println(day);
    	 //  if(day.equals("16")) {
    	//	   activeDates.get(i).click();
    		//   break;
    	 //  }
    	   
    	   //Simpler way
		 String Date = "October 16";
		
	
		while( driver.findElement(By.xpath("//span[contains(@aria-label,'"+Date+"')]")).getText().isEmpty()) {
			driver.findElement(By.xpath("//span[@class='flatpickr-next-month']/child::*[local-name()='svg']")).click();
		}
    	   
    	  // driver.findElement(By.xpath("//span[contains(@aria-label,'September "+x+"') and (@class='flatpickr-day today' or @class='flatpickr-day ')]")).click();
		 driver.findElement(By.xpath("//span[contains(@aria-label,'"+Date+"')]")).click();
       }
       

	}


