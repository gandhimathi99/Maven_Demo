package moduleone;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook {
	
	@Test
	public void testing() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com");
		
		driver.findElementByLinkText("Create New Account").click();
		
		Thread.sleep(5000);
		
		driver.findElementByName("firstname").sendKeys("Mathi");
		
	}
	

}
