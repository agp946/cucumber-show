package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;
import pages.CommonPage;

public class CommonPageSteps {
    CommonPage thisPage = page(CommonPage.class);

    @When("^User in page header clicks link 'Sign up'$")
    public void clickSignIn() {
        thisPage.headerLinkSignIn().click();
    }

    @Given("^User has open page \"([^\"]*)\"$")
    public void hasOpen(String title) {
        $("title").shouldHave(attribute("text",title));
    }

}
