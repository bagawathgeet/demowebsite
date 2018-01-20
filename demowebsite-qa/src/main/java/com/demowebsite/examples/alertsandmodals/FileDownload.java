package com.demowebsite.examples.alertsandmodals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileDownload {
	WebDriver driver;
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	@Test
	public void invokeBrowser() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:/WD/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(160, TimeUnit.SECONDS);
		driver.get("http://seleniumeasy.com");
		driver.findElement(By.xpath(".//*[@id='block-block-57']/div/div/a")).click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,600)", "");
		driver.findElement(By.xpath(".//*[@id='treemenu']/li/ul/li[5]/a")).click();
		Thread.sleep(3000);			//alerts & Modals
		driver.findElement(By.xpath(".//*[@id='treemenu']/li/ul/li[5]/ul/li[6]/a")).click();//Filedownload
		fileDownloadDemo();
	}
	@Test
	public void fileDownloadDemo() throws InterruptedException{
		driver.findElement(By.xpath(".//*[@id='textbox']")).sendKeys("Hello-happy to see you selenium");
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,400)", "");
		driver.findElement(By.xpath(".//*[@id='create']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='link-to-download']")).click();
		//learn to handle the popup window
		
	
}

public static void main(String[] args) throws InterruptedException{
	FileDownload d1 = new FileDownload();
	d1.invokeBrowser();
}


}
	
		
	


