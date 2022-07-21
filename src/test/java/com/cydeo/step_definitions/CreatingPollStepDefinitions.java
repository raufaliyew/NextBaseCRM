package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CreatingPollStepDefinitions extends BasePage{

    LoginPage loginPage = new LoginPage();
    private String titleText;

    @Given("User logins with HR credentials")
    public void user_logins_with_hr_credentials() {
        loginPage.login();
    }

    @When("User clicks {string} tab")
    public void user_clicks_tab(String tabName) {
        chooseTab(tabName);
    }

    @When("User adds Title")
    public void user_adds_title() {
        titleText = "Question of the day";
       setTitle(titleText);
       BrowserUtils.waitFor(2);

    }

    @When("User adds question to question field")
    public void user_adds_question_to_question_field() {
        setQuestion(1,"Cydeo or Cybertek");
    }

    @When("User adds multiple answers to answer fields")
    public void user_adds_multiple_answers_to_answer_fields() {
        setAnswer(1,1,"Cyde");
        setAnswer(2,1,"Cybertek");
    }

    @When("User clicks Send button")
    public void user_clicks_send_button() {
        sendBTN.click();
    }
    @Then("User should see same poll with same title and same question in Activity Stream")
    public void user_should_see_same_poll_with_same_title_and_same_question_in_activity_stream() {
        Assert.assertEquals(lastPostText.getText(),titleText);
    }

    @When("User leaves empty title field")
    public void user_leaves_empty_title_field() {
        setTitle("");
    }

    @Then("User should see {string} notification")
    public void userShouldSeeNotification(String expectedErrMsg) {
        Assert.assertTrue(errorMSG.isDisplayed());
        Assert.assertEquals(errorMSG.getText(),expectedErrMsg);
    }

    @And("User enables Allow multiple Choice checkbox")
    public void userEnablesAllowMultipleChoiceCheckbox() {
        setAllowMultiChoice(1);
    }

    @Then("User should be able to select multiple answers in Activity Stream")
    public void user_should_be_able_to_select_multiple_answers_in_activity_stream() {

    }

    @When("User clicks Add question button")
    public void user_clicks_add_question_button() {

    }

    @Then("User should see new QA fields")
    public void user_should_see_new_qa_fields() {

    }

    @When("User clicks Cancel button")
    public void user_clicks_cancel_button() {

    }

    @Then("User should see active tab is Message")
    public void user_should_see_active_tab_is_message() {

    }



}
