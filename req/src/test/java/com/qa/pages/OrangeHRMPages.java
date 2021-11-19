package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRMPages {

	WebDriver driver;

	// Create the variable that can accomodate the locator and its value
	// Create the methods that can return webelement, which can be called into test case / test scripts
	// Create a constructor to call the class members of this class into an other object in a test case.

	
	@FindBy(id="txtUsername")
	WebElement UNameTxtField;
	
	

	public WebElement getUNameTxtField() {
		return UNameTxtField;
	}
	
	
	@FindBy(id="txtPassword")
	WebElement PwdTxtField;
	
	public WebElement getPwdTxtField() {
		return PwdTxtField;
	}
	
	@FindBy(id="btnLogin")
	WebElement btnLoginField;
	
	public WebElement getbtnLoginField() {
		return btnLoginField;
	}
	
	@FindBy(linkText="Assign Leave")
	WebElement AssignLeaveLink;
	
	public WebElement getAssignLeaveLink() {
		return AssignLeaveLink;
		
	}
	
	@FindBy(id="assignleave_txtEmployee_empName")
	WebElement EmpNameField;
	
	public WebElement getEmpNameField() {
		return EmpNameField;
		
	}
	
	@FindBy(id="assignleave_txtLeaveType")
	WebElement LeaveTypeField;
	
	public WebElement getLeaveType() {
		return LeaveTypeField;
		
	}
	
	@FindBy(xpath="//div[@class='head']//child::h1")
	WebElement DashBoardHeaderText;
	
	public String GetDashBoardHeaderText() {
		return DashBoardHeaderText;
		
	}
	
	public OrangeHRMPages(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	}






