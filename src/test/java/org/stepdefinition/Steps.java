package org.stepdefinition;

import com.github.dockerjava.api.model.HealthCheck;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en_scouse.An;
import org.apache.log4j.Logger;
import org.apache.velocity.runtime.directive.contrib.For;
import org.base.Global;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.pagemanager.PageObjectManager;
import org.testng.Assert;

import com.aventstack.extentreports.GherkinKeyword;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import javax.swing.*;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Steps extends Global {
	public static Logger log;
	public static WebDriver driver;
	public static List<String> Contactlist, Comparelist;


	//	@Given("Launch the url")
//	public void launch_the_url() {
//		driver = getDriver();
//		maximizeWindow();
//		implicitWait();
//		launchURL(readPropertyFileData().getProperty("url"));
//	}
	@Given("Launch the url")
	public void launch_the_url() throws Throwable {
		driver = getDriver();
		maximizeWindow();
		implicitWait();
		launchURL(ReadDatafromJson("Contact_Name", "url"));
	}
//
//	@When("Enter Valid Username")
//	public void i_enter_the_username() throws Throwable {
//		log = readLog4jData();
//		log.info("User is navigate to Salesforce site");
//		enterData(PageObjectManager.getInstance().getLoginPage().getUserName(),
//				readPropertyFileData().getProperty("UserName"));
//		log.info("User enter the correct username");
//	}

	@And("Enter valid Username")
	public void i_enter_the_username() throws Throwable {
		log = readLog4jData();
		log.info("User is navigate to Salesforce site");
		enterData(PageObjectManager.getInstance().getLoginPage().getUserName(),
				ReadDatafromJson("Contact_Name", "UserName"));
		log.info("User enter the correct username");
	}

	//	@When("Enter Valid Password")
//	public void i_enter_the_password() throws Throwable {
//		enterData(PageObjectManager.getInstance().getLoginPage().getPassword(),
//				readPropertyFileData().getProperty("Password"));
//		log.info("User enter the correct password");
//	}
	@And("Enter Valid Password")
	public void i_enter_the_password() throws Throwable {
		enterData(PageObjectManager.getInstance().getLoginPage().getPassword(),
				ReadDatafromJson("Contact_Name", "Password"));
		log.info("User enter the correct password");
	}

	@And("click on Login button")
	public void i_click_on_login_button() throws Throwable{
		clickButton(PageObjectManager.getInstance().getLoginPage().getLoginCTA());
		log.info("User is successfully logged in");
	}

	@When("Click on Create company button")
	public void i_click_on_create_company_button() throws Throwable{
		clickButton(PageObjectManager.getInstance().getLoginPage().CreateCompany());
		log.info("User clicked on create company button");
		Thread.sleep(3000);
	}

	@And("User click on CreateNewJob Button")
	public void i_click_on_create_new_job_button() throws Throwable{
		clickButton(PageObjectManager.getInstance().getLoginPage().CreateNewJobButton());
		log.info("User clicked on create new job button");
		Thread.sleep(3000);
	}

	@And("User enter jobname")
	public void i_entered_jobname() throws Throwable{
		enterData(PageObjectManager.getInstance().getLoginPage().getjobname(),
				ReadDatafromJson("Contact_Name", "JobName"));
		log.info("User enter the jobname");
		Thread.sleep(3000);
	}

	@And("User Select Priority")
	public void i_select_high_priority() throws Throwable{
		clickButton(PageObjectManager.getInstance().getLoginPage().Highp());
		log.info("User selected High priority");
	implicitWait();
	}

	@And("User select active")
	public void i_select_active_in_company_status() throws Throwable{
		clickButton(PageObjectManager.getInstance().getLoginPage().Active());
		log.info("user selected active in company status");
	}

	@And("User select Onscreen")
	public void i_select_on_screen_in_activity() throws Throwable{
		clickButton(PageObjectManager.getInstance().getLoginPage().Onscreen());
		log.info("User selected on screen in activity");
	}

	@And("User Enter Valid Domain Name")
	public void i_enter_valid_domain() throws Throwable{
		enterData(PageObjectManager.getInstance().getLoginPage().DomainName(),
				ReadDatafromJson("Contact_Name", "Domain_Name"));
		log.info("User entered valid domainname");
	}

	@And("User Enter Country code")
	public void i_enter_valid_counrty_code() throws Throwable{
		enterData(PageObjectManager.getInstance().getLoginPage().CountryCode(),
				ReadDatafromJson("Contact_Name","Country_Code"));
		log.info("User entered Country Code");
		Thread.sleep(3000);
	}

	@And("Click on Submit Button")
	public void i_click_on_submit_button() throws Throwable{
		clickButton(PageObjectManager.getInstance().getLoginPage().Submitbutton());
		log.info("User clicked on Submit button");
		Thread.sleep(3000);
	}

	@And("Click on Yes Button")
	public void i_click_on_yes_button() throws Throwable{
		clickButton(PageObjectManager.getInstance().getLoginPage().YesButton());
		log.info("User clicked on Yes button");
		Thread.sleep(5000);
	}

	@And("Refresh the page")
	public void i_click_on_refresh_button() throws Throwable{
		clickButton(PageObjectManager.getInstance().getLoginPage().RefreshButton());
		log.info("User clicked on refresh button");
		Thread.sleep(5000);
	}
	 @And("Click on AllButton")
	 public void i_click_on_all_button() throws Throwable{
		clickButton(PageObjectManager.getInstance().getLoginPage().Allbutton());
		log.info("User clicked on All button");
		Thread.sleep(5000);
	 }

//	@And("Move the Orchestration Website Screen Down")
//	public void I_Scroll_down_Screen() throws Throwable {
//		Thread.sleep(5000);
//		Scrollpup(PageObjectManager.getInstance().getLoginPage().getScrolldown());
//	}
//	@And("Move the Orchestration Website Screen Up")
//	public void I_Scroll_Up_Screen() throws Throwable {
//		Thread.sleep(5000);
//		Scrollpup(PageObjectManager.getInstance().getLoginPage().getScrollup());
//	}

	@And("Click On Browse Button")
	public void I_Click_Browse() throws Throwable {
		Thread.sleep(5000);
		clickButton(PageObjectManager.getInstance().getLoginPage().Choosefile());
		log.info("Click On Browse Button");
	}
	@And("Upload File From Local Directory")
	public void I_Upload_File_Directory() throws Throwable {
		Thread.sleep(5000);
		uploadfilefromlocal("D:\\Create company_12-07\\CC_1.csv");
		Thread.sleep(5000);
	}

	@And("Download the Uploaded CSV")
	public void I_click_on_download_button() throws Throwable{
		clickButton(PageObjectManager.getInstance().getLoginPage().DownloadCSV());
		Thread.sleep(3000);
	}
}