package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.AllureUtils;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class InventoryPage {
    private WebDriver driver;
    private WebDriverWait wait;

    // Locators
    private By cartIcon = By.className("shopping_cart_link");
    private By inventoryItems = By.className("inventory_item");
    private By addToCartBackpackBtn = By.id("add-to-cart-sauce-labs-backpack");
    private By cartBadge = By.className("shopping_cart_badge");
    private By sortDropdown = By.className("product_sort_container");
    private By itemPrices = By.className("inventory_item_price");

    // Constructor
    public InventoryPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Validations & Getters
    @Step("Check if Cart Icon is displayed")
    public boolean isCartIconDisplayed() {
        boolean isDisplayed = wait.until(ExpectedConditions.visibilityOfElementLocated(cartIcon)).isDisplayed();
        AllureUtils.takeScreenshot("Cart Icon Visibility", driver);
        return isDisplayed;
    }

    @Step("Get count of products displayed on inventory page")
    public int getProductCount() {
        int count = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(inventoryItems)).size();
        AllureUtils.takeScreenshot("Inventory Products Displayed", driver);
        return count;
    }

    @Step("Get current page URL")
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    @Step("Get page title")
    public String getPageTitle() {
        return driver.getTitle();
    }

    @Step("Click 'Add to Cart' for Sauce Labs Backpack")
    public void addBackpackToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(addToCartBackpackBtn)).click();
        AllureUtils.takeScreenshot("Added Backpack to Cart", driver);
    }

    @Step("Get text/count displayed on Cart Badge")
    public String getCartBadgeText() {
        String badgeText = wait.until(ExpectedConditions.visibilityOfElementLocated(cartBadge)).getText();
        AllureUtils.takeScreenshot("Cart Badge Text", driver);
        return badgeText;
    }

    @Step("Select sorting option: '{optionText}'")
    public void selectSortOption(String optionText) {
        WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(sortDropdown));
        Select select = new Select(dropdown);
        select.selectByVisibleText(optionText);
        AllureUtils.takeScreenshot("Selected Sort Option - " + optionText, driver);
    }

    @Step("Fetch list of all product prices")
    public List<Double> getProductPrices() {
        List<WebElement> priceElements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(itemPrices));
        List<Double> prices = new ArrayList<>();
        for (WebElement element : priceElements) {
            String priceText = element.getText().replace("$", "");
            prices.add(Double.parseDouble(priceText));
        }
        AllureUtils.takeScreenshot("Product Prices Fetched", driver);
        return prices;
    }
}