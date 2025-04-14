package uistore;

import org.openqa.selenium.By;

public class NavBarLocator {

    public static By searchBar = By.xpath("(//span[@class='search-icon-wrapper'])[1]");
    public static By search = By.id("search");
    public static By GoButton = By.xpath("//button[@class='action search']");
    public static By RocketSports = By.xpath("(//span[text()='Racket Sports'])[2]");
    public static By shoes = By.xpath("(//span[text()='Shoes'])[2]");
    public static By removeRacket = By.cssSelector("a[title='Remove Category Racket Sports']");
    public static By Text1 = By.className("base");
    public static By Text2 = By.cssSelector("span[class='base']");
    public static By clothing = By.xpath("(//span[text()='Clothing'])[2]");
    public static By accessories = By.xpath("(//span[text()='Accessories'])[5]");
    public static By running = By.xpath("(//span[text()='Running'])[4]");
    public static By clearAll = By.xpath("//span[text()='Clear All']");

    public static By Team_Sport = By.xpath("//span[contains(text(),'Team Sport')]");
    public static By Fitness = By.xpath("//span[contains(text(),'Fitness')]");
    public static By Cart = By.cssSelector("a[class='action showcart']");

    public static By shopnow = By.id("slider-2-slide-5-layer-15");
    public static By userIcon = By.xpath("//a[@class='button js-item-myaccount-action']");

    public static By Racket_sports = By.xpath("//a[@href='https://sportsjam.in/racket-sports']");

    public static By brandNavBar = By.cssSelector("a[href='https://sportsjam.in/shopbrand']");
    // public static By hoverOverNavBarShoes =
    // By.cssSelector("a[href='https://sportsjam.in/shoes']");
    public static By hoverOverNavBarShoes = By.xpath(
            "//li[@class='level0 category-item level-top parent ox-dropdown--megamenu parent']//a[@href='https://sportsjam.in/shoes']");

}
