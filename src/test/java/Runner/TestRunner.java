package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="Features/demo.Feature",glue= {"cucumber_gft"},plugin= {"html:target/cucumber_gft.html"})

public class TestRunner {
	

}
