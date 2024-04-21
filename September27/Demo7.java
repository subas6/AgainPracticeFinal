package com.September27;


import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {
public static void main(String[]args)
{
System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.manage().window().setPosition(new Point(500,400));


}
}
