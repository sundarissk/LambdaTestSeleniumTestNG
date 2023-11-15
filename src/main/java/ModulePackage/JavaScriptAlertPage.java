package ModulePackage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertPage {

	WebDriver driver;
	// WebElement

	static final By clickmejavasc = By.xpath("//div[@class='mt-30 rounded'][1]//button");

	// Constructor
	public JavaScriptAlertPage(WebDriver driver) {
		this.driver = driver;
	}
	// Actions

	public void AlertMessageValidate() {

		String alertmv = "I am an alert box!";
		driver.findElement(clickmejavasc).click();

		Alert alert = driver.switchTo().alert();
		String alertm = driver.switchTo().alert().getText();
		alert.accept();

		System.out.println("Assertion status");
		assertEquals(alertm, alertmv);
		if (alertm.equals(alertmv)) {
			System.out.println(alertm + "  Validation pass  " + alertmv);
		} else
			System.out.println(alertm + "  Validation fail  " + alertmv);

	}
}
