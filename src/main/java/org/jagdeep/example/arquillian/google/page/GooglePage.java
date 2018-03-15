package org.jagdeep.example.arquillian.google.page;

import java.net.URL;
import java.util.List;

import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.Graphene;
import org.jboss.arquillian.graphene.findby.FindByJQuery;
import org.jboss.arquillian.graphene.page.Location;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GooglePage {
	
	@Drone
    private WebDriver driver;
	
	@ArquillianResource
    private URL contextRoot;
	
    @FindBy(name = "q")
    private WebElement searchBox;
 
    @FindBy(name = "btnG")
    private WebElement searchbutton;
 
    @FindByJQuery(".rc")
    private List <WebElement> results;
 
    public void searchFor(String searchQuery) {
        searchBox.sendKeys(searchQuery);
        System.out.println("Test Ran fine");
    }
    
    public void goTo() {
    	driver.get(contextRoot.toString());
    }
    
}