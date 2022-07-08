package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MsgPage {
    public MsgPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(css = ".bx-editor-iframe")
    public WebElement iframe;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement bodyMsg;
    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendBtn;
    @FindBy(xpath = "(//span[@class='feed-post-more-text'])[1]")
    public WebElement moreBtn;
    @FindBy(xpath = "//span[text()=\"Delete\"]")
    public WebElement deleteBtn;
    @FindBy(xpath = "//span[@title='Link']//i")
    public WebElement linkBtn;
    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-href']")
    public WebElement linkArea;
    @FindBy(xpath = "//input[@value='Save']")
    public WebElement linkSaveBtn;
    @FindBy(xpath = "//span[@class='feed-add-info-text']")
    public WebElement errorMsg;



}
