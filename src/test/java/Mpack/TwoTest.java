package Mpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TwoTest {
	WebDriver driver;
	@Test
	public void sample21()
	{
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://omayo.blogspot.com/");
		String d = driver.findElement(By.xpath("//p[@id='pah']")).getText();
		//System.out.println(d);
		//Assert.assertEquals(d,"PracticeAutomationHere");
	}
	@AfterMethod
	public void sample2()
	{
		driver.quit();
	}
}
