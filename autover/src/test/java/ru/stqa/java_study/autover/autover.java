package ru.stqa.java_study.autover;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.fail;

public class autover {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
    driver = new FirefoxDriver();
  }

  @Test
  public void testUntitledTestCase() throws Exception {
    driver.get("http://i.control.fbn/games/testslots");
    driver.findElement(By.name("_username")).click();
    driver.findElement(By.name("_username")).clear();
    driver.findElement(By.name("_username")).sendKeys("test");
    driver.findElement(By.name("_password")).clear();
    driver.findElement(By.name("_password")).sendKeys("123456");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Авторизация'])[1]/following::button[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Автомат'])[1]/following::span[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crazy Fruits'])[2]/following::span[1]")).click();
    driver.findElement(By.id("form-cost")).click();
    driver.findElement(By.id("form-cost")).clear();
    driver.findElement(By.id("form-cost")).sendKeys("1");
    driver.findElement(By.id("form-number")).click();
    driver.findElement(By.id("form-number")).clear();
    driver.findElement(By.id("form-number")).sendKeys("1000000");
    driver.findElement(By.id("form-use_safe_life_sets")).click();
    driver.findElement(By.id("form-use_safe_life_sets")).clear();
    driver.findElement(By.id("form-use_safe_life_sets")).sendKeys("1");
    driver.findElement(By.id("form-probabilities")).click();
    driver.findElement(By.id("form-probabilities")).clear();
    driver.findElement(By.id("form-probabilities")).sendKeys("2377|2247|1090|2012|1778|1000|186|761|416");
    driver.findElement(By.id("start")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
