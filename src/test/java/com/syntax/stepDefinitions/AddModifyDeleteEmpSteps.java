package com.syntax.stepDefinitions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.syntax.pages.AddModifyDeleteEmpPage;
import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddModifyDeleteEmpSteps extends BaseClass {

	AddModifyDeleteEmpPage Add;
	String rawData1;


	@When("^I click on PIM$")
	public void i_click_on_PIM() {
		Add = new AddModifyDeleteEmpPage();
		CommonMethods.click(Add.PIM);
	}

	@When("^I navigated to the Add Employee Page$")
	public void i_navigated_to_the_Add_Employee_Page() {
		CommonMethods.click(Add.AddEmp);
	}

	@When("^I provide the \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" of the employee$")
	public void i_provide_the_and_and_of_the_employee(String fname, String mname, String lname) {
		CommonMethods.enterValue(Add.FirstName, fname);
		CommonMethods.enterValue(Add.MiddleName, mname);
		CommonMethods.enterValue(Add.LastName, lname);
	}

	@Then("^I successfully added an employee$")
	public void i_successfully_added_an_employee() {
		CommonMethods.click(Add.SaveBtn);
		Assert.assertTrue(Add.VerifyDetails.isDisplayed());
		System.out.println("Successful Test");
		driver.close();
	}

	@When("^I go to the Employee List Page$")
	public void i_navigated_to_the_Employee_List_Page() {
		CommonMethods.click(Add.EmpList);
	}

	@When("^I search for employee with name and id of \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_search_for_employee_with_name_and_id_of_and(String EmpFullName, String EmpIDSearch) throws InterruptedException {
		CommonMethods.enterValue(Add.EmpNameSearch, EmpFullName);
		CommonMethods.enterValue(Add.IdSearch, EmpIDSearch);
		CommonMethods.click(Add.SearchBtn);
		Thread.sleep(3000);
	}

	@When("^Search results table appears$")
	public void search_results_table_appears() {
		List<WebElement> searchTables = driver.findElements(By.xpath("//table[@id='resultTable']/tbody"));
		for (int i = 1; i <= searchTables.size(); i++) {
			WebElement searchTable = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + i + "]"));
			rawData1 = searchTable.getText();

		}
	}

	@When("^selected employee \"([^\"]*)\"$")
	public void selected_employee(String SearchEmpTable) {

		if (rawData1.contains(SearchEmpTable)) {
			CommonMethods.click(Add.ViewEmp);
		}

	}

	@Then("^I navigated to the employee profile$")
	public void i_navigated_to_the_employee_profile() {
		Assert.assertTrue(Add.VerifyDetails.isDisplayed());
	}

	@Then("^I can edit Employee information$")
	public void i_can_edit_Employee_information() {
		CommonMethods.click(Add.EditBtn);
		Assert.assertTrue(Add.EmpIdVerify.isDisplayed());
		System.out.println("Successful Test");
		driver.close();
	}

	@Then("^I should be able to delete that employee \"([^\"]*)\"$")
	public void i_should_be_able_to_delete_that_employee(String value1) throws InterruptedException {

		if (rawData1.contains(value1)) {
			Add.CheckBox.click();
			Add.DeleteBtn.click();
			Add.PopUpOkBtn.click();
	

		}

		System.out.println("Successful Test");
		driver.quit();

	}

}
