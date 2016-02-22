package Cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
////ctrl + shift + o : to import all the classes
//
@RunWith(Cucumber.class)
@CucumberOptions
(
		features = "C://Users//Nisum User//Desktop//Practice//CucumberSample//src//Cucumber//features//myfeature.feature"
		,glue={"stepdefinition"}
		//format ={"pretty","json:tareaget/cucumber.json"},
			//	features={"src/cucumber/"}
		)

public class CucumberTest {

	
	
}
