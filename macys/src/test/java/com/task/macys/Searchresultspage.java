package com.task.macys;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import framework.testreport;

import framework.Commonmethods;
import framework.Sehelper;

public class Searchresultspage extends Sehelper {
	public static void itemselection(String itemname, String color, String size) {
		WebElement shirt = driver.findElement(By.id("image_2436759_0_cat"));
		testreport.elementvalidation(shirt.isDisplayed(), "item validation");
		shirt.click();
		WebElement shirt_color = driver.findElement(By.id("swatch2436759#7_0_0_6"));
		testreport.elementvalidation(shirt_color.isDisplayed(), "color validation");
		shirt_color.click();
		WebElement shirt_size = driver.findElement(By.cssSelector("#sizeList2436759 > li:nth-child(3)"));
		testreport.elementvalidation(shirt_size.isDisplayed(), "size validation");
		shirt_size.click();

	}

}
