package com.October29;
import java.awt.AWTException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IRCTC {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.irctc.com/");
		WebElement about=driver.findElement(By.linkText("About Us"));
		Actions act=new Actions(driver);
		act.moveToElement(about).perform();
		driver.findElement(By.linkText("Board of Directors")).click();
		String result=driver.findElement(By.xpath("//table[@class='responsive-table']/tbody/tr[2]/td[2]")).getText();
		System.out.println(result);
}
}
