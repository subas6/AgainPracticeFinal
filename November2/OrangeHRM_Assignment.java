package com.November2;

import java.awt.AWTException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_Assignment {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/contact-sales//");
		driver.findElement(By.xpath("//div[@class=\"social-link\"]/ul/li[1]/a/div[1]")).click();
		driver.findElement(By.xpath("//div[@class=\"social-link\"]/ul/li[2]/a/div[1]")).click();
		driver.findElement(By.xpath("//div[@class=\"social-link\"]/ul/li[3]/a/div[1]")).click();
		Set<String> allid=driver.getWindowHandles();
		for(String id:allid)
		{
			driver.switchTo().window(id);
			String title=driver.getTitle();
			if(!title.contains("YouTube"))
				driver.close();
 
			}
}		}