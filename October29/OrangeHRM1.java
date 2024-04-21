package com.October29;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRM1 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/");
		driver.findElement(By.xpath("(//button[text()='Contact Sales'])[2]")).click();
		driver.findElement(By.id("Form_getForm_FullName")).sendKeys("Subash kumar");
		driver.findElement(By.id("Form_getForm_Contact")).sendKeys("7735089444");
		driver.findElement(By.id("Form_getForm_Email")).sendKeys("subashmaharana65@gmail.com");
		WebElement country=driver.findElement(By.id("Form_getForm_Country"));
		Select s=new Select(country);
		s.selectByVisibleText("India");
		WebElement employees=driver.findElement(By.id("Form_getForm_NoOfEmployees"));
		Select s1=new Select(employees);
		s1.selectByVisibleText("101-150");
		driver.findElement(By.id("Form_getForm_JobTitle")).sendKeys("QAE");
		driver.findElement(By.id("Form_getForm_Comment")).sendKeys("hello");
		
		
}
}