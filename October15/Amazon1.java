package com.October15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Amazon1 {
	public static void main(String[]args) throws InterruptedException  {
		System.setProperty("Webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		List<WebElement> alllinks=driver.findElements(By.xpath("//a"));
		for(WebElement link:alllinks)
		{
			System.out.println(link.getText());
		}
	}
	}


