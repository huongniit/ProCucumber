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
import sun.security.util.PendingException;

import static org.junit.Assert.*;

public class StepDefinitionEuroland {

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
    public void finish(){
        this.driver.quit();
    }

    @Given("^The homepage is showed$")
    public void the_homepage_is_showed(){
        this.pageObject.Openpage();
    }

    @When("^The user input with email \"([^\"]*)\" is invalid$")
    public void the_user_input_with_email_something_is_invalid(String email)  {
        this.pageObject.txtUsername.sendKeys(email);
        this.pageObject.txtPassword.sendKeys("");
        this.pageObject.txtPassword.sendKeys(Keys.ENTER);
    }

    @Then("^The message \"([^\"]*)\" is showed$")
    public void the_message_something_is_showed(String msg)  {
        this.pageObject.GetMessageError();
    }

    @When("^The user input password \"([^\"]*)\"$")
    public void the_user_input_password_something(String passWord){
        this.pageObject.txtPassword.sendKeys("");
        this.pageObject.txtUsername.sendKeys(passWord);
        this.pageObject.txtPassword.sendKeys(Keys.ENTER);
    }

    @When("^User, Pass are blank$")
    public void user_pass_are_blank(){
        this.pageObject.txtPassword.sendKeys("");
        this.pageObject.txtUsername.sendKeys("");
        this.pageObject.txtPassword.sendKeys(Keys.ENTER);
    }

    @When("^The user input user \"([^\"]*)\" and passWord \"([^\"]*)\"$")
    public void the_user_input_user_something_and_password_something(String userName, String passWord) {
        this.pageObject.txtPassword.sendKeys(userName);
        this.pageObject.txtUsername.sendKeys(passWord);
        this.pageObject.txtPassword.sendKeys(Keys.ENTER);
    }

    @Then("^The Customer Interface 2 will showed $")
    public void the_customer_interface_2_will_showed() {
        throw new PendingException();
    }


    //

}
