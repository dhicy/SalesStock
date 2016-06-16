package Support;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page_Objects {
	 private static WebElement element = null;
	    
	 public static WebElement txtbox_email(WebDriver driver) throws Exception{
     	try{
	            element = driver.findElement(By.id("email"));
	            
	            System.out.println("found: textbox email");
     	}catch (Exception e){
     			System.out.println("not found: textbox email");
        		throw(e);
        		}
        	return element;
         }
     
     public static WebElement txtbox_Password(WebDriver driver) throws Exception{
     	try{
	        	element = driver.findElement(By.id("passwd"));
	        	System.out.println("found: textbox password");
     	}catch (Exception e){
     			System.out.println("not found: textbox password");
        		throw(e);
        		}
        	return element;
     }
     
     public static WebElement btn_signIn(WebDriver driver) throws Exception{
     	try{
	        	element = driver.findElement(By.id("SubmitLogin"));
	        	System.out.println("found: button signIn");
     	}catch (Exception e){
     			System.out.println("not found: button signIn");
        		throw(e);
        		}
        	return element;
     }
     
     public static WebElement btn_signOut(WebDriver driver) throws Exception{
      	try{
 	        	element = driver.findElement(By.className("logout"));
 	        	System.out.println("found: button signOut");
      	}catch (Exception e){
      			System.out.println("not found: button signOut");
         		throw(e);
         		}
         	return element;
      }
     
     public static WebElement btn_create_account(WebDriver driver) throws Exception{
       	try{
  	        	element = driver.findElement(By.id("SubmitCreate"));
  	        	
       	}catch (Exception e){
       			
          		throw(e);
          		}
          	return element;
       }
     
     public static WebElement txt_email_create_account(WebDriver driver) throws Exception{
        	try{
   	        	element = driver.findElement(By.id("email_create"));
   	        	
        	}catch (Exception e){
        			
           		throw(e);
           		}
           	return element;
        }
     
     public static WebElement forgot_password(WebDriver driver) throws Exception{
     	try{
	        	element = driver.findElement(By.xpath(".//*[@id='login_form']/div/p[1]/a"));
	        	
     	}catch (Exception e){
     			
        		throw(e);
        		}
        	return element;
     }
     
     public static WebElement btn_retrieve_password(WebDriver driver) throws Exception{
      	try{
 	        	element = driver.findElement(By.xpath(".//*[@id='form_forgotpassword']/fieldset/p/button"));
 	        	
      	}catch (Exception e){
      			
         		throw(e);
         		}
         	return element;
      }
     
     
     
     
     
     
     public static WebElement chk_mr(WebDriver driver) throws Exception{
     	try{
	        	element = driver.findElement(By.id("id_gender1"));
	        	
     	}catch (Exception e){
     			
        		throw(e);
        		}
        	return element;
     }
     
     
     public static WebElement chk_mrs(WebDriver driver) throws Exception{
     	try{
	        	element = driver.findElement(By.id("id_gender2"));
	        	
     	}catch (Exception e){
     			
        		throw(e);
        		}
        	return element;
     }
     
     public static WebElement txt_first_name(WebDriver driver) throws Exception{
     	try{
	        	element = driver.findElement(By.id("customer_firstname"));
	        	
     	}catch (Exception e){
     			
        		throw(e);
        		}
        	return element;
     }
     
     public static WebElement txt_email(WebDriver driver) throws Exception{
      	try{
 	        	element = driver.findElement(By.id("email"));
 	        	
      	}catch (Exception e){
      			
         		throw(e);
         		}
         	return element;
      }
     
     
     public static WebElement txt_last_name(WebDriver driver) throws Exception{
     	try{
	        	element = driver.findElement(By.id("customer_lastname"));
	        	
     	}catch (Exception e){
     			
        		throw(e);
        		}
        	return element;
     }
     
     public static WebElement txt_zipcode(WebDriver driver) throws Exception{
      	try{
 	        	element = driver.findElement(By.id("postcode"));
 	        	
      	}catch (Exception e){
      			
         		throw(e);
         		}
         	return element;
      }
     
     
     
     public static WebElement txt_password(WebDriver driver) throws Exception{
     	try{
	        	element = driver.findElement(By.id("passwd"));
	        	
     	}catch (Exception e){
     			
        		throw(e);
        		}
        	return element;
     }
     
     public static WebElement ddl_date(WebDriver driver) throws Exception{
     	try{
	        	element = driver.findElement(By.id("dates"));
	        	
     	}catch (Exception e){
     			
        		throw(e);
        		}
        	return element;
     }
     
     public static WebElement ddl_month(WebDriver driver) throws Exception{
     	try{
	        	element = driver.findElement(By.id("months"));
	        	
     	}catch (Exception e){
     			
        		throw(e);
        		}
        	return element;
     }
     public static WebElement ddl_year(WebDriver driver) throws Exception{
     	try{
	        	element = driver.findElement(By.id("years"));
	        	
     	}catch (Exception e){
     			
        		throw(e);
        		}
        	return element;
     }
     
     
     public static WebElement chk_signup_letter(WebDriver driver) throws Exception{
     	try{
	        	element = driver.findElement(By.id("newsletter"));
	        	
     	}catch (Exception e){
     			
        		throw(e);
        		}
        	return element;
     }
     
     
     public static WebElement chk_receive_special_offer(WebDriver driver) throws Exception{
     	try{
	        	element = driver.findElement(By.id("optin"));
	        	
     	}catch (Exception e){
     			
        		throw(e);
        		}
        	return element;
     }
     
     public static WebElement txt_first_name_address(WebDriver driver) throws Exception{
     	try{
	        	element = driver.findElement(By.id("firstname"));
	        	
     	}catch (Exception e){
     			
        		throw(e);
        		}
        	return element;
     }
     
     
     public static WebElement txt_last_name_address(WebDriver driver) throws Exception{
     	try{
	        	element = driver.findElement(By.id("lastname"));
	        	
     	}catch (Exception e){
     			
        		throw(e);
        		}
        	return element;
     }
     
     public static WebElement txt_company_address(WebDriver driver) throws Exception{
     	try{
	        	element = driver.findElement(By.id("company"));
	        	
     	}catch (Exception e){
     			
        		throw(e);
        		}
        	return element;
     }
     
     
     public static WebElement txt_address(WebDriver driver) throws Exception{
     	try{
	        	element = driver.findElement(By.id("address1"));
	        	
     	}catch (Exception e){
     			
        		throw(e);
        		}
        	return element;
     }
     
     public static WebElement txt_city(WebDriver driver) throws Exception{
     	try{
	        	element = driver.findElement(By.id("city"));
	        	
     	}catch (Exception e){
     			
        		throw(e);
        		}
        	return element;
     }
     
     
     public static WebElement ddl_state(WebDriver driver) throws Exception{
     	try{
	        	element = driver.findElement(By.id("id_state"));
	        	
     	}catch (Exception e){
     			
        		throw(e);
        		}
        	return element;
     }
     
     public static WebElement ddl_country(WebDriver driver) throws Exception{
     	try{
	        	element = driver.findElement(By.id("id_country"));
	        	
     	}catch (Exception e){
     			
        		throw(e);
        		}
        	return element;
     }
     
     
     public static WebElement txt_mobile_phone(WebDriver driver) throws Exception{
     	try{
	        	element = driver.findElement(By.id("phone_mobile"));
	        	
     	}catch (Exception e){
     			
        		throw(e);
        		}
        	return element;
     }
     
     public static WebElement btn_register(WebDriver driver) throws Exception{
     	try{
	        	element = driver.findElement(By.id("submitAccount"));
	        	
     	}catch (Exception e){
     			
        		throw(e);
        		}
        	return element;
     }
     
    
     
     
     
     
     public static WebElement btn_signIn_corner(WebDriver driver) throws Exception{
      	try{
 	        	element = driver.findElement(By.linkText("Sign In"));
 	        	
      	}catch (Exception e){
      			
         		throw(e);
         		}
         	return element;
      }
     public static WebElement btn_detail_account_corner(WebDriver driver) throws Exception{
       	try{
  	        	element = driver.findElement(By.linkText(".//*[@id='header']/div[2]/div/div/nav/div[1]/a/span"));
  	        	
       	}catch (Exception e){
       			
          		throw(e);
          		}
          	return element;
       }
     
     public static WebElement btn_wishlist(WebDriver driver) throws Exception{
        	try{
   	        	element = driver.findElement(By.xpath(".//*[@id='center_column']/div/div[2]/ul/li/a/span"));
   	        	
        	}catch (Exception e){
        			
           		throw(e);
           		}
           	return element;
        }
     
     
     
     
     public static WebElement close_notif_wishlist(WebDriver driver) throws Exception{
     	try{
	        	element = driver.findElement(By.xpath(".//*[@id='product']/div[2]/div/div/a"));
	        	
     	}catch (Exception e){
     			
        		throw(e);
        		}
        	return element;
     }
     
     
     public static WebElement btn_add_to_wishlist(WebDriver driver) throws Exception{
      	try{
 	        	element = driver.findElement(By.id("wishlist_button"));
 	        	
      	}catch (Exception e){
      			
         		throw(e);
         		}
         	return element;
      }
     
     
     public static WebElement btn_add_to_chart_detail(WebDriver driver) throws Exception{
       	try{
  	        	element = driver.findElement(By.id("add_to_cart"));
  	        	
       	}catch (Exception e){
       			
          		throw(e);
          		}
          	return element;
       }
     
     public static WebElement btn_detail_order(WebDriver driver) throws Exception{
        	try{
   	        	element = driver.findElement(By.xpath(".//*[@id='center_column']/div/div[1]/ul/li[1]/a/span"));
   	        	
        	}catch (Exception e){
        			
           		throw(e);
           		}
           	return element;
        }
     
     

     public static WebElement txt_search(WebDriver driver) throws Exception{
       	try{
  	        	element = driver.findElement(By.id("search_query_top"));
  	        	
       	}catch (Exception e){
       			
          		throw(e);
          		}
          	return element;
       }
     
     

     public static WebElement btn_search(WebDriver driver) throws Exception{
       	try{
  	        	element = driver.findElement(By.id("searchbox"));
  	        	
       	}catch (Exception e){
       			
          		throw(e);
          		}
          	return element;
       }
       
       
     public static WebElement btn_add_to_chart(WebDriver driver) throws Exception{
        	try{
   	        	element = driver.findElement(By.xpath(".//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span"));
   	        	
        	}catch (Exception e){
        			
           		throw(e);
           		}
           	return element;
        }
     
     public static WebElement img_logo(WebDriver driver) throws Exception{
     	try{
	        	element = driver.findElement(By.id("header_logo"));
	        	
     	}catch (Exception e){
     			
        		throw(e);
        		}
        	return element;
     }
     public static WebElement btn_chart(WebDriver driver) throws Exception{
      	try{
 	        	element = driver.findElement(By.xpath(".//*[@id='header']/div[3]/div/div/div[3]/div/a"));
 	        	
      	}catch (Exception e){
      			
         		throw(e);
         		}
         	return element;
      }
     
     
     
     public static WebElement btn_proceed_to_check_out(WebDriver driver) throws Exception{
       	try{
  	        	element = driver.findElement(By.xpath(".//*[@id='center_column']/p[2]/a[1]/span"));
  	        	
       	}catch (Exception e){
       			
          		throw(e);
          		}
          	return element;
       }
     
     
     public static WebElement btn_continue_shopping(WebDriver driver) throws Exception{
        	try{
   	        	element = driver.findElement(By.xpath(".//*[@id='center_column']/form/p/a"));
   	        	
        	}catch (Exception e){
        			
           		throw(e);
           		}
           	return element;
        }
     
     public static WebElement btn_proceed_to_check_out_address(WebDriver driver) throws Exception{
        	try{
   	        	element = driver.findElement(By.xpath(".//*[@id='center_column']/form/p/button"));
   	        	
        	}catch (Exception e){
        			
           		throw(e);
           		}
           	return element;
        }
     
     
     
     public static WebElement btn_proceed_to_check_out_shipping(WebDriver driver) throws Exception{
        	try{
   	        	element = driver.findElement(By.xpath(".//*[@id='form']/p/button"));
   	        	
        	}catch (Exception e){
        			
           		throw(e);
           		}
           	return element;
        }
     

     public static WebElement chk_term_and_condition(WebDriver driver) throws Exception{
        	try{
   	        	element = driver.findElement(By.xpath(".//*[@id='cgv']"));
   	        	
        	}catch (Exception e){
        			
           		throw(e);
           		}
           	return element;
        }
     
     public static WebElement close_notify_term_and_condition(WebDriver driver) throws Exception{
     	try{
	        	element = driver.findElement(By.xpath(".//*[@id='order']/div[2]/div/div/a"));
	        	
     	}catch (Exception e){
     			
        		throw(e);
        		}
        	return element;
     }
     
     public static WebElement pay_by_bank_wire(WebDriver driver) throws Exception{
      	try{
 	        	element = driver.findElement(By.xpath(".//*[@id='HOOK_PAYMENT']/div[1]/div/p/a"));
 	        	
      	}catch (Exception e){
      			
         		throw(e);
         		}
         	return element;
      }
     
     
     public static WebElement pay_by_credit(WebDriver driver) throws Exception{
      	try{
 	        	element = driver.findElement(By.xpath(".//*[@id='HOOK_PAYMENT']/div[2]/div/p/a"));
 	        	
      	}catch (Exception e){
      			
         		throw(e);
         		}
         	return element;
      }
     
     public static WebElement btn_confirm_order(WebDriver driver) throws Exception{
       	try{
  	        	element = driver.findElement(By.xpath(".//*[@id='cart_navigation']/button"));
  	        	
       	}catch (Exception e){
       			
          		throw(e);
          		}
          	return element;
       }
     
     
     
     
}
