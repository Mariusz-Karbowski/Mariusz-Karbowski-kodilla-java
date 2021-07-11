package com.kodilla.selen.facebook;

import com.kodilla.selen.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_COOKIES_CONSENT = "//*[@data-testid='cookie-policy-dialog-accept-button']";
    public static final String XPATH_CREATE_ACCOUNT = "//*[@data-testid='open-registration-form-button']";
    public static final String XPATH_DOB = "//*[@id=\"day\"]";
    public static final String XPATH_MOB = "//*[@id=\"month\"]";
    public static final String XPATH_YOB = "//*[@id=\"year\"]";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement cookiesConsent = driver.findElement(By.xpath(XPATH_COOKIES_CONSENT));
        cookiesConsent.click();

        WebElement createAccount = driver.findElement(By.xpath(XPATH_CREATE_ACCOUNT));
        createAccount.click();
        Thread.sleep(2000);

        while (!driver.findElement(By.xpath(XPATH_DOB)).isDisplayed());

        WebElement dOB = driver.findElement(By.xpath(XPATH_DOB));
        Select selectDOB = new Select(dOB);
        selectDOB.selectByValue("23");

        WebElement mOB = driver.findElement(By.xpath(XPATH_MOB));
        Select selectMOB = new Select(mOB);
        selectMOB.selectByVisibleText("wrz");

        WebElement yOB = driver.findElement(By.xpath(XPATH_YOB));
        Select selectYOB = new Select(yOB);
        selectYOB.selectByValue("1972");
    }
}
