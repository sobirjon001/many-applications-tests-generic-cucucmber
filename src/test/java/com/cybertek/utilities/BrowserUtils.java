package com.cybertek.utilities;

public interface BrowserUtils {

  default void sleep(int seconds){
    try {
      Thread.sleep(seconds * 1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
