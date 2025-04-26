package basic.homeworklocators;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsAmazonTests {

    private final By ACCEPT_COOKIES_BTN = By.id("sp-cc-accept");
    private final By CLICK_SEARCH_FIELD = By.id("twotabsearchtextbox");
    private final By CHANGE_ADDRESS = By.xpath(".//input[@data-action-type = 'SELECT_LOCATION']");
    private final By BURGER_MENU_ALL_CATAGORIES = By.id("nav-hamburger-menu");
    private final By LANGUAGE_SELECTOR = By.xpath(".//span[@class = 'nav-line-2']");
    private final By CART_CONTAINER = By.id("nav-cart");
    // или By.xpath(".//a[@id = 'nav-cart']
    private final By FIRST_BLOCK = By.xpath(".//div[@data-a-card-type = 'basic']");


    @Test
    public void locatorsAmazonTest () {
        //Open Browser window
        WebDriver browser = new ChromeDriver(); //выбираем браузер
        browser.manage().window().maximize();  //расхлопываем на весь экран

        //Open Home Page
        browser.get("https://www.amazon.de/"); //указали страницу

        //Accept Cookies
        browser.findElement(ACCEPT_COOKIES_BTN).click();

        //Click on Search Field
        browser.findElement(CLICK_SEARCH_FIELD).click();

        //Click Change Address
        browser.findElement(CHANGE_ADDRESS).click();

        //Open All Categories Menu
        browser.findElement(BURGER_MENU_ALL_CATAGORIES).click();


        // Click on Change Language
        browser.findElement(LANGUAGE_SELECTOR).click();

        //Click Cart Container
        browser.findElement(CART_CONTAINER).click();

        //Open The First Block
        browser.findElement(FIRST_BLOCK).click();
    }
}
