package NopCommerce.Test;

import org.testng.annotations.Test;

public class VerifyThatUserIsAbleToSearchProduct extends BaseClass {
    @Test
    public void searchProduct() {
        pageFactory.getLoginPage().login();
        pageFactory.getCatalogPage().catalog();
        pageFactory.getCatalogPage().catalogVerification("//h1", "Admin area demo");
    }
}
