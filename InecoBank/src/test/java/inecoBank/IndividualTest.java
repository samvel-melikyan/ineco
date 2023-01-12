package inecoBank;

import inecoBank.pages.Individuals;
import inecoBank.pages.navMenu.Account;
import org.testng.Assert;
import org.testng.annotations.Test;

import static util.URL.ACCOUNTS;

public class IndividualTest extends BaseTest{
    @Test
    public void t(){
        Individuals individual = new Individuals();
        Account account = individual.newAccount();

        Assert.assertEquals(ACCOUNTS, account.getURL());
//        driver.get("https://www.google.com/");
//        Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com/" );

    }
}
