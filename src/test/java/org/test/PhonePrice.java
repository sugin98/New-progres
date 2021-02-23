package org.test;

import java.util.Date;

import org.base.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.samp.Login;

public class PhonePrice extends BaseClass {
@BeforeClass
public static void beforeClass() {
	launchBrowser();
	System.out.println("Before class");
}
@AfterClass
public static void AfterClass() {
	closeBrowser();
	System.out.println("After class");
}
@Before
public void before() {
	Date d=new Date();
	System.out.println("Text starts...."+d);
	
}
@After
public void After() {
	Date d=new Date();
	System.out.println("Text Starts...."+d);
}
@Test
public void test1(){
	launchUrl("https://www.amazon.in/");
	Login l=new Login();
	txt(l.getTxtSearch(),"iphone 7");
	button(l.getBtnClick());
}

}
