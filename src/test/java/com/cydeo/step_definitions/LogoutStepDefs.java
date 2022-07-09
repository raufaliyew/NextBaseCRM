package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LogoutStepDefs {
BasePage basePage=new BasePage();
LoginPage loginPage=new LoginPage();
    @Given("user is on login page and logs in")
    public void user_is_on_login_page_and_logs_in() {
        loginPage.login();
    }
    @Given("user click user button")
    public void user_should_be_in_main_page() {
        basePage.clickUserBtn();
    }
    @Given("user click logout button")
    public void user_click_logout_button() {
       basePage.logOutBtn.click();
    }
    @Then("user should be on login page")
    public void user_should_be_on_login_page() {
        System.out.println("login page");
    }



}
