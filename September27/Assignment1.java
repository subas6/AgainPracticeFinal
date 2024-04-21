package com.September27;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.yatra.com/");
		driver.get("https://www.ebay.com/");
		driver.navigate().back();
		String title=driver.getTitle();
		System.out.println(title);
		driver.manage().window().minimize();
		driver.close();
		
	}

}
