package WebTestSalesStock;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import Support.Login_Activity;
import Support.Page_Objects;
import Support.Parameter.ca;
import Support.Wait;

public class Activity {
	public static void create_account(WebDriver driver) throws Exception{
	   
 		      	try{
					
 		      	Page_Objects.btn_signIn_corner(driver).click();
 		      	Page_Objects.txt_email_create_account(driver).sendKeys(ca.email);
 		      	Page_Objects.btn_create_account(driver).click();Wait.Normal_Wait();
 		      	switch (ca.title) {
				case "Mr":
					Page_Objects.chk_mr(driver).click();
					break;

				case "Mrs":
					Page_Objects.chk_mrs(driver).click();
					break;
				}
 		      	
 		      	Page_Objects.txt_first_name(driver).sendKeys(ca.first_name);
 		      	Page_Objects.txt_last_name(driver).sendKeys(ca.last_name);
 		      	
 		      	Select d=new Select(Page_Objects.ddl_date(driver));
 		      	d.selectByVisibleText(ca.date);
 		      	Select m=new Select(Page_Objects.ddl_date(driver));
 		      	m.selectByVisibleText(ca.month);
 		      	Select y=new Select(Page_Objects.ddl_date(driver));
 		      	y.selectByVisibleText(ca.year);
 		      	
 		      	switch (ca.sign_up) {
				case "Yes":
					Page_Objects.chk_signup_letter(driver).click();
					break;

				case "No":
					break;
				}
 		      	
 		      	
 		      	switch (ca.receive_newsletter) {
				case "Yes":
					Page_Objects.chk_receive_special_offer(driver).click();
					break;

				case "No":
					break;
				}
 		      	
 		      	
 		      	Page_Objects.txt_first_name_address(driver).sendKeys(ca.first_name1);
 		      	Page_Objects.txt_last_name_address(driver).sendKeys(ca.last_name1);
 		      	Page_Objects.txt_address(driver).sendKeys(ca.address);
 		      	Page_Objects.txt_city(driver).sendKeys(ca.city);
 		      	
 		      	Select st=new Select(Page_Objects.ddl_state(driver));
 		      	st.selectByVisibleText(ca.state);
 		      	Page_Objects.txt_zipcode(driver).sendKeys(ca.zipcode);
 		      	Select country=new Select(Page_Objects.ddl_country(driver));
 		      	country.selectByVisibleText(ca.country);
 		      	
 		      	Page_Objects.txt_mobile_phone(driver).sendKeys(ca.phone);
 		      	Page_Objects.btn_register(driver).click();
 		      	
 		      	
 		      	
 		      		
 		      	}catch (Exception e){
 		      		
 		      		throw(e);
 		      	}      
	}
	
	
	public static void signIn(WebDriver driver) throws Exception{
		   
	      	try{
			
	      	Login_Activity.signIn(driver);
	      		
	      		
	      	}catch (Exception e){
	      		
	      		throw(e);
	      	}      
}
	
	public static void signOut(WebDriver driver) throws Exception{
		   
      	try{
		Login_Activity.signOut(driver);
      	}catch (Exception e){
      		
      		throw(e);
      	} 
      	
	}
	
      	
      	
      	public static void search_data(WebDriver driver) throws Exception{
 		   
          	try{
    		
          	}catch (Exception e){
          		
          		throw(e);
          	} 
      }
      	
      	public static void check_out(WebDriver driver) throws Exception{
  		   
          	try{
          		
          		Page_Objects.img_logo(driver).click();Wait.Normal_Wait();
          		Page_Objects.txt_search(driver).sendKeys(ca.barang);
          		Page_Objects.btn_search(driver).click();
          		Page_Objects.btn_add_to_chart_detail(driver).click();
          		Page_Objects.btn_proceed_to_check_out(driver).click();
          		Page_Objects.btn_proceed_to_check_out_address(driver);
          		Page_Objects.btn_proceed_to_check_out_shipping(driver).click();
          		Page_Objects.close_notify_term_and_condition(driver).click();
          		Page_Objects.chk_term_and_condition(driver).click();
          		Page_Objects.btn_proceed_to_check_out_shipping(driver).click();
          		
          		switch (ca.payment_method) {
				case "Pay By Bank Wire":
					Page_Objects.pay_by_bank_wire(driver).click();
					break;

				case "Pay By Credit":
					Page_Objects.pay_by_credit(driver).click();
					break;
				}
          		
          		Page_Objects.btn_confirm_order(driver).click();
          		
          		
          		
          	}catch (Exception e){
          		
          		throw(e);
          	} 
      }
      	
      	
      	public static void forgot_password(WebDriver driver) throws Exception{
   		   
          	try{
    		
          		Page_Objects.forgot_password(driver).click();
          		Page_Objects.txt_email_create_account(driver).sendKeys(ca.email);
          		Page_Objects.btn_retrieve_password(driver).click();
          		
          		
          	}catch (Exception e){
          		
          		throw(e);
          	} 
      }
      	
      	public static void check_order(WebDriver driver) throws Exception{
    		   
          	try{
    		Page_Objects.btn_detail_account_corner(driver).click();
    		Page_Objects.btn_detail_order(driver).click();
          
          		
          		
          	}catch (Exception e){
          		
          		throw(e);
          	} 
      }
      	
      	
      	
	
	
	
}
