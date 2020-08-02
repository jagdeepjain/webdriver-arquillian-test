package org.jagdeep.example.arquillian.google.tests;

import org.jagdeep.example.arquillian.google.page.GooglePage;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.graphene.page.Page;
import org.jboss.arquillian.testng.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest1 extends Arquillian {
	
  @Page
  GooglePage googlePage;

  @Test(priority = 1)
  public void f() {
    googlePage.goTo();
    googlePage.searchFor("Jagdeep");
  }

  @Deployment
  public static JavaArchive createDeployment() {
    return ShrinkWrap.create(JavaArchive.class)
        .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
  }

}
