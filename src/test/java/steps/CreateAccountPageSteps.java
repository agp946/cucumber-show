package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.CucumberException;
import pages.CreateAccountPage;

import static com.codeborne.selenide.Selenide.page;

public class CreateAccountPageSteps {

    CreateAccountPage thisPage = page(CreateAccountPage.class);

    @Then("^System opens 'Create an Account' page$")
    public void hasOpen() {
        thisPage.title().shouldBe(Condition.visible);
    }

    @When("^User on 'Create an Account' page on \"([^\"]*)\" form chooses \"([^\"]*)\" radiobutton")
    public void selectRadioButton(String name, String caption) {
        if (thisPage.infoFormRadioBtnIsChecked(name, caption).is(Condition.exist))
            return;
        thisPage.infoFormRadioBtn(name, caption).click();
        thisPage.infoFormRadioBtnIsChecked(name, caption).should(Condition.exist);
    }

    @When("^User on 'Create an Account' page on \"([^\"]*)\" form types \"([^\"]*)\" in input field \"([^\"]*)\"$")
    public void typeText(String name, String text, String caption) {
        thisPage.infoFormInput(name, caption).clear();
        thisPage.infoFormInput(name, caption).sendKeys(text);
        //to close security warning hint in Firefox
        if (caption.equals("Password"))
            thisPage.infoFormInput(name, caption).click();
    }

    //text area
    @When("^User on 'Create an Account' page on \"([^\"]*)\" form types \"([^\"]*)\" in text area \"([^\"]*)\"$")
    public void typeText2(String name, String text, String caption) {
        thisPage.infoFormTextArea(name, caption).sendKeys(text);
    }

    // combo
    @When("^User on \\'Create an Account\\' page on \"([^\"]*)\" form in combobox \"([^\"]*)\" choose \"([^\"]*)\"$")
    public void selectComboItem(String name, String caption, String option) {
        thisPage.infoFormComboControl(name, caption).click();
        thisPage.infoFormComboOptions(name,caption).should(Condition.appear);
        thisPage.infoFormComboOption(name,caption,option).click();
        thisPage.infoFormComboOptions(name,caption).should(Condition.disappear);
        thisPage.infoFormComboSelectedOption(name,caption,option).should(Condition.exist);
    }

    // Date part combo
    @When("^User on 'Create an Account' page on \"([^\"]*)\" form in 'Date of Birth' parameter in combobox \"([^\"]*)\" choose \"([^\"]*)\"$")
    public void selectDateComboItem(String name, String datePart, String option) {
        thisPage.infoFormComboDateControl(name, parseDatePart(datePart)).click();
        thisPage.infoFormComboDateOptions(name,parseDatePart(datePart)).should(Condition.appear);
        thisPage.infoFormComboDateOption(name,parseDatePart(datePart),option).click();
        thisPage.infoFormComboDateOptions(name,parseDatePart(datePart)).should(Condition.disappear);
        thisPage.infoFormComboDateSelectedOption(name,parseDatePart(datePart),option).should(Condition.exist);
    }

    // Check box
    @When("^User on 'Create an Account' page on \"([^\"]*)\" form set checkbox \"([^\"]*)\"$")
    public void typeText2(String name, String caption) {
        if (thisPage.infoFormCheckboxIsChecked(name,caption).is(Condition.exist))
            return;
        thisPage.infoFormCheckbox(name,caption).click();
        thisPage.infoFormCheckboxIsChecked(name,caption).should(Condition.appear);
    }

    //
    @When("User on 'Create an Account' page clicks on button 'Register'")
    public void pressBtn() {
        thisPage.btnSubmit().click();
    }

    // Utils
    private String parseDatePart(String datePart){
        if (datePart.equals("Day"))
            return "1";
        if (datePart.equals("Month"))
            return "2";
        if (datePart.equals("Year"))
            return "3";
        throw new CucumberException("Data part should be in [\"Day\",\"Month\",\"Year\"]. Actual: "+datePart);
    }
}
