package Examples;
//To get access for webdriver classes & methods
import org.openqa.selenium.WebDriver;

//To get access for Firefox browers
import org.openqa.selenium.firefox.FirefoxDriver;
//To get access for object: methods
import org.openqa.selenium.By;
//Mouse activity Package

public class TC001 {
//Test case Steps
	public static void main (String args[]) throws Exception {
		//Property of browser driver location
		System.setProperty("webdriver.gecko.driver", "D:\\Java Selenium\\Jarfiles\\geckodriver.exe");
		//Launching Browser
		WebDriver driver = new FirefoxDriver();
		//URL Navigatation
		driver.navigate().to("http://183.82.125.5/nareshit/login.php");
		
		System.out.println("Launched the brower");
		//Time Waiting 3000 MS
		Thread.sleep(3000);
		//Username
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		//Password
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		
		Thread.sleep(3000);
		//Submit click activity
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login Completed");
		
		Thread.sleep(5000);
		//Click activity
		driver.findElement(By.linkText("Logout")).click();
		
		System.out.println("Logout Completed");
		
		Thread.sleep(3000);
		
		driver.close();
		
	}
}
