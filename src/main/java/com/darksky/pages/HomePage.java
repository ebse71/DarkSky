package com.darksky.pages;

import com.darksky.utils.HelperMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.darksky.base.BasePage.driver;

public class HomePage {

        @FindBy(xpath = "//form[@id='searchForm']//input")
        public static WebElement searchForm;

        @FindBy(xpath = "//img[@alt='Search Button']")
        public static WebElement searchButton;

        @FindBy(xpath = "//span[@class='high-temp-text']")
        public static WebElement hightemp;

        @FindBy(xpath = "//span[@class='low-temp-text']")
        public static WebElement lowtemp;

public HomePage() {
    PageFactory.initElements(driver,this);
}
public static String verifyTitle(){
    return HelperMethods.doGetPageTitle();
}

public static void enterCity(){
    System.out.println("deneme git");
    HelperMethods.sendText(searchForm,"Hünxe");
}
public static void clickSearch(){
    HelperMethods.doClick(searchButton);
}
public static String getTemperatureHigh(){
    return HelperMethods.doGetText(hightemp);
}
public static String getTemperatureLow(){
    return HelperMethods.doGetText(lowtemp);
    }

}
