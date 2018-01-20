package com.geetha.experiments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;

public class Test1 {
	
	private static WebDriver driver1;

	public static void Subtest(){
		
		System.out.println("own..test writing..");
		
		System.setProperty("webdriver.chrome.driver", "C:/WD/chromedriver.exe");
		
		 driver1 = new ChromeDriver();
		driver1.get("http://www.seleniumeasy.com");
		driver1.quit();
		
		/*System.setProperty("webdriver.gecko.driver", "C:/WD/geckodriver.exe");
		 driver2 = new FirefoxDriver();
		driver2.get("http://www.seleniumhq.org");*/
		
	}
	public static void main(String[] args){
		Subtest();
	}
}
 