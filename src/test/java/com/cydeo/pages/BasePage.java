package com.cydeo.pages;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class BasePage {

    public BasePage() {

        PageFactory.initElements(Driver.getDriver(),this);

    }

    // this method helps to click one of the tabs(Message, Task, Event, More)
    public void chooseTab(String tabName){
        WebElement tab = Driver.getDriver().findElement(By.xpath("//span[.='"+tabName+"']"));
        tab.click();
    }

    // this method helps to select one of the tabs under More tab
    public void subTabsMore(String subTabName){
        chooseTab("More");

        WebElement subTab = Driver.getDriver().findElement(By.xpath("//span[.='"+subTabName+"']"));
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

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement titleFrame;

    public void setTitle(String title){

        Driver.getDriver().switchTo().frame(titleFrame);
        WebElement titleInput = Driver.getDriver().findElement(By.xpath("//body[@contenteditable='true']"));
        titleInput.sendKeys(title);

    }
    public void setle(String title){



    }



}
