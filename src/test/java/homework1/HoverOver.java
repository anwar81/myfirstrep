package homework1;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;




public class HoverOver {

	private static final WebElement Products_Element = null;

	@Test
	public void hoverover() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver badman = new ChromeDriver();
		//Implicit Wait
		badman.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
		
		badman.get("http://www.dell.com/en-us");
		badman.manage().window().maximize();
		Thread.sleep(3000);
		//Hoverover we use Action Class
		//WebElement Products_Element= badman.findElement(By.id("l1_0"));
		WebElement Products_Element= badman.findElement(By.xpath("//button[@id='l1_0']"));
		
		
		Actions action = new Actions(badman);
		action.moveToElement(Products_Element).build().perform();
		Thread.sleep(6000);
		
		WebElement Deals_Element = badman.findElement(By.id("l1_4"));
		action.moveToElement(Deals_Element).build().perform();
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)badman;
		js.executeScript("scroll (0,400)");

		//close the browser
		//badman.close();
		//Quit the driver
		//badman.quit();
	}
}
