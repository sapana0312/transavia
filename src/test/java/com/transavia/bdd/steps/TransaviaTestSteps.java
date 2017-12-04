package com.transavia.bdd.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TransaviaTestSteps {

    public WebDriver webDriver = null;

    @Given("^User is registered on Transavia$")
    public void userIsRegisteredOnTransavia() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^on Logon page \"([^\"]*)\"$")
    public void onLogonPage(String arg0) throws Throwable {

        System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
        webDriver = new FirefoxDriver();
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
        webDriver.findElement(By.linkText(arg0)).click();
        Thread.sleep(10000);
    }

    @Then("^User is login with home page$")
    public void userIsLoginWithHomePage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
