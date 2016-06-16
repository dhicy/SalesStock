package WebTestSalesStock;

	import java.util.concurrent.TimeUnit;






import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Excel_Utils.ExcelUtils;
import Log.*;
import Support.Constant;
import Support.Link_Path;
import Support.Login_Activity;

	public class Main_WebSalesStockTesting {
		private WebDriver driver;
		String baseUrl;
		
		
		
		
		 @BeforeTest
		public void setUp() throws Exception {
		     driver = new FirefoxDriver();
		     driver.get(Link_Path.link_access); 
		     driver.manage().window().maximize();
		      driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		      ExcelUtils.setExcelFile(Constant.Path_TestData+Constant.File_Test_Sales_Stock);  
		      DOMConfigurator.configure("log4j.xml");
		   }   	
		 
		 @Test(priority=1)
			public void validLogin() throws Exception{
			Log.info("========================== Mulai Test =========================");
				Login_Activity.signIn(driver);
			}
			
			@Test(priority=2)
			public void _nama_class_1() throws Exception{
				
				Thread.sleep(2000);
		
			}
			
			@Test(priority=3)
			public void _nama_class_2 () throws Exception{
			
				Thread.sleep(2000);
		
			}
			
			
			
}
