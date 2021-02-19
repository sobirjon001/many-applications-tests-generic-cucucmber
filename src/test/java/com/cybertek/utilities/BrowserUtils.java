package com.cybertek.utilities;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public interface BrowserUtils {

  default void sleep(int seconds){
    try {
      Thread.sleep(seconds * 1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  // It accepts List<WebElement> and returns List<String>
  default List<String> getElemetnsText(List<WebElement> webElementList){
    List<String> result = new ArrayList<>();
    for (WebElement each : webElementList) {
      result.add(each.getText());
    }
    return result;
  }
}
