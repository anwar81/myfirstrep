package homework1;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Homeworkpart2 {
	
	@Test
	
	public void practice() {
		
	System.setProperty("Webdriver.chrome.driver","./driver/chromedriver.exe");
	
	WebDriver Texas = new ChromeDriver();
	Texas.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Texas.manage().window().maximize();
	Texas.get("http://newtours.demoaut.com/mercurywelcome.php");
	Texas.findElement(By.name("userName")).sendKeys("mercury");
	Texas.findElement(By.name("password")).sendKeys("mercury");
	Texas.findElement(By.name("login")).click();
	//validate the title through assertion :
	String expectedTitle ="Dashboard- TechFios Test Application - Billing" ;
	String actualTitle = Texas.getTitle();
	Assert.assertEquals(expectedTitle, actualTitle);
	}
	
}
