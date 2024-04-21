package com.October3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static void main(String[]args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.cssSelector("div._2QfC02>[class='_2KpZ6l _2doB4z']")).click();//close login
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input._3704LK")).sendKeys("iphone12");//type iphone12 & search
	Thread.sleep(2000);
	String title=driver.getTitle();
	System.out.println(title);
	
}
}