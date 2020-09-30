package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.en.Then;
import pages.MyAccountPage;

import static com.codeborne.selenide.Selenide.page;

public class MyAccountPageSteps {

    MyAccountPage thisPage = page(MyAccountPage.class);

    @Then("^System opens 'My account' page$")
    public void hasOpen() {
        thisPage.title().shouldBe(Condition.visible);
    }

}
