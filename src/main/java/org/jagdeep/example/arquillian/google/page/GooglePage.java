package org.jagdeep.example.arquillian.google.page;

import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.Graphene;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class GooglePage {

  @Drone
  private RemoteWebDriver driver;

  @ArquillianResource
  private URL contextRoot;

  @FindBy(name = "q")
  private WebElement searchBox;

  @FindBy(name = "btnG")
  private WebElement searchButton;

  public void searchFor(String searchQuery) {
    searchBox.sendKeys(searchQuery);
  }

  public void go() {
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.get(contextRoot.toString());
  }

}