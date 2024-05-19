package com.a10.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePageFactory {
    private final WebDriver driver;
    private final WebDriverWait wait;

    @FindBy(id = "react-burger-menu-btn")
    private WebElement burgerMenuButton;

    @FindBy(id = "logout_sidebar_link")
    private WebElement logoutLink;

    @FindBy(className = "bm-menu-wrap")
    private WebElement menuWrap;

    @SuppressWarnings("deprecation")
    public HomePageFactory(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }

    public void clickBurgerMenuButton() {
        burgerMenuButton.click();
    }

    public void clickLogoutLink() {
        wait.until(ExpectedConditions.elementToBeClickable(logoutLink)).click();
    }

    public boolean isMenuVisible() {
        // Check if the aria-hidden attribute is set to false
        String ariaHiddenValue = menuWrap.getAttribute("aria-hidden");
        return ariaHiddenValue != null && ariaHiddenValue.equals("false");
    }
}