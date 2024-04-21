package com.October3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
public static void main(String[]args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.actitime.com/login.do");
driver.findElement(By.cssSelector("[placeholder='Username']")).sendKeys("admin");
Thread.sleep(2000);
driver.findElement(By.cssSelector("[class='textField pwdfield']")).sendKeys("manager");
Thread.sleep(2000);
driver.findElement(By.cssSelector("[id='loginButton']")).click();

	
}

}
