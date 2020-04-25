package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LandingPage {
    public WebDriver driver;

    private By signin = By.cssSelector("a[href*='sign_in']");
    private By title = By.cssSelector(".text-center>h2");
    private By NavBar = By.cssSelector(".nav.navbar-nav.navbar-right>li>a");
    private By buttonPopUp = By.xpath("//button[contains(text(),'NO THANKS')]");
    private By header = By.cssSelector("div[class*='video-banner'] h3");

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getLogin() {
        return driver.findElement(signin);
    }

    public WebElement getNavigationBar() {
        return driver.findElement(NavBar);
    }

    public WebElement getTitle() {
        return driver.findElement(title);
    }

    public void dismissPopUp() {
        List<WebElement> buttons = driver.findElements(buttonPopUp);
        if (buttons.size() >= 1) {
            buttons.get(0).click();
        }
    }

    public WebElement getHeader (){
        return driver.findElement(header);
    }
}
