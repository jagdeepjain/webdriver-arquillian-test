package org.jagdeep.example.arquillian.google.tests;

import org.jagdeep.example.arquillian.google.page.GooglePage;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.page.Page;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

@RunWith(Arquillian.class)
public class Google2Test {

  @Drone
  private RemoteWebDriver driver;

  @Page
  GooglePage googlePage;

  @ArquillianResource
  private URL contextRoot;

  @Deployment(testable = false)
  public static JavaArchive createDeployment() {
    return ShrinkWrap.create(JavaArchive.class)
        .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
  }

  @Test
  public void f() throws InterruptedException {
    go();
    googlePage.searchFor("Jagdeep");
    Thread.sleep(1000);
  }

  public void go() {
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.get("https://google.co.in");
  }
}
