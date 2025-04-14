package uistore;

import org.openqa.selenium.By;

public class NavBarDropDownLocators {

        // TestCase04
        public static By Protective_Gear = By.cssSelector(
                        "a[href='https://sportsjam.in/sports/cricket-equipment-store-online-india/cricket-protective-gear-shop-online-india']");
        public static By Batting_Gloves = By.cssSelector(
                        "a[href='https://sportsjam.in/sports/cricket-equipment-store-online-india/cricket-protective-gear-shop-online-india/batting-gloves-cricket-shop-online-india']");
        public static By Batting_Leg_Guards = By.cssSelector(
                        "a[href='https://sportsjam.in/sports/cricket-equipment-store-online-india/cricket-protective-gear-shop-online-india/batting-leg-guards-shop-online-india']");
        public static By Wicket_Keeping_Gloves = By.cssSelector(
                        "a[href='https://sportsjam.in/sports/cricket-equipment-store-online-india/cricket-protective-gear-shop-online-india/wicket-keeping-gloves-cricket-shop-online-india']");
        public static By Wicket_Keeping_Leg_Guards = By.cssSelector(
                        "a[href='https://sportsjam.in/sports/cricket-equipment-store-online-india/cricket-protective-gear-shop-online-india/wicket-keeping-leg-guards-shop-online-india']");
        public static By Circket_Helmets = By.cssSelector(
                        "a[href='https://sportsjam.in/sports/cricket-equipment-store-online-india/cricket-protective-gear-shop-online-india/cricket-helmets-shop-online-india']");
        public static By Inner_Thigh_Pads = By.cssSelector(
                        "a[href='https://sportsjam.in/sports/cricket-equipment-store-online-india/cricket-protective-gear-shop-online-india/cricket-inner-thigh-pads-shop-online-india']");
        // TestCase05
        public static By Gym_Gloves = By.cssSelector(
                        "a[href='https://sportsjam.in/gym-exercise-fitness-equipment-online-shop-india/gym-accessories-online-india?equipment_type=680']");
        public static By view_cart = By.cssSelector("a[class='action viewcart']");
        public static By Proceed_to_checkout = By.xpath("(//button[@class='action primary checkout'])[1]");

        // testcase2
        public static By Badminton_Rackets = By
                        .cssSelector("a[href='https://sportsjam.in/buy-badminton-rackets-onine']");
        public static By Badminton_shoes = By
                        .cssSelector("a[href='https://sportsjam.in/badminton-shoes-online-india']");
        // testcase3
        public static By shop_sportswear = By.xpath("(//a[contains(text(),'SHOP SPORTSWEAR')])[2]");

        public static By clickOnBadminton = By.xpath(
                        "(//a[@href='https://sportsjam.in/sports/badminton-equipment-store-online-india/badminton-shoes-online-india'])[1]");
        public static By clickOnBasketBall = By.xpath(
                        "(//a[@href='https://sportsjam.in/sports/basketball-gear-online-india/basketball-shoes-online-india'])[2]");
        public static By clickOnCricket = By.xpath(
                        "(//a[@href='https://sportsjam.in/sports/cricket-equipment-store-online-india/cricket-shoes-shop-online-india'])[2]");
        public static By clickOnFootball = By
                        .xpath("(//a[@href='https://sportsjam.in/sports/buy-sports-football/football-shoes-online-india'])[2]");
        public static By clickOnRunning = By
                        .xpath("(//a[@href='https://sportsjam.in/buy-running/buy-running-shoes-online-india'])[2]");
        public static By clickOnSquash = By.xpath(
                        "(//a[@href='https://sportsjam.in/sports/squash-equipment-online-shop-india/indoor-court-squash-shoes-online-india'])[1]");

        public static By login = By
                        .cssSelector("[href='https://sportsjam.in/customer/account/login/referer/aHR0cHM6Ly9zcG9ydHNqYW0uaW4v/']");

}
