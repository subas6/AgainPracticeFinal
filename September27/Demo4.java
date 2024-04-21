package com.September27;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
public static void main(String[]args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();

driver.get("https://www.google.com/");
driver.manage().window().maximize();
Thread.sleep(3000);
driver.get("https://www.amazon.in/");
Thread.sleep(3000);
driver.navigate().back();
Thread.sleep(3000);

driver.navigate().forward();
Thread.sleep(3000);
driver.navigate().refresh();
}

}
