package SeleniumSessions1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HudlLoginFunctionalityTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hudl.com/login");	
		String title = driver.getTitle();
						
		//Validate title of the page
		if(title.equals("Log In - Hudl")) {
			System.out.println("Correct Page Title");
		}
		else {
			System.out.println("Incorrect Page Title");		
		}
		
		//Login functionality (Happy path): Input correct login credentials and click login button.  
		//Expected to be navigated to the user's home page 
		
		WebElement txtbx_username =  driver.findElement(By.name("username"));
		txtbx_username.sendKeys("kalavaidya@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("Password@23");
			
		driver.findElement(By.id("logIn")).click();
		
		System.out.println("Login Test Success");
			
			driver.quit();
			System.out.println("Browser is closed");		

	}

}
