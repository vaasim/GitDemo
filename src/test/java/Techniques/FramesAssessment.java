package Techniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesAssessment {
public static void main(String[] args) {
	WebDriver driver;
	
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	/*
	 * driver.get("https://jqueryui.com/droppable/"); WebElement fr =
	 * driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	 * driver.switchTo().frame(fr);
	 * 
	 * Actions a = new Actions(driver); WebElement drag =
	 * driver.findElement(By.xpath("//div[@id='draggable']")); WebElement drop =
	 * driver.findElement(By.xpath("//div[@id='droppable']")); a.dragAndDrop(drag,
	 * drop).build().perform(); driver.switchTo().defaultContent();
	 */
	
	driver.get("https://the-internet.herokuapp.com/nested_frames");
	WebElement top= driver.findElement(By.xpath("//frame[@name='frame-top']"));
	driver.switchTo().frame(top);
	driver.switchTo().frame("frame-middle");
	
	System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
	
	
}
}
