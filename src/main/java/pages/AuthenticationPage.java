package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AuthenticationPage extends CommonPage {

    public SelenideElement title(){
        return $x("//h1[@class='page-heading'][.='Authentication']");
    }

    public SelenideElement createAccountForm(){
        return $x("//form[@id='create-account_form']");
    }

    public SelenideElement createAccountFormEmailInput(){
        return createAccountForm().$x(".//div[contains(@class,'form-group')][./label[.='Email address']]/input");
    }

    public SelenideElement createAccountFormCreateBtn(){
        return createAccountForm().$x(".//button[./span[contains(.,'Create an account')]]");
    }

    public SelenideElement loginForm(){
            return $x("//form[@id='login_form']");
    }

    public SelenideElement loginFormEmailInput(){
        return loginForm().$x(".//div[contains(@class,'form-group')][./label[.='Email address']]/input");
    }

    public SelenideElement loginFormPasswordInput(){
        return loginForm().$x(".//div[contains(@class,'form-group')][./label[.='Password']]//input");
    }

}
