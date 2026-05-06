package Techniques;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablesAssessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        List<WebElement> tableRows = driver.findElements(By.xpath("//table[@name='courses']/descendant::tr"));
        int rows = tableRows.size() - 1;
        System.out.println(rows);
        
        List<WebElement> tablecolumns = driver.findElements(By.xpath("//table[@name='courses']/descendant::th"));
        int columns = tablecolumns.size();
        System.out.println(columns);
        
        List<WebElement> secondRow = driver.findElements(By.xpath("//table[@name='courses']/descendant::tr[3]/td"));
        for(int i=0; i<secondRow.size();i++) {
        	System.out.println(secondRow.get(i).getText());   
        }
	}

}
