package uistore;

import org.openqa.selenium.By;

public class FooterLocator {

    public static By registerLogin = By.cssSelector("a[href='/customer/account/login']");
    // public static By deliveryCharges =
    // By.cssSelector("a[href='/delivery-information']");
    public static By deliveryCharges = By.xpath("//a[text()='Delivery & Charges']");
    public static By paymentOptions = By.cssSelector("a[href='/payment-options']");
    public static By faq = By.cssSelector("a[href='/sportsjam-frequently-asked-questions']");
    public static By returnPolicy = By.cssSelector("a[href='/returns-policy']");

    public static By facebook = By.xpath("//a[@class='athlete2-social-icon athlete2-icon-facebook']");
    public static By youtube = By.xpath("//a[@class='athlete2-social-icon athlete2-icon-youtube']");
    public static By instagram = By.xpath("//a[@class='athlete2-social-icon athlete2-icon-instagram']");
    public static By twitter = By.xpath("//a[@class='athlete2-social-icon athlete2-icon-twitter']");

}
