package com.October12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hover {
	public static void main(String[]args){
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement chechbox=driver.findElement(By.id("keepLoggedInCheckBox"));
		String msg=chechbox.getAttribute("title");
		System.out.println(msg);
		driver.quit();
	}

}
