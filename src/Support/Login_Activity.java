package Support;


import org.openqa.selenium.WebDriver;

import Excel_Utils.ExcelUtils;
import Log.Log;

public class Login_Activity {
	public static void signIn(WebDriver driver) throws Exception{
	    String user=ExcelUtils.getCellData("Login", "A", 4);
	    String pass=ExcelUtils.getCellData("Login", "B", 4);
    	   
 		      	try{
					/*
					class LoginPage aku pake buat simpan locator2 ID, kyk ID nya txtbox_username, password, sama button
					*/
				
					Page_Objects.txtbox_email(driver).clear();
					Page_Objects.txtbox_email(driver).sendKeys(user);
					
 		    	  
					Page_Objects.txtbox_Password(driver).clear();
					Page_Objects.txtbox_Password(driver).sendKeys(pass);
 				  
		 			Log.info("Email yang dimasukkan : "+user);
		 			Log.info("Password yang dimasukkan : "+pass);
					Page_Objects.btn_signIn(driver).click();
					
 		    	  
 		    	  	Log.info("Sukses Login");
 		      	}catch (Exception e){
 		      		Log.info("Gagal Login");
 		      		throw(e);
 		      	}      
	}
	
	
	public static void signOut(WebDriver driver) throws Exception{
	    
    	   
 		      	try{
					/*
					class LoginPage aku pake buat simpan locator2 ID, kyk ID nya txtbox_username, password, sama button
					*/
				
					
					Page_Objects.btn_signOut(driver).click();
					
 		    	  
 		    	  	Log.info("Sukses Logout");
 		      	}catch (Exception e){
 		      		Log.info("Gagal Logout");
 		      		throw(e);
 		      	}      
	}
	
	
}
