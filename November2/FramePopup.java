package com.November2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramePopup {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/iframe");
	//index
	//driver.switchTo().frame(0);
	//id or name
	//driver.switchTo().frame("mce_0_ifr");
	//By using webelement
	WebElement frame1=driver.findElement(By.className("tox-edit-area__iframe"));
	driver.switchTo().frame(frame1);
	String msg=driver.findElement(By.tagName("p")).getText();
	System.out.println(msg);
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//span[text()='File']")).click();
}
}
