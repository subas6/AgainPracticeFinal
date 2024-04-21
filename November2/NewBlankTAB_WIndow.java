package com.November2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewBlankTAB_WIndow {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/");
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.flipkart.com/");
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://www.google.com/");
}
}
