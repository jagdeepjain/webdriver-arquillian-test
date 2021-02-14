package org.jagdeep.example.arquillian.google.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage {

  @FindBy(name = "q")
  private WebElement searchBox;

  @FindBy(name = "btnG")
  private WebElement searchButton;

  public void searchFor(String searchQuery) {
    searchBox.sendKeys(searchQuery);
  }

}