package com.cybertek.pages.smartBear;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Lending_Page {

  public Lending_Page(){
    PageFactory.initElements(Driver.getDriver(), this);
  }

  @FindBy(xpath = "//a[@href='Process.aspx']")
  public WebElement orderModuleLink;

  @FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")
  public WebElement selectProduct;

  @FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
  public WebElement inputQuantity;

  @FindBy(id = "ctl00_MainContent_fmwOrder_txtName")
  public WebElement inputCustomerName;

  @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
  public WebElement inputStreet;

  @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
  public WebElement inputCity;

  @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
  public WebElement inputState;

  @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
  public WebElement inputZip;

  @FindBy(id = "ctl00_MainContent_fmwOrder_cardList")
  public WebElement tableRadioBoxesVisaTypes;

  @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
  public WebElement inputCardNumber;

  @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
  public WebElement inputExpDate;

  @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
  public WebElement buttonProcess;

  @FindBy(xpath = "//a[@href='Default.aspx']")
  public WebElement viewAllOrdersLink;

  @FindBy(id = "ctl00_MainContent_orderGrid")
  public WebElement tableListOfAllOrders;
}
