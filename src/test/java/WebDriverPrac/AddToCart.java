package WebDriverPrac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		Thread.sleep(5000);

		/*
		 * String[] itemsToAdd = {"Cauliflower","Tomato"}; String x = itemsToAdd[1];
		 * System.out.println(x);
		 * 
		 * int itemsSize =
		 * driver.findElements(By.xpath("//button[text()='ADD TO CART']")).size();
		 * 
		 * for(int j=0;j<itemsToAdd.length;j++) { for(int i=1;i<=itemsSize;i++) { String
		 * item =
		 * driver.findElement(By.xpath("(//h4[@class='product-name'])["+i+"]")).getText(
		 * ); System.out.println(item);
		 * 
		 * if(item.contains(itemsToAdd[j])) { System.out.println("if loop entered"+ i);
		 * 
		 * Thread.sleep(7000);
		 * driver.findElement(By.xpath("(//button[text()='ADD TO CART'])["+i+"]")).click
		 * ();
		 * 
		 * break; }
		 * 
		 * }}
		 */

		// or traditional method------------------------------------------
		/*
		 * String[] itemsNeeded = {"Cucumber","Brocolli","Beetroot"}; List<WebElement>
		 * allProducts = driver.findElements(By.xpath("//*[@class='product-name']"));
		 * 
		 * int totalProducts = allProducts.size(); int j=0; for(int i
		 * =0;i<totalProducts;i++) { String[] p =
		 * allProducts.get(i).getText().split("-"); String name = p[0].trim(); List
		 * items = Arrays.asList(itemsNeeded); if(items.contains(name)) {
		 * driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click(
		 * ); Thread.sleep(5000); j++; } if(j==itemsNeeded.length) {
		 * System.out.println(j); break;
		 * 
		 * }
		 * 
		 * }
		 */

		// Practice

		/*
		 * String[] itemsToAdd = { "Cucumber", "Beetroot" }; int totalItems =
		 * itemsToAdd.length; System.out.println(totalItems); List<WebElement> items =
		 * driver.findElements(By.xpath("//h4[@class='product-name']")); int siteItems =
		 * items.size(); System.out.println(siteItems);
		 * 
		 * for (int i = 0; i < totalItems; i++) { String item = itemsToAdd[i];
		 * System.out.println(item); Thread.sleep(5000); for (int j = 0; j < siteItems;
		 * j++) { String a = items.get(j).getText(); System.out.println(a); if
		 * (a.contains(item)) {
		 * driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[" + j++ +
		 * "]")).click(); // or //List<WebElement> items =
		 * driver.findElements(By.xpath(" (//button[text()='ADD TO CART'])")); //
		 * items.get(j).click(); break; } }
		 * 
		 * }
		 */
	
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };
		int totalItems = itemsNeeded.length;
		for (int i = 0; i < totalItems; i++) {
			String productName = itemsNeeded[i];
			driver.findElement(By.xpath("//*[contains(text(),'" + productName + "')]/following-sibling::div/button"))
					.click();
		}
		 
	}

}
