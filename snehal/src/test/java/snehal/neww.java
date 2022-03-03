package snehal;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class neww {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// Open Product page
		driver.get("https://stage.gustoreich.at/produkte");
		Thread.sleep(5000);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.navigate().refresh();
		driver.findElement(By.xpath("//input[@id='input-29']")).sendKeys("test");
		driver.findElement(By.cssSelector("button[class*='submit-btn-fill']")).click();
		Thread.sleep(5000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@itemprop='itemListElement']"));
		System.out.print(list.size());
		// //div[@itemprop="itemListElement"]
		driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Zur Kasse')]")).click();

		driver.findElement(By.xpath("//a[normalize-space()='Anmeldung / Registrierung']")).click();
		Thread.sleep(5000);
		driver.navigate().refresh();
		driver.findElement(By.xpath("//*[@id='input-20']")).sendKeys("sujayvbedarkar@gmail.com");
		driver.findElement(By.xpath("//*[@id='input-24']")).sendKeys("Suj@y123");
		driver.findElement(By.xpath("//button[@type='submit']//span[@class='v-btn__content']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//div[@class='v-input ml-3 theme--light v-input--selection-controls v-input--checkbox']//div[@class='v-input--selection-controls__ripple']"))
				.click();
		driver.findElement(By.xpath("//div[@class='d-flex mb-3']//div[@class='v-input--selection-controls__ripple']"))
				.click();
		driver.findElement(By.xpath("//div[@class='d-flex']//div[@class='v-input--selection-controls__ripple']"))
				.click();
		driver.findElement(By.xpath("//button[contains(@class,'submit-btn-fill-color')]")).click();

		driver.findElement(By.xpath("//div[contains(@class,'v-input--selection-controls__ripple primary--text')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("div[class='display-payment-mathod'] button[type='button']")).click();
		
		/*
		 * driver.switchTo().frame("__privateStripeFrame94711");
		 * driver.findElement(By.xpath(
		 * "//div[@id='card-element']//div[@class='__PrivateStripeElement']"))
		 * .sendKeys("424242424242424242"); driver.switchTo().defaultContent();
		 */
		// driver.findElement(By.xpath("//div[contains(@class,'display-payment-mathod')]//button[contains(@class,'ml-0')][normalize-space()='KOSTENPFLICHTIG
		// BESTELLEN']")).click();
		System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'Vielen Dank für Ihre Bestellung')]")).getText());

	}

}
