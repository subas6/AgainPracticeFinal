package com.October7;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Worldmeter {
	ChromeDriver driver;
	public static void main(String[]args) throws InterruptedException
	{
		Worldmeter e=new Worldmeter();
		e.launchBrowser();
		e.covidCases();
		e.covidDeaths();
		e.covidRecover();
	}
	
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.worldometers.info/coronavirus//");
	}
	public void covidCases(){
	String positive = driver.findElement(By.xpath("//h1[text()='Coronavirus Cases:']/../div/span")).getText();
	System.out.println(positive);
	}
	
	public void covidDeaths(){
		String deaths = driver.findElement(By.xpath("//h1[text()='Deaths:']/../div/span")).getText();
		System.out.println(deaths);
		}
	public void covidRecover(){
		String recover = driver.findElement(By.xpath("//h1[text()='Recovered:']/../div/span")).getText();
		System.out.println(recover);
		}
}
