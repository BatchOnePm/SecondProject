package RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\makes\\eclipse-workspace\\AppleTesting\\Feature",glue="RunnerClass")

public class Runner {

}
