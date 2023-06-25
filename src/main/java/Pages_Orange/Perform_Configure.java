package Pages_Orange;

import org.openqa.selenium.By;
import Base_Orange.Base_Page;

public class performConfigure extends basePage{

	public void configure() {
		driver.findElement(By.xpath("configure")).click();
	}
	
	public void KPIs(){
		
		driver.findElement(By.xpath("Kpis")).click();
	}
	
}


