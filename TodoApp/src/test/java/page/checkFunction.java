package page;

import com.codeborne.selenide.Configuration;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class checkFunction {
    Todo_page TP = new Todo_page();
    String data_email = "shikaru2505@gmail.com";
    String password = "Alec753!@#";
    String[] list = new String[10];

    public String baseURL = "https://todo-list-login.firebaseapp.com/#!/";

    public void SignIn() {
        Configuration.timeout = 15000;
        open(baseURL);
        TP.btn_GitHubSignIn().shouldBe(enabled).click();
        switchTo().window(1);
        TP.input_UsernameOrEmail().shouldBe(editable).sendKeys(data_email);
        TP.input_Password().shouldBe(editable).sendKeys(password);
        TP.btn_SignIn().shouldBe(enabled).click();
        switchTo().window(0);
        TP.text_HeaderPage().shouldBe(visible);
    }

    public void SignOut() {
        TP.btn_SignOut().shouldBe(visible).click();
        TP.text_HeaderLoginPage().shouldBe(visible).click();
        closeWindow();
    }

    public void AddListTodo() {
        TP.text_HeaderPage().shouldBe(visible);
        //Add 10 tasks
        for (int i = 0; i < 10; i++) {
            String randomTask = i + " " + RandomStringUtils.randomAlphabetic(5);
            list[i] = randomTask;
            System.out.println(list[i]);
            TP.input_NameTask().shouldBe(editable).sendKeys(randomTask);
            TP.btn_AddList().shouldBe(enabled).click();
        }
    }

    public void RemoveTodoList() {
        TP.text_HeaderPage().shouldBe(visible);
        //Remove 5-10 tasks
        for (int i = 5; i < 10; i++) {
            String nameTask = list[i];
            System.out.println("Remove " + list[i]);
            $(By.xpath("//a[text()='" + nameTask + " List']/parent::div/parent::div//following-sibling::div/button")).shouldBe(visible).click();
        }
    }
}
