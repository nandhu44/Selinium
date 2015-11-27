package com.nike.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.common.methods.Sehelper;
import com.common.methods.testreport;
import com.common.methods.*;

public class Addtocart extends Commonmethods {

	public static void cart() {
		driver.get("http://store.nike.com/us/en_us/pd/hoops-elite-max-air-team-backpack/pid-10278314/pgid-1466090");
		WebElement btn_addtocart = driver.findElement(By.id("buyingtools-add-to-cart-button"));
		WebElement btn_proceed = driver.findElement(By.xpath("html/body/div[7]/nav/div[1]/div[2]/div[5]/a/span"));
		report.elementvalidation(btn_addtocart.isDisplayed(), "Add-to-cart page validation");
		btn_addtocart.click();
		waittime();
		report.elementvalidation(btn_proceed.isDisplayed(), "minicart page validation");
		btn_proceed.click();
		waittime();
	}
}
