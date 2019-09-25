package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features1/Login.Feature",glue= {"cucumber_gft"},plugin= {"html:target/c.html"})
public class loginRunner {

}
