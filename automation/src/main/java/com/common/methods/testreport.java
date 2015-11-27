package com.common.methods;

import org.testng.Assert;
import org.testng.Reporter;

public class testreport {
	public static void logstep(String message) {
		Reporter.log(message);
	}

	public static void stringvalidation(String Actualvalue, String ExpectedValue,String message) {
		Assert.assertEquals(Actualvalue, ExpectedValue);
		Reporter.log(message);
	}

	public static void boolvalidation(boolean Actualval, boolean ExpectedVal,String message) {
		Assert.assertEquals(Actualval, ExpectedVal);
		Reporter.log(message);
	}

	public static void intvalidation(int Actualvalu, int ExpectedValu,String message) {
		Assert.assertEquals(Actualvalu, ExpectedValu);
		Reporter.log(message);
	}

	public static void elementvalidation(boolean actval,String message) {
		Assert.assertTrue(actval, message);
		Reporter.log(message);
	}

	public void stringvalidation(boolean displayed, String message) {
		Assert.assertTrue(displayed, message);
		Reporter.log(message);
		// TODO Auto-generated method stub
		
	}
}
