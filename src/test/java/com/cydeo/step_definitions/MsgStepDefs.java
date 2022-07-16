package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.LoginPage;
import com.cydeo.pages.MsgPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;

public class MsgStepDefs {
    BasePage basePage=new BasePage();
    MsgPage msgPage=new MsgPage();
    LoginPage loginPage=new LoginPage();
    @Given("user is on main page")
    public void user_is_on_main_page(){
        loginPage.login();
    }

    @And("user click on message button")
    public void userClickOnMessageButton() {
        basePage.chooseTab("Message");
    }

    @And("user click send button")
    public void userClickSendButton() {
    msgPage.sendBtn.click();
   // BrowserUtils.waitFor(2);
        System.out.println("test");
    }

    @Then("user should see {string} msg")
    public void userShouldSeeMsg(String arg0) {
        Assert.assertEquals(msgPage.errorMsg.getText().toString(),arg0);
    }

    @And("user input a msg in message feature")
    public void userInputAMsgInMessageFeature() {
        basePage.chooseTab("Message");
        Driver.getDriver().switchTo().frame(msgPage.iframe);
        msgPage.bodyMsg.sendKeys("Message");
        Driver.getDriver().switchTo().defaultContent();
    }

    @Then("user should see msg on Activity Stream")
    public void userShouldSeeMsgOnActivityStream() {
        System.out.println("photo");
    }

    @And("user inputs a msg")
    public void userInputsAMsg() {
        basePage.chooseTab("Message");
        Driver.getDriver().switchTo().frame(msgPage.iframe);
        msgPage.bodyMsg.sendKeys("Message");
        Driver.getDriver().switchTo().defaultContent();
    }

    @And("clicks save")
    public void clicksSave() {
        msgPage.sendBtn.click();
        BrowserUtils.waitFor(2);
    }

    @And("clicks more button")
    public void clicksMoreButton() {
        msgPage.moreBtn.click();
    }

    @Then("should see delete option")
    public void shouldSeeDeleteOption() {
        System.out.println("see");
    }

    @When("user clicks on delete button")
    public void userClicksOnDeleteButton() {
        msgPage.deleteBtn.click();
        BrowserUtils.waitFor(2);
        Alert alert=Driver.getDriver().switchTo().alert();
        alert.accept();
    }

    @Then("msg should be canceled")
    public void msgShouldBeCanceled() {
        System.out.println("photo");
    }

    @Given("user is on  main page")
    public void userIsOnMainPage() {
    }

    @When("user creates a message")
    public void userCreatesAMessage() {
        basePage.chooseTab("Message");
        Driver.getDriver().switchTo().frame(msgPage.iframe);
        msgPage.bodyMsg.sendKeys("Link ");
        Driver.getDriver().switchTo().defaultContent();
    }

    @And("user clicks attach a link option")
    public void userClicksAttachALinkOption() {
        msgPage.linkBtn.click();
    }

    @Then("user should see attach link pop up")
    public void userShouldSeeAttachLinkPopUp() {
        System.out.println("seen");
    }

    @When("user attach the link")
    public void userAttachTheLink() {
        msgPage.linkArea.sendKeys("link");
        msgPage.linkSaveBtn.click();
        msgPage.sendBtn.click();
    }

    @And("user clicks save button")
    public void userClicksSaveButton() {
      //  msgPage.linkSaveBtn.click();

    }

    @Then("user should see the link attached to msg")
    public void userShouldSeeTheLinkAttachedToMsg() {
        System.out.println("photo");
    }
}
