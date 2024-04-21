package com.September27;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {
	public static void main(String[]args) throws MalformedURLException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		URL url=new URL("https://www.google.com/");
		driver.navigate().to(url);
		
	}

}
