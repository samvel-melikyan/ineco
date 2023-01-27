package inecoBank.pages;

import static util.url.URL.NOT_EXIST;

public class NotExist extends BasePage{
    public NotExist(){
        super();
        this.url = NOT_EXIST;
        get();
    }
    @Override
    protected void load() {
        super.load();
    }

    @Override
    protected void isLoaded() throws Error {
        super.isLoaded();
    }

    @Override
    public String getURL() {
        return driver.getCurrentUrl();
    }
}
