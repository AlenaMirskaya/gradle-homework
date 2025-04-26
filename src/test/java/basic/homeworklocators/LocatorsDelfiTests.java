package basic.homeworklocators;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LocatorsDelfiTests {

    private final By ACCEPT_COOKIES = By.id("accept-btn");
    private final By CLICK_LOGO = By.xpath(".//span[@class = 'd-flex align-items-center']");
    private final By OPEN_BUSINESS_SECTION = By.xpath("//div[contains(@class, 'header-menu__horizontal header-menu__horizontal--center col')]//a[contains(@href, '/biznes')]");
    private final By OPEN_CONTACTS_HEADER = By.xpath("//div[contains(@class, 'header-menu__horizontal header-menu__horizontal--right')]//a[contains(@href, 'kontakti')]");
    private final By LANGUAGE_SELECTOR = By.xpath(".//a[@class = 'btn language-switch text-size-7 fw-bold btn-size-auto']");
    private final By BLOCK_HEADER_MENU = By.xpath(".//div[@class = 'header-menu--primary-container d-flex justify-content-between flex-nowrap align-items-center h-100 position-relative bottom-header d-none d-lg-flex']");
    private final By HEADER_MENU_LEFT_SECOND_ITEM = By.xpath(".//a[@class = 'btn header-menu__item-content btn-link btn-size-default']");





    @Test
    public void locatorsDelfiTest() {
        //Open Browser window
        WebDriver browser = new ChromeDriver(); //выбираем браузер
        browser.manage().window().maximize();  //расхлопываем на весь экран

        //Open Home Page
        browser.get("https://www.delfi.lv/"); //указали страницу

        //Accept Cookies
        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(10));
        WebElement acceptButton = wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES));
        acceptButton.click();

        //Click On Logo
        browser.findElement(CLICK_LOGO).click();


        //Open Businees Section
        browser.findElement(OPEN_BUSINESS_SECTION).click();

        //Click Language Selector
        browser.findElement(LANGUAGE_SELECTOR).click();

        //Open Contacts Header
        browser.findElement(OPEN_CONTACTS_HEADER).click();

        //Click On Block Header Menu
        browser.findElement(BLOCK_HEADER_MENU).click();

        //Click On The Second Item In Left Header Menu
        browser.findElement(HEADER_MENU_LEFT_SECOND_ITEM).click();

    }
}
