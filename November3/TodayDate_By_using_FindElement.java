package com.November3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TodayDate_By_using_FindElement {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/datepicker/");
	driver.switchTo().frame(0);
	driver.findElement(By.id("datepicker")).click();
	driver.findElement(By.className("ui-state-highlight")).click();
}
}
