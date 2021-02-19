package com.cybertek.pages.google;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

  public Home_Page(){
    PageFactory.initElements(Driver.getDriver(), this);
  }

  @FindBy(name = "q")
  public WebElement inputSearch;
}
