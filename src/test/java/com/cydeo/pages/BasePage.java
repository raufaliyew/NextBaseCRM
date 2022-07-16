package com.cydeo.pages;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {

        PageFactory.initElements(Driver.getDriver(),this);

    }

    // this method helps to click one of the tabs(Message, Task, Event, More)
    public void chooseTab(String tabName){
        WebElement tab = Driver.getDriver().findElement(By.xpath("//div[@class='microblog-top-tabs-visible']//span[.='"+tabName+"']"));
        tab.click();
    }

    // this method helps to select one of the tabs under More tab
    public void subTabsMore(String subTabName){
        chooseTab("More");

        WebElement subTab = Driver.getDriver().findElement(By.xpath("//div[@class='microblog-top-tabs-visible']//span[.='"+subTabName+"']"));
        subTab.click();
    }
    /**
     * Below locator allows you to locate search box
     */

    @FindBy(id = "search-textbox-input")
    public WebElement searchBox;

    /**
     * Below locator allows you to locate "Nothing found" Element
     * once you search, it's only locating the element
     */
    @FindBy(xpath = "//div[@id='feed-empty-wrap']//div")
    public WebElement invalidSearch;

    @FindBy (xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement titleFrame;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement title;

    @FindBy(linkText = "Add question")
    public WebElement addQuestion;

    @FindBy (id = "blog-submit-button-save")
    public WebElement sendBTN;


    @FindBy (id = "blog-submit-button-cancel")
    public WebElement cancelBTN;

    @FindBy (className = "feed-add-info-text")
    public WebElement errorMSG;

    /**
    Finds last post from Activity Stream and returns text of the post
     */
    @FindBy (xpath = "(//*[@class='feed-post-text-block-inner-inner'])[1]")
    public WebElement lastPostText;



    public void setAllowMultiChoice(Integer questionNumber){
        questionNumber = questionNumber-1;
        WebElement allowMultiChoiceBtn = Driver.getDriver().findElement(By.id("multi_"+questionNumber));
        allowMultiChoiceBtn.click();
    }


    public void setQuestion(Integer questionNumber, String questionText){
        questionNumber = questionNumber-1;
//        WebElement questionField = Driver.getDriver().findElement(By.id("question_"+questionNumber));
        WebElement questionField = Driver.getDriver().findElement(By.xpath("//*[@id='question_"+questionNumber+"']"));
        questionField.click();
        questionField.sendKeys(questionText);
    }

    public void setAnswer(Integer answerNumber, Integer questionNumber, String answerText){
        questionNumber = questionNumber-1;
        answerNumber = answerNumber-1;
        WebElement answerField = Driver.getDriver().findElement(By.id("answer_"+ questionNumber+"__"+answerNumber+"_"));
        answerField.sendKeys(answerText);
    }


    public void setTitle(String title){
        Driver.getDriver().switchTo().frame(titleFrame);
        this.title.sendKeys(title);
        Driver.getDriver().switchTo().defaultContent();
    }



}
