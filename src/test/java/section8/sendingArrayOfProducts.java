package section8;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sendingArrayOfProducts {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		int j = 0;
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		Thread.sleep(3000);
		
		String[] itemsNeeded = {"Cucumber", "Brocolli" , "Beetroot"};
		
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		
		for (int i = 0; i < products.size(); i++) {
			
			
			//Brocolli - 1 Kg

			//Brocolli,    1 kg
			String[] name = products.get(i).getText().split("-");
			
			String formattedName = name[0].trim();
			
			
			List itemsNeededList = Arrays.asList(itemsNeeded);
			
			
			if (itemsNeededList.contains(formattedName)) {
				
				//driver.findElement(By.xpath("//button[text() ='ADD TO CART']")).click();
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if (j == itemsNeeded.length){
					break;
				}
			}
		}
	}
}