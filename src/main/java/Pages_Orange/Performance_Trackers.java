package Pages_Orange;

import org.openqa.selenium.By;

import Base_Orange.Base_Page;

public class performanceTrackers extends basePage{
	
	
      public void performTrackersPage() {
    	  driver.findElement(By.xpath("")).click();
		 driver.findElement(By.xpath("")).click(); 
	    }
      
      public void performTracker() {
    	 
    	  driver.findElement(By.xpath("performTracker1")).sendKeys(prop.getProperty("Name"));
    	  
    	  driver.findElement(By.xpath("performTracker2")).click();
    	  driver.findElement(By.xpath("performTracker3")).click();
	
      }
      
      public void performAdd() {
	       driver.findElement(By.xpath("performAdd1")).click();
	       driver.findElement(By.xpath("performAdd2")).sendKeys(prop.getProperty("Tracker_name")) ;
	       driver.findElement(By.xpath("performAdd3")).sendKeys(prop.getProperty("Employee_name")) ;
	       driver.findElement(By.xpath("performAdd4")).sendKeys(prop.getProperty("Reviewers"));
	       driver.findElement(By.xpath("performAdd5")).click() ;
	       driver.findElement(By.xpath("performAdd")).click() ;
	}
}
