package example.example.tests;

import example.example.factory.PageinstancesFactory;
import example.example.pages.FlipPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Flip extends BaseTest{
    @Test
    public void facebookLoginTest() {
        driver.get("https://flip-sample-form.onrender.com/");
        FlipPage flipPage = PageinstancesFactory.getInstance(FlipPage.class);
        flipPage.chooseTitle("Mrs");
        flipPage.fillfirstname("Julia");
        flipPage.midname("Diana");
        flipPage.lstname("lasati");
        flipPage.sendemail("test@gmail.com");
        flipPage.phonenum("08098999999");
        flipPage.dateofbirth("01012000");
        flipPage.chooseProvince("Papua Barat");
        flipPage.chooseCity("Teluk Bintuni");
        flipPage.submit();
        Assert.assertTrue(flipPage.getdialogBody().contains("Mrs"),"ga nemu title");
    }
}
