package com.syntax.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class AddModifyDeleteEmpPage extends BaseClass{
	
	//Links to get to Employee modifications
	
	@FindBy(id="menu_pim_viewPimModule")
	public WebElement PIM;
	
	@FindBy(id="menu_pim_addEmployee")
	public WebElement AddEmp;
	
	//Elements found in Add Employee 
	
	@FindBy(id="firstName")
	public WebElement FirstName;
	
	@FindBy(id="middleName")
	public WebElement MiddleName;
	
	@FindBy(id="lastName")
	public WebElement LastName;
	
	@FindBy(id="btnSave")
	public WebElement SaveBtn;
	
	@FindBy(id="employeeId")
	public WebElement EmpId;
	
	@FindBy(id="employee-details")
	public WebElement VerifyDetails;
	
	//Elements found in Employee List Page

	@FindBy(xpath="//a[@id='menu_pim_viewEmployeeList']")
	public WebElement EmpList;
	
	@FindBy(id="empsearch_employee_name_empName")
	public WebElement EmpNameSearch;
	
	@FindBy(id="empsearch_id")
	public WebElement IdSearch;
	
	@FindBy(id="empsearch_employee_status")
	public WebElement EmpStatus;
	
	@FindBy(id="empsearch_termination")
	public WebElement EmpTerminationStatus;
	
	@FindBy(id="empsearch_supervisor_name")
	public WebElement EmpSupervisor;
	
	@FindBy(id="empsearch_job_title")
	public WebElement JobTitle;
	
	@FindBy(id="empsearch_sub_unit")
	public WebElement SubUnit;
	
	@FindBy(id="searchBtn")
	public WebElement SearchBtn;
	
	@FindBy(xpath="//tr[@class='odd']//a")
	public WebElement ViewEmp;
	
	@FindBy(id="btnSave")
	public WebElement EditBtn;
	
	@FindBy(id="personal_txtEmployeeId")
	public WebElement EmpIdVerify;
	
	@FindBy(xpath="//table[@id='resultTable']/tbody")
	public List<WebElement> Tables;
	
	@FindBy(xpath="//table[@id='resultTable']/tbody/tr[\" + i + \"]")
	public WebElement Table;
	
	//Delete Employee from Emp List
	
	@FindBy(xpath="//input[@type='checkbox']")
	public WebElement CheckBox;
	
	@FindBy(id="btnDelete")
	public WebElement DeleteBtn;
	
	@FindBy(id="dialogDeleteBtn")
	public WebElement PopUpOkBtn;
	
	public AddModifyDeleteEmpPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	

}
