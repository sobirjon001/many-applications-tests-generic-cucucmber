package com.cybertek.step_definitions;

import com.cybertek.pages.practiceCybertec.DropdownList_Page;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class PracticeCybertek_Dropdowns_StepDefinitions implements BrowserUtils {
  DropdownList_Page dropdownList_page = new DropdownList_Page();

  @Given("User is on the dropdowns page of practice tool")
  public void user_is_on_the_dropdowns_page_of_practice_tool() {
    Driver.getDriver().get(
            ConfigurationReader.getProperty("CybertekDropdowns_URL")
    );
  }

  @Then("User should see below info in month dropdown")
  public void user_should_see_in_month_dropdown(List<String> expectedMonths) {
    Select select = new Select(dropdownList_page.dropdownMonths);
    List<WebElement> actualMonthsWebEls = select.getOptions();
    List<String> actualMonths = getElemetnsText(actualMonthsWebEls);
    Assert.assertEquals(expectedMonths, actualMonths);
  }
}
