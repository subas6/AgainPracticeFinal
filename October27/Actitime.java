package com.October27;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Actitime {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		driver.findElement(By.className("popup_menu_button_settings")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Manage system settings')]/..")).click();
		WebElement dd=driver.findElement(By.id("firstHierarchyLevelCodeSelect"));
		Select s=new Select(dd);
		List<WebElement> alloptions=s.getOptions();
		for(WebElement options:alloptions)
		{
			System.out.println(options.getText());
			
		}		
}
}