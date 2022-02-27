package Assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class assignment1 {
	
	public static void main(String[] args) {
		
		//TASK: Google search
//1- Open a chrome browser
//2- Go to: https://google.com
//3- Write "orange" in search box
//4- Click google search button
//5- Verify title:
//Expected: Title should start with "orange" word
//6-navigate back
//7-write banana in search box
//8-verify title contains banana.
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input[title='Search']")).sendKeys("orange");
		driver.findElement(By.xpath("(//input[@name='btnK'])[1]")).click();
		
		String expectedTitle = "orange";
		
		if (expectedTitle.startsWith(expectedTitle)){
			System.out.println("Verification has passed");
		}
		else
			System.out.println("it failed");
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("banana");
		driver.findElement(By.xpath("(//input[@name='btnK'])[1]")).click();
	}
}
