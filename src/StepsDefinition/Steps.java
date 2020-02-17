package StepsDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	WebDriver driver;
	
	@Given("^Open the Chrome and launch the application$")
	public void open_the_Chrome_and_launch_the_application() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.close();
	//    throw new cucumber.api.PendingException();
	}

	@When("Clicking the Company Single Sign-On")
	public void clicking_the_Company_Single_Sign_On() {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new cucumber.api.PendingException();
	}

	@When("Fill Username and Password")
	public void fill_Username_and_Password() {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new cucumber.api.PendingException();
	}

	@When("Click Sign and No")
	public void click_Sign_and_No() {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new cucumber.api.PendingException();
	}

	@Then("Login Sign in page")
	public void login_Sign_in_page() {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new cucumber.api.PendingException();
	}

	@Given("User sign Out")
	public void user_sign_Out() {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new cucumber.api.PendingException();
	}

	@When("Click Drop Down")
	public void click_Drop_Down() {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new cucumber.api.PendingException();
	}

	@When("Click Sign Out")
	public void click_Sign_Out() {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new cucumber.api.PendingException();
	}

	@When("Click Confirm")
	public void click_Confirm() {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new cucumber.api.PendingException();
	}

	@Then("Logged Out")
	public void logged_Out() {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new cucumber.api.PendingException();
	}
	
	
}
