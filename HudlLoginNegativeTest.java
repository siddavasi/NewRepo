package SeleniumSessions1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HudlLoginNegativeTest {

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
		//Login functionality_Negative test : Input wrong login credentials and click login button 
		//Expected to get login failure error message, with Need help hyperlink.
				
		WebElement txtbx_username =  driver.findElement(By.name("username"));
		txtbx_username.sendKeys("kalavaidya@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("wrongPassword123");
			
		driver.findElement(By.id("logIn")).click();
		
		driver.findElement(By.className("need-help")).click();
				
		System.out.println("Negative login test Success");
												
		driver.quit();
		System.out.println("Browser is closed");		

	}

}
