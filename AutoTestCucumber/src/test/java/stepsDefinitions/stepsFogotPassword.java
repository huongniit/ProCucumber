package stepsDefinitions;

import HomePage.PageObject;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class stepsFogotPassword {

    WebDriver driver;
    PageObject pageObject;

    @Before
    public void init()
    {
        System.setProperty("webdriver.chrome.driver","src\\test\\resources\\driver\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.pageObject = new PageObject(this.driver);
    }
    @After
    public void after()
    {
        this.driver.quit();
    }

    @Given("^The homepage is showed$")
    public void the_homepage_is_showed()  {
        this.pageObject.Openpage();
    }

    @When("^The email is blank$")
    public void the_email_is_blank() {
        this.pageObject.txtEmailFogot.sendKeys("");
        this.pageObject.txtEmailFogot.sendKeys(Keys.ENTER);
    }

    @When("^The email input is \"([^\"]*)\"$")
    public void the_email_input_is_something(String email) {
        this.pageObject.txtEmailFogot.sendKeys(email);
        this.pageObject.txtEmailFogot.sendKeys(Keys.ENTER);
        this.pageObject.btlClose.click();
    }

    @Then("^The message \"([^\"]*)\" is showed$")
    public void the_message_something_is_showed(String message) {
        this.pageObject.GetMessEmailFogot();
    }

    @Then("^The message is showed \"([^\"]*)\"$")
    public void the_message_is_showed_something(String messagePopup)  {
        this.pageObject.GetPopupFogotEmail();
    }

}
