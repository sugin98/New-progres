package org.base;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "");
		driver = new ChromeDriver();
		return driver;
	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static void maxiWindow() {
		driver.manage().window().maximize();
	}

	public static void closeBrowser() {
		driver.quit();
	}

	public static String pageTitle() {
		String s = driver.getTitle();
		return s;
	}

	public static String pageUrl() {
		String u = driver.getCurrentUrl();
		return u;
	}

	public static void txt(WebElement e, String va) {
		e.sendKeys(va);
	}

	public static void pass(WebElement e, String pa) {
		e.sendKeys(pa);
	}

	public static void button(WebElement e) {
		e.click();
	}

	public static String getT(WebElement e) {
		String t = e.getText();
		return t;
	}

	public static String Attribut(WebElement e, String val) {
		String s = e.getAttribute(val);
		return s;
	}

	public static void move(WebElement e) {
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();
	}

	public static void draganddrop(WebElement e, WebElement element) {
		Actions a = new Actions(driver);
		a.dragAndDrop(e, element).perform();
	}

	public static void contextClick(WebElement e) {
		Actions a = new Actions(driver);
		a.contextClick(e).perform();
	}

	public static void doubleClick(WebElement e) {
		Actions a = new Actions(driver);
		a.doubleClick(e).perform();
	}

	public static void scrollUp(WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", e);
	}

	public static void scrolldown(WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", e);
	}

	public static void jclick(WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", e);
	}

	public static String getAttribute(WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object o1 = js.executeScript("return arguments[0].getAttribute('value')", e);
		String s1 = (String) o1;
		return s1;
	}

	public static void acceptSimpletext() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	public static void acceptConfirmtext() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	public static void dismissConfirmtext() {
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}

	public static void acceptPromptAlert(String text) {
		Alert a = driver.switchTo().alert();
		a.sendKeys(text);
		a.accept();
	}

	public static void dismissPromptAlert(String text) {
		Alert a = driver.switchTo().alert();
		a.sendKeys(text);
		a.accept();
	}

	public static String getAlertText() {
		Alert a = driver.switchTo().alert();
		String t = a.getText();
		return t;
	}

	public static void switchFrame(String id) {
		driver.switchTo().frame(id);
	}

	public static void switchFrame1(String name) {
		driver.switchTo().frame(name);
	}

	public static void switchFrame2(WebElement e) {
		driver.switchTo().frame(e);
	}

	public static void switchFrame3(int index) {
		driver.switchTo().frame(index);
	}

	public static void main(String[] args) {
		launchBrowser();

	}

}
