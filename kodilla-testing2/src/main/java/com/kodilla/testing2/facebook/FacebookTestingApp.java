package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_DAY = "//div[contains(@class, \"_5k_5\")]/span//span/select[1]";
    public static final String XPATH_MONTH = "//div[contains(@class, \"_5k_5\")]/span//span/select[2]";
    public static final String XPATH_YEAR = "//div[contains(@class, \"_5k_5\")]/span//span/select[3]";
    public static final String XPATH_WAIT = "//select[3]";



    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com//");

        while(!driver.findElement(By.xpath(XPATH_WAIT)).isDisplayed());

        WebElement selectDayCombo = driver.findElement(By.xpath(XPATH_DAY));
        Select dayBoard = new Select(selectDayCombo);
        dayBoard.selectByIndex(2);

        WebElement selectMonthCombo = driver.findElement(By.xpath(XPATH_MONTH));
        Select monthBoard = new Select(selectMonthCombo);
        monthBoard.selectByIndex(2);

        WebElement selectYearCombo = driver.findElement(By.xpath(XPATH_YEAR));
        Select yearBoard = new Select(selectYearCombo);
        yearBoard.selectByIndex(2);
    }
}
