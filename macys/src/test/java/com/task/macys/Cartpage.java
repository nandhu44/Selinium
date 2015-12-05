package com.task.macys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import framework.testreport;

import framework.Commonmethods;
import framework.Sehelper;

public class Cartpage extends Sehelper {
	public static void clickcheckout() {
		WebElement checkbtn = driver.findElement(By.id("btnCheckout"));
		testreport.elementvalidation(checkbtn.isDisplayed(), "checkout button validation");
		checkbtn.click();
		Commonmethods.waittime();
	}

	public static void validateitem(String itemname, String color, String size) {

		WebElement shirt = driver.findElement(By.cssSelector(".addToBagPageLineItemName>a"));
		String sh = shirt.getText();
		if (sh.contains(itemname)) {
			System.out.println("name is validated in cart page");
			report.stringvalidation(sh, itemname, "NAME IS VALIDATED IN CART PAGE.");
		}
		WebElement shirt_size = driver
				.findElement(By.xpath(".//*[@id='atbPageProductSummary']/div/div[2]/div[1]/div[3]/div[2]"));
		String siz = shirt_size.getText();
		if (siz.contains(size)) {
			System.out.println("size is validated in cart page");
			report.stringvalidation(siz, size, "size is validated in cart page.");
		}
		WebElement shirt_color = driver
				.findElement(By.xpath(".//*[@id='atbPageProductSummary']/div/div[2]/div[1]/div[2]/div[2]"));
		String col = shirt_color.getText();
		if (col.contains(color)) {
			System.out.println("COLOUR is validated in cart page");
			report.stringvalidation(col, color, "COLOUR IS VALIDATED IN CART PAGE.");
		}

	}

}
