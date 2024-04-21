package com.October12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Boolean_Selected {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement result=driver.findElement(By.id("keepLoggedInCheckBox"));
		Thread.sleep(2000);
		if(result.isSelected())
		{
			System.out.println("it is Selected");
		}
		else
		{
			System.out.println("it is not Selected");
			result.click();
		}
		Thread.sleep(2000);
		driver.quit();
	}
}
