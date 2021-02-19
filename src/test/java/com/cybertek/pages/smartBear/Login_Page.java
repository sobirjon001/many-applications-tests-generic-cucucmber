package com.cybertek.pages.smartBear;


import com.cybertek.utilities.ConfigurationReader;
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
  public WebElement inputPassword;

  @FindBy(id = "ctl00_MainContent_login_button")
  public WebElement buttonLogin;

  public void loginToSmartBear(){
    inputUserName.sendKeys("Tester");
    inputPassword.sendKeys("test");
    buttonLogin.click();
  }

  public void loginToSmartBear(String userName, String password){
    Driver.getDriver().get(
            ConfigurationReader.getProperty("smartBear_URL")
    );
    inputUserName.sendKeys(userName);
    inputPassword.sendKeys(password);
    buttonLogin.click();
  }

  public void loginToSmartBear_Config(){
    Driver.getDriver().get(
            ConfigurationReader.getProperty("smartBear_URL")
    );
    inputUserName.sendKeys(ConfigurationReader.getProperty("smartBear_userName"));
    inputPassword.sendKeys(ConfigurationReader.getProperty("smartBear_password"));
    buttonLogin.click();
  }
}
