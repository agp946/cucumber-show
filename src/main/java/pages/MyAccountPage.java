package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MyAccountPage extends CommonPage {

    public SelenideElement title(){
        return $x("//h1[@class='page-heading'][.='My account']");
    }

}
