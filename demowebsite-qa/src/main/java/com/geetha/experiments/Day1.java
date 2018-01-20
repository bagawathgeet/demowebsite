package com.geetha.experiments;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Day1 {
	WebDriver driver;
	JavascriptExecutor jse;

	public void invokeBrowser() {

		try {
			System.setProperty("webdriver.chrome.driver", "C:/WD/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			 //driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(160, TimeUnit.SECONDS);
			driver.get("http://www.seleniumeasy.com/test/basic-first-form-demo.html");
			} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*public void SingleInputField() {
		try {
			driver.findElement(By.xpath(".//input[@id='user-message']")).sendKeys("Geetha");
			driver.findElement(By.xpath(".//*[@id='get-input']/button")).click();
			Assert.assertTrue(driver.findElement(By.xpath(".//div[@id='user-message']")).getText().contains("Geetha"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void TwoInputField(){
				driver.findElement(By.id("sum1")).sendKeys("555");
				driver.findElement(By.id("sum2")).sendKeys("445");		
				driver.findElement(By.xpath(".//*[@id='gettotal']/button")).click();
				Assert.assertTrue(driver.findElement(By.id("displayvalue")).getText().contains(driver.findElement(By.id("displayvalue")).getText()));
				System.out.println("Value="+driver.findElement(By.id("displayvalue")).getText());
		}*/
	public void SingleCheckboxDemo() throws InterruptedException{
		

		
		driver.findElement(By.xpath(".//*[@id='treemenu']/li/ul/li[1]/i")).click();
		driver.findElement(By.xpath(".//*[@id='treemenu']/li/ul/li[1]/ul/li[2]/a")).click();

		driver.findElement(By.id("isAgeSelected")).click();
		System.out.println(driver.findElement(By.id("txtAge")).getText());
		}
	
	public void MultipleCheckboxDemo() throws InterruptedException{
		driver.findElement(By.xpath(".//*[@id='check1']")).click();
		Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='check1']")).getText()=="Uncheck All", "Failed: Uncheck All not displayed");
//		if(driver.findElement(By.xpath(".//*[@id='check1']")).getText()=="Uncheck All")
//			System.out.println("Success: Uncheck All displayed");
//		else
//			System.out.println("Failed: Uncheck All not displayed");
		driver.findElement(By.xpath(""));
		driver.findElement(By.xpath(""));
		}
	
	public void test () throws InterruptedException 
	 { 
	  //WebElement option = driver.findElement(By.xpath("//option[@id='country5']"));
	  //System.out.print(option.getAttribute("id")+" - "+option.getText());
	  List<WebElement> options = driver.findElements(By.xpath("//div[@class='checkbox']"));
	  System.out.println(options.size());
	  for(int i=0;i<=options.size();i++)
	  {
	   String str = options.get(i).getAttribute("id")+" - "+options.get(i).getText(); 
	   System.out.println(str);
	   
	  }
	  
	 }
	
	
	public static void main(String[] args) throws InterruptedException {
		Day1 runday1 = new Day1();
		runday1.invokeBrowser();
		//runday1.SingleInputField();
		//runday1.TwoInputField();
		runday1.SingleCheckboxDemo();
		runday1.MultipleCheckboxDemo();
		runday1.test();
	}

}
