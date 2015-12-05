package com.task.macys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import framework.testreport;

import framework.Commonmethods;
import framework.Sehelper;

public class Addtocartpage extends Sehelper {
	public static void addtobag() {
		WebElement addcart = driver.findElement(By.id("addToBagButton2436759"));
		testreport.elementvalidation(addcart.isDisplayed(), "addtocart validation");
		addcart.click();
		Commonmethods.waittime();
	}

	public static void addtolist() {
		WebElement addlist = driver.findElement(By.id("addToWishlistBtn2436759"));
		testreport.elementvalidation(addlist.isDisplayed(), "addtolist validation");
		addlist.click();
		Commonmethods.waittime();

	}

}
