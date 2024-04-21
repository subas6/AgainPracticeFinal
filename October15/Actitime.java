package com.October15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.xpath("//table[@class='headerRowTable']/tbody/tr/td[1]/div/div")).click();
		driver.findElement(By.cssSelector("[class=\"delete button\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='You are about to delete 62 tasks']")).getText();
	}

}
