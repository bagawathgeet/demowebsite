package com.demowebsite.examples.inputforms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButtonsDemo {
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
		driver.findElement(By.xpath(".//*[@id='basic']/div/a[3]")).click();
	}
	@Test
	public void radioButtonDemo(){
		driver.findElement(By.xpath(".//*[@id='easycont']/div/div[2]/div[1]/div[2]/label[1]/input")).click();		
		driver.findElement(By.id("buttoncheck")).click();
		System.out.println(driver.findElement(By.xpath(".//*[@id='easycont']/div/div[2]/div[1]/div[2]/p[3]")).getText());
		driver.findElement(By.xpath(".//*[@id='easycont']/div/div[2]/div[1]/div[2]/label[2]/input")).click();
		driver.findElement(By.id("buttoncheck")).click();
		System.out.println(driver.findElement(By.xpath(".//*[@id='easycont']/div/div[2]/div[1]/div[2]/p[3]")).getText());
		
	}
	@Test
	public void groupRadioButtonsDemo(){
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		driver.findElement(By.xpath(".//*[@id='easycont']/div/div[2]/div[2]/div[2]/div[1]/label[1]/input")).click();
		driver.findElement(By.xpath(".//*[@id='easycont']/div/div[2]/div[2]/div[2]/div[2]/label[1]/input")).click();    
		driver.findElement(By.xpath(".//*[@id='easycont']/div/div[2]/div[2]/div[2]/button")).click(); //get values button
		System.out.println(driver.findElement(By.xpath(".//*[@id='easycont']/div/div[2]/div[2]/div[2]/p[2]")).getText());
		driver.findElement(By.xpath(".//*[@id='easycont']/div/div[2]/div[2]/div[2]/div[2]/label[2]/input")).click(); 
		driver.findElement(By.xpath(".//*[@id='easycont']/div/div[2]/div[2]/div[2]/button")).click();
		System.out.println(driver.findElement(By.xpath(".//*[@id='easycont']/div/div[2]/div[2]/div[2]/p[2]")).getText());
		driver.findElement(By.xpath(".//*[@id='easycont']/div/div[2]/div[2]/div[2]/div[2]/label[3]/input")).click(); 
		driver.findElement(By.xpath(".//*[@id='easycont']/div/div[2]/div[2]/div[2]/button")).click();
		System.out.println(driver.findElement(By.xpath(".//*[@id='easycont']/div/div[2]/div[2]/div[2]/p[2]")).getText());
		
		driver.findElement(By.xpath(".//*[@id='easycont']/div/div[2]/div[2]/div[2]/div[1]/label[2]/input")).click();
		driver.findElement(By.xpath(".//*[@id='easycont']/div/div[2]/div[2]/div[2]/div[2]/label[1]/input")).click();    
		driver.findElement(By.xpath(".//*[@id='easycont']/div/div[2]/div[2]/div[2]/button")).click(); //get values button
		System.out.println(driver.findElement(By.xpath(".//*[@id='easycont']/div/div[2]/div[2]/div[2]/p[2]")).getText());
		driver.findElement(By.xpath(".//*[@id='easycont']/div/div[2]/div[2]/div[2]/div[2]/label[2]/input")).click(); 
		driver.findElement(By.xpath(".//*[@id='easycont']/div/div[2]/div[2]/div[2]/button")).click();
		System.out.println(driver.findElement(By.xpath(".//*[@id='easycont']/div/div[2]/div[2]/div[2]/p[2]")).getText());
		driver.findElement(By.xpath(".//*[@id='easycont']/div/div[2]/div[2]/div[2]/div[2]/label[3]/input")).click(); 
		driver.findElement(By.xpath(".//*[@id='easycont']/div/div[2]/div[2]/div[2]/button")).click();
		System.out.println(driver.findElement(By.xpath(".//*[@id='easycont']/div/div[2]/div[2]/div[2]/p[2]")).getText());
		
				
	}
	public static void main(String[] args) throws InterruptedException{
		RadioButtonsDemo d1 = new RadioButtonsDemo();
		d1.invokeBrowser();
		d1.radioButtonDemo();
		d1.groupRadioButtonsDemo();
		
	}
}
