package SeleniumSessions1;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class HudlLoginPageElements {
		
		public static void main(String[] args) {
	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.hudl.com/");	
			String title = driver.getTitle();
							
			//Validate title of the Hudl home page
			if(title.equals("Hudl: We Help Teams and Athletes Win")) {
				System.out.println("Correct Page Title");
			}
			else {
				System.out.println("Incorrect Page Title");		
			}
			
			driver.findElement(By.xpath("/html/body/div[1]/header/div/a[2]")).click();
						
			//validates elements displayed in Login page
					
			driver.findElement(By.className("icon-logomark")).isDisplayed();
			driver.findElement(By.className("sign-up-trial")).isDisplayed();
			driver.findElement(By.className("login-fields")).isDisplayed();
			driver.findElement(By.name("password")).isEnabled();			
			driver.findElement(By.className("login-buttons")).isDisplayed();
			driver.findElement(By.className("checkbox-container")).isDisplayed();
			driver.findElement(By.id("forgot-password-link")).isDisplayed();
			driver.findElement(By.className("login-organization-button")).isDisplayed();
			
				System.out.println("All login page elements are displayed as expected.");	
				
				driver.quit();
				System.out.println("Browser is closed");	

		}

	}



