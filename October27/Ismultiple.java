package com.October27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ismultiple {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("file:///C:/Automation/HTML/DropDown.html");
		WebElement dd=driver.findElement(By.id("Movies"));
		Select s=new Select(dd);
		if(s.isMultiple())
		{
			System.out.println("it is a Multiselect");
		}
		else
		{
			System.out.println("it is a Singleselect");	
		}
	}
}