package com.October11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
public static void main(String[]args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.actitime.com/login.do");
Thread.sleep(2000);
driver.findElement(By.tagName("label")).click();

}

}
