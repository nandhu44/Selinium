package com.nike.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.common.methods.Sehelper;
import com.common.methods.testreport;
import com.common.methods.Commonmethods;
import com.common.methods.Commonmethods;

public class Validate extends Commonmethods {

	// public static Commonmethods common = new Commonmethods();

	public static void validation() {
		String address = getvalue("css", ".ch4_reviewDetailsFull>p");
		click("name", "ch4_editShipping");
		String fname = getatt("name", "fname", "value");
		String lname = getatt("name", "lname", "value");
		if (address.contains(fname)) {
			System.out.println("firstname is validated");
		} else {
			System.out.println("first name is not present in the order review page");
		}
		if (address.contains(lname)) {
			System.out.println("lastname is validated");
		} else {
			System.out.println("last name is not present in the order review page");
		}
	}

	public static void namevalidate() {
		String firstname = getatt("name", "fname", "data-error-required");
		String lasname = getatt("name", "lname", "data-error-required");
		if (firstname.contains("Please enter your first name.")) {
			System.out.println("test case passed");
		} else {
			System.out.println("test case failed");
		}
		if (lasname.contains("Please enter your last name.")) {
			System.out.println("test case passed");
		} else {
			System.out.println("testcase failed.");
		}
	}
}
