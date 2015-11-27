package com.nike.automation.test;

import org.testng.annotations.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Testng {
	@BeforeMethod
	public void login() {
		System.out.println("Print login");
	}

	@Test
	public void B() {
		System.out.println("Print B");
	}

	@Test
	public void C() {
		System.out.println("Print C");
	}

	@Test
	public void D() {
		System.out.println("Print D");
	}

	@AfterMethod
	public void logout() {
		System.out.println("Print logout");
	}
}
