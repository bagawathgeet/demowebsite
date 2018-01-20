package com.demowebsite.examples.inputforms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import com.demowebsite.pages.*;

import com.geetha.experiments.Day1;

public class PracticeSimpleFormDemo {
	WebDriver driver; 
	//CheckBox checkBox = new CheckBox();

@Test
	public void invokeBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/WD/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://seleniumeasy.com");
		driver.findElement(By.xpath(".//*[@id='block-block-57']/div/div/a")).click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		driver.findElement(By.xpath(".//*[@id='treemenu']/li/ul/li[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='treemenu']/li/ul/li[1]/ul/li[1]/a")).click();
		
	}
	@AfterTest
	public void closeDriver(){
		driver.quit();
	}
	@Test
	public void singleInputField() throws InterruptedException {
		driver.findElement(By.className("form-control")).sendKeys("Geetha");;
		driver.findElement(By.xpath(".//*[@id='get-input']/button")).click();
		Assert.assertTrue(driver.findElement(By.xpath(".//div[@id='user-message']")).getText().contains("Geetha"));
	}
	@Test
	public void TwoInputField(){
		driver.findElement(By.id("sum1")).sendKeys("555");
		driver.findElement(By.id("sum2")).sendKeys("445");		
		driver.findElement(By.xpath(".//*[@id='gettotal']/button")).click();
		Assert.assertTrue(driver.findElement(By.id("displayvalue")).getText().contains(driver.findElement(By.id("displayvalue")).getText()));
		System.out.println("Value="+driver.findElement(By.id("displayvalue")).getText());
}
	
	public static void main(String[] args) throws InterruptedException {
		PracticeSimpleFormDemo runday1 = new PracticeSimpleFormDemo();
		runday1.invokeBrowser();
		runday1.singleInputField();
		runday1.TwoInputField();
		}
	
	
	
	
	

}
