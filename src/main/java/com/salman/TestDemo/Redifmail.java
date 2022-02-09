package com.salman.TestDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redifmail {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Applications/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();

		// Alert Handle
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.name("proceed")).click();

		Alert alert = driver.switchTo().alert();
		String text = alert.getText();

		System.out.println(text);

		if (alert.equals(text)) {

			System.out.println("Correct String");

		} else {
			System.out.println("InCorrect String");
		}
		alert.accept();
		//alert.dismiss();

	}

}
