package Mpack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OneTest {
	WebDriver driver;
	@Test
	public void Sample() throws InterruptedException, IOException 
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		 
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("uploadfile"))).click().build().perform();
		
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("C:\\Users\\sunil kumar\\eclipse-workspace\\MVNProject\\file\\mama.exe");
		
	}
	@AfterMethod
	public void samplee() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}
	
}
