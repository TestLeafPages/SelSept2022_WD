package testcases;

import base.BaseClass;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/main/java/features",
                 glue="pages",
                 monochrome=true,
                 publish=true)
                // tags="@Group2 or @Group1")
public class CucumberRunner extends BaseClass	{

}
