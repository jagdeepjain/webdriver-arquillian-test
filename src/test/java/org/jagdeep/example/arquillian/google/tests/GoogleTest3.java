package org.jagdeep.example.arquillian.google.tests;

import java.net.URL;

import org.jagdeep.example.arquillian.google.page.GooglePage;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.page.Page;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.arquillian.testng.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest3 extends Arquillian {
	
    @Page
    GooglePage googlePage;

  @Deployment
  public static JavaArchive createDeployment() {
    return ShrinkWrap.create(JavaArchive.class)
        .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
  }

  @Test(priority = 1)
    public void f() {
    	googlePage.goTo();
       	googlePage.searchFor("Jagdeep");
    }
}
