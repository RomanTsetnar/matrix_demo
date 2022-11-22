package com.ad_ho_research.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutUsPage extends com.ad_ho_research.pages.BasePage {

    @FindBy(xpath = "//h2[.='Drop Us A Message']")
    public WebElement dropUsAMessageText;

    @FindBy(xpath = "//input[@name='text-683']")
    public WebElement nameInputBox;

    @FindBy(xpath = "//input[@name='email-634']")
    public WebElement emailInputBox;

    @FindBy(xpath = "//input[@name='tel-287']")
    public WebElement phoneInputBox;

    @FindBy(xpath = "//input[@name='Company']")
    public WebElement companyInputBox;

    @FindBy(xpath = "//textarea[@name='Message']")
    public WebElement msgInputBox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement contactUsBtn;

    @FindBy(xpath = "//div[.='Thank you for your message. It has been sent.']")
    public  WebElement successMsg;


    @FindBy(linkText = "Home")
    public WebElement homeBtn;

}
