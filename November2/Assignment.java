package com.November2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300)");
		//driver.switchTo().frame(0);
		driver.switchTo().frame("iframe_a");
		driver.findElement(By.xpath("//font[text()='Free Mock Tests']")).click();
		String mainid=driver.getWindowHandle();
		Set<String> allid=driver.getWindowHandles();
		for(String id:allid)
		{
			if(!id.equals(mainid)) 
			{
			driver.switchTo().window(id);	
			}
		}
		driver.findElement(By.xpath("//ul[contains(@class,'navbar-left hide-in-mobile')]/li[4]/a")).click();
		driver.findElement(By.xpath("(//a[text()='RRB NTPC Stage 1'])[1]")).click();
		String title=driver.getTitle();
		System.out.println(title);
		
}
}