package Pages_Orange;

import org.openqa.selenium.By;

import Base_Orange.Base_Page;

public class loginOrange extends basePage {
	
	public void orangeLogin() {
	
		driver.findElement(By.name("username")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("submit")).click();
		
	}
	public void invalidLogin() {
		driver.findElement(By.name("username")).sendKeys(prop.getProperty("Invalid_username"));
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("invalidsubmit")).click();
	    
	}
	
	

}
