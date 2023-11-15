package ModulePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import BasePackage.Utility;

public class MainPage {
	WebDriver driver;

	static final By ele = By.xpath("//a [@href]");
	static final By checkbox = By.xpath("//a[contains(text(),'Checkbox Demo')]");
	static final By javascriptalert = By.xpath("//a[contains(text(),'Javascript Alerts')]");

	public MainPage(WebDriver driver) {
		this.driver = driver;
	}

	public void ExplicitWaitTest() {
		Utility.explicitWait(driver, ele);
	}

	public void ValidatePageTitle() {

		String ptitle = driver.getTitle();
		String vtitle = "LambdaTest";

		SoftAssert as = new SoftAssert();
		as.assertTrue(ptitle.equals(vtitle), "Assertion Fails");
		System.out.println(ptitle + " ********* " + vtitle);
		as.assertAll();

	}

	public CheckBoxPage CheckboxDemo() {
		driver.findElement(checkbox).click();
		return new CheckBoxPage(driver);

	}
	
	public JavaScriptAlertPage JavaScriptAlert() {
		driver.findElement(javascriptalert).click();
		return new JavaScriptAlertPage(driver);
		
	}

}
