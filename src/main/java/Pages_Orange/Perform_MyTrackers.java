package Pages_Orange;

import org.openqa.selenium.By;

import Base_Orange.Base_Page;

public class performMyTrackers extends basePage {

	public void trackerView() {
		driver.findElement(By.xpath("trackerview")).click();
	}
	
	
	public void addLog() {
		driver.findElement(By.xpath("addLog1")).click();
		driver.findElement(By.xpath("addLog2")).click();
		driver.findElement(By.xpath("addLog3")).sendKeys(prop.getProperty("Log"));
		driver.findElement(By.xpath("addLog4")).click();
		driver.findElement(By.xpath("addLog5")).sendKeys(prop.getProperty("Comment"));
	    driver.findElement(By.xpath("addLog6")).click();
	
	}
}
