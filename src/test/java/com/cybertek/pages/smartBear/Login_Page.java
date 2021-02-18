package com.cybertek.pages.smartBear;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

  public Login_Page(){
    PageFactory.initElements(Driver.getDriver(), this);
  }

  @FindBy(id = "ctl00_MainContent_username")
  public WebElement inputUserName;

  @FindBy(id = "ctl00_MainContent_password")
  public WebElement getInputPassword;

  @FindBy(id = "ctl00_MainContent_login_button")
  public WebElement buttonLogin;
}
