package homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PractiseAssign1 {
	
	@Test
	public void homework() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver batman = new ChromeDriver();
		batman.get("http://newtours.demoaut.com/mercurywelcome.php");
		batman.findElement(By.name("userName")).sendKeys("mercury");
		batman.findElement(By.name("password")).sendKeys("mercury");
		batman.findElement(By.name("login")).click();
		Thread.sleep(3000);
		batman.findElement(By.linkText("SIGN-OFF")).click();
		batman.findElement(By.xpath("//a[@ href='mercurysignoff.php']")).isDisplayed();
		Thread.sleep(3000);
		//span[id="]
		
		
		
	}

}
