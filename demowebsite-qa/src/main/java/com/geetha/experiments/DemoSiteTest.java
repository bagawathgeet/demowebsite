package com.geetha.experiments;

import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoSiteTest {
	
	

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Execution started....");
		
		System.setProperty("webdriver.chrome.driver", "C:/WD/chromedriver.exe");
		WebDriver driver = new ChromeDriver();  //WebDriver is the Selenium webdriver
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.seleniumeasy.com");//opening url
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("#btn_basic_example")).click();
		//driver.findElement(By.cssSelector(".first.leaf>a")).click();
		
		
		driver.quit();
		
		
		
	}

}
