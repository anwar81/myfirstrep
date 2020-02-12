package homework1;

import java.util.Random;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Homeworkadditional {
	
	@Test
	public void homework() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver badman = new ChromeDriver();
		//Implicit Wait
		badman.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		badman.get("http://techfios.com/test/billing/?ng=admin/");
		//Slow down Java
		Thread.sleep(3000);
		badman.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		badman.findElement(By.id("password")).sendKeys("abc123");
		badman.findElement(By.name("login")).click();
		badman.findElement(By.linkText("Add Deposit")).click();
		Thread.sleep(3000);
		//badman.findElement(By.xpath("//option[text()='Expenses21']")).click();
		//Select
		WebElement drop = badman.findElement(By.id("select2-account-container"));
		
		Select select = new Select(drop);
		
		select.selectByVisibleText("Expenses21");
		
		
		
		//validate the title through assertion :
		String expectedTitle ="Dashboard- TechFios Test Application - Billing" ;
		String actualTitle = badman.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		Assert.assertEquals("our test is failed" , "expectedTitle, actualTitle");
		
		Random rd = new Random();
		int random = rd.nextInt(999);
		String Expected_Account="ABC"+ random;
		Thread.sleep(3000);
		badman.findElement(By.xpath("//input[@id='account']")).sendKeys(Expected_Account);
		for(String windowHandle : badman.getWindowHandles()) {
			badman.findElement(By.xpath("//div[@class='w3-bar w3-left']/descendat::a[text()='SQL']")).click();
		}
		//close the browser
		//badman.close();
		//Quit the driver
		//badman.quit();
	}

}
