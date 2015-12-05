package com.task.macys;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import framework.testreport;

import framework.Commonmethods;
import framework.Sehelper;
public class Orderreviewpage extends Sehelper{
	public static Commonmethods common = new Commonmethods();
public static void validateshippingdetails(){
	 String fn=common.getdata("firstname");
	  String ln=common.getdata("lastname");
	  String add=common.getdata("address");
	  String cit=common.getdata("city");
	  String sta=common.getdata("state");
	  String zip=common.getdata("zipcode");
	  String ph=common.getdata("phonenum");
	 
		List<WebElement> shipadd = driver.findElements(By
				.xpath(".//*[@id='rc-at-shipping-address']"));
		for (int i = 0; i < shipadd.size(); i++) {
			String ship = shipadd.get(i).getText();
			if (ship.contains(fn)) {
				String test=fn;
				report.stringvalidation(test, fn, "firstname is validated");
				System.out.println("firstname is validated");
			}
			if (ship.contains(ln)) {
				String test=ln;
				report.stringvalidation(test, ln, "lastname is validated");
				System.out.println("last name is validated");
			}
			if (ship.contains(add)) {
				String test=add;
				report.stringvalidation(test, add, "address is validated");
				System.out.println("door number is validated");
			}
			if (ship.contains(cit)) {
				String test=cit;
				report.stringvalidation(test, cit, "city is validated");
				System.out.println("city is validated");
			}
			if (ship.contains(sta)) {
				String test=sta;
				report.stringvalidation(test, sta, "state is validated");
				System.out.println("state  is validated");
			}
			if (ship.contains(zip)) {
				String test=zip;
				report.stringvalidation(test, zip, "zipcode is validated");
				System.out.println("zipcode is validated");
			}
			if (ship.contains(ph)) {
				String test=ph;
				report.stringvalidation(test, ph, "phone is validated");
				System.out.println("phonenumber is validated");
			}

		}   
		
	}
public static void editbtn(){
WebElement edit = driver.findElement(By.cssSelector("#rc-shipping-edit"));
edit.click();
Commonmethods.waittime();
}
public static void validatebillingdetails(){
	 String fn=common.getdata("firstname");
	  String ln=common.getdata("lastname");
	  String add=common.getdata("address");
	  String cit=common.getdata("city");
	  String sta=common.getdata("state");
	  String zip=common.getdata("zipcode");
	  String ph=common.getdata("phonenum");
	 
		List<WebElement> shipadd = driver.findElements(By
				.xpath(".//*[@id='rc-at-shipping-address']"));
		for (int i = 0; i < shipadd.size(); i++) {
			String ship = shipadd.get(i).getText();
			if (ship.contains(fn)) {
				String test=fn;
				report.stringvalidation(test, fn, "firstname is validated");
				System.out.println("firstname is validated");
			}
			if (ship.contains(ln)) {
				String test=ln;
				report.stringvalidation(test, ln, "lastname is validated");
				System.out.println("last name is validated");
			}
			if (ship.contains(add)) {
				String test=add;
				report.stringvalidation(test, add, "address is validated");
				System.out.println("door number is validated");
			}
			if (ship.contains(cit)) {
				String test=cit;
				report.stringvalidation(test, cit, "city is validated");
				System.out.println("city is validated");
			}
			if (ship.contains(sta)) {
				String test=sta;
				report.stringvalidation(test, sta, "state is validated");
				System.out.println("state  is validated");
			}
			if (ship.contains(zip)) {
				String test=zip;
				report.stringvalidation(test, zip, "zipcode is validated");
				System.out.println("zipcode is validated");
			}
			if (ship.contains(ph)) {
				String test=ph;
				report.stringvalidation(test, ph, "phone is validated");
				System.out.println("phonenumber is validated");
			}

		}   
	
}
public static void validateitemdetails(){
	
}

}
