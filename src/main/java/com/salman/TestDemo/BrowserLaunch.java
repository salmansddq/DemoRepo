package com.salman.TestDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Applications/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://www.amazon.com/");
		String title = driver.getTitle();
		System.out.println(title);

		if (title.equals("Google")) {
			System.out.println("Correct title");

		} else {
			System.out.println("Incorrct Title");

		}

		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());

		for (int i = 0; i < linklist.size(); i++) {

			String linktext = linklist.get(i).getText();

			System.out.println(linktext);
		}
		
		Thread.sleep(2000);

		driver.quit();

	}

}
