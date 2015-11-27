package com.nike.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static WebDriver driver;

	public static void accessnike() {
		System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://store.nike.com/us/en_us/pd/hoops-elite-max-air-team-backpack/pid-10278314/pgid-1466090");
	}

	public static void addtocart() {
		click("id", "buyingtools-add-to-cart-button");
		// driver.findElement(By.xpath("html/body/div[7]/nav/div[1]/div[2]/div[5]/a/span")).click();
		click("xpath", "html/body/div[7]/nav/div[1]/div[2]/div[5]/a/span");
		waittime();
		// driver.findElement(By.id("ch4_cartCheckoutBtn")).click();
		click("id", "ch4_cartCheckoutBtn");

	}

	public static void checkout() {
		// driver.findElement(By.cssSelector("#ch4_loginGuestBtn")).click();
		waittime();
		click("css", "#ch4_loginGuestBtn");
	}

	public static void shippingaddress(String firstname, String lastname, String Address, String City, String State,
			String Zipcode) {
		// driver.findElement(By.name("fname")).sendKeys(firstname);
		entertext("name", "fname", firstname);
		// driver.findElement(By.name("lname")).sendKeys(lastname);
		entertext("name", "lname", lastname);
		// driver.findElement(By.xpath(".//*[@id='address1Field']")).sendKeys(Address);
		entertext("xpath", ".//*[@id='address1Field']", Address);
		// driver.findElement(By.cssSelector("#singleCity")).sendKeys(City);
		entertext("css", "#singleCity", City);
		// driver.findElement(By.id("singleState")).sendKeys(State);
		entertext("id", "singleState", State);
		// driver.findElement(By.name("postalCodeField")).sendKeys(Zipcode);
		entertext("name", "postalCodeField", Zipcode);
		// driver.findElement(By.xpath(".//*[@id='ch4_checkoutShippingForm']/div[1]/div[6]/div[1]/div[3]/div[2]/label")).click();
		click("xpath", ".//*[@id='ch4_checkoutShippingForm']/div[1]/div[6]/div[1]/div[3]/div[2]/label");
		// driver.findElement(By.xpath(".//*[@id='shippingSubmit']")).click();
		click("xpath", ".//*[@id='shippingSubmit']");
	}

	public static void billing() {
		driver.switchTo().frame("billingFormFrame");
		driver.findElement(By.name("cardTypeSelect")).sendKeys("Visa");
		driver.findElement(By.name("creditCardNumber")).sendKeys("4111111111111111");
		driver.findElement(By.id("expirationMonth")).sendKeys("5");
		driver.findElement(By.id("expirationYear")).sendKeys("2018");
		driver.findElement(By.name("cvNumber")).sendKeys("111");
		driver.findElement(By.id("phoneNumber")).sendKeys("3048046844");
		driver.findElement(By.id("email")).sendKeys("manik.malhotra@gmail.com");
		driver.findElement(By.id("billingSubmit")).click();
		driver.switchTo().defaultContent();

	}

	public static String amountvalidation() {
		String Totalamount = driver.findElement(By.id("totalAmt")).getText();
		return Totalamount;
	}

	public static String subtotalvalidation() {
		String subTotalamt = driver.findElement(By.id("subTotalAmount")).getText();
		return subTotalamt;
	}

	public static void waittime() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

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

	public static void quit() {
		driver.quit();
	}

	public static void validate() {
		String address = getvalue("css", ".ch4_reviewDetailsFull>p");
		// Str9ing address =
		// driver.findElement(By.cssSelector(".ch4_reviewDetailsFull>p"));
		click("name", "ch4_editShipping");
		String fname = getatt("name", "fname", "value");
		String lname = getatt("name", "lname", "value");
		if (address.contains(fname)) {
			System.out.println("firstname is validated");
		} else {
			System.out.println("first name is not present in the order review page");
		}
		if (address.contains(lname)) {
			System.out.println("lastname is validated");
		} else {
			System.out.println("last name is not present in the order review page");
		}
	}

	public static void namevalidate() {
		String firstname = getatt("name", "fname", "data-error-required");
		String lasname = getatt("name", "lname", "data-error-required");
		if (firstname.contains("Please enter your first name.")) {
			System.out.println("test case passed");
		} else {
			System.out.println("test case failed");
		}
		if (lasname.contains("Please enter your last name.")) {
			System.out.println("test case passed");
		} else {
			System.out.println("testcase failed.");
		}
	}

	public static void main(String[] args) {
		accessnike();
		addtocart();
		checkout();
		namevalidate();
		shippingaddress("sjgvhjb", "khcvlloblik", "sjxfcgkvh", "dublin", "Ohio", "43215");
		String subTotalamt = subtotalvalidation();
		String shippingTotalamount = amountvalidation();
		billing();
		validate();
		String reviewsubamt = subtotalvalidation();
		if (subTotalamt.contains(reviewsubamt)) {
			System.out.println("total amount is correct");
		} else {
			System.out.println("total amount is incorrect");
		}
		String reviewTotalamount = amountvalidation();
		if (shippingTotalamount.contains(reviewTotalamount)) {
			System.out.println("total amount is correct");
		} else {
			System.out.println("total amount is incorrect");
		}

	}

}
