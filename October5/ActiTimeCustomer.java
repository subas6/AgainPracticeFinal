package com.October5;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeCustomer {
	ChromeDriver driver;
	public static void main(String[]args) throws InterruptedException  {
		Random r=new Random();
		int num=r.nextInt(10000);
		String expcustomername="Subash";
		expcustomername=expcustomername+num;
		ActiTimeCustomer ac=new ActiTimeCustomer();
		ac.lunchBrowser();
		ac.login();
		String actualcustomername=ac.customerCreation(expcustomername);
		if(expcustomername.equals(actualcustomername))
		{
			System.out.println("TC is passed");
			
		}
		else
		{
			System.out.println("TC is failed");
			
		}
		ac.closeBrowser();
	}
	public void lunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void login() 
	{
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	}
	public String customerCreation(String expcustomername ) throws InterruptedException
	{
		driver.findElement(By.id("container_tasks")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".title.ellipsis")).click();
		driver.findElement(By.className("createNewCustomer")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("newNameField")).sendKeys(expcustomername);
		driver.findElement(By.cssSelector("[placeholder='Enter Customer Description']")).sendKeys("done");
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		Thread.sleep(2000);
		String actualcustomername=driver.findElement(By.cssSelector(".titleEditButtonContainer>.title")).getText();
		return actualcustomername;
	}
	public void closeBrowser()
	{
		driver.close();
		
	}

}
