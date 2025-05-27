package org.pom_Pages;

import org.GenericMethod.GenericMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAppointmentPage {
	WebDriver driver;
	GenericMethod gm = new GenericMethod();
	

	// CONSTRUCTOR
	public BookAppointmentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//ion-select[@name='selectService']")
	private WebElement selectServiceDropdown;
	
	@FindBy(xpath = "//h6[normalize-space()='In Person Consultation']//parent::label//parent::ion-col//input[@name='consultationType']")
	private WebElement InPersonRadioBtn;
	
	@FindBy(xpath = "//textarea[@name='medicalComplaint']")
	private WebElement MedicalComplaintInputBox;
	
	@FindBy(xpath = "//ion-select[@name='department']")
	private WebElement Department;
	
	@FindBy(xpath = "//ion-select[@name='subDepartment']")
	private WebElement SubDepartment;
	
	
	
	public void SelectService() {
		gm.elementClick(selectServiceDropdown);
	}
	
	public void selectoption(String optionText) {
		WebElement serviceoption = driver.findElement(By.xpath(String.format("//ion-list[contains(@class, 'ion-select-popover')]//ion-radio[text()='%s']", optionText)));
	    gm.elementClick(serviceoption);
	}
	
	public void InPersonRadioBtn() {
		gm.elementClick(InPersonRadioBtn);
	}
	
	public void DescribeMedicalComplaint(String complaint) throws InterruptedException{
		gm.setText(MedicalComplaintInputBox,complaint);
	}
	
	public void Departmentdropdown() {
		gm.elementClick(Department);
	}
	
	public void SubDepartmentdropdown() {
		gm.elementClick(SubDepartment);
	}
	
	public void selectDepartmentOption(String departmentName) {
	   WebElement department= driver.findElement(By.xpath(String.format("//ion-list[@role='list']//ion-item//ion-radio[normalize-space()='%s']", departmentName)));
	   gm.elementClick(Department);  
	}
	



	


}
