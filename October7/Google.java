package com.October7;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	ChromeDriver driver;
	public static void main(String[]args) throws InterruptedException
	{
		Google g=new Google();
		g.launchBrowser();
		g.searchSachin();
	}
		public void launchBrowser()
		{
			System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
		}
		public void searchSachin() throws InterruptedException
		{
			
			driver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys("Sachin Tendulkar");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Sachin Tendulkar']")).click();
			String result=driver.findElement(By.cssSelector(".yKMVIe")).getText();
			System.out.println(result);
			
			
		}
		
	}
