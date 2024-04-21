package com.October14;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_WebElement {
public static void main(String[]args) throws IOException {
System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/");
WebElement google=driver.findElement(By.className("lnXdpd"));
File src=google.getScreenshotAs(OutputType.FILE);
File trg=new File("./screenshot/google.png");
FileUtils.copyFile(src,trg);
}
}