package com.cybertek.step_definitions;

import com.cybertek.pages.google.Home_Page;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Google_StepDefinitions {

  Home_Page home_page = new Home_Page();

  @Given("User is on Google home page")
  public void user_is_on_google_home_page() {
    Driver.getDriver().get(ConfigurationReader.getProperty("google_URL"));
  }
  @Then("User should see title is {string}")
  public void user_should_see_title_is_google(String expectedTitle) {
    String actualTitle = Driver.getDriver().getTitle();
    Assert.assertEquals(expectedTitle, actualTitle);
  }

  @When("User Searches for {string}")
  public void user_searches_for(String searchWord) {
    home_page.inputSearch.sendKeys(
            searchWord + Keys.ENTER
    );
  }
  @Then("User should see {string} in the title")
  public void user_should_see_in_the_title(String searchWord) {
    String expectedSearchWordInTitle = searchWord + " - Google Search";
    String actualSearchWordInTitle = Driver.getDriver().getTitle();
    Assert.assertEquals(expectedSearchWordInTitle, actualSearchWordInTitle);
  }
}
