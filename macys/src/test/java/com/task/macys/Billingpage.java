package com.task.macys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import framework.testreport;

import framework.Commonmethods;
import framework.Sehelper;


public class Billingpage extends Sehelper{
public static void Enterbillingdetails(String cardtype, String cardnum, String expmnth, String expyr, String cvvno,String firstname, String lastname, String Address, String City,
		String State, String Zipcode,String phonenum,String emailid) {
	Commonmethods.waittime();
	WebElement card_type = driver.findElement(By.name("creditCard.cardType.code"));
	WebElement creditno = driver.findElement(By.name("creditCard.cardNumber"));
	WebElement expiremnth = driver.findElement(By.id("rc-payment-card-month"));
	WebElement expireyr = driver.findElement(By.id("rc-payment-card-year"));
	WebElement cvv = driver.findElement(By.name("creditCard.securityCode"));
	WebElement f_name = driver.findElement(By.name("billingContact.firstName"));
	WebElement l_name = driver.findElement(By.name("billingContact.lastName"));
	WebElement Add_home = driver.findElement(By.name("billingAddress.addressLine1"));
	WebElement city = driver.findElement(By.id("rc-payment-city"));
	WebElement state = driver.findElement(By.id("rc-payment-state"));
	WebElement zip_code = driver.findElement(By.name("billingAddress.zipCode"));
	WebElement phone = driver.findElement(By.id("rc-payment-phone"));
	WebElement email = driver.findElement(By.id("rc-payment-email"));
	WebElement billsubmit = driver.findElement(By.id("rc-payment-continue"));
	testreport.elementvalidation(card_type.isDisplayed(), "card type validation");
	card_type.sendKeys(cardtype);
	testreport.elementvalidation(creditno.isDisplayed(), "card num validation");
	creditno.sendKeys(cardnum);
	testreport.elementvalidation(expiremnth.isDisplayed(), "expire month validation");
	expiremnth.sendKeys(expmnth);
	testreport.elementvalidation(expireyr.isDisplayed(), "expire year validation");
	expireyr.sendKeys(expyr);
	testreport.elementvalidation(cvv.isDisplayed(), "cvv num validation");
	cvv.sendKeys(cvvno);
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
	testreport.elementvalidation(zip_code.isDisplayed(), "zipcode validation");
	zip_code.sendKeys(Zipcode);
	testreport.elementvalidation(phone.isDisplayed(), "phone num validation");
	phone.sendKeys(phonenum);
	testreport.elementvalidation(email.isDisplayed(), "email validation");
	email.sendKeys(emailid);
	testreport.elementvalidation(billsubmit.isDisplayed(), "bill submit button validation");
	billsubmit.click();
		
	}
public static void Updatebillingdetails(){
		
	}

}
