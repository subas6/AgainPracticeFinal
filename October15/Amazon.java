package com.October15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		Actions act=new Actions(driver);
		act.keyUp(Keys.SHIFT).sendKeys(search,"Clock").perform();
		act.keyDown(Keys.CONTROL).sendKeys("a",Keys.DELETE).perform();
		act.keyUp(Keys.CONTROL).perform();
		act.keyUp(Keys.SHIFT).sendKeys(search,"Flower",Keys.ENTER).perform();
		driver.findElement(By.xpath("//span[text()='Generic']")).click();
		Thread.sleep(2000);
		String result=driver.findElement(By.cssSelector("[class='a-section a-spacing-small a-spacing-top-small']")).getText();
		System.out.println(result);
}	
}