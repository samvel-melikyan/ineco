package inecoBank;


import inecoBank.navMenu.Account;
import inecoBank.pages.Individuals;
import org.testng.Assert;
import org.testng.annotations.Test;

import static util.URL.ACCOUNTS;

public class IndividualTest extends BaseTest{
    @Test
    public void t(){
        Individuals individual = new Individuals();
        Account account = individual.newAccount();

        Assert.assertEquals(ACCOUNTS, account.getURL());


    }
}
