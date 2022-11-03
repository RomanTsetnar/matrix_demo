package com.ad_ho_research.step_deffs;

import com.ad_ho_research.pages.AboutUsPage;
import com.ad_ho_research.pages.CareersPage;
import com.ad_ho_research.utility.BrowserUtilities;
import com.ad_ho_research.utility.ConfigurationReader;
import com.ad_ho_research.utility.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

public class ad_ho_researcg_step_deffs {
    AboutUsPage page = new AboutUsPage();
    CareersPage careers = new CareersPage();
    Faker faker = new Faker();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();


    @Given("user is on the main page")
    public void user_is_on_the_main_page() {
        Driver.getDriver().get(ConfigurationReader.getProperties("url"));
    }

    @When("user hovers over the About Us module")
    public void user_hovers_over_the_about_us_module() {
        BrowserUtilities.moveToElement(page.aboutUsModule);
    }

    @When("user selects Executive Team")
    public void user_selects_executive_team() {
        page.executiveTeamOption.click();
    }

    @When("user scrolls down to Drop us a message section")
    public void user_scrolls_down_to_drop_us_a_message_section() {
        BrowserUtilities.moveToElement(page.homeBtn);
    }

    @When("user enters correct credentials, phone number, company name")
    public void user_enters_correct_credentials_phone_number_company_name() {
        page.nameInputBox.sendKeys(faker.name().fullName());
        page.emailInputBox.sendKeys(faker.internet().emailAddress());
        page.phoneInputBox.sendKeys(faker.phoneNumber().cellPhone());
        page.companyInputBox.sendKeys(faker.company().name());
    }

    @When("user types in a message")
    public void user_types_in_a_message() {
        page.msgInputBox.sendKeys(faker.lorem().sentence());
    }

    @When("user clicks on CONTACT US button")
    public void user_clicks_on_contact_us_button() {
        page.contactUsBtn.click();
    }

    @Then("the following message should be displayed {string}")
    public void the_following_message_should_be_displayed(String expectedMsg) {
        String actualMsg = page.successMsg.getText();
        Assert.assertEquals("text verification failed", expectedMsg, actualMsg);
    }

    @When("user hovers over Solutions module")
    public void user_hovers_over_solutions_module() {
        BrowserUtilities.moveToElement(page.solutionModule);

    }

    @When("user selects each {string}")
    public void user_selects_each(String option) {
        page.selectOption(option);

    }

    @Then("user verifies he is on the correct page by verifying the {string} is displayed correctly")
    public void user_verifies_he_is_on_the_correct_page_by_verifying_the_is_displayed_correctly(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("title verification failed", expectedTitle, actualTitle);
    }

    @When("user clicks on Careers module")
    public void user_clicks_on_careers_module() {
        careers.careersModule.click();
    }

    @When("user scrolls down to Open Positions")
    public void user_scrolls_down_to_open_positions() {
        js.executeScript("window.scrollBy(0,1400)");
        Driver.getDriver().switchTo().frame(careers.iFrame);

    }

    @When("user enters {string} to job title input box")
    public void user_enters_to_job_title_input_box(String jobTitle) {
        careers.jobTitleInputBox.sendKeys(jobTitle);
    }

    @When("user selects {string} from the Country drop down")
    public void user_selects_from_the_country_drop_down(String country) {
        Select select = new Select(careers.countrySelectDropDown);
        select.selectByVisibleText(country);
    }

    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        careers.searchButton.click();

    }

    @When("user clicks on Apply now button")
    public void user_clicks_on_apply_now_button() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        careers.applyButton.click();
    }

    @When("user fills out all the information'")
    public void user_fills_out_all_the_information() {
        careers.fullNameInputBox.sendKeys(faker.name().fullName());
        careers.phoneInputBox.sendKeys(faker.phoneNumber().cellPhone());
        careers.emailInputBox.sendKeys(faker.internet().emailAddress());
        careers.coverLetterInputBox.sendKeys(faker.lorem().sentence());
    }

    @When("user uploads resume")
    public void user_uploads_resume() {
        String filePath = "/Users/romantsetnar/IdeaProjects/ad_hoc_research/src/test/resources/test_pdfs/FakeResume.pdf";
        careers.browseButton.sendKeys(filePath);

    }

    @When("user clicks on Submit your application button")
    public void user_clicks_on_submit_your_application_button() {
        careers.submitYourApplicationBtn.click();
    }

    @Then("user should see the following message {string}")
    public void user_should_see_the_following_message(String expectedMsg) {
        String actualMsg = careers.applicationSuccessSubmitted.getText();
        Assert.assertEquals("message verification failed",expectedMsg, actualMsg);
    }

}
