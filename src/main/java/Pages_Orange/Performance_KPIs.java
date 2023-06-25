package Pages_Orange;

import java.lang.StackWalker.Option;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Base_Orange.Base_Page;

public class performanceKPIs extends basePage{

	
	public void KPIsearch() {
		

		driver.findElement(By.xpath("KPIsearch1")).click();	

		
		List<WebElement> drop= driver.findElements(By.xpath("KPIsearch2"));
			Iterator<WebElement> iterator=drop.iterator();
			while (iterator.hasNext()) {
				WebElement webElement = (WebElement) iterator.next();
				System.out.println(webElement.getText());
				
				if (webElement.getText().equals(prop.getProperty("jobTitle"))) {
				webElement.click();	
				  }

		        }
			   driver.findElement(By.xpath("KPIsearch3")).click();
			   driver.findElement(By.xpath("KPIsearch4")).click();
		   }
		
		public void addKeyPerformance() {
			
			driver.findElement(By.xpath("addKeyPerformance1")).click();
			driver.findElement(By.xpath("addKeyPerformance2")).sendKeys(prop.getProperty("Key_Per.indicator"));
		
			driver.findElement(By.xpath("addKeyPerformance3")).click();
		
			List<WebElement> drop= driver.findElements(By.xpath("addKeyPerformance4"));
			Iterator<WebElement> iterator=drop.iterator();
			while (iterator.hasNext()) {
				WebElement webElement = (WebElement) iterator.next();
				System.out.println(webElement.getText());
				if (webElement.getText().equals(prop.getProperty("jobTitleAdd"))) {
				webElement.click();	
				}
			}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		
		driver.findElement(By.xpath("addKeyPerformance5")).click();
		driver.findElement(By.xpath("addKeyPerformance6")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		WebElement element=driver.findElement(By.xpath("addKeyPerformance7"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click;", element);
		
		WebElement elmt=driver .findElement(By.xpath("addKeyPerformance8"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click;", elmt);
		
		driver.findElement(By.xpath("addKeyPerformance9")).click();
		
		}
		
		public void KPIsSelection() {
			 WebElement cb=driver.findElement(By.xpath("KPIsSelection1"));
              cb.click();
			        
		}
		
		public void KPIsDeletion() {
			 WebElement cb4=driver.findElement(By.xpath("KPIsDeletion1"));
			 cb4.click();
		
			 driver.findElement(By.xpath("KPIsDeletion2")).click();
			 driver.findElement(By.xpath("KPIsDeletion3")).click();
			       
		}
		
		public void orderKPIs() {
			driver.findElement(By.xpath("orderKPIs1")).click();
			driver.findElement(By.xpath("orderKPIs2")).click();

		}
		
		
		public void editKPIs() {
			driver.findElement(By.xpath("editKPIs1")).click();
			driver.findElement(By.xpath("editKPIs2")).sendKeys(prop.getProperty("EditKPI"));
			driver.findElement(By.xpath("editKPIs3")).click();
			List<WebElement> dropKPI=driver.findElements(By.xpath("editKPIs4"));
			Iterator<WebElement> iterator=dropKPI.iterator();
			while (iterator.hasNext()) {
				WebElement webElement = (WebElement) iterator.next();
				System.out.println(webElement.getText());
				if (webElement.getText().equals(prop.getProperty("EditKPI"))) {
				webElement.click();	
				}
			}
			
			
		driver.findElement(By.xpath("editKPIs5"));
		driver.findElement(By.xpath("editKPIs6"));
		WebElement element= driver.findElement(By.xpath("editKPIs7"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click;", element);	
			}
		
		}	

