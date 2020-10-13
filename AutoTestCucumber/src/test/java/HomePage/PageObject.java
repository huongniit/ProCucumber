package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class PageObject
{

    @FindBy (css = "input[name=UserName]")
    public WebElement txtUsername;
    @FindBy(css = "input[type=password]")
    public WebElement txtPassword;
    @FindBy(css = "div.text-center")
    public WebElement imgTextCenter;

    @FindBy(css = "input[name=UserEmail]")
    public WebElement txtEmailFogot;
    @FindBy(css = "a[class *=btn-default]")
    public WebElement btlClose;

    By lblMessage = By.cssSelector("span[data-valmsg-for=\"UserName\"]");

    By lblMessageFogotEmail = By.cssSelector("div.field-validation-error");

    By popUpFogotEmail = By.cssSelector("p[class*= after-message]");
    WebDriver driver;
    public PageObject(WebDriver driver)
    {
        this.driver = driver;

    }

    public void Openpage()
    {
        this.driver.get("https://dev.vn.euroland.com/tools/customerinterface2");
        this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        PageFactory.initElements(this.driver, this);
    }

    public String GetMessageError()
    {
        WebDriverWait driverWait = new WebDriverWait(this.driver, 20);
        String msg = driverWait.until(ExpectedConditions.visibilityOfElementLocated(lblMessage)).getText();
        return msg;

    }

    public String GetMessEmailFogot()
    {
        WebDriverWait driverWait = new WebDriverWait(this.driver, 20);
        String msg = driverWait.until(ExpectedConditions.visibilityOfElementLocated(lblMessageFogotEmail)).getText();
        return msg;

    }
    public String GetMessageEmailFogot()
    {
        WebDriverWait driverWait = new WebDriverWait(this.driver, 20);
        String msg = driverWait.until(ExpectedConditions.visibilityOfElementLocated(lblMessageFogotEmail)).getText();
        return msg;

    }

    public String GetPopupFogotEmail()
    {
        WebDriverWait driverWait = new WebDriverWait(this.driver, 20);
        String msg = driverWait.until(ExpectedConditions.visibilityOfElementLocated(popUpFogotEmail)).getText();
        return msg;

    }

}
