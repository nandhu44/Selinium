package com.common.methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Commonmethods extends Sehelper {

	public static void click(String locatorname, String locatorvalue) {
		if (locatorname.contains("id")) {
			driver.findElement(By.id(locatorvalue)).click();
		} else if (locatorname.contains("name")) {
			driver.findElement(By.name(locatorvalue)).click();
		} else if (locatorname.contains("xpath")) {
			driver.findElement(By.xpath(locatorvalue)).click();
		} else if (locatorname.contains("css")) {
			driver.findElement(By.cssSelector(locatorvalue)).click();
		}

	}

	public static String getvalue(String locatorname, String locatorvalue) {
		String text = null;
		if (locatorname.contains("id")) {
			text = driver.findElement(By.id(locatorvalue)).getText();
		} else if (locatorname.contains("name")) {
			text = driver.findElement(By.name(locatorvalue)).getText();
		} else if (locatorname.contains("xpath")) {
			text = driver.findElement(By.xpath(locatorvalue)).getText();
		} else if (locatorname.contains("css")) {
			text = driver.findElement(By.cssSelector(locatorvalue)).getText();
		}
		return text;
	}

	public static String getatt(String locatorname, String locatorvalue, String attribute) {
		String attvalue = null;
		if (locatorname.contains("id")) {
			attvalue = driver.findElement(By.id(locatorvalue)).getAttribute(attribute);
		} else if (locatorname.contains("name")) {
			attvalue = driver.findElement(By.name(locatorvalue)).getAttribute(attribute);
		} else if (locatorname.contains("xpath")) {
			attvalue = driver.findElement(By.xpath(locatorvalue)).getAttribute(attribute);
		} else if (locatorname.contains("css")) {
			attvalue = driver.findElement(By.cssSelector(locatorvalue)).getAttribute(attribute);
		}
		return attvalue;
	}

	public static void entertext(String locatorname, String locatorvalue, String textdata) {
		if (locatorname.contains("id")) {
			driver.findElement(By.id(locatorvalue)).sendKeys(textdata);
		} else if (locatorname.contains("name")) {
			driver.findElement(By.name(locatorvalue)).sendKeys(textdata);
		} else if (locatorname.contains("xpath")) {
			driver.findElement(By.xpath(locatorvalue)).sendKeys(textdata);
		} else if (locatorname.contains("css")) {
			driver.findElement(By.cssSelector(locatorvalue)).sendKeys(textdata);
		}

	}

	public static void getalllinks(String linktext) {
		List<WebElement> linknames = driver.findElements(By.tagName("a"));
		for (int i = 0; i < linknames.size(); i++) {
			String linkname = linknames.get(i).getText();
			System.out.println(linkname);
			if (linkname.contains(linktext)) {
				System.out.println("test case is passed");
				break;
			}
		}

	}

	public static void waittime() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void quit() {
		driver.quit();
	}

	public static void main(String[] args) {
		chrome();
	}
}
