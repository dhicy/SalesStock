package Support;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;
 





public class Wait {
	  static WebDriver driver;
	  WebElement button;
	public static void Fluent_Wait() {
	   /* new FluentWait<WebElement>(button).withTimeout(3, TimeUnit.SECONDS)
	        .pollingEvery(100, TimeUnit.MILLISECONDS)
	        .until(new Function<WebElement, Boolean>() {
	          public Boolean apply(WebElement w) {
	            return w.isDisplayed();
	          }
	        });
	    button.click();*/
		
		
	/*	 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(30, TimeUnit.SECONDS)
			       .pollingEvery(5, TimeUnit.SECONDS)
			       .ignoring(NoSuchElementException.class);

			   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			       return driver.findElement(By.id("foo"));
			     }
			   });
			   */
			   
		
		 try {
			    new FluentWait<WebDriver>(driver).withTimeout(3, TimeUnit.SECONDS)
			        .pollingEvery(100, TimeUnit.MILLISECONDS)
			        .ignoring(NoSuchElementException.class)
			        .until(new Function<WebDriver, Boolean>() {
			          public Boolean apply(WebDriver d) {
			            WebElement link = d.findElement(By.xpath(""));
			            return link.isDisplayed();
			          }
			        });
			    } catch(TimeoutException te) {
			     
			    }
			   
	    
	  }
	
	
	public static void Normal_Wait() throws InterruptedException
	{
		
		Thread.sleep(3000);
	}
	
	
	public static void Wait_To_Load(WebDriver driver){
	    try {
	      if(driver.findElement(By.id("ucLoadingPanel_loadingPanel")).isDisplayed()){
		Thread.sleep(3000);
	        System.out.println("Loading . . . wait for 5 sec"); 
	        while(driver.findElement(By.id("ucLoadingPanel_loadingPanel")).isDisplayed()) 
	          Thread.sleep(5000); 
	        }
	      } catch (Exception e) {
	        
	    }
	  }

		

}
