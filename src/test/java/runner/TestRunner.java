package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="../Amazon/src/test/java/features/Customer.feature"
        ,glue = {"steps"}
       // ,monochrome = false
        //,dryRun = true
)
public class TestRunner {
}