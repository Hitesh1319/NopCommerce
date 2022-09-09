package NopCommerce.Pages;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CatalogPage {
    WebDriver driver;
    WebDriverWait wait;

    By catalog= By.linkText("Catalog");
    By product = By.linkText("Products");
    By productName = By.xpath("(//input[@class='form-control text-box single-line'])[1]");
    By searchProduct =By.xpath("//button[@id='search-products']");
    By logout= By.xpath("//a[text()='Logout']");
    public CatalogPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void catalog() {
        driver.findElement(catalog).click();
        wait.until(ExpectedConditions.elementToBeClickable(product));
        driver.findElement(product).click();
        driver.findElement(productName).sendKeys("Apple MacBook Pro 13-inch");
        driver.findElement(searchProduct).click();
        driver.findElement(logout).click();
    }
    public void catalogVerification(String locator, String expected){
        String actual = driver.findElement(By.xpath(locator)).getText();
        Assert.isTrue(actual.equals(expected), "Expected result does not match with actual result");
    }
}
