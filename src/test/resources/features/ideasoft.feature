@ideasoft
  Feature: İdeasoft Test Otomasyon Calismasi
    Scenario:TC_01 Sepete ürün ekleme ve doğrulama testi
      Given Kullanici "https://testcase.myideasoft.com/" sitesine gider
      When Kullanici arama kutusuna "ürün" yazar ve arama yapar
      And Kullanici listelenen urune tiklar
      And Kullanici urunden 5 adet sepete ekler
      Then "SEPETİNİZE EKLENMİŞTİR" yazisinin gorundugunu kontrol eder
      When Kullanici sepet sayfasina gider
      Then Sepette "5" adet urun oldugunu kontrol eder