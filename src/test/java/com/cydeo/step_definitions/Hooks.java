package com.cydeo.step_definitions;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.security.PublicKey;

public class Hooks {
    public static final Logger LOG = LogManager.getLogger();
    //cucumber before annotation applies before each scenario
    @Before
    public void setUp(){
        Driver.getDriver().get(ConfReader.getProperty("env"));
        LOG.info("Test is starting");

    }
    //cucumber after annotation applies after each scenario
    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()) {
            byte[] screenShots = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShots, "image/png", scenario.getName());
        }
       Driver.closeDriver();
        LOG.info("Test finished");

    }

    //cucumber before annotation with @db value applies before each scenario that has @db tag
    @Before (value = "@db")
    public void setUpDB(){
        System.out.println("Before annotation running");

    }


    @After ("@db")
    public void tearDownDB(){
        System.out.println("After annotation running");

    }

    //applies before of each step of test scenario
    @BeforeStep
    public void setUpStep(){


    }

    //applies each step of scenario for example for taking screenshot
    @AfterStep
    public void tearDownStep(){


    }
    @AfterStep
    public void waitForAsec(){
        BrowserUtils.waitFor(1);
    }
}
