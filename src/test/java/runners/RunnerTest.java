package runners;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "html:cucumber-report/report",
        },
        features = {"src/test/java/features"},
        glue = {"steps"},
        tags = {},
        junit = {"--step-notifications"}
)

public class RunnerTest {

    public static final int TIMEOUT = 4;
    public static final String DRIVER_PATH = "resources/drivers/";
    public static final String CHROME_DRIVER_FILENAME = "geckodriver.exe";
    public static final String TEST_DATA_PATH = "resources/data/";

    @BeforeClass
    static public void setup() throws Exception {
        Configuration.timeout = TIMEOUT * 1000;
        Configuration.browser = "firefox";
        //Configuration.browserSize = "1980x1080";
        System.setProperty("webdriver.gecko.driver", DRIVER_PATH+CHROME_DRIVER_FILENAME);
        Selenide.open("http://automationpractice.com/");
    }
}

