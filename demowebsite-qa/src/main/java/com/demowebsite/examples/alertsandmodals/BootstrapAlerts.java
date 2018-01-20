package com.demowebsite.examples.alertsandmodals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BootstrapAlerts {
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
				driver.findElement(By.xpath(".//*[@id='treemenu']/li/ul/li[5]/a")).click();
				Thread.sleep(3000);			//alerts & Modals
				driver.findElement(By.xpath(".//*[@id='treemenu']/li/ul/li[5]/ul/li[1]/a")).click();//bootstrap alerts
				//bootstrapAlertMessages();
				bootstrapAlert();
			}
		@Test
		public void bootstrapAlertMessages() throws InterruptedException{
			driver.findElement(By.xpath(".//*[@id='autoclosable-btn-success']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[@id='normal-btn-success']")).click();
			Thread.sleep(3000);
				
	}
		@Test
		public void bootstrapAlert() throws InterruptedException{
			//single modalexample
			driver.findElement(By.xpath(".//*[@id='treemenu']/li/ul/li[5]/a")).click();//alerts & Modals
			driver.findElement(By.xpath(".//*[@id='treemenu']/li/ul/li[5]/ul/li[2]/a")).click();//bootstrap modals
			driver.findElement(By.xpath("html/body/div[2]/div/div[2]/div[1]/div/div/div[2]/a")).click();//launch
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[@id='myModal0']/div/div/div[4]/a[1]")).click();//close
			Thread.sleep(3000);
			//multiple modalexample
			driver.findElement(By.xpath("html/body/div[2]/div/div[2]/div[2]/div/div/div[2]/a")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[@id='myModal']/div/div/div[3]/a")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[@id='myModal2']/div/div/div[6]/a[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[@id='myModal']/div/div/div[4]/a[1]")).click();
	}
	
		public static void main(String[] args) throws InterruptedException{
			BootstrapAlerts d1 = new BootstrapAlerts();
			d1.invokeBrowser();
		}
		
		
}
