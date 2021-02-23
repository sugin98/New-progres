package org.samp;

import org.base.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClass {
	public Login() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "twotabsearchtextbox")
	private WebElement txtSearch;

	public WebElement getTxtSearch() {
		return txtSearch;

	}

	@FindBy(id = "nav-search-submit-button")
	private WebElement btnClick;

	public WebElement getBtnClick() {
		return btnClick;
	}
}
