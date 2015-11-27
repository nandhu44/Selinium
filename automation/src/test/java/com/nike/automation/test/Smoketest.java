package com.nike.automation.test;

import org.testng.annotations.*;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import com.common.methods.*;
import com.common.methods.Sehelper;
import com.common.methods.testreport;
import com.common.methods.Commonmethods;
import com.nike.automation.Addtocart;
import com.nike.automation.cartcheckout;
import com.nike.automation.guestcheckout;
import com.nike.automation.Shipping;
import com.nike.automation.Billing;
import com.nike.automation.Validate;

@SuppressWarnings({ "static-access", "unused" })
public class Smoketest {
	public static Sehelper chrom = new Sehelper();
	public static Addtocart access = new Addtocart();
	public static cartcheckout cart = new cartcheckout();
	public static guestcheckout guest = new guestcheckout();
	public static Shipping ship = new Shipping();
	public static Billing bill = new Billing();
	public static Validate val = new Validate();
	public static Commonmethods methods = new Commonmethods();
	public static testreport report;

	@BeforeMethod
	public void BeforeMethod() {
		chrom.chrome();
	}

	@Test
	public void test01() {
		access.cart();
		cart.checkcart();
		guest.checkout();
	}
@Test
	public void test02() {
		access.cart();
		cart.checkcart();
		guest.checkout();
		ship.shippingaddress("sjgvhjb", "khcvlloblik", "sjxfcgkvh", "dublin", "Ohio", "43215");
		bill.billing("Visa", "4111111111111111", "5", "2018", "111", "3048046484", "manik.malhotra@gmail.com");
	}
	// val.namevalidate();
	// val.validation();

	/*
	 * ship.shippingaddress("manik", "malhotra", "425 metro north", "dublin",
	 * "Ohio", "43215"); String subTotalamt = ship.subtotalvalidation(); String
	 * shippingTotalamount = ship.amountvalidation();
	 * 
	 * /* String reviewsubamt = ship.subtotalvalidation(); if
	 * (subTotalamt.contains(reviewsubamt)) { System.out.println(
	 * "total amount is correct"); } else { System.out.println(
	 * "total amount is incorrect"); } String reviewTotalamount =
	 * ship.amountvalidation(); if
	 * (shippingTotalamount.contains(reviewTotalamount)) { System.out.println(
	 * "total amount is correct"); } else { System.out.println(
	 * "total amount is incorrect"); }
	 */
}

/*
 * @AfterMethod public void AfterMethod() { methods.quit(); }
 */
