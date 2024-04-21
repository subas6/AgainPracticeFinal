package com.October15;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("iphonex",Keys.ENTER);
		System.out.println(driver.getTitle());
	//driver.findElement(By.xpath("//div[text()='APPLE iPhone X (Silver, 64 GB)']/../..")).getText();
	}	
}