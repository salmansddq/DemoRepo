package com.salman.TestDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HrisApp {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Applications/Documents/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get(
				"https://login.microsoftonline.com/6be5b754-cbd2-4393-9dc2-d7050d353c69/oauth2/v2.0/authorize?client_id=340b7726-72e9-4920-949c-5a6e13b94d8a&response_type=id_token&response_mode=form_post&scope=openid&state=12345&nonce=678910");

		driver.findElement(By.id("i0116")).sendKeys("salman.siddiqui@qualitestgroup.com");
		driver.findElement(By.id("idSIButton9")).click();
		driver.findElement(By.id("i0118")).sendKeys("9Reen@93");
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();

		driver.findElement(By.className("table-cell text-left content")).click();

		Thread.sleep(4000);

		// driver.findElement(By.className("tab-heading")).click();

		// Thread.sleep(3000);

		driver.quit();

	}

}
