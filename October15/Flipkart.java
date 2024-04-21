package com.October15;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[]args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		WebElement search=driver.findElement(By.xpath("//div[contains(@class,'InyRMC')] "));
		File src=search.getScreenshotAs(OutputType.FILE);
		File trg=new File("./screenshot/flipkartoffer.png");
		FileUtils.copyFile(src,trg);
	}

}
