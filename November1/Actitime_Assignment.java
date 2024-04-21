package com.November1;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime_Assignment {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		driver.findElement(By.className("popup_menu_button_settings")).click();
		driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
		driver.findElement(By.className("i")).click();
		driver.findElement(By.id("name")).sendKeys("Subash");
		driver.findElement(By.xpath("//input[@value='      Cancel      ']")).click();
		Alert alt=driver.switchTo().alert();
		String msg=alt.getText();
		System.out.println(msg);
		alt.dismiss();
		WebElement work=driver.findElement(By.xpath("//td[@class='mainContentPadding rightPadding']/table/tbody/tr[1]/td"));
		File src=work.getScreenshotAs(OutputType.FILE);
		File trg=new File("./screenshot/Actitimework.png");
		FileUtils.copyFile(src,trg);

}
}