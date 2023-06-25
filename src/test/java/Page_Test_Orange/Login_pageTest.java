package Page_Test_Orange;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base_Orange.Base_Page;
import Pages_Orange.Login_Orange;
import Pages_Orange.Perform_Configure;
import Pages_Orange.Perform_MyTrackers;
import Pages_Orange.Performance_KPIs;
import Pages_Orange.Performance_Orange;
import Pages_Orange.Performance_Trackers;

public class loginPageTest extends basePage{
	
	loginOrange Lp;
	performanceOrange Pp;
	performConfigure Pc;
	performanceKPIs Pk;
	performanceTrackers Pt;
	performMyTrackers Pm;
	
	@BeforeMethod
	public void browserConfig() {
		
		initialization();
		Lp=new loginOrange();
		Pp=new performanceOrange();
		Pc= new performConfigure();
		Pk=new performanceKPIs();
		Pt=new  performanceTrackers);
		Pm=new performMyTrackers();
		
	}
	
	@Test
	public void validateLogin() {
		Lp.orangeLogin();
		
	}
	
	@Test
	public void validateInvalidLogin() {
		Lp.invalidLogin();
	}
	
	@Test
	public void validatePerformanceOrange() {
		Lp.orangeLogin();
		Pp.performance();
	}
	
	@Test
	public void validatePerformConfigure() {
		
		validatePerformance();
		
	    Pc.configure();	
	    
	}
	@Test
	public void validatePerformanceKPIs() {
	   validatePerformConfigure();
		
		Pc.KPIs();
		Pk.KPIsSearch();
		Pk.addKeyPerformance();
		Pk.KPIsDeletion();
		Pk.KPIsSelection();
		Pk.orderKPIs();
		Pk.editKPIs();
	}
	
	@Test
	public void validatePerformanceTrackers() {
		validatePerformanceKPIs();
		Pt.performTrackersPage();
		Pt.performTracker();
	}
	
	@Test
	public void validatePerformMyTrackers() { 
		validatePerformanceTrackers();
		Pm.trackerVieww();
		Pm.addLog();
	}
	@AfterMethod
	public void validateBrowserClosing() {
		tearDown();
	}
}
