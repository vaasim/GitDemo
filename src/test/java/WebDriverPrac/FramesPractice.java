package WebDriverPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();

		// driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		driver.findElement(By.id("draggable")).click();

		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement dest = driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, dest).build().perform();

	}

}
