package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Methods_Objects_Class {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.gecko.driver", "D:\\Java Selenium\\Jarfiles\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
//Launch Browser
		driver.navigate().to("");

//Close Browers
		driver.close();

//Finding element and enter keys
		driver.findElement(By.name("")).sendKeys("");
		// name or id or class 
		
//Click Method
		driver.findElement(By.name("")).click();
		
//Linked text ( If <a tag is avalible in html code then we need to consider as anchor tag
		driver.findElement(By.linkText(""));
		
//Xpath ( If there is no id name or class then we need to consider as xpath
		driver.findElement(By.xpath("//input[type='password']"));
		//<input type="password" class="gwt-PasswordTextBox field" size="20" maxlength="15">
		
//Verify ( If verify a title name is matching or not)
//Verify the text with the help of Conditions methods
		if(driver.getTitle().equals("Expected result")) {
			System.out.println("Title match");
		}
		else {
			System.out.println("Title Not match");
			System.out.println(driver.getTitle());
		}
			
//Mouseover
		//Package .interactions.Action;
		//Method - moveToElement();
		//Object creation
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText(""))).perform();
		
//Frames
		//In HTLM code if <frame> or <iframe> avalible then it will consider as Frame
		//Handle a frame 1. Enter 2. Exit
		//M
		
		

	}
}
	