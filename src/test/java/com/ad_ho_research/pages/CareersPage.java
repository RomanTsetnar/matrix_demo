package com.ad_ho_research.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CareersPage extends BasePage {

    @FindBy(xpath = "//p[.='Thank you for your application!']")
    public WebElement thanksForApplicationMsg;

    @FindBy(xpath = "(//a[@class='btn btn-view-job'])[1]")
    public WebElement learnMoreButton;

    @FindBy(xpath = "//input[@placeholder='Enter the position name']")
    public WebElement jobTitleInputBox;

    @FindBy(xpath = "//select[@tabindex='-1']")
    public WebElement countrySelectDropDown;

    @FindBy(xpath = " //span[@class='fa fa-search']")
    public WebElement searchButton;

    @FindBy(xpath = "//a[@class='btn btn-primary btn-xs']")
    public WebElement applyButton;

    @FindBy(id = "field138215")
    public WebElement fullNameInputBox;

    @FindBy(id = "field138217")
    public WebElement phoneInputBox;

    @FindBy(id = "field138216")
    public WebElement emailInputBox;

    @FindBy(id = "field138218")
    public WebElement coverLetterInputBox;

    @FindBy(id = "field138219")
    public WebElement browseButton;

    @FindBy(name = "submit")
    public WebElement submitYourApplicationBtn;

    @FindBy(xpath = "//p[.='Your application was successfully submitted.']")
    public WebElement applicationSuccessSubmitted;


}
