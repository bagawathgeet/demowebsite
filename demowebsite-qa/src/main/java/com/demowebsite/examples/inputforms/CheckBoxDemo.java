package com.demowebsite.examples.inputforms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxDemo {
	
	WebDriver driver;
	@Test
	public void invokeBrowser() throws InterruptedException{
		
			System.setProperty("webdriver.chrome.driver", "C:/WD/chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(160, TimeUnit.SECONDS);
			driver.get("http://seleniumeasy.com");
			driver.findElement(By.xpath(".//*[@id='block-block-57']/div/div/a")).click();
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,500)", "");
			driver.findElement(By.xpath(".//*[@id='btn_basic_example']")).click();
			Thread.sleep(3000);			
			driver.findElement(By.xpath(".//*[@id='basic']/div/a[2]")).click();
		
	}
	@Test	
	public void singleCheckBoxDemo() {
			driver.findElement(By.xpath(".//*[@id='treemenu']/li/ul/li[1]/i")).click();
			driver.findElement(By.xpath(".//*[@id='treemenu']/li/ul/li[1]/ul/li[2]/a")).click();
			driver.findElement(By.id("isAgeSelected")).click();
			System.out.println(driver.findElement(By.id("txtAge")).getText());
			
		}
	@Test	
	public void multipleCheckBoxDemo() {
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,400)", "");
			driver.findElement(By.id("check1")).click();
			System.out.println(driver.findElement(By.xpath(".//*[@id='easycont']/div/div[2]/div[2]/div[2]/div[1]/label")).getText());		
			if(driver.findElement(By.xpath(".//*[@id='check1']")).getText()=="Uncheck All")
					System.out.println("Success: Uncheck All displayed");
					else
						System.out.println("Failed: Uncheck All not displayed");
					
			
		}
	public static void main(String[] args) throws InterruptedException{
		CheckBoxDemo d1 = new CheckBoxDemo();
		d1.invokeBrowser();
		d1.singleCheckBoxDemo();
		d1.multipleCheckBoxDemo();
		
	}
	
}
