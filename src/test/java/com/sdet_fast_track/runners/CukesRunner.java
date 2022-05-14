package com.sdet_fast_track.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",
        glue = "com/sdet_fast_track/step_definitions",
        monochrome = true,
        dryRun = false,
        tags = "@wip"
)
public class CukesRunner {
}
