package com.October12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Boolean_Enabled {
	public static void main(String[]args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Automation/HTML/Register.html");
		WebElement un=driver.findElement(By.cssSelector("[placeholder='username']"));
		Thread.sleep(2000);
		if(un.isEnabled())
		{
			System.out.println("it is enabled");
			
		}
		else
		{
			System.out.println("it is disebled");
		}
		driver.quit();
}
}