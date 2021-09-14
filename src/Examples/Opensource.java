package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Opensource {
	public static void main (String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Java Selenium\\Jarfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.etester.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='login-button-hover']")).click();
		//driver.findElement(By.xpath("//input[class='gwt-TextBox field']")).sendKeys("student1");
		//driver.findElement(By.xpath("//input[type='password']")).sendKeys("student1");
		//driver.findElement(By.xpath("//button[tabindex='91']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.name("gwt-Button")).click();
		//driver.findElement(By.xpath("//button[@type ='button']")).click();
		
	}	
	}


