package com.October7;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	ChromeDriver driver;
	public static void main(String[]args) throws InterruptedException
	{
		Flipkart e=new Flipkart();
		e.launchBrowser();
		e.searchIphonex();
	}
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	}
	public void searchIphonex() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphonex");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		Thread.sleep(2000);
		String price = driver.findElement(By.xpath("//div[text()='APPLE iPhone X (Silver, 64 GB)']/../../div[2]/div/div/div")).getText();
		System.out.println(price);
		
	}
	
}
