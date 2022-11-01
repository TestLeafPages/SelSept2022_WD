package runner;

import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

@CucumberOptions(features="src/test/java/features",
                 glue="steps",
                 monochrome=true,
                 publish=true)
                // tags="@Group2 or @Group1")
public class CucumberRunner extends BaseClass	{

}
