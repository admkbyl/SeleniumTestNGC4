import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WebDriver1 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//WebDriverWait w =new WebDriverWait(driver,5);
		
		
		
		//String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};
		
		
		
		
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
	}
}
