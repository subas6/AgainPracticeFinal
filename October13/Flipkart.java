package com.October13;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

 public class Flipkart{
		public static void main(String[]args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.xpath("//button[text()='✕']")).click();
			driver.findElement(By.name("q")).sendKeys("iphonex");
			driver.findElement(By.cssSelector("[type='submit']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[text()='Add to Compare'])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[text()='Add to Compare'])[last()]")).click();
	}
	}

