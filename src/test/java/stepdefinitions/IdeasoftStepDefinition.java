package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import page.IdeasoftPage;
import utilities.Driver;

import static utilities.ReusableMethods.clickWithJS;
import static utilities.ReusableMethods.waitForVisibility;

public class IdeasoftStepDefinition {

    IdeasoftPage ideasoftPage = new IdeasoftPage();

    @Given("Kullanici {string} sitesine gider")
    public void kullanici_sitesine_gider(String sayfa) {
        Driver.getDriver().get(sayfa);
    }

    @When("Kullanici arama kutusuna {string} yazar ve arama yapar")
    public void kullanici_arama_kutusuna_yazar_ve_arama_yapar(String urun) {

        ideasoftPage.urunAd.click();
        ideasoftPage.urunAd.sendKeys(urun, Keys.ENTER);

    }

    @When("Kullanici listelenen urune tiklar")
    public void kullanici_listelenen_urune_tiklar() {
        ideasoftPage.urunSec.click();
    }

    @When("Kullanici urunden {int} adet sepete ekler")
    public void kullanici_urunden_adet_sepete_ekler(Integer sayi) {
        ideasoftPage.urunAdet5Ekle.click();
        ideasoftPage.sepeteEkle.click();


    }

    @Then("{string} yazisinin gorundugunu kontrol eder")
    public void yazisinin_gorundugunu_kontrol_eder(String sepeteEkle) {
        waitForVisibility(ideasoftPage.toastMessage, 10);

        Assert.assertEquals(sepeteEkle, ideasoftPage.toastMessage.getText());

    }

    @When("Kullanici sepet sayfasina gider")
    public void kullanici_sepet_sayfasina_gider() {
        waitForVisibility(ideasoftPage.sepetSayfasi, 5);
        clickWithJS(ideasoftPage.sepetSayfasi);
    }

    @Then("Sepette {string} adet urun oldugunu kontrol eder")
    public void sepette_adet_urun_oldugunu_kontrol_eder(String urunSepetSayi) {

        String miktar = ideasoftPage.sepetSayfasiUrunDogrulama.getAttribute("value");
        Assert.assertEquals(urunSepetSayi, miktar);

        Driver.closeDriver();
    }


}
