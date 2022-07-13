package org.pages;

import org.base.Global;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Global {

//	public static String Readuserdata()
//	{
//		String name = readPropertyFileData().getProperty("FirstName1");
//		return name;
//	}
//	public static String name = Readuserdata();
//
//	public static String usernamexpath = "//*[contains(text(),"\"name\"")]";
	@FindBy(xpath = "//*[@placeholder='User Name']")
	private WebElement userName;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginCTA;
//Create company
	@FindBy(xpath = "//button[@title='Create Company']")
	private WebElement CreateCompany;

	@FindBy(xpath = "//button[text()='Create New Job']")
	private WebElement CreateNewJobButton;

	@FindBy(xpath = "//*[@placeholder='Job Name']")
	private WebElement getjobname;

	@FindBy(xpath = "//input[@id='express']")
	private WebElement Highp;

	@FindBy(xpath = "//input[@id='active']")
	private WebElement Active;

	@FindBy(xpath = "//input[@id='onscreenentry']")
	private WebElement Onscreen;

	@FindBy(xpath = "//input[@placeholder='Domain Name']")
	private WebElement DomainName;

	@FindBy(xpath = "//input[@placeholder='Country Code']")
	private WebElement CountryCode;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement Submitbutton;

	@FindBy (xpath = "//button[text()='Yes']")
	private WebElement YesButton;

	@FindBy(xpath = "//button[text()='Refresh']")
	private WebElement RefreshButton;

	@FindBy(xpath = "(//input[@type='radio'])[3]")
	private WebElement Allbutton;
	@FindBy(xpath = "(//*[@class='page-link'])[3]")
	private WebElement Scrolldown;

	@FindBy(xpath = "//*[contains(text(),'Task Dashboard')]")
	private WebElement Scrollup;

	@FindBy(xpath = "//*[contains(text(),'Choose File')]")
	private WebElement Choosefile;

	@FindBy(xpath = "(//*[@title='Download Results'])[1]")
	private WebElement DownloadCSV;

	public LoginPage() throws Throwable {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginCTA() {
		return loginCTA;
	}

	public WebElement CreateCompany()
	{
		return CreateCompany;
	}
	public WebElement CreateNewJobButton()
	{
		return CreateNewJobButton;
	}

	public WebElement getjobname()
	{
		return getjobname;
	}

	public WebElement Highp()
	{
		return Highp;
	}

	public WebElement Active()
	{
		return Active;
	}

	public WebElement Onscreen()
	{
		return Onscreen;
	}
	public WebElement DomainName()
	{
		return DomainName;

	}
	public WebElement CountryCode()
	{
		return CountryCode;
	}

	public WebElement Submitbutton()
	{
		return Submitbutton;
	}

	public WebElement YesButton()
	{
		return YesButton;
	}

	public WebElement RefreshButton()
	{
		return RefreshButton;
	}

	public WebElement Allbutton()
	{
		return Allbutton;
	}
//	public WebElement getScrolldown() {
//		return Scrolldown;
//	}
//
//	public WebElement getScrollup() {
//		return Scrollup;
//	}
	public WebElement Choosefile() {
		return Choosefile;
	}

	public WebElement DownloadCSV()
	{
		return DownloadCSV;
	}
	}


