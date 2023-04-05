package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.Driver;

public class MngSchoolStepDef {

    @Given("kullanici mngstudent gider")
    public void kullanici_mngstudent_gider() {

        Driver.getDriver().get(ConfigReader.getProperty("student_url"));
    }

    @Given("techproeducation sayfasına gidilir")
    public void techproeducationSayfasınaGidilir() {

        System.out.println(Driver.getDriver().getTitle());
    }

    @When("sayfa basligi yazdirilir")
    public void sayfaBasligiYazdirilir() {
    }

    @Then("sayfa basliginda Bootcamp yazisi oldugu test edilir")
    public void sayfaBasligindaBootcampYazisiOlduguTestEdilir() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(""));


    }

    @And("sayfa kapatilir")
    public void sayfaKapatilir() {
       Driver.closeDriver();

    }
}
