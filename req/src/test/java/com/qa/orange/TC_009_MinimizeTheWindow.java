package com.qa.orange;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Point;

public class TC_009_MinimizeTheWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajnishk\\OneDrive - Broadridge Financial Solutions, Inc\\JAVA-SDET\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    driver.manage().window().setPosition(new Point(-2000, 0));//Minimize the window

	}

}
