package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class CommonPage {
    public SelenideElement headerLinkSignIn(){
        return $x("//header//a[contains(.,'Sign in')]");
    }
}
