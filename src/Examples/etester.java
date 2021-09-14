package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class etester {
	public static void main (String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Java Selenium\\Jarfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.etester.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".login-button-hover")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".gwt-TextBox")).sendKeys("student1");
		driver.findElement(By.cssSelector(".gwt-PasswordTextBox")).sendKeys("student");
		driver.findElement(By.cssSelector(".rf-webuser-command-button")).click();
		driver.findElement(By.cssSelector(".login-button-hover")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("login-button-hover")).click();
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("gwt-Button")).click();
		//driver.findElement(By.name("gwt-Button")).click();
		driver.findElement(By.xpath("//button[@type ='button']")).click();
		
	}	
}
