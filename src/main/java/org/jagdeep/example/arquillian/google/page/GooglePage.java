package org.jagdeep.example.arquillian.google.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {

    public GooglePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private WebDriver driver;
    @FindBy(name = "q")

    private WebElement searchBox;
 
    @FindBy(name = "btnG")
    private WebElement searchButton;
 
    public void searchFor(String searchQuery) {
        searchBox.sendKeys(searchQuery);
        System.out.println("Test Ran fine.");
    }
    
    public void goTo() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.get("https://www.google.co.in/");
    }
    
}