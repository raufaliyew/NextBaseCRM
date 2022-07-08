package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class SearchFeatureStepDefinitions extends BasePage {

    LoginPage loginPage = new LoginPage();
    Faker faker= new Faker();


    @Given("hr user is on the Home page")
    public void hr_user_is_on_the_home_page() {
        loginPage.login();
    }
    @When("User enters a valid info \\(employee,doc,post,task) {string}in the search box")
    public void userEntersAValidInfoEmployeeDocPostTaskInTheSearchBox(String selection) {
        searchBox.click();
        searchBox.sendKeys(selection);
    }

    @And("User hits enter button")
    public void userHitsEnterButton() {

//      Actions actions=new Actions(Driver.getDriver());
//        BrowserUtils.waitFor(3);
//      actions.moveToElement(searchBox).click().sendKeys(Keys.ENTER).perform();
        BrowserUtils.waitFor(3);
        searchBox.sendKeys(Keys.ENTER);
    }


    @Then("User can see {string} is in the Title")
    public void userCanSeeIsInTheTitle(String string) {
    BrowserUtils.verifyTitle(string);
    }

    @When("User enters a invalid info in the search box")
    public void user_enters_a_invalid_info_in_the_search_box() {
        searchBox.click();
        searchBox.sendKeys(faker.animal().name());
    }
    @Then("User can see {string}")
    public void user_can_see(String expectedMessage) {
        String actual= invalidSearch.getText();
        Assert.assertEquals(expectedMessage,actual);
    }
}
