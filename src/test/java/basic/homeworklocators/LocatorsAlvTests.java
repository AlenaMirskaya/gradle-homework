package basic.homeworklocators;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LocatorsAlvTests {
    private final By COOKIES_SHOW_DETAILS = By.id("CybotCookiebotDialogBodyLevelDetailsButton");
    private final By CLICK_LOGO = By.xpath(".//a[@class = 'main-logo']");
    private final By INPUT_SEARH_FIELD = By.name("q");
    private final By CLICK_SEARCH_BTN = By.xpath(".//div[@class = 'main-search__submit']");
    private final By CLICK_CONTACTS_HEADER = By.xpath(".//a[@class = 'site-top__menu-right-link' and contains(@href, 'https://www.1a.lv/kp/kontakti/3')]");
    private final By CLICK_CART_HEADER = By.xpath(".//a[@class = 'cart-block__handle']");
    private final By EXPAND_BURGER_MENU_CATALOG = By.xpath(".//i[@class = 'main-menu__handle-icon icon-svg']");
    private final By OPEN_SPORTS_SECTION = By.xpath(".//div[@class='submenu-lvl1 submenu-lvl1--invisible']//a[contains(@href, '/c/sports-un-fitness/2pj')]//svg");




    @Test
    public void locatorsAlvTests() {
        //Open Browser window
        WebDriver browser = new ChromeDriver(); //выбираем браузер
        browser.manage().window().maximize();  //расхлопываем на весь экран

        //Open Home Page
        browser.get("https://www.1a.lv/"); //указали страницу

        // Click Cookies Show Details
        browser.findElement(COOKIES_SHOW_DETAILS).click();

        //Click on Logo
        browser.findElement(CLICK_LOGO).click();

        //Input Words In Search Field
        browser.findElement(INPUT_SEARH_FIELD).sendKeys("Sports");

        // Click on Search BTN
        browser.findElement(CLICK_SEARCH_BTN).click();

        //Click Contacts Header
        browser.findElement(CLICK_CONTACTS_HEADER).click();

        //Click Cart Section Header
        browser.findElement(CLICK_CART_HEADER).click();

        //Expand Burger Menu Catalog
        browser.findElement(EXPAND_BURGER_MENU_CATALOG).click();

        //Open Sports Section

        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(5));
        WebElement svgElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath(".//div[@class='submenu-lvl1 submenu-lvl1--invisible']//a[contains(@href, '/c/sports-un-fitness/2pj')]//svg")
        ));

        browser.findElement(OPEN_SPORTS_SECTION).click();


    }

}
