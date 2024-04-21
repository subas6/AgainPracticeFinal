package com.October7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelM {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\zzzzzzz\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}

}
