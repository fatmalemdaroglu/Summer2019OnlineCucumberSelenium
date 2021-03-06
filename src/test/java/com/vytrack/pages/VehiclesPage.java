package com.vytrack.pages;

import com.vytrack.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehiclesPage extends BasePage {

    @FindBy(css = "[title='Create Car']")
    public WebElement createACarElement;

    //use this method to click on "Create a car" button
    //method already contains waits to handle synchronization issues
    public void clickToCreateACar(){
        BrowserUtils.waitForVisibility(createACarElement,10);
        BrowserUtils.waitForClickablility(createACarElement,10);
        createACarElement.click();
    }

}
