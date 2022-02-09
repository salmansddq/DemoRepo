package com.salman.TestDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertConcept {

	public static void main(String[] args) throws InterruptedException {
		
		//1. alert --JavaScript Pop Pups -- Alert API (accept ,dismiss)
		//2. fileUpload --- Brows button (type ="file, .sendkeys(path)
		//3. Browser window popup -- WindowHendler API - getWndowHandles())

		System.setProperty("webdriver.chrome.driver", "/Applications/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://www.rediff.com/");

		driver.findElement(By.xpath("//a[@class='signin']")).click();
		driver.findElement(By.xpath("//input[@class='signinbtn']")).click();

		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);

		if (alert.equals(text)) {
			System.out.println("Correct alert msg is:" + text);
		}

		else  {
			System.out.println("Incorrect alert msg");
		}

		alert.accept();
		// alert.dismiss();

		Thread.sleep(2000);

		driver.quit();
	}

}
