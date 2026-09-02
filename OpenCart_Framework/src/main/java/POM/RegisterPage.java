package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BasePage;

public class RegisterPage extends BasePage {
	
	
	
	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="input-firstname")
	private WebElement firstNameField;
	
	@FindBy(id="input-lastname")
	private WebElement lastNameFeild;
	
	@FindBy(id="input-email")
	private WebElement emailFeild;
	
	@FindBy(id="input-telephone")
	private WebElement telephoneFeild;
	
	@FindBy(id="input-password")
	private WebElement passwordFeild;
	
	@FindBy(id="input-confirm")
	private WebElement conformPasswordFeild;
	
	@FindBy(name="agree")
	private WebElement agreeCheckBox;
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement continueButton;
	
	@FindBy(xpath="//h1[text()='Your Account Has Been Created!']")
	private WebElement msgConfirnmation;
	
	//
	public String getConfiramationMsg() {
		try {
		return (msgConfirnmation.getText());//return confirmation text
		}catch(Exception e) {
			return (e.getMessage());//return the exception
		}
		
	}
	
	
	
	
	public void enterFirstName(String firstname) {
		firstNameField.sendKeys(firstname);
	}
	
	
	
	public void enterlastFirstName(String lastname) {
		lastNameFeild.sendKeys(lastname);
	}
	
	
	
	public void enterEmail(String email) {
		emailFeild.sendKeys(email);
	}
	
	
	
	public void enterTelephone(String telephone) {
		telephoneFeild.sendKeys(telephone);
	}
	
	
	public void enterPassword(String password) {
		passwordFeild.sendKeys(password);
	}

	
	public void enterConfirmPassword(String confirmpassword) {
		conformPasswordFeild.sendKeys(confirmpassword);
	}
	
	
	public void clickOnAgreeCheckBox() {
		agreeCheckBox.click();	
	}
	
	public void clickOnContinue() {
		continueButton.click();
	}




	public WebElement getFirstNameField() {
		return firstNameField;
	}




	public WebElement getLastNameFeild() {
		return lastNameFeild;
	}




	public WebElement getEmailFeild() {
		return emailFeild;
	}




	public WebElement getTelephoneFeild() {
		return telephoneFeild;
	}




	public WebElement getPasswordFeild() {
		return passwordFeild;
	}




	public WebElement getConformPasswordFeild() {
		return conformPasswordFeild;
	}




	public WebElement getAgreeCheckBox() {
		return agreeCheckBox;
	}




	public WebElement getContinueButton() {
		return continueButton;
	}




	public WebElement getMsgConfirnmation() {
		return msgConfirnmation;
	}
	
	
	
	
//	public AccountSuccessPage clickOnContinueButton() {
//		continueButton.click();
//		return new AccountSuccessPage(driver);
//	}

}
