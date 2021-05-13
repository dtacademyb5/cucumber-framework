package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    // Cucumber Hooks run before and after each SCENARIO

    @Before
    public void setupScenario(){
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Driver.getDriver().manage().window().maximize();

    }


    @After
    public void tearDownScenario(){
        Driver.quitDriver();
    }


}
