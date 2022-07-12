package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.apache.poi.xddf.usermodel.text.XDDFParagraphBulletProperties;
import org.junit.runner.manipulation.Ordering;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
    public TaskPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//iframe[@class='bx-editor-iframe'])[2]")
    public WebElement taskIframe;
    @FindBy(xpath = "//input[@data-bx-id='task-edit-title']")
    public WebElement taskThingToDoArea;
    @FindBy(xpath = "//input[@data-bx-id='task-edit-priority-cb']")
    public WebElement highPriorityCheckBox;
    @FindBy(xpath = "(//input[@data-bx-id='datepicker-display'])[1]")
    public WebElement deadlineArea;
    @FindBy(xpath = "//span[text()='Time planning']")
    public WebElement timePlanningBtn;
    @FindBy(xpath = "//span[text()='Options']")
    public WebElement optionsBtnTask;
    @FindBy(xpath = "//span[text()='Checklist']")
    public WebElement checklistTask;
    @FindBy(xpath = "//div[@class='task-additional-alt-more']")
    public WebElement moreBtnTask;
    @FindBy(id = "#blog-submit-button-cancel")
    public WebElement cancelBtnTask;
    @FindBy(xpath = "//span[text()='Select']")
    public WebElement deadlineSelectBtn;
    @FindBy(xpath = "//input[@data-bx-id='dateplanmanager-duration']")
    public WebElement durationArea;
    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendBtn;
    @FindBy(xpath = "(//input[@data-bx-id=\"datepicker-display\"])[2]")
    public WebElement startTasOn;
    @FindBy(xpath = "(//input[@data-bx-id=\"datepicker-display\"])[3]")
    public WebElement finishArea;
    @FindBy(xpath = "//div[@class='feed-create-task-popup-title']")
    public WebElement popUp;
}
