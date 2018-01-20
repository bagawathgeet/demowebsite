package com.demowebsite.examples.inputforms;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AjaxFormSubmit {
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
				driver.findElement(By.xpath(".//*[@id='treemenu']/li/ul/li[1]/a")).click();
				Thread.sleep(3000);			//input forms
				driver.findElement(By.xpath(".//*[@id='treemenu']/li/ul/li[1]/ul/li[6]/a")).click();//bootstrap alerts
				ajaxFormSubmit();
			}
		@Test
		public void ajaxFormSubmit() throws InterruptedException{
			driver.findElement(By.id("title")).sendKeys("Geetha Test");
			driver.findElement(By.id("description")).sendKeys("Is it working good---Selenium");
			Thread.sleep(3000);
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,300)", "");
			driver.findElement(By.xpath(".//*[@id='btn-submit']")).click();
			
		}
	
		public static void main(String[] args) throws InterruptedException{
			AjaxFormSubmit d1 = new AjaxFormSubmit();
			d1.invokeBrowser();
		}
		
		
}
