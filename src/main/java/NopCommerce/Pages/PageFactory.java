package NopCommerce.Pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    static WebDriver driver;
    private LoginPage loginPage;
    private CatalogPage catalogPage;

    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }

    public CatalogPage getCatalogPage() {
        if (catalogPage == null) {
            catalogPage = new CatalogPage(driver);
        }
        return catalogPage;
    }
}
