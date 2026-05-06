package XpathPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathPractice {
	
	public WebDriver driver;
	
	@Test(priority=1)
	public void openBrowser() {
	
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\53353\\eclipse-workspace\\SeleniumJavaPractice\\src\\test\\resources\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://selectorshub.com/xpath-practice-page/");
	//driver.get("https://www.google.com/");

}
	//@Test(priority=3)
//public void form() throws InterruptedException {
//		
////		driver.findElement(By.xpath("//input[@id='userId']")).sendKeys("abc@gmail.com");
////		driver.findElement(By.id("pass")).sendKeys("password");
////		driver.findElement(By.name("company")).sendKeys("Hexaware");
////		driver.findElement(By.name("mobile number")).sendKeys("1234567890");
 //   	Thread.sleep(3000);
////		driver.findElement(By.xpath("//input[@value='Submit']")).click();
//		
//		//WebElement linkurl = driver.findElement(By.linkText("DownLoad Link"));
//		//driver.findElement(By.xpath("//a[contains(text(),'DownLoad Link')]")).click();
//		//linkurl.click();
//		
//	  String name = "Garry White";
//	  driver.findElement(By.xpath("//td[text()='"+name+"']/preceding-sibling::td[3]/input")).click();
 //   	driver.findElement(By.xpath("//button[text()='Checkout here']")).click();
 //   	Thread.sleep(3000);
 //      driver.findElement(By.xpath("//a[text()='SHub Youtube Channel']")).click();
//	}
	@Test(priority =2)
	public void shadowDom() throws InterruptedException {
////		 Find the host element of the Shadow DOM
//		WebElement shadowHost = driver.findElement(By.cssSelector("div#userName"));
////		
////		// Execute JavaScript to access Shadow DOM
	//	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
   //  WebElement shadowRoot = (WebElement) jsExecutor.executeScript("return arguments[0].shadowRoot", shadowHost);
////       
////       // Find elements within the Shadow DOM
   //  WebElement shadowElement = shadowRoot.findElement(By.cssSelector("input#kils"));
////       
    //  shadowElement.sendKeys("vaasim");
////		
//		
 //     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 1000);");
 	//	Thread.sleep(5000);
////		
//		WebElement shadowHost = driver.findElement(By.cssSelector("div#userName"));
////		
	//	WebElement shadowElement = shadowHost.findElement(By.cssSelector("input#kils"));
	//	shadowElement.sendKeys("vaasim");
////		
//        
//        

		
	}
}
	
	
	
	
	
	

