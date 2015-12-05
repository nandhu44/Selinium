package com.task.macys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import framework.Commonmethods;
import framework.Sehelper;


public class Homepage extends Sehelper{
	public static framework.Commonmethods common = new framework.Commonmethods();

	public static void geturl() {
		String siteurl = Commonmethods.getdata("url");
		System.out.println(siteurl);
		driver.get(siteurl);
		Commonmethods.waittime();
	}
public static void search(){
	WebElement search = driver.findElement(By.id("globalSearchInputField"));
	search.sendKeys("lacoste sweaters");
	search.sendKeys(Keys.ENTER);
	Commonmethods.waittime();
		
	}
public static void validateallmenuitems(String home,String BB, String women,String men,String juniors, String kids,String active,String beauty,String shoes,
		String handbags,String jew,String watches,String brands){
	
	String home_tab = driver.findElement(By.id("flexLabel_22672")).getText();
	report.stringvalidation(home_tab, home, "HOME item validated");
	
	String b_b = driver.findElement(By.id("flexLabel_7495")).getText();
	report.stringvalidation(b_b, BB, "BED & BATH item validated");
	
	String women_tab = driver.findElement(By.id("flexLabel_118")).getText();
	report.stringvalidation(women_tab,women, "WOMEN item validated");
	
	String men_tab = driver.findElement(By.id("flexLabel_1")).getText();
	report.stringvalidation(men_tab,men,"MEN item validated");
	
	String jun = driver.findElement(By.id("flexLabel_16904")).getText();
	report.stringvalidation(jun,juniors, "JUNIORS item validated");
	
	String kids_tab = driver.findElement(By.id("flexLabel_5991")).getText();
	report.stringvalidation(kids_tab,kids, "KIDS item validated");
	
	String active_tab = driver.findElement(By.id("flexLabel_70868")).getText();
	report.stringvalidation(active_tab,active, "ACTIVE item validated");
	
	String beauty_tab = driver.findElement(By.id("flexLabel_669")).getText();
	report.stringvalidation(beauty_tab,beauty,"BEAUTY item validated");
	
	String shoes_tab = driver.findElement(By.id("flexLabel_13247")).getText();
	report.stringvalidation(shoes_tab,shoes,"SHOES item validated");
	
	String hb = driver.findElement(By.id("flexLabel_26846")).getText();
	report.stringvalidation(hb,handbags,  "HANDBAGS item validated");
	
	String jewelry = driver.findElement(By.id("flexLabel_544")).getText();
	report.stringvalidation(jewelry, jew, "JEWELRY item validated");
	
	String watch = driver.findElement(By.id("flexLabel_23930")).getText();
	report.stringvalidation(watch,watches, "WATCHES item validated");
	
	String brands_tab = driver.findElement(By.id("flexLabel_63538")).getText();
	report.stringvalidation(brands_tab,brands,"BRANDS item validated");
	
}
}

