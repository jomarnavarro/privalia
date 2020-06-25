package privalia;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StepDefs {

    public WebDriver driver;
    public WebDriverWait wait;

    @Before
    public void before() {

    }

    @After
    public void after() {

    }
    
    @When("I am in Privalia Home Page")
    public void iAmInPrivaliaHomePage() {
    }

    @Then("All the featured ads are up to date")
    public void allTheFeaturedAdsAreUpToDate() {
        
    }

    @Then("All the current ads are up to date")
    public void allTheCurrentAdsAreUpToDate() {
        
    }

    @Then("Coming up promotions don't have a due date")
    public void comingUpPromotionsDonTHaveADueDate() {
    }
}
