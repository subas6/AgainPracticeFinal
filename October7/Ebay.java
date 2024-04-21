package com.October7;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {
	ChromeDriver driver;
	public static void main(String[]args) throws InterruptedException
	{
		Ebay e=new Ebay();
		e.launchBrowser();
		e.searchWatch();
		System.out.println(e.resultfetching());
	}
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
	}
	public void searchWatch()
	{
		driver.findElement(By.id("gh-ac")).sendKeys("Watch");
		driver.findElement(By.id("gh-btn")).click();
	}
	public String resultfetching()
	{
		String result=driver.findElement(By.xpath("//span[text()='watch']")).getText();
		return result;
		
	}
		
		
}
