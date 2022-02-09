package com.salman.TestDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FreeCrm {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Applications/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// driver.manage().timeouts().pageLoadTimeout(3,TimeUnit.SECONDS);
		// driver.manage().timeouts().implicitlyWait(3, Seconds);

		driver.get("https://freecrm.com/");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//span[@class='icon icon-xs mdi-chart-bar']")).click();

		// Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("salmansddq19@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9807755243");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();

		// print all the available links on page
		// print all the links name.

		List<WebElement> linklist = driver.findElements(By.tagName("a"));

		// size of linklist
		System.out.println(linklist.size());

		for (int i = 0; i < linklist.size(); i++) {

			String linktext = linklist.get(i).getText();
			System.out.println(linktext);

			Actions action = new Actions(driver);

			action.moveToElement(driver.findElement(By.className("menu-item-wrapper"))).build().perform();

			// Thread.sleep(2000);

		}

	}
}
