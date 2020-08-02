package org.jagdeep.example.arquillian.google.tests;

import org.jagdeep.example.arquillian.google.page.GooglePage;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class GoogleTest2 {

  @Test(priority = 1)
  public void f() throws MalformedURLException {
    RemoteWebDriver driver = new RemoteWebDriver(new URL("http://0.0.0" +
        ".0:4444/wd/hub"), new ChromeOptions());
    GooglePage googlePage = new GooglePage(driver);

    googlePage.goTo();
    googlePage.searchFor("Jagdeep");

    Assert.assertEquals("Google", driver.getTitle());

    System.out.println("Test Ran from GoogleTest2.");

    driver.close();
  }
}
