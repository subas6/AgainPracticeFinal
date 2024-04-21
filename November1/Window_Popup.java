package com.November1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Popup {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
	driver.findElement(By.name("q")).sendKeys("iphonex",Keys.ENTER);
	driver.findElement(By.xpath("//div[text()='APPLE iPhone X (Silver, 256 GB)']")).click();
	String mainid=driver.getWindowHandle();
	Set<String> allid=driver.getWindowHandles();
	for(String id:allid)
	{
		if(!(id.equals(mainid))) 
		{
		driver.switchTo().window(id);	
		}
	}
	String price=driver.findElement(By.className("CEmiEU")).getText();
	System.out.println(price);
	driver.close();
	driver.switchTo().window(mainid);
	System.out.println(driver.getTitle());
	
}
}
