package com.transavia.bdd.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class TransaviaTestSteps {

    public WebDriver webDriver = null;

    @Given("^User is registered on Transavia$")
    public void userIsRegisteredOnTransavia() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^on Logon page \"([^\"]*)\"$")
    public void onLogonPage(String arg0) throws Throwable {

        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get(arg0);

        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @And("^User provide registered user ID \"([^\"]*)\"$")
    public void userProvideRegisteredUserID(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();

        webDriver.findElement(By.id("loginID")).sendKeys(arg0);
    }

    @And("^User provide password \"([^\"]*)\"$")
    public void userProvidePassword(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        webDriver.findElement(By.id("password")).sendKeys(arg0);
    }

    @And("^user click on Login Button \"([^\"]*)\"$")
    public void userClickOnLoginButton(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //webDriver.findElement(By.linkText(arg0)).click();
        webDriver.findElement(By.xpath("//input[@value='Log in']")).click();
        Thread.sleep(1000);
    }

    @Then("^User is login with home page$")
    public void userIsLoginWithHomePage() throws Throwable {
        List<WebElement> list = webDriver.findElements(By.xpath("//*[contains(text(),'" + "Hi Sapana" + "')]"));
        Assert.assertTrue("Text not found!", list.size() > 0);
    }

    @When("^user click on \"([^\"]*)\" top menu$")
    public void userClickOnTopMenu(String arg0) throws Throwable {
        List<WebElement> text = webDriver.findElements(By.xpath("/html/body/header/nav/div[1]/div[1]/ul/li[2]/a"));//TODO
        text.get(0).click();
    }

    @Then("^\"([^\"]*)\" process dialog section is displayed$")
    public void processDialogSectionIsDisplayed(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^user click on \"([^\"]*)\" top icon$")
    public void userClickOnTopIcon(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^home page is displayed$")
    public void homePageIsDisplayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^Flight search page is available$")
    public void flightSearchPageIsAvailable() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^Open page \"([^\"]*)\"$")
    public void openPage(String arg0) throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get(arg0);
    }

    @And("^Select From Textbox to put outbound airport \"([^\"]*)\"$")
    public void selectFromTextboxToPutOutboundAirport(String arg0) throws Throwable {
        webDriver.findElement(By.id("routeSelection_DepartureStation-input")).sendKeys(arg0);
    }

    @And("^Select To Textbox to put destination airport \"([^\"]*)\"$")
    public void selectToTextboxToPutDestinationAirport(String arg0) throws Throwable {
        webDriver.findElement(By.id("routeSelection_ArrivalStation-input")).sendKeys(arg0);
    }

    @And("^Select Depart on date \"([^\"]*)\"$")
    public void selectDepartOnDate(String arg0) throws Throwable {
        webDriver.findElement(By.id("dateSelection_OutboundDate-datepicker")).clear();
        webDriver.findElement(By.id("dateSelection_OutboundDate-datepicker")).sendKeys(arg0);

    }

    @And("^Select Return on date \"([^\"]*)\"$")
    public void selectReturnOnDate(String arg0) throws Throwable {

        List<WebElement> allDates=webDriver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));

        for(WebElement ele:allDates)
        {

            String date=ele.getText();

            if(date.equalsIgnoreCase("28"))
            {
                ele.click();
                break;
            }

        }
        webDriver.findElement(By.id("dateSelection_IsReturnFlight-datepicker")).click();
        webDriver.findElement(By.id("dateSelection_IsReturnFlight-datepicker")).clear();

        webDriver.findElement(By.id("dateSelection_IsReturnFlight-datepicker")).sendKeys(arg0);

        // webDriver.findElement(By.id("dateSelection_IsReturnFlight")).click();
/*





        //Thread.sleep(1000);
        webDriver.findElement(By.id("dateSelection_IsReturnFlight-datepicker")).click();
        webDriver.findElement(By.id("dateSelection_IsReturnFlight-datepicker")).clear();
        webDriver.findElement(By.id("dateSelection_IsReturnFlight-datepicker")).sendKeys(arg0);
        webDriver.findElement(By.id("dateSelection_IsReturnFlight-datepicker")).click();
        */
/*if(webDriver.findElement(By.id("ui-datepicker-div")).isSelected())
            webDriver.findElement(By.id("ui-datepicker-div")).click();*//*

        WebElement element = webDriver.findElement(By.className("togglepanel-container position-right is-visible-intermediate is-visible __web-inspector-hide-shortcut__"));
        ((JavascriptExecutor)webDriver).executeScript("arguments[0].style.visibility='hidden'", element);
*/

    }


    @And("^Select the number of people travelling \"([^\"]*)\"$")
    public void selectTheNumberOfPeopleTravelling(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^user click on Search Button \"([^\"]*)\"$")
    public void userClickOnSearchButton(String arg0) throws Throwable {
        webDriver.findElement(By.ByXPath.xpath("//*[@id=\"desktop\"]/section/div[3]/div/button")).click();
    }
}
