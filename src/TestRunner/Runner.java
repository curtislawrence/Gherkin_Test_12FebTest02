package TestRunner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin="com.hpe.alm.octane.OctaneGherkinFormatter:gherkin-results\\ManualRunnerTest_OctaneGherkinResults.xml",
    features="src", glue={"StepsDefinition"}) 
public class Runner{

}

//@RunWith(Cucumber.class)                                                       
//@CucumberOptions(features="src", ,glue={"StepsDefinition"})                                                                                         
//public class Runner                                                          
//{                              
//
//}