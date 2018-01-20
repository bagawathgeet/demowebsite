package com.demowebsite.examples.inputforms;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class InputFormSubmit {
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
				driver.findElement(By.xpath(".//*[@id='treemenu']/li/ul/li[1]/ul/li[5]/a")).click();//bootstrap alerts
				inputFormWithValidations();
			}
		@Test
		public void inputFormWithValidations() throws InterruptedException{
			
			driver.findElement(By.xpath(".//*[@id='contact_form']/fieldset/div[1]/div/div/input")).sendKeys("Geetha");
			driver.findElement(By.xpath(".//*[@id='contact_form']/fieldset/div[1]/div/div/input")).sendKeys("Geetha");
			driver.findElement(By.name("last_name")).sendKeys("Bagawath");
			driver.findElement(By.name("email")).sendKeys("bagawathgeet@gmail.com");
			driver.findElement(By.name("phone")).sendKeys("6235479899");
			driver.findElement(By.name("address")).sendKeys("23126 27th");
			driver.findElement(By.name("city")).sendKeys("Bothell");
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,500)", "");
			driver.findElement(By.name("state")).click();
			Select state=new Select(driver.findElement(By.name("state")));
			state.selectByIndex(5);
			driver.findElement(By.name("zip")).sendKeys("98021");
			driver.findElement(By.name("website")).sendKeys("www.udemy.com");
			driver.findElement(By.name("hosting")).click();
			driver.findElement(By.name("comment")).sendKeys("Project submission-good job");
			driver.findElement(By.xpath(".//*[@id='contact_form']/fieldset/div[13]/div/button")).click();
						
		}
	
		public static void main(String[] args) throws InterruptedException{
			InputFormSubmit d1 = new InputFormSubmit();
			d1.invokeBrowser();
		}
		
		
}