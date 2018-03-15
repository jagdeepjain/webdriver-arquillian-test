package org.jagdeep.example.arquillian.google.tests;

import java.net.URL;

import org.jagdeep.example.arquillian.google.page.GooglePage;
import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.page.Page;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.arquillian.testng.Arquillian;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest extends Arquillian {
	
    @Page
    GooglePage googlePage;
    
    @Test(priority = 1)
    public void f() {
    	googlePage.goTo();
       	googlePage.searchFor("Jagdeep");
    }
}
