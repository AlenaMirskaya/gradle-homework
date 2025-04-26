package basic.homeworklocators;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.ref.PhantomReference;
import java.time.Duration;

public class LocatorsSportsDirect {

    private final By ACCEPT_COOKIES = By.id("onetrust-accept-btn-handler");
    private final By CLOSE_WINDOW_CHOOSE_COUNTRY = By.xpath(".//button[@data-dismiss = 'modal']");
    private final By OPEN_MANS_SECTION = By.xpath("//div[contains(@data-testid, 'carousel')]//a[contains(@href, '/mens')]");
    private final By OPEN_lOGIN = By.id("loginMenu");
    private final By CLICK_SEARCH_FIELD = By.id("txtSearch");
    private final By OPEN_GIFTS_BY_BRAND = By.xpath(".//div[@class = 'BlockHeader_text__3u7EC']");



    @Test
    public void locatorsSportsDirect() {
        //Open Browser window
        WebDriver browser = new ChromeDriver(); //выбираем браузер
        browser.manage().window().maximize();  //расхлопываем на весь экран

        //Open Home Page
        browser.get("https://www.sportsdirect.lv/"); //указали страницу

        // WebDriverWait for BTN Accept Cookies
        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(10));

        //Accept Cookies
        WebElement acceptCookiesButton = wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES));
        acceptCookiesButton.click();

        //Close Window Choose Country
        browser.findElement(CLOSE_WINDOW_CHOOSE_COUNTRY).click();

        //Click On "Gifts By Brand"
        browser.findElement(OPEN_GIFTS_BY_BRAND).click();

        //Open Man Section
        browser.findElement(OPEN_MANS_SECTION).click();

        //Open Login Window
        browser.findElement(OPEN_lOGIN).click();

        //Click In Search Field
        browser.findElement(CLICK_SEARCH_FIELD).click();








    }
}
