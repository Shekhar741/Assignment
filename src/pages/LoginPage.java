package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	@FindBy(xpath="//a[@id='uh-signin']")
	private WebElement signIn;
	@FindBy(xpath="//a[contains(text(),'Sign')]")
	private WebElement signUp;
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement firstNameTB;
	@FindBy(xpath="//input[@name='lastName']")
	private WebElement sirNameTB;
	@FindBy(xpath="//input[@name='yid']")
	private WebElement emailTB;
	@FindBy(xpath="//input[@name='phone']")
	private WebElement mobNoTB;
	@FindBy(xpath="//select[@id='usernamereg-month']")
	private WebElement month;
	@FindBy(xpath="//input[@id='usernamereg-day']")
	private WebElement day;
	@FindBy(xpath="//input[@id='usernamereg-year']")
	private WebElement year;
	@FindBy(xpath="//input[@name='freeformGender']")
	private WebElement gender;
	@FindBy(xpath="//button[.='Continue']")
	private WebElement continueBTN;

}
