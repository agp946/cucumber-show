package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AuthenticationPage;
import static com.codeborne.selenide.Selenide.page;

public class AuthenticationPageSteps {

    AuthenticationPage thisPage = page(AuthenticationPage.class);

    @Then("^System opens 'Authentication' page$")
    public void hasOpen() {
        thisPage.title().shouldBe(Condition.visible);
    }

    @When("^User on 'Authentication' page in 'Create an account' from types 'email' in input field 'Email address'$")
    public void fillEmailInput() {
        String email = String.valueOf(System.currentTimeMillis());
        thisPage.createAccountFormEmailInput().clear();
        thisPage.createAccountFormEmailInput().sendKeys(email+"@example.com");
    }

    @When("^User on 'Authentication' page in 'Create an account' from clicks button 'Create an account'$")
    public void clickCreateBtn() {
        thisPage.createAccountFormCreateBtn().click();
    }
}
