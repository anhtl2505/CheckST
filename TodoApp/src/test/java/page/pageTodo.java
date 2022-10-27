package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class pageTodo {

    public SelenideElement btn_GitHubSignIn() {
        return $x("//span[@class='fa fa-github']");
    }

    public SelenideElement input_UsernameOrEmail() {
        return $x("//input[@name='login']");
    }

    public SelenideElement input_Password() {
        return $x("//input[@name='password']");
    }

    public SelenideElement btn_SignIn() {
        return $x("//input[@value='Sign in']");
    }

    public SelenideElement text_HeaderPage() {
        return $x("//div[text()='Todo Lists']");
    }

    public SelenideElement btn_AddList() {
        return $x("//button[contains(text(),'Add List')]");
    }

    public SelenideElement input_NameTask() {
        return $x("//div[@class='row']/div/input");
    }

    public SelenideElement btn_SignOut() {
        return $x("//button[text()='Sign out']");
    }

    public SelenideElement text_HeaderLoginPage() {
        return $x("//h1[text()='To continue you will need to sign in first,']");
    }


}
