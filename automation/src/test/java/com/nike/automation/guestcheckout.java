package com.nike.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.common.methods.testreport;

public  class guestcheckout extends cartcheckout {
	public static void checkout() {
		waittime();
		WebElement guest_chkout = driver.findElement(By.cssSelector("#ch4_loginGuestBtn"));
		testreport.elementvalidation(guest_chkout.isDisplayed(), "guestcheckout page validation");
		guest_chkout.click();
		// click("css", "#ch4_loginGuestBtn");
		waittime();
	}
}
