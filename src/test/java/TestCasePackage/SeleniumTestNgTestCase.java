package TestCasePackage;

import org.testng.annotations.Test;

import BasePackage.DriverClass;
import ModulePackage.CheckBoxPage;
import ModulePackage.JavaScriptAlertPage;
import ModulePackage.MainPage;

public class SeleniumTestNgTestCase extends DriverClass {

	@Test(priority = 0)
	public void MainPageTestCase() {
		MainPage mp = new MainPage(driver);
		try {
			mp.ExplicitWaitTest();
		} catch (Exception e) {
			System.out.println(e);

		}
		try {
			mp.ValidatePageTitle();

		} catch (Exception e) {
			System.out.println(e);

		}

	}

	@Test(priority = 1)
	public void CheckBoxPageTestCase() {
		MainPage cbp = new MainPage(driver);
		cbp.CheckboxDemo();

		CheckBoxPage cbd = new CheckBoxPage(driver);
		cbd.SingleCheckBoxClickValidate();
		cbd.SingleCheckBoxUnClickValidate();

		System.out.println(" Scenario 2 Done ");

	}

	@Test(priority = 2)
	public void JavaScriptAlertTestCase() {

		MainPage jsa = new MainPage(driver);
		jsa.JavaScriptAlert();

		JavaScriptAlertPage jsp = new JavaScriptAlertPage(driver);
		jsp.AlertMessageValidate();

		System.out.println(" Scenario 3 Done ");

	}
}
