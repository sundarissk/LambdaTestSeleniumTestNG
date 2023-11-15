package BasePackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class DriverClass {

	public static String username = "ssk.sdet";
	public static String accesskey = "CUUvWss6JIVYBNIps4Wof0uiLNJJ4x83fVCJ7jgsFRvslRGdkQ";
	public static RemoteWebDriver driver = null;
	public static String gridURL = "@hub.lambdatest.com/wd/hub";
	public static DesiredCapabilities browserOptions = new DesiredCapabilities();

	@BeforeMethod
	@Parameters(value = { "browser", "version", "platform" })
	public void BrowserSetUP(String browser, String version, String platform) {
		if (browser.equalsIgnoreCase("chrome")) {

			HashMap<String, Object> ltOptions = new HashMap<String, Object>();
			ltOptions.put("browserName", browser);
			ltOptions.put("version", version);
			ltOptions.put("platform", platform);

			ltOptions.put("build", "ParallelExceution_SeleniumJava");
			ltOptions.put("project", "DemoSleniumJava101");
			ltOptions.put("name", "ParallelLambdaExceution_SeleniumJava_101");

			ltOptions.put("visual", true);
			ltOptions.put("video", true);
			ltOptions.put("network", true);
			ltOptions.put("w3c", true);

			browserOptions.setCapability("LT:Options", ltOptions);

		} else if (browser.equalsIgnoreCase("Firefox")) {

			HashMap<String, Object> ltOptions = new HashMap<String, Object>();
			ltOptions.put("browserName", browser);
			ltOptions.put("version", version);
			ltOptions.put("platform", platform);

			ltOptions.put("build", "ParallelExceution_SeleniumJava");
			ltOptions.put("project", "DemoSleniumJava101");
			ltOptions.put("name", "ParallelLambdaExceution_SeleniumJava_101");

			ltOptions.put("visual", true);
			ltOptions.put("video", true);
			ltOptions.put("network", true);
			ltOptions.put("w3c", true);

			browserOptions.setCapability("LT:Options", ltOptions);

		} else if (browser.equalsIgnoreCase("edge")) {

			HashMap<String, Object> ltOptions = new HashMap<String, Object>();
			ltOptions.put("browserName", browser);
			ltOptions.put("version", version);
			ltOptions.put("platform", platform);

			ltOptions.put("build", "ParallelExceution_SeleniumJava");
			ltOptions.put("project", "DemoSleniumJava101");
			ltOptions.put("name", "ParallelLambdaExceution_SeleniumJava_101");

			ltOptions.put("visual", true);
			ltOptions.put("video", true);
			ltOptions.put("network", true);
			ltOptions.put("w3c", true);

			browserOptions.setCapability("LT:Options", ltOptions);
		} else {

			HashMap<String, Object> ltOptions = new HashMap<String, Object>();
			ltOptions.put("browserName", browser);
			ltOptions.put("version", version);
			ltOptions.put("platform", platform);

			ltOptions.put("build", "ParallelExceution_SeleniumJava");
			ltOptions.put("project", "DemoSleniumJava101");
			ltOptions.put("name", "ParallelLambdaExceution_SeleniumJava_101");

			ltOptions.put("visual", true);
			ltOptions.put("video", true);
			ltOptions.put("network", true);
			ltOptions.put("w3c", true);

			browserOptions.setCapability("LT:Options", ltOptions);
		}
		try {
			driver = new RemoteWebDriver(new URL("https://" + username + ":" + accesskey + gridURL), browserOptions);

		} catch (MalformedURLException e) {
			System.out.println("Invalid grid URL");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.lambdatest.com/selenium-playground/");

	}

	@AfterMethod
	public void BrowserCloseing() {
		if (driver != null) {
			System.out.println("End of browser Testing : ");

			// driver.close();
			driver.quit();

		}

	}
}