package corejava;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fileUploadfromWindow {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\guru\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		chrome.get("https://airconvertpdftojpg.com/");
		chrome.findElement(By.xpath("//*[@id='dropzoneInput-label']")).click();
		
		Thread.sleep(3000l);
		Runtime.getRuntime().exec("C:\\Users\\guru\\OneDrive\\Desktop\\German Classes\\New folder\\FileUpload.exe");
	WebDriverWait wait = new WebDriverWait(chrome,10);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class*='medium']")));
	chrome.findElement(By.cssSelector("button[class*='medium']")).click();
	
		}

}
