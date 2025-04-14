package uistore;

import org.openqa.selenium.By;

public class ProductDetailsLocator {

        // TestCase05
        public static By Everlast_mens_Gloves = By
                        .cssSelector("a[title='Everlast Mens Universal FIT Gloves (Size M&L, Blue)']");
        public static By Add_to_cart = By.cssSelector("button[id='product-addtocart-button']");
        public static By Gym_Accessories = By.xpath("(//span[contains(text(),'Gym Accessories')])[2]");
        public static By correct_item_verification = By
                        .xpath("(//a[contains(text(),'Everlast Mens Universal FIT Gloves')])[1]");

        public static By searchBarBrand = By.cssSelector("input[name='keyword']");
        public static By verifyPuma = By.cssSelector("h1[class='title']");
        public static By searchiconInBrandPage = By.xpath("(//span[@class='search-icon-wrapper'])[2]");
        public static By clickPumaLogo = By.cssSelector("div[class='image']");
        public static By clickOnPumaLabel = By.cssSelector("a[class='link-brand']");
        public static By iteratePumaProducts = By.cssSelector("div[class='product details product-item-details']");
        public static By hoverOverElementToquickView = By.cssSelector("a[title='Puma Women Sport Quarters Assorted']");
        public static By quickViewOfPumaProduct = By
                        .cssSelector("a[data-quickview-url='https://sportsjam.in/ox_quickview/catalog_product/view/id/30663/']");
        public static By verifyQuickViewlabel = By.cssSelector("span[data-ui-id='page-title-wrapper']");
        public static By iframe = By
                        .cssSelector("iframe[src='https://sportsjam.in/ox_quickview/catalog_product/view/id/30663/']");
        public static By hoverOverWindowOpenByquickview = By.cssSelector("div[class='product-info-main']");
        public static By clickOnAddtoWhishList = By.cssSelector("a[data-action='add-to-wishlist']");
        public static By verifyErrorMessageWhishList = By
                        .cssSelector("div[data-bind='html: $parent.prepareMessageForHtml(message.text)']");
        public static By verifyErrorMessageToSignIn = By
                        .cssSelector("div[data-bind='html: $parent.prepareMessageForHtml(message.text)']");
        public static By inputEmailAdd = By.id("email");
        public static By inputPassword = By.id("pass");
        public static By clickOnSignIn = By.id("send2");
        public static By errorMessageVerify = By
                        .cssSelector("div[data-bind='html: $parent.prepareMessageForHtml(message.text)']");

        public static By verifyBadmintonShoes = By.id("page-title-heading");
        public static By verifyBasketBall = By.id("page-title-heading");
        public static By verifyCricket = By.id("page-title-heading");
        public static By verifyFootball = By.id("page-title-heading");
        public static By verifyRunning = By.id("page-title-heading");
        public static By verifysquash = By.id("page-title-heading");

        // testcase2
        public static By Rackets_firstproduct = By.id("product-item-info_40047");
        public static By shoes_firstproduct = By
                        .cssSelector("a[title='Yonex Blaze 2I Badminton Shoes (Red/Black/Gold)']");
         // testcase3
         public static By list_viewproduct = By.id("mode-list");
         public static By verifyZipcode = By.id("form-product-zipcode");
         public static By verifybeforecheckzipcode = By.xpath("//div[@class='message error']");
         public static By verifyaddtocartButton = By.xpath("//button[@id='product-addtocart-button']//span");
         public static By verifyafterclickingaddtocart=By.xpath("(//a[@href='https://sportsjam.in/checkout/cart/'])[2]");
         public static By verifycheckafterclicking=By.xpath("//div[@class='message success']");
         //(verification1)
         public static By verifyclothingheading=By.cssSelector("span[data-ui-id='page-title-wrapper']");
         public static By verifycompare1product=By.xpath("//div[contains(text(),'You added product Yonex Mens Shorts (2692-Jet Black) to the ')]");
         public static By verifycompare2product=By.xpath("//div[contains(text(),'You added product Yonex Mens Shorts (2693-Jet Black) to the ')]");
         public static By verifyremoving1product=By.xpath("//div[contains(text(),'You removed product Yonex Mens Shorts ')]");
         public static By verifyremoving2product=By.xpath("//div[contains(text(),'You removed product Yonex Mens Shorts (2693-Jet Black) from the comparison list.')]");
         public static By afterremoveallproducts=By.xpath("//div[contains(text(),'You have no items to compare.')]");

  

}
