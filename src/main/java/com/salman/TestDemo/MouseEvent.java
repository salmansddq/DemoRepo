package com.salman.TestDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvent {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Applications/Documents/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://www.ebay.com/");

		/*
		 * Alert alert = driver.switchTo().alert();
		 * 
		 * String s1 = alert.getText();
		 * 
		 * System.out.println(s1); alert.accept();
		 */

		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.linkText("My eBay"))).build().perform();
		


		Thread.sleep(3000);

		driver.quit();

	}

}
