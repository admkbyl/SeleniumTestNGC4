package UdemyPractices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.*;

public class Demo {
	
	public static void main(String[] args)  {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().wait(Duration.ofSeconds(5,));
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).sendKeys("Adem@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("password123");
		driver.findElement(By.className("signInBtn")).click();
		//System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Addo");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("addo@aca.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("addo@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("362323583");
		//driver.findElement(By.cssSelector())
		//System.out.println(driver.findElement(By.cssSelector("form p")));
		
		
	}
}
