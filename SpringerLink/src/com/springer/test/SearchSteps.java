package com.springer.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchSteps {
	WebDriver driver = new FirefoxDriver();
	
	@Given("^I am in search page of Springer$")
	public void I_am_in_search_page_of_Springer() throws Throwable {
		
		driver.get("http://link.springer.com/");
		//driver.manage().window().maximize();
		
	}

	@When("^I enter valid keyword (.*) in search text box$")
	public void I_enter_valid_keyword_in_search_text_box(String search_txt) throws Throwable {
		WebElement txt_Search = driver.findElement(By.id("query"));
	    txt_Search.sendKeys(search_txt);
	}

	@When("^Click on Search button$")
	public void Click_on_Search_button() throws Throwable {
		WebElement btn_Search = driver.findElement(By.id("search"));
	    btn_Search.click();
	}

	@Then("^I can see the list of results$")
	public void I_can_see_the_list_of_results() throws Throwable {
		
		
		
	}


}
