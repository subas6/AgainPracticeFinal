package com.November7;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data_From_Properties {
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("C:\\Automation\\commondata.properties");
	Properties pobj=new Properties();
	pobj.load(fis);
	String url=pobj.getProperty("url");
	System.out.println(url);
	String un=pobj.getProperty("username");
	System.out.println(un);
	String pwd=pobj.getProperty("password");
	System.out.println(pwd);
	System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get(url);
	driver.findElement(By.id("username")).sendKeys(un);
	driver.findElement(By.name("pwd")).sendKeys(pwd);
	driver.findElement(By.id("loginButton")).click();
	
}
}
