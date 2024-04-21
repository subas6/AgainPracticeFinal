package com.October11;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
	public static void main(String[]args) {
	System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	WebElement username=driver.findElement(By.id("username"));
	//x and y co-ordinate
	Point location=username.getLocation();
	System.out.println(location);
	// width and length
	Dimension size=username.getSize();
	System.out.println(size);
	//x,y,width,height
	Rectangle rec=username.getRect();
	System.out.println(rec.getX());
	System.out.println(rec.getY());
	System.out.println(rec.getWidth());
	System.out.println(rec.getHeight());
	}
	}
	


