package com.October29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstSelect {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("file:///C:/Automation/HTML/DropDown.html");
	WebElement dd=driver.findElement(By.id("Movies"));
	Select s=new Select(dd);
	s.selectByVisibleText("puspa");
	s.selectByVisibleText("KGF2");
	s.selectByVisibleText("Bahubali");
	List<WebElement> alloptions=s.getAllSelectedOptions();
	for(WebElement options:alloptions)
	{
		System.out.println(options.getText());
	}	
	String firstopt=s.getFirstSelectedOption().getText();
	System.out.println(firstopt);
}
}
