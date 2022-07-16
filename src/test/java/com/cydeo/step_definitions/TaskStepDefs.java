package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.LoginPage;
import com.cydeo.pages.TaskPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.formula.functions.T;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class TaskStepDefs {
BasePage basePage=new BasePage();
LoginPage loginPage=new LoginPage();
TaskPage taskPage=new TaskPage();
    @Given("user click Task feature")
    public void user_click_task_feature() {loginPage.login();
        basePage.chooseTab("Task");
    }
    @Given("user click checklist")
    public void user_click_checklist() {
        taskPage.taskThingToDoArea.click();

    }
    @Given("user add an item to checklist")
    public void user_add_an_item_to_checklist() {
        taskPage.taskThingToDoArea.sendKeys("Task");
    }
    @Given("user click on deadline field")
    public void user_click_on_deadline_field() {
        taskPage.deadlineArea.click();
    }
    @Given("user choose date and time")
    public void user_choose_date_and_time() {
       taskPage.deadlineSelectBtn.click();
    }
    @Given("user click on Time planning")
    public void user_click_on_time_planning() {
       taskPage.timePlanningBtn.click();
    }
    @Given("user click on Start Task On")
    public void user_click_on_start_task_on() {
       taskPage.startTasOn.click();
       taskPage.deadlineSelectBtn.click();
    }
    @Given("user click on Duration in day")
    public void user_click_on_duration_in_day() {
        taskPage.durationArea.click();
       taskPage.durationArea.sendKeys("1");
    }
    @Given("user click on Finish")
    public void user_click_on_finish() {
       taskPage.finishArea.click();
       taskPage.deadlineSelectBtn.click();
    }
    @Given("user select date and time")
    public void user_select_date_and_time() {
        System.out.println("comes auto");
        taskPage.sendBtn.click();
    }
    @Then("user should see {string} pop up")
    public void user_should_see_pop_up(String string) {
        Assert.assertEquals(string, taskPage.popUp.getText());
    }

}
