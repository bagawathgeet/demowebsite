package com.demowebsite.examples.inputforms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectDropdownList {
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
		jse.executeScript("window.scrollBy(0,300)", "");
		//driver.findElement(By.xpath(".//*[@id='treemenu']/li/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='treemenu']/li/ul/li[1]/a")).click();
		Thread.sleep(3000);			
		jse.executeScript("window.scrollBy(0,300)", "");
		driver.findElement(By.xpath(".//*[@id='treemenu']/li/ul/li[1]/ul/li[4]")).click();
	}
	@Test
	public void selectListDemo(){	
		driver.findElement(By.id("select-demo")).click();
		Select state=new Select(driver.findElement(By.id("select-demo")));
		state.selectByIndex(3);
		}
	@Test
	public void multiSelectListDemo(){
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300)","");
		driver.findElement(By.xpath(".//*[@id='multi-select']/option[2]")).click();
		driver.findElement(By.id("printMe")).click();
		System.out.println(driver.findElement(By.xpath(".//*[@id='easycont']/div/div[2]/div[2]/div[2]/p[2]")).getText());
		driver.findElement(By.id("printAll")).click();
		System.out.println(driver.findElement(By.xpath(".//*[@id='easycont']/div/div[2]/div[2]/div[2]/p[2]")).getText());
		
		
	}
	public static void main(String[] args) throws InterruptedException{
		SelectDropdownList d1 = new SelectDropdownList();
		d1.invokeBrowser();
		d1.selectListDemo();
		d1.multiSelectListDemo();
				
	}
		
}
