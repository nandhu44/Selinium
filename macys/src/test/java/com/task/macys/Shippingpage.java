package com.task.macys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import framework.testreport;

import framework.Commonmethods;
import framework.Sehelper;

public class Shippingpage extends Sehelper {
	public static void Entershippingdetails(String firstname, String lastname, String Address, String City,
			String State, String Zipcode, String phonenum) {

		WebElement f_name = driver.findElement(By.name("contact.firstName"));
		WebElement l_name = driver.findElement(By.name("contact.lastName"));
		WebElement Add_home = driver.findElement(By.xpath(".//*[@id='rc-shipping-line1']"));
		WebElement city = driver.findElement(By.cssSelector("#rc-shipping-city"));
		WebElement state = driver.findElement(By.id("rc-shipping-state"));
		WebElement zip_code = driver.findElement(By.name("address.zipCode"));
		WebElement phone = driver.findElement(By.name("address.phone"));		
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
		testreport.elementvalidation(phone.isDisplayed(), "ship form validation");
		phone.sendKeys(phonenum);
		Commonmethods.waittime();	
		
	}
	public static void contbtn() {
		WebElement cont = driver.findElement(By.id("rc-shipping-continue"));
		testreport.elementvalidation(cont.isDisplayed(), "continue button validation");
		cont.click();
		Commonmethods.waittime();
	
	}

	public static void Updateshippingdetails() {
		String first=Commonmethods.getdata("ufirst");
		String last=Commonmethods.getdata("ulast");
		String add=Commonmethods.getdata("upadd");
		String cit=Commonmethods.getdata("upcity");
		String stat=Commonmethods.getdata("upstate");
		String zip=Commonmethods.getdata("upzip");
		String ph=Commonmethods.getdata("uphone");
		WebElement f_name = driver.findElement(By.name("contact.firstName"));
		WebElement l_name = driver.findElement(By.name("contact.lastName"));
		WebElement Add_home = driver.findElement(By.xpath(".//*[@id='rc-shipping-line1']"));
		WebElement city = driver.findElement(By.cssSelector("#rc-shipping-city"));
		WebElement state = driver.findElement(By.id("rc-shipping-state"));
		WebElement zip_code = driver.findElement(By.name("address.zipCode"));
		WebElement phone = driver.findElement(By.name("address.phone"));
	}

	public static void Giftmessage( String message1, String message2, String message3) {
		WebElement checkbox = driver.findElement(By.id("rc-giftoption-isgift"));
		WebElement gift = driver.findElement(By.cssSelector("#rc-giftoption-giftMsg"));
		WebElement msg1 = driver.findElement(By.cssSelector("#rc-gift-msg1"));
		WebElement msg2 = driver.findElement(By.cssSelector("#rc-gift-msg2"));
		WebElement msg3 = driver.findElement(By.cssSelector("#rc-gift-msg3"));	
		testreport.elementvalidation(checkbox.isDisplayed(), "checkbox validation");
		checkbox.click();
		Commonmethods.waittime();
		testreport.elementvalidation(gift.isDisplayed(), "giftbox validation");
		gift.click();
		Commonmethods.waittime();
		testreport.elementvalidation(msg1.isDisplayed(), "msg1 validation");
		msg1.sendKeys(message1);
		testreport.elementvalidation(msg2.isDisplayed(), "msg2  validation");
		msg2.sendKeys(message2);
		testreport.elementvalidation(msg3.isDisplayed(), "msg3 validation");
		msg3.sendKeys(message3);
	}

	public static void Itemvalidation() {
		

	}

}
