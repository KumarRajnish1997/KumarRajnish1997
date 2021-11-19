package com.qa.orange;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_001_OpenURL {

		public static void main(String[] args) throws InterruptedException, IOException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\rajnishk\\OneDrive - Broadridge Financial Solutions, Inc\\JAVA-SDET\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();
			driver.close();
		

	}

}
