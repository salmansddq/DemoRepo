package com.salman.TestDemo;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPoPup {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Applications/Documents/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("");

		driver.findElement(By.xpath(""));

		Set<String> handler = driver.getWindowHandles();

		Iterator<String> it = handler.iterator();

		String ParenWindowId = it.next();
		System.out.println("Parent window id is:" + ParenWindowId);

		String ChildWindowId = it.next();
		System.out.println("Child Window id is" + ChildWindowId);

		driver.switchTo().window(ChildWindowId);

		System.out.println("Child window title is" + driver.getTitle());

		driver.close();
	}

}
