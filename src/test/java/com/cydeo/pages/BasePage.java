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
        WebElement tab = Driver.getDriver().findElement(By.xpath("//span[.='"+tabName+"']"));
        tab.click();
    }

    // this method helps to select one of the tabs under More tab
    public void subTabsMore(String subTabName){
        chooseTab("More");

        WebElement subTab = Driver.getDriver().findElement(By.xpath("//span[.='"+subTabName+"']"));
        subTab.click();
    }
    /*Below method is to be used to click on userprofile feature
    Just need to call method with obj (see line 57 for locator)
     */
    public void clickUserBtn(){
        this.userBtn.click();
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

    /*
     * Below locator is for button with current user,that enables to choose logout button
     Options:My Profile,Edit Profile settings,Themes,Configurations and LOG OUT
     * see line 32 for method to be used
     */

    @FindBy(xpath = "//span[@id='user-name']")
    public WebElement userBtn;
     /*
     Below is locator for logout button
     */

    @FindBy(xpath = "//span[text()='Log out']")
    public WebElement logOutBtn;

}
