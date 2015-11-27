package com.nike.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.common.methods.Sehelper;
import com.common.methods.testreport;
import com.common.methods.Commonmethods;

public class Shipping extends Sehelper {
	
	public  static Commonmethods common = new Commonmethods();
	
	public static void shippingaddress(String firstname, String lastname, String Address, String City, String State,
			String Zipcode) {
		WebElement f_name = driver.findElement(By.name("fname"));
		WebElement l_name = driver.findElement(By.name("lname"));
		WebElement Add_home = driver.findElement(By.xpath(".//*[@id='address1Field']"));
		WebElement city = driver.findElement(By.cssSelector("#singleCity"));
		WebElement state = driver.findElement(By.id("singleState"));
		WebElement zip_code = driver.findElement(By.name("postalCodeField"));
		WebElement ship_form = driver
				.findElement(By.xpath(".//*[@id='ch4_checkoutShippingForm']/div[1]/div[6]/div[1]/div[3]/div[2]/label"));
		WebElement ship_submit = driver.findElement(By.xpath(".//*[@id='shippingSubmit']"));
		testreport.elementvalidation(f_name.isDisplayed(), "first name validation");
		f_name.sendKeys(firstname);
		testreport.elementvalidation(l_name.isDisplayed(), "last name  validation");
		l_name.sendKeys(lastname);
		testreport.elementvalidation(Add_home.isDisplayed(), "addhome validation");
		Add_home.sendKeys(Address);
		testreport.elementvalidation(city.isDisplayed(), "city validation");
		city.sendKeys(City);
		testreport.elementvalidation(state.isDisplayed(), "state validation");
		state.sendKeys(State);
		testreport.elementvalidation(zip_code.isDisplayed(), "state validation");
		zip_code.sendKeys(Zipcode);
		testreport.elementvalidation(ship_form.isDisplayed(), "ship form validation");
		ship_form.click();
		Commonmethods.waittime();
		testreport.elementvalidation(ship_submit.isDisplayed(), "ship submit validation");
		ship_submit.click();
		Commonmethods.waittime();
		/*
		 * entertext("name", "fname", firstname); entertext("name", "lname",
		 * lastname); entertext("xpath", ".//*[@id='address1Field']", Address);
		 * entertext("css", "#singleCity", City); entertext("id", "singleState",
		 * State); entertext("name", "postalCodeField", Zipcode); click("xpath",
		 * ".//*[@id='ch4_checkoutShippingForm']/div[1]/div[6]/div[1]/div[3]/div[2]/label"
		 * ); click("xpath", ".//*[@id='shippingSubmit']");
		 */
	}
}

	
/*	public static String amountvalidation() {
		  WebElement Totalamount =  driver.findElement(By.id("totalAmt")); 
		  String  amount=Totalamount.getText(); 
		  report.stringvalidation(amount.contains(), "ok"); 
		  return Totalamount; }
	}
	public static String subtotalvalidation() { 
		WebElement subTotalamt = driver.findElement(By.id("subTotalAmount")); 
		String subamount=subTotalamt.getText(); 
		return subTotalamt; }*/
	 
	

