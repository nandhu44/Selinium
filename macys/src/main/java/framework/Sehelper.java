package framework;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Sehelper extends testreport {
	public static WebDriver driver;
	public static testreport report;

	public static void chrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		testreport.logstep("Access macys Website");
		
	}
}
