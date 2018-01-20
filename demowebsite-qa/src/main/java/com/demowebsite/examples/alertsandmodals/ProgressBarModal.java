package com.demowebsite.examples.alertsandmodals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ProgressBarModal {
	
	public void modalDialogWithProgressBar(){
		
	}
	
	
}


driver.findElement(By.name("state")).click();
Select state=new Select(driver.findElement(By.name("state")));
state.selectByIndex(5);