package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

  @Before(order = 2)
  public void setupScenario(){
    System.out.println("Setting up the browser with further details ...");
  }

  @Before(value = "@dataBase", order = 1)
  public void setUpDatabaseOne(){
    System.out.println("Setting up first database");
  }

  @Before(value = "@dataBase", order = 2)
  public void setUpDatabaseTwo(){
    System.out.println("Setting up second database");
  }

  @After
  public void tearDownScenario(){
    System.out.println("Taking a screenshot");
    System.out.println("Closing the browser");
    Driver.closeDriver();
  }
}
