package com.November1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	Alert alt=driver.switchTo().alert();
	//Fetch msg
	String msg=alt.getText();
	System.out.println(msg);
	// pass value
	alt.sendKeys("Hiii Subash");
	//click on Ok
	alt.accept();
	String result=driver.findElement(By.id("result")).getText();
	System.out.println(result);
}
}
