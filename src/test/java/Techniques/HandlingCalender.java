package Techniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandlingCalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
       
       String date = "15";
       String month = "07";
       String year = "2028";
       String[] actual= {year,month,date};
       driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
       driver.findElement(By.xpath("//span[contains(@class,'react-calendar__navigation__label__labelText')]")).click();
       driver.findElement(By.xpath("//span[contains(@class,'react-calendar__navigation__label__labelText')]")).click();
       driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
       
       driver.findElements(By.xpath("//button[contains(@class,' react-calendar__year-view__months__month')]")).
       get(Integer.parseInt(month)-1).click();
       driver.findElement(By.xpath("//abbr[text()='"+date+"']/parent::button[@class='react-calendar__tile react-calendar__month-view__days__day' "
       		+ "or @class='react-calendar__tile react-calendar__month-view__days__day react-calendar__month-view__days__day--weekend']")).click();
	
      String[] c = driver.findElement(By.xpath("//input[@name='date']")).getAttribute("value").split("-");
     
      if(year==c[0] && month==c[1] && date==c[2]) {
    	  Assert.assertTrue(true, "failed");
      }
	
	}

}
