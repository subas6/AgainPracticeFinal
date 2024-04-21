package com.November4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUplord_Popup_By_using_Sendkeys {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("C:\\Automation\\chromedriver_win32\\chromedriver.exe");
	driver.findElement(By.id("file-upload")).sendKeys("C:\\SKM\\Hello\\Hello.java.bak");
}
}
