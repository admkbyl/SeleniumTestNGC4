package UdemyPractices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.getCurrentUrl();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		// LOCATORS :
		//driver.findElement(By.id("Username")).sendKeys("Adem");
		driver.findElement(By.id("inputUsername")).sendKeys("ogun");
		driver.findElement(By.xpath("//input[@placeholder='Password']"));
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.findElement(By.linkText("Forgot your password?")).click();
		//driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Ogun");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("ogunBoy@yakusuklu.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("6473313131");
		//driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).clear();
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());
		
		
		
		driver.findElement(By.cssSelector(".go-to-login-btn")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("Ogun");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
		
		driver.close();
		
		
		
		
		//driver.findElement(By.cssSelector("input[id$='inputUsername']")).sendKeys("ali");
		//driver.findElement(By.cssSelector("input[id*='inputUserName']")).sendKeys("ibodayi");
		//driver.findElement(By.cssSelector("input[id^='inputUserName']")).sendKeys("abbi");
		//driver.findElement(By.cssSelector("#inputUsername")).sendKeys("amcikali@otuzbir.com");
		//driver.findElement(By.xpath("#inputUsername")).sendKeys("mcik");
		//driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("askjbak");
		//driver.findElement(By.cssSelector("button[type='submit']")).click();
		//driver.getCurrentUrl();
		//System.out.println("yakisikli ogun " + driver.getCurrentUrl());
		
		//String title = driver.getCurrentUrl();
		//System.out.println(title);
		
		//if (title.equals("https://rahulshettyacademy.com/locatorspractic/")) {
			
			//System.out.println("passed");
		//}else
			//System.out.println("failed");
	
		//System.out.println(driver.findElement(By.tagName("p")).getText());
		
		
	}
}
