package com.nike.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.common.methods.Commonmethods;

public class cartcheckout extends Addtocart {
	public static Commonmethods methods;

	@SuppressWarnings("static-access")
	public static void checkcart() {
		methods.waittime();
		// methods.getalllinks("Contact Us");
		WebElement btn_chkout = driver.findElement(By.id("ch4_cartCheckoutBtn"));
		report.elementvalidation(btn_chkout.isDisplayed(), "cartcheckout page validation");
		btn_chkout.click();
		// click("id", "ch4_cartCheckoutBtn");
	}

	public static void cartitems_css() {
		List<WebElement> items = driver.findElements(By.cssSelector("/.ch4_cartItemOption"));
		for (int i = 0; i < items.size(); i++) {
			String itemname = items.get(i).getText();
			report.logstep(itemname);
		}
	}
}