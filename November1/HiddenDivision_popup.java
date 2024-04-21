package com.November1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HiddenDivision_popup {
	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
	driver.findElement(By.id("container_tasks")).click();
	driver.findElement(By.xpath("//span[@class='customerNameHeader']/../../preceding-sibling::td")).click();
	driver.findElement(By.className("delete")).click();
	String msg=driver.findElement(By.xpath("//div[contains(text(),'You are about to delete ')]")).getText();
	System.out.println(msg);
}
}