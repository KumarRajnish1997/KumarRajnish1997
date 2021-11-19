package com.qa.orange;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class TC_003_XPathCSSLocatorofLoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajnishk\\OneDrive - Broadridge Financial Solutions, Inc\\JAVA-SDET\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='txtUsername']"));
		driver.findElement(By.xpath("//input[@id='txtPassword']"));
		driver.findElement(By.linkText("Forgot your password?"));
		driver.findElement(By.xpath("//div[@id='divLogo']//child::img"));
		driver.findElement(By.cssSelector("input#txtUsername"));
		driver.findElement(By.cssSelector("input#txtPassword"));

	}

}
