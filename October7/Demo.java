package com.October7;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\Automation\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys("Sachin Tendulkar");
		//driver.findElement(By.cssSelector("[name='btnK']")).click();
//		driver.findElement(By.xpath("//input[@name='btnK'][1]")).click();
		Thread.sleep(2000);
		
	}
}