package com.ad_ho_research.pages;

import com.ad_ho_research.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(linkText = "Careers")
    public WebElement careersModule;

    @FindBy(linkText = "About Us")
    public WebElement aboutUsModule;

    @FindBy(linkText = "Executive Team")
    public WebElement executiveTeamOption;

    @FindBy(linkText = "Solutions")
    public  WebElement solutionModule;

    @FindBy(linkText = "Cyber Analytics")
    public WebElement cyberAnalyticsOption;

    @FindBy(linkText = "Cyber Experimentation")
    public WebElement cyberExperimentationOption;

    @FindBy(linkText = "Modeling Simulation V&V")
    public WebElement modelingSimulationOption;

    @FindBy(linkText = "Test & Evaluation")
    public WebElement testEvaluationOption;

    @FindBy(linkText = "Big Data & Cyber Defense")
    public WebElement bigDataCyberDefenseOption;

    @FindBy(linkText = "Tactical Network Emulation")
    public WebElement tacticalNetworkEmulationOption;

    @FindBy(xpath = "//iframe[@src='https://www.careers-page.com/ad-hoc-research']")
    public WebElement iFrame;

    public void selectOption(String option){
        String locator = "//a[linkText = '"+option+"']";
        WebElement item = Driver.getDriver().findElement(By.linkText(option));
        item.click();
    }



}
