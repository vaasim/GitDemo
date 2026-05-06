package WebDriverPrac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dropdown {
	
public WebDriver driver;
	@Test(priority=1)
	public void openBrowser() {
	
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\53353\\eclipse-workspace\\SeleniumJavaPractice\\src\\test\\resources\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	}
	@Test(priority=2,enabled=true)
	public void autoSuggestiveDropDown() throws InterruptedException {
		
		Thread.sleep(5000);
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(3000);
		List<WebElement> options =driver.findElements(By.xpath("//li[@role='presentation']/a"));
		
		// Return type of driver.findElments is List<WebElement>
		
		for(WebElement option:options) {
			
			if(option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}
		Thread.sleep(3000);
			
		
	}
	
	@Test(priority=3,enabled=false)
	public void staticDropDown() {
		
		WebElement staticDP = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropDown = new Select(staticDP);
		dropDown.selectByValue("USD");
		//dropDown.selectByIndex(3);
		System.out.println(dropDown.getFirstSelectedOption().getText());
		
		
	}
	
	@Test(priority=4,enabled=false)
	public void dynamicDropDown() throws InterruptedException {
		Thread.sleep(3000);
		WebElement fromDp = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		fromDp.click();
		driver.findElement(By.xpath("//a[@value='IXB']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id ='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='ATQ']")).click();
	}
		
	
	//Checking element disable or enabled through attribute
	
@Test(priority=5,enabled=true)
public void disabledCalender() throws InterruptedException {
	Thread.sleep(5000);
	//before clicking - one way trip
	//System.out.println(driver.findElement(By.xpath("//div[contains(@style,'opacity: 0.5')]")).isDisplayed());
	
	driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")){
		System.out.println("Enabled");
		Assert.assertTrue(true);
		
	}
	else {
		Assert.assertTrue(false);
	}
}
	

}
