package com.October5;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	public static void main(String[]args) throws InterruptedException {
		Random r=new Random();
		int num=r.nextInt(10000);
		String expcustomername="Subash";
		expcustomername=expcustomername+num;
		
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//login
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		//click on task
		driver.findElement(By.id("container_tasks")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".title.ellipsis")).click();
		driver.findElement(By.className("createNewCustomer")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("newNameField")).sendKeys(expcustomername);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[placeholder='Enter Customer Description']")).sendKeys("done");
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		Thread.sleep(2000);
		String actualcustomername=driver.findElement(By.cssSelector(".titleEditButtonContainer>.title")).getText();
		System.out.println(actualcustomername);
		if(expcustomername.equals(actualcustomername))
		{
			System.out.println("TC is passed");
			
		}
		else
		{
			System.out.println("TC is failed");
			
		}
	}
	

}
