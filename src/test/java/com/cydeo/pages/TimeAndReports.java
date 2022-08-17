package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class TimeAndReports {

    public TimeAndReports(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    /**
     * Below method locates Day/Week or Month from
     * Times and Reports feature.
     */
    public void dayWeekMonth(String argument){
        String argument2= argument.substring(0,1).toUpperCase()+argument.substring(1);
        WebElement element = Driver.getDriver().findElement(By.xpath("//a[contains(@id,'"+argument+"')]//span[contains(text(),'"+argument2+"')]"));
        element.click();
    }
    
}
