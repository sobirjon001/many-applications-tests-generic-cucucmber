package com.cybertek.pages.practiceCybertec;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropdownList_Page {

  public DropdownList_Page(){
    PageFactory.initElements(Driver.getDriver(), this);
  }

  @FindBy(id = "month")
  public WebElement dropdownMonths;
}
