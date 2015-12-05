package com.task.macys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import framework.Commonmethods;
import framework.testreport;
import framework.Sehelper;

public class Checkoutpage extends Sehelper {
	public static Commonmethods common = new Commonmethods();
	static String wid = common.getdata("webid");
	static String cost = common.getdata("itemcost");
	static String subcost = common.getdata("subtotal");
	static String scost = common.getdata("shipcost");
	static String tax = common.getdata("taxamount");
	static String tot = common.getdata("totcost");
/*	static String item = common.getdata("itemname");
	static String colr = common.getdata("color");
	static String siz = common.getdata("size");*/

	public static void clickcheckout() {
		WebElement chknext = driver.findElement(By.id("continueCheckout"));
		testreport.elementvalidation(chknext.isDisplayed(), "checkout button validation");
		chknext.click();
		Commonmethods.waittime();
		WebElement chkguest = driver.findElement(By.id("isWithoutProfile"));
		testreport.elementvalidation(chkguest.isDisplayed(), "guestcheckout button validation");
		chkguest.click();
		Commonmethods.waittime();

	}

	
		public static void validateitem(String itemname, String color, String size) {

			WebElement shirt = driver.findElement(By.id("href_3_productDesc"));
			String sh = shirt.getText();
			if (sh.contains(itemname)) {
				System.out.println("name is validated in cart page");
				report.stringvalidation(sh, itemname, "itemname is validated");
			}
			WebElement shirt_size = driver
					.findElement(By.xpath(".//*[@id='atbPageProductSummary']/div/div[2]/div[1]/div[3]/div[2]"));
			String siz = shirt_size.getText();
			if (siz.contains(size)) {
				System.out.println("size is validated in cart page");
				report.stringvalidation(siz, size, "size is validated");
			}
			WebElement shirt_color = driver
					.findElement(By.xpath(".//*[@id='atbPageProductSummary']/div/div[2]/div[1]/div[2]/div[2]"));
			String col = shirt_color.getText();
			if (col.contains(color)) {
				System.out.println("COLOUR is validated in cart page");
				report.stringvalidation(col, color, "color is validated");
			}

		}
		public static void cartitemsvalidation() {

		WebElement web = driver.findElement(By.cssSelector("#webID_2436759"));
		String web_id = web.getText();
		if (web_id.contains(wid)) {
			System.out.println("web id is validated ");
			report.stringvalidation(web_id, wid, "web id is validated");
		}
		WebElement cost_val = driver.findElement(By.cssSelector("#bag_salesPrice34875321"));
		String costval = cost_val.getText();
		if (costval.contains(cost)) {
			System.out.println("price is validated");
			report.stringvalidation(costval, cost, "item price is validated");
			Commonmethods.waittime();
		}
		WebElement sub_tot = driver.findElement(By.cssSelector("#bagMerchandiseTotal"));
		String subtot = sub_tot.getText();
		if (subtot.contains(subcost)) {
			System.out.println("order subtotal is validated in the checkout next page before bag page");
			report.stringvalidation(subtot, subcost, "order subtotalprice is validated");
		}
		WebElement ship_tot = driver.findElement(By.cssSelector("#bagEstimatedShippingTotal"));
		String shiptot = ship_tot.getText();
		if (shiptot.contains(scost)) {
			System.out.println("shipping total is validated in the checkout next page before bag page");
			report.stringvalidation(shiptot, scost, " ship totalprice is validated");
		}
		WebElement sal_tax = driver.findElement(By.cssSelector("#bagEstimatedTaxes"));//
		String saletax = sal_tax.getText();
		if (saletax.contains(tax)) {
			System.out.println("tax is validated in the checkout next page before bag page");
			report.stringvalidation(saletax, tax, " sales  tax price is validated");
		}
		WebElement shirt_tot = driver.findElement(By.cssSelector("#bagTotal"));//
		String total = shirt_tot.getText();
		if (total.contains(tot)) {
			System.out.println("bagtotal is validated in the checkout next page before bag page");
			report.stringvalidation(total, tot, "total price is validated");
		}
	}

}
