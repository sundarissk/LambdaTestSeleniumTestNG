package ModulePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxPage {
	WebDriver driver;
	// WebElement

	static final By singlecheckbox = By.id("isAgeSelected");

	// constructor
	public CheckBoxPage(WebDriver driver) {

		this.driver = driver;
	}

	// Actions

	public void SingleCheckBoxClickValidate() {

		driver.findElement(singlecheckbox).click();

		WebElement checkb = driver.findElement(singlecheckbox);

		if (checkb.isSelected() == true) {
			System.out.println(" Check box is selected ");
		} else
			System.out.println(" Check box is not selected  ");

	}

	public void SingleCheckBoxUnClickValidate() {
		driver.findElement(singlecheckbox).click();

		WebElement checkb = driver.findElement(singlecheckbox);

		if (checkb.isSelected() == true) {
			System.out.println(" Check box is selected ");
		} else
			System.out.println(" Check box is not selected  ");

	}

}
