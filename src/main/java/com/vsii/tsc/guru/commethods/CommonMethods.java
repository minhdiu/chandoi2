package com.vsii.tsc.guru.commethods;

import org.openqa.selenium.By;

import com.vsii.tsc.guru.pages.method.ISMS_LoginPageMethod;
import com.vsii.tsc.utility.TestBase;

public class CommonMethods {
  //Check login or not
	public static void checkLogin(){
		ISMS_LoginPageMethod objLogin;
		objLogin = new ISMS_LoginPageMethod(TestBase.driver);
		if(TestBase.driver.findElements(By.name("login")).size()!=0){
			objLogin.login("diuttm", "duong123*");
		}
	}
}
