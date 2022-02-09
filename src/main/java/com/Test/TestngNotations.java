package com.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngNotations {

	
	@BeforeSuite
	
	public void steup(){
		
		System.out.println("print browser name");
	}
	
	@BeforeClass
	public void launchbrowser() {
		System.out.println("launch browser");
	}
	
	@BeforeTest
	public void login() {
		System.out.println("login");
	}
	
	@BeforeMethod 
	public void enterurl() {
		
		System.out.println("enter url");
	}
	
	@Test
	public void googletitletest() {
		System.out.println("print the title");
	}
	@Test
	public void googlepageload() {
		System.out.println("page loaded successfully");
	}
	
	@AfterTest
	public void deleteallcookies() {
		
	}
	@AfterMethod
	public void closebrowser() {
		
	}
}
