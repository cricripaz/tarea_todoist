package test;

import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.TopMainPage;

public class TestLogin extends BaseTodoIst {


    TopMainPage topMainPage = new TopMainPage();
    LoginPage loginPage = new LoginPage();


    @Test
    public void loginTODO() {

        topMainPage.loginButton.click();
        loginPage.emailTextBox.setText("cricripaz6@gmail.com");
        loginPage.pwdTextBox.setText("cristiank1k2");
        loginPage.loginButton.click();


    }
}
