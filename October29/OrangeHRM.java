package com.October29;
import java.awt.AWTException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class OrangeHRM {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/");
		driver.findElement(By.linkText("Contact Sales")).click();
		driver.findElement(By.id("Form_getForm_FullName")).sendKeys("Subash kumar",Keys.TAB,Keys.TAB,"7735089444",Keys.TAB,"subashmaharana65@gmail.com",Keys.TAB,Keys.DOWN,"india",Keys.TAB,Keys.DOWN,"101-150",Keys.TAB,"Test Engineer",Keys.TAB,"Hey buddy",Keys.TAB,Keys.ENTER);
}
}