package Examples;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Title_Match {
public static void main(String args[]) throws Exception {
	System.setProperty("webdriver.gecko.driver", "D:\\Java Selenium\\Jarfiles\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("http://183.82.125.5/nareshit/index.php");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	Thread.sleep(2000);
	driver.findElement(By.name("Submit")).click();
	////////////////////////////////////////////////////
	//Title Matches
	//By using Conditions methods (If or else)
	if(driver.getTitle().equals("OrangeHRM")) {
		
	System.out.println("Title Match");
	}
	else {
		System.out.println("Title Not Match");
		//If not matches this statment will Print the correct title
		System.out.println(driver.getTitle());
		}
	/////////////////////////////////////////
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(2000);
	driver.close();
}
}
