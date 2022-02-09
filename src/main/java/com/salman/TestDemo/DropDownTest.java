package com.salman.TestDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropDownTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Applications/Documents/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://www.ebay.com/");
		
		Select select = new Select(driver.findElement(By.name("_sacat")));
		
		
		select.selectByVisibleText("Art");
		
		//List<WebElement> selectedoption = select.getAllSelectedOptions();
		
		
		
		
		List<WebElement> alloption =  select.getOptions();
		
	//advanced for loop
		
		for (WebElement ele:alloption) {
			
			System.out.println(ele.getText());
			
			
			
		}
		
	Thread.sleep(2000);
	driver.quit();
		
		

	}

}
