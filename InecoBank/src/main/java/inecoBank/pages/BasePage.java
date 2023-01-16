package inecoBank.pages;

import org.openqa.selenium.support.PageFactory;

public abstract class BasePage extends Header {


////////////////////////////////////////<footer/topSegment>////////////////////////////////////////////////////////////////////////////////
//    @FindBy(className="footerContacts__phone")
//    private WebElement phone;
//    @FindBy(className="footerContacts__mail")
//    private WebElement mail;
//    @FindBy(className="footerSocial__icon.footerSocial__icon--linkedin")
//    private WebElement linkedIn;
//    @FindBy(className="footerSocial__icon.footerSocial__icon--facebook")
//    private WebElement facebook;
//    @FindBy(className="footerSocial__icon.footerSocial__icon--instagram")
//    private WebElement instagram;
//    @FindBy(className="footerSocial__icon.footerSocial__icon--youtube")
//    private WebElement youtube;
//    @FindBy(className="footerSocial__icon.footerSocial__icon--twitter")
//    private WebElement twitter;
//
//////////////////////////////////////////<bottomSegment>////////////////////////////////////////////////////////////////////////////////
//    @FindBy(linkText="ABOUT US")
//    private WebElement aboutUs;
//    @FindBy(linkText="CORPORATE GOVERNANCE")
//    private WebElement corporativeGovernance;
//    @FindBy(linkText="SHAREHOLDERS  AND INVESTORS")
//    private WebElement sharenholdersAndInvestors;
//    @FindBy(linkText="REPORTS")
//    private WebElement reports;
//    @FindBy(linkText="CAREERS")
//    private WebElement careers;
//    @FindBy(linkText="PRESS CENTER")
//    private WebElement pressCenter;
//    @FindBy(linkText="CONTACT US")
//    private WebElement contactUs;
//    @FindBy(linkText="CUSTOMER RIGHTS")
//    private WebElement customerRights;
//    @FindBy(linkText="PROCUREMENT")
//    private WebElement procurement;
//    @FindBy(linkText="PRIVACY POLICY")
//    private WebElement privicyPolicy;
//    @FindBy(linkText="FINANCIAL SYSTEM MEDIATOR")
//    private WebElement financialSystemMediator;
//    @FindBy(linkText="REGULATION")
//    private WebElement regulation;
//    @FindBy(linkText="DISPOSED PROPERTY")
//    private WebElement disposedProperty;
//    @FindBy(linkText="CORRESPONDENT RELATIONS")
//    private WebElement correspondentRelations;
//////////////////////////////////////////<buttonToTop>/////////////////////////////////////////////////////////////////////////////
//    @FindBy(className="btn__icon.btn__icon--right.icon--arrow-lg")
//    private WebElement btnToTop;
////////////////////////////////////////<buttonToTop>////////////////////////////////////////////////////////////////////////////////

    protected BasePage ()
    {
        super();
        PageFactory.initElements(driver, this);
    }


}
