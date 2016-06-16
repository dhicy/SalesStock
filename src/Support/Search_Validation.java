package Support;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import Log.Log;


public class Search_Validation {
	public void validation_search_without_notification(WebDriver driver) throws Exception 
    {
		if(driver.findElements(By.xpath(".//*[@id='gvAssetAttribute']")).size() != 0)
		{
			Log.info("Asset Attribute Code "+"........ masukan obeject yang akan dicheck ......."+" Ditemukan");
			
		} else

		{
				Log.info("Asset Attribute Code "+"........ masukan obeject yang akan dicheck ......."+" Tidak Ditemukan");
		}
    }
	
	
	public void validation_search_with_notification(WebDriver driver) throws Exception 
    {
		if(driver.findElements(By.xpath(".//*[@id='gvAssetAttribute']")).size() != 0)
		{
			JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("alert('hello world');");Thread.sleep(2000);
				
				Alert logAlert=driver.switchTo().alert();
				logAlert.accept();Thread.sleep(2000);
			
		} else

		{
				
    }
}
	
	
	
	
	
	
}
