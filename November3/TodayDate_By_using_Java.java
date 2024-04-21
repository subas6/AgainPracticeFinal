package com.November3;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TodayDate_By_using_Java {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/datepicker/");
	Calendar cal=Calendar.getInstance();
	Date currentDate=cal.getTime();
	System.out.println(currentDate);
	SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
	String modifiedDate=sdf.format(currentDate);
	System.out.println(modifiedDate);
	driver.switchTo().frame(0);
	driver.findElement(By.id("datepicker")).sendKeys(modifiedDate,Keys.ESCAPE);
}
}
