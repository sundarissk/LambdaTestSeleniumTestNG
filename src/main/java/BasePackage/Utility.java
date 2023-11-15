package BasePackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {

	public static void explicitWait(WebDriver driver, By locator ) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		
		 // ExpectedCondition for Visibility of All Elements Located
		 List<WebElement> allVisibleElements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
}
