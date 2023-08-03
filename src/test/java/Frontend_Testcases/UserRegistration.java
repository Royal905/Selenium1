package Frontend_Testcases;

import org.testng.annotations.Test;

import TestBase.JohnsonBase;

public class UserRegistration extends JohnsonBase{
		@Test(priority = 1)
		
	public void userRegistrationErrorMessageValidation() {
			application.waitForPageToLoad(driver);
			application.validateText("homePageSignin_xpath", "Sign In");
			application.click("homePageSignin_xpath");
			application.wait(5);
			application.scrollTo("signupButton_xpath");
			application.validateText("signupButton_xpath", "SIGN UP");
			application.click("signupButton_xpath");
			application.wait(5);
			application.scrollByValue("300");
			application.wait(2);
			application.click("createAccountButton_xpath");
			application.wait(3);
			application.validateFieldRequired("firstNameFieldRequired_xpath");
			application.validateFieldRequired("lastNameFieldRequired_xpath");
			application.validateFieldRequired("emailFieldRequired_xpath");
			application.validateFieldRequired("passwordFieldRequired_xpath");
			application.wait(2);
			application.type("firstname_name", readExcelData("invalid_first_name", "Create_Account"));
			application.click("lastname_name");
			application.validateErrortext("firstname_name" , "firstNameFieldRequired_xpath");
			application.type("lastname_name", readExcelData("invalid_last_name", "Create_Account"));
			application.click("email_name");
			application.validateErrortext("lastname_name" , "lastNameFieldRequired_xpath");
			application.type("email_name", readExcelData("invalid_mail_ID", "Create_Account"));
			application.click("createpassword_name");
			application.validateEmailIputField("email_name", "emailFieldRequired_xpath");
			application.wait(5);
			application.type("createpassword_name", readExcelData("invalid_password", "Create_Account"));
			application.wait(2);
			application.clickEnter("createpassword_name");
			application.wait(5);
			application.validatePassword("createpassword_name", "passwordFieldRequired_xpath");
			application.wait(3);
			application.click("cancelButton_xpath");
			application.wait(3);
			application.scrollTo("signupButton_xpath");
			application.click("signupButton_xpath");
			application.wait(5);
			application.scrollByValue("300");
			application.wait(2);
	}
		@Test(priority = 2)
		public void userRegistration() {
			application.waitForPageToLoad(driver);
			application.type("firstname_name", readExcelData("valid_first_name", "Create_Account"));
			application.click("lastname_name");
			application.wait(2);
			application.validateErrortext("firstname_name" , "firstNameFieldRequired_xpath");
			application.type("lastname_name", readExcelData("valid_last_name", "Create_Account"));
			application.click("email_name");
			application.wait(2);
			application.validateErrortext("lastname_name" , "lastNameFieldRequired_xpath");
			application.type("email_name", readExcelData("valid_mail_ID", "Create_Account"));
			application.click("createpassword_name");
			application.wait(2);
			application.validateEmailIputField("email_name", "emailFieldRequired_xpath");
			application.type("createpassword_name", readExcelData("valid_password", "Create_Account"));
			application.click("email_name");
			application.wait(2);
			application.validatePassword("createpassword_name", "passwordFieldRequired_xpath");
			application.wait(3);
		}
		
}
