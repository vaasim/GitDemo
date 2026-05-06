package WebDriverPrac;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		// printing the all the links count
		System.out.println(driver.findElements(By.tagName("a")).size());
		Thread.sleep(3000);
		// printing all the links count in footer
		System.out.println(driver.findElements(By.xpath("//div[@id='gf-BIG'] //a")).size());

		// limiting the scope of wendriver and printing the count of links in browser

		WebElement footerSpace = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerSpace.findElements(By.tagName("a")).size());
		// to print links in 1st column of footer
		WebElement columnDriver = footerSpace.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		int firstColumnSize = columnDriver.findElements(By.tagName("a")).size();
		List<WebElement> link = columnDriver.findElements(By.tagName("a"));
		Actions ac = new Actions(driver);
		System.out.println(firstColumnSize);

		System.out.println(
				footerSpace.findElements(By.xpath("(//div[@id='gf-BIG']//descendant::ul)[1]//descendant::a")).size());

		/*
		 * for(int i=1;i<firstColumnSize;i++) {
		 * ac.moveToElement(link.get(i)).keyDown(Keys.CONTROL).click().build().perform()
		 * ; Thread.sleep(5000); }
		 */

		for (int i = 1; i < firstColumnSize; i++) {
			String clicklink = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clicklink);
			Thread.sleep(5000);
		}
		System.out.println(driver.getTitle());
		Set<String> tabs = driver.getWindowHandles();
		int a = tabs.size();
		System.out.println("No of tabs = " + a);
		Iterator<String> it = tabs.iterator();
		String parentId = it.next();
		for(int i=1;i<a;i++) {
			String windowTabId = it.next();
			driver.switchTo().window(windowTabId);
			String Title = driver.getTitle();
			System.out.println(Title);
		}
		
		

	}

}
