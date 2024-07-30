package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class IdeasoftPage {
    public IdeasoftPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='q']")
    public WebElement urunAd;

    @FindBy(xpath = "//a[normalize-space()='Ürün']")
    public WebElement urunSec;

    @FindBy(xpath = "//span[normalize-space()='SEPETE EKLE']")
    public WebElement sepeteEkle;
    @FindBy(xpath = "//*[@id=\"qty-input\"]/option[5]")
    public WebElement urunAdet5Ekle;

    @FindBy(xpath = "//a[@title='Sepet']")
    public WebElement sepetSayfasi;

    @FindBy(xpath = "//div[@data-selector='qty-wrapper']//input")
    public WebElement sepetSayfasiUrunDogrulama;

    @FindBy(xpath = "//div[@class='shopping-information-cart-inside']")
    public WebElement toastMessage;


}
