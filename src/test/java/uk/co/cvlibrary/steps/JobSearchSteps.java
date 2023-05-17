package uk.co.cvlibrary.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import uk.co.cvlibrary.pages.HomePage;
import uk.co.cvlibrary.pages.ResultPage;

public class JobSearchSteps {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @When("^I accept all cookies$")
    public void iAcceptAllCookies() throws InterruptedException {
        new HomePage().accpetCookies();
    }

    @And("^I enter job title \"([^\"]*)\"$")
    public void iEnterJobTitle(String jobTitle) throws InterruptedException {
        new HomePage().enterJobTitel(jobTitle);
    }

    @And("^I enter location \"([^\"]*)\"$")
    public void iEnterLocation(String location) {
        new HomePage().enterLocation(location);
    }

    @And("^I select distance \"([^\"]*)\"$")
    public void iSelectDistance(String distance) throws InterruptedException {
        new HomePage().selectDistance(distance);
    }

    @And("^I click on more search option link$")
    public void iClickOnMoreSearchOptionLink() {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("^I enter minimum salary \"([^\"]*)\"$")
    public void iEnterMinimumSalary(String minSalary) {
        new HomePage().enterMinSalary(minSalary);
    }

    @And("^I enter maximum salary \"([^\"]*)\"$")
    public void iEnterMaximumSalary(String maxSalary) {
        new HomePage().enterMaxSalary(maxSalary);
    }

    @And("^I select salary type \"([^\"]*)\"$")
    public void iSelectSalaryType(String salaryType) {
        new HomePage().selectSalaryType(salaryType);
    }

    @And("^I select job type \"([^\"]*)\"$")
    public void iSelectJobType(String jobType) {
        new HomePage().selectJobType(jobType);
    }

    @And("^I click on find jobs button$")
    public void iClickOnFindJobsButton() {
        new HomePage().clickOnFindJobsButton();
    }

    @Then("^I verify the navigation on result page \"([^\"]*)\"$")
    public void iVerifyTheNavigationOnResultPage(String result) throws InterruptedException {
        Assert.assertTrue(new ResultPage().verifyTheResults(result), "User is not navigated to results page.");
    }

}
