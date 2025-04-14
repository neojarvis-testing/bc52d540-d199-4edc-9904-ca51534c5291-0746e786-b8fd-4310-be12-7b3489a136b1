package uistore;

import org.openqa.selenium.By;

public class LoginModuleLocator {

        // Create account page

        public static By createAccount = By.cssSelector("[class='action create primary']");
        public static By firstName = By.id("firstname");
        public static By lastName = By.id("lastname");
        public static By email = By.id("email_address");
        public static By password = By.id("password");
        public static By confirmPassword = By.id("password-confirmation");
        public static By confirmCreateButton = By.xpath("(//button[@id='send2'])[1]");

        // My account page

        public static By thankYouMessage = By
                        .cssSelector("[data-bind='html: $parent.prepareMessageForHtml(message.text)']");
        public static By logout = By.xpath("(//a[@href='https://sportsjam.in/customer/account/logout/'])[1]");

        // login page

        public static By emailLogin = By.id("email");
        public static By passwordLogin = By.id("pass");
        public static By signIn = By.id("send2");

        public static By verify5secWait = By.xpath("//p[contains(text(),'You have signed out and will go to our homepage in 5 seconds.')]");
        public static By verifyErrorMessage = By
                        .cssSelector("[data-bind='html: $parent.prepareMessageForHtml(message.text)']");

}
