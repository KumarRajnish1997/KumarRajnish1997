package com.qa.orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_008_PageTitleTestMethod {
	
	WebDriver driver;
	
	@BeforeTest // Before the class in a test is invoked
	public void setUp() {
		System.out.println("Invoke the Browser and launch URL");
		try {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\rajnishk\\OneDrive - Broadridge Financial Solutions, Inc\\JAVA-SDET\\Drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			Thread.sleep(1000);
			driver.manage().window().maximize();
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	
	@AfterTest // runs after all the classes in a test is executed..
	public void tearDown() {
		System.out.println("Close the browser");
		driver.close();
	}
	
	@BeforeClass // run once the class invoked
	public void Login() {
		System.out.println("Enter the credentials to login");
		WebElement SearchTextField = driver.findElement(By.id("txtUsername"));
		SearchTextField.sendKeys("Admin");
		WebElement SearchTextField1 = driver.findElement(By.id("txtPassword"));
		SearchTextField1.sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}
	
	@Test(priority=1)
	public  String Admintab() {
		String AdminText = driver.findElement(By.id("menu_admin_viewAdminModule")).getText();
		return AdminText;
	}
	
	@Test(priority=2)
	public  String PIMtab() {
		String PIMText = driver.findElement(By.id("menu_pim_viewPimModule")).getText();
		return PIMText;
	}
	
	@Test(priority=3)
	public  String Leavetab() {
		String LeaveText = driver.findElement(By.id("menu_leave_viewLeaveModule")).getText();
		return LeaveText;
	}
	
	@Test(priority=4)
	public  String Directorytab() {
		String DirectoryText = driver.findElement(By.id("menu_directory_viewDirectory")).getText();
		return DirectoryText;
	}
	
	@Test(priority=5)
	public  String Maintenancetab() {
		String MaintainText = driver.findElement(By.id("menu_maintenance_purgeEmployee")).getText();
		return MaintainText;
	}
	


}
