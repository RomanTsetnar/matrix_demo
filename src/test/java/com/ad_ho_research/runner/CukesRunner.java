package com.ad_ho_research.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "rerun:target/rerun.txt", "json:target/cucumber-report.json"},
        features = "src/test/resources/features",
        glue = "com/ad_ho_research/step_deffs",
        dryRun = false,
        tags = "@wip"

)
public class CukesRunner {

}
