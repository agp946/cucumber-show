package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CreateAccountPage extends CommonPage {

    public SelenideElement title(){
        return $x("//h1[@class='page-heading'][.='Create an account']");
    }

    public SelenideElement infoForm(String name){
        return $x("//div[@class='account_creation'][./h3[.='"+name+"']]");
    }

    // Radio button
    public SelenideElement infoFormRadioBtn(String name, String btnName){
        return infoForm(name).$x(".//div[@class='radio-inline'][./node()[contains(.,'"+btnName+"')]]");
    }

    public SelenideElement infoFormRadioBtnIsChecked(String name, String btnName){
        return infoFormRadioBtn(name, btnName).$x(".//span[@class='checked']");
    }

    // InputField
    public SelenideElement infoFormInput(String name, String caption){
        return infoForm(name).$x("./node()[contains(@class,'form-group')]" +
                "[./label[contains(.,'"+caption+"')]]/input");
    }

    // TextArea
    public SelenideElement infoFormTextArea(String name, String caption){
        return infoForm(name).$x("./node()[contains(@class,'form-group')]" +
                "[./label[contains(.,'"+caption+"')]]/textarea");
    }

    // Checkbox
    public SelenideElement infoFormCheckbox(String name, String caption){
        return infoForm(name).$x("./node()[contains(@class,'checkbox')]" +
                "[./label[contains(.,'"+caption+"')]]//div[contains(@class,'checker')]");
    }

    public SelenideElement infoFormCheckboxIsChecked(String name, String caption){
        return infoFormCheckbox(name,caption).$x("./span[contains(@class,'checked')]");
    }

    // Combo
    public SelenideElement infoFormCombo(String name, String caption){
        return infoForm(name).$x("./node()[contains(@class,'form-group')]" +
                "[./label[contains(.,'"+caption+"')]]/div[contains(@class,'selector')]");
    }

    public SelenideElement infoFormComboControl(String name, String caption){
        return infoFormCombo(name,caption).$x("./self::node()");
    }

    public SelenideElement infoFormComboOptions(String name, String caption){
        return infoFormCombo(name,caption).$x("./self::node()[contains(@class,'focus')]");
    }

    public SelenideElement infoFormComboOption(String name, String caption, String item){
        return infoFormComboControl(name,caption).$x("./select/option[contains(.,'"+item+"')]");
    }

    public SelenideElement infoFormComboSelectedOption(String name, String caption, String item){
        return infoFormComboControl(name,caption).$x("./span[contains(.,'"+item+"')]");
    }

    // Combo Date
    public SelenideElement infoFormComboDate(String name, String num) {
        return infoForm(name).$x("./node()[contains(@class,'form-group')][./label[contains(.,'Date of Birth')]]" +
                "/div[@class='row']/div[" + num + "]/div[contains(@class,'selector')]");
    }

    public SelenideElement infoFormComboDateControl(String name, String num) {
        return infoFormComboDate(name, num).$x("./self::node()");
    }

    public SelenideElement infoFormComboDateOptions(String name, String num) {
        return infoFormComboDate(name, num).$x("./self::node()[contains(@class,'focus')]");
    }

    public SelenideElement infoFormComboDateOption(String name, String num, String item) {
        return infoFormComboDateControl(name, num).$x("./select/option[contains(.,'"+item+"')]");
    }

    public SelenideElement infoFormComboDateSelectedOption(String name, String num, String item) {
        return infoFormComboDateControl(name, num).$x("./span[contains(.,'"+item+"')]");
    }

    //
    public SelenideElement btnSubmit() {
        return $x("//button[./span[contains(.,'Register')]]");
    }
}
