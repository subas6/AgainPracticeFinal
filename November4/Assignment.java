package com.November4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		WebElement job=driver.findElement(By.xpath("//div[text()='Jobs']"));
		Actions act=new Actions(driver);
		act.moveToElement(job).perform();
		driver.findElement(By.xpath("//div[text()='IT jobs']")).click();
		driver.findElement(By.xpath("//a[text()='Embedded Test Engineer']")).click();
		WebElement connect=driver.findElement(By.className("nI-gNb-followus"));
		File src=connect.getScreenshotAs(OutputType.FILE);
		File trg=new File("./screenshot/Naukri.png");
		FileUtils.copyFile(src,trg);
		driver.findElement(By.xpath("//a[text()='Privacy policy']")).click();
		String title=driver.getTitle();
		System.out.println(title);
		
}
}