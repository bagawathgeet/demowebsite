package com.demowebsite.examples.inputforms;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class JQuerySelectDropdown {

}


driver.findElement(By.name("state")).click();
Select state=new Select(driver.findElement(By.name("state")));
state.selectByIndex(5);