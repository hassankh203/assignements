package novemberassignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class November_20_Assignement {
	public static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rediff.com");
		List<WebElement> rediffLinks = driver.findElements(By.tagName("a"));
		System.out.println("The number of links on reddiff website Home page :" + " " + rediffLinks.size());
// I used a for loop just for up to 8 since 269 might take more time to execute
		for (int i = 0; i < 8; i++) {
			List<WebElement> rediffLinks1 = driver.findElements(By.tagName("a"));

			System.out.println(rediffLinks1.get(i).getText());
			rediffLinks1.get(i).click();

			driver.navigate().back();
		}
		driver.quit();

	}

}
