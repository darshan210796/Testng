package darshanseries.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {
	
	private WebDriver odriver;
	
	public JavaScriptUtil(WebDriver odriver) {
		this.odriver = odriver;
	}
	
	public void flash(WebElement element) {
		String bgcolor = element.getCssValue("backgroundColor");
		for (int i = 0; i < 10; i++) {
			changeColor("rgb(255,255,0)", element);// 1
			changeColor(bgcolor, element);// 2
		}
	}

	private void changeColor(String color, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) odriver);
		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);

		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
		}
	}

	public String getTitleByJS() {
		JavascriptExecutor js = (JavascriptExecutor) odriver;
		return js.executeScript("return document.title;").toString();
	}

	public void goBackByJS() {
		JavascriptExecutor js = (JavascriptExecutor) odriver;
		js.executeScript("history.go(-1)");
	}
	
	public void goForwardByJS() {
		JavascriptExecutor js = (JavascriptExecutor) odriver;
		js.executeScript("history.go(1)");
	}
	
	public void refreshBrowserByJS() {
		JavascriptExecutor js = (JavascriptExecutor) odriver;
		js.executeScript("history.go(0);");
	}

	public void generateAlert(String message) {
		JavascriptExecutor js = (JavascriptExecutor) odriver;
		js.executeScript("alert('" + message + "')");
	}
	
	public void generateConfirmPopUp(String message) {
		JavascriptExecutor js = (JavascriptExecutor) odriver;
		js.executeScript("confirm('" + message + "')");
	}

	public String getPageInnerText() {
		JavascriptExecutor js = (JavascriptExecutor) odriver;
		return js.executeScript("return document.documentElement.innerText;").toString();
	}

	public void clickElementByJS(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) odriver;
		js.executeScript("arguments[0].click();", element);
	}

	public void sendKeysUsingWithId(String id, String value) {
		JavascriptExecutor js = (JavascriptExecutor) odriver;
		js.executeScript("document.getElementById('" + id + "').value='" + value + "'");
						  //document.getElementById('input-email').value ='tom@gmail.com'
	}

	public void scrollPageDown() {
		JavascriptExecutor js = (JavascriptExecutor) odriver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public void scrollPageDown(String height) {
		JavascriptExecutor js = (JavascriptExecutor) odriver;
		js.executeScript("window.scrollTo(0, '" + height + "')");
	}

	public void scrollPageUp() {
		JavascriptExecutor js = (JavascriptExecutor) odriver;
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
	}
	
	public void scrollPageDownMiddlepage() {
		JavascriptExecutor js = (JavascriptExecutor) odriver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight/2)");
	}

	public void scrollIntoView(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) odriver;
		js.executeScript("arguments[0].scrollIntoView(false);", element);
	}

	public void drawBorder(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) odriver;
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	

}
