package com.nike.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.common.methods.Commonmethods;
import com.common.methods.Sehelper;
import com.common.methods.testreport;

public class Billing extends Sehelper {
	
	public  static Commonmethods common = new Commonmethods();
	
	public static void billing(String cardtype, String cardnum, String expmnth, String expyr, String cvvno,
			String phone,String emailid) {
		common.waittime();
		driver.switchTo().frame("billingFormFrame");
		WebElement card_type = driver.findElement(By.name("cardTypeSelect"));
		WebElement creditno = driver.findElement(By.name("creditCardNumber"));
		WebElement expiremnth = driver.findElement(By.id("expirationMonth"));
		WebElement expireyr = driver.findElement(By.id("expirationYear"));
		WebElement cvv = driver.findElement(By.name("cvNumber"));
		WebElement phnnum = driver.findElement(By.id("phoneNumber"));
		WebElement email = driver.findElement(By.id("email"));
		WebElement billsubmit = driver.findElement(By.id("billingSubmit"));
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
		testreport.elementvalidation(phnnum.isDisplayed(), "phone num validation");
		phnnum.sendKeys(phone);
		testreport.elementvalidation(email.isDisplayed(), "email validation");
		email.sendKeys(emailid);
		testreport.elementvalidation(billsubmit.isDisplayed(), "bill submit button validation");
		billsubmit.click();
		driver.switchTo().defaultContent();
	}
}

