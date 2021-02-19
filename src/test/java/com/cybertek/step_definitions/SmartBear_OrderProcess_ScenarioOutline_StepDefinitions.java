package com.cybertek.step_definitions;

import com.cybertek.pages.smartBear.Lending_Page;
import com.cybertek.pages.smartBear.Login_Page;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Map;

public class SmartBear_OrderProcess_ScenarioOutline_StepDefinitions implements BrowserUtils {

  private Login_Page login_page = new Login_Page();
  private Lending_Page lending_page = new Lending_Page();

  @Given("User is logged into SmartBear Tester account as {string} with {string} password")
  public void user_is_logged_into_smart_bear_tester_account_as_with_password(String userName, String password) {
    Driver.getDriver().get(
            ConfigurationReader.getProperty("smartBear_URL")
    );
    login_page.inputUserName.sendKeys(userName);
    login_page.inputPassword.sendKeys(password);
    sleep(1);
    login_page.buttonLogin.click();
  }

  @And("User is on Order page")
  public void user_is_on_order_page() {
    lending_page.orderModuleLink.click();
  }
  @When("User selects {string} from product dropdown")
  public void user_selects_from_product_dropdown(String product) {
    Select select = new Select(lending_page.selectProduct);
    select.selectByVisibleText(product);
    sleep(1);
  }
  @When("User enters {string} to quantity")
  public void user_enters_to_quantity(String quantity) {
    lending_page.inputQuantity.clear();
    lending_page.inputQuantity.sendKeys(quantity);
  }
  @When("User enters {string} to customer name")
  public void user_enters_to_costumer_name(String customerName) {
    lending_page.inputCustomerName.sendKeys(customerName);
  }
  @When("User enters {string} to street")
  public void user_enters_to_street(String street) {
    lending_page.inputStreet.sendKeys(street);
  }
  @When("User enters {string} to city")
  public void user_enters_to_city(String city) {
    lending_page.inputCity.sendKeys(city);
  }
  @When("User enters {string} to state")
  public void user_enters_to_state(String state) {
    lending_page.inputState.sendKeys(state);
  }
  @When("User enters {string} to zip")
  public void user_enters_to_zip(String zip) {
    lending_page.inputZip.sendKeys(zip);
  }
  @When("User selects {string} as card type")
  public void user_selects_as_card_type(String cardType) {
    lending_page.tableRadioBoxesVisaTypes.findElement(By.xpath(
            ".//label[.='" + cardType + "']/../input"
    )).click();
  }
  @When("User enters {string} to card number")
  public void user_enters_to_card_number(String cardNumber) {
    lending_page.inputCardNumber.sendKeys(cardNumber);
  }
  @When("User enters {string} to expiration date")
  public void user_enters_to_expiration_date(String expirationDate) {
    lending_page.inputExpDate.sendKeys(expirationDate);
  }
  @When("User clicks process button")
  public void user_clicks_process_button() {
    sleep(1);
    lending_page.buttonProcess.click();
    sleep(1);
  }
  @When("User is in View All Orders page")
  public void user_is_view_all_orders_page() {
    lending_page.viewAllOrdersLink.click();
  }
  @Then("User verifies {string} is in the list")
  public void user_verifies_is_in_the_list(String expectedCustomerName) {
    String actualCustomerName = lending_page.tableListOfAllOrders.findElement(By.xpath(
            ".//tr[2]/td[2]"
    )).getText();

    Assert.assertEquals(expectedCustomerName, actualCustomerName);
  }

  @Given("user is already logged in to SmartBear")
  public void user_is_already_logged_in_to_smart_bear() {
    login_page.loginToSmartBear_Config();
  }
  @Then("user enters address information")
  public void user_enters_address_information(Map<String, String> dataTable) {
    String customerName = dataTable.get("customerName");
    String street = dataTable.get("street");
    String city = dataTable.get("city");
    String state = dataTable.get("state");
    String zip = dataTable.get("zip");
    lending_page.inputCustomerName.sendKeys(customerName);
    lending_page.inputStreet.sendKeys(street);
    lending_page.inputCity.sendKeys(city);
    lending_page.inputState.sendKeys(state);
    lending_page.inputZip.sendKeys(zip);
  }
  @Then("user enters payment information")
  public void user_enters_payment_information(Map<String, String> dataTable) {
    String cardType = dataTable.get("cardType");
    String cardNumber = dataTable.get("cardNumber");
    String expirationDate = dataTable.get("expirationDate");
    lending_page.tableRadioBoxesVisaTypes.findElement(By.xpath(
            ".//label[.='" + cardType + "']/../input"
    )).click();
    lending_page.inputCardNumber.sendKeys(cardNumber);
    lending_page.inputExpDate.sendKeys(expirationDate);
  }
}
