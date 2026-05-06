package Miscelleneous;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		String url = driver.findElement(By.xpath("//a[text()='Broken Link']")).getAttribute("href");
//		HttpURLConnection   conn= (HttpURLConnection)new URL(url).openConnection();
		List<WebElement> links = driver.findElements(By.xpath("//div[@id='gf-BIG'] //li/a"));
		int l = links.size();
		int brokenlinks =0;
		
		SoftAssert a = new SoftAssert();
		for(WebElement link: links) {
			String eachLink = link.getAttribute("href");
		HttpURLConnection conn = (HttpURLConnection)new URL(eachLink).openConnection();
		
		conn.setRequestMethod("HEAD"); //Head request method.
		conn.connect(); // Making connection
		int response = conn.getResponseCode();
		
			
			a.assertTrue(response<400, "The broken link is" + link.getText());		
		
		}
		a.assertAll(); // report all isuues.
		
		
		
		
	}

}
