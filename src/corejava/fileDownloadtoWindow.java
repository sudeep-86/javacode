package corejava;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class fileDownloadtoWindow {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		// TODO Auto-generated method stub
		String downloadpath=	System.getProperty("usr.dir");
		System.out.println(downloadpath);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\guru\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		HashMap<String,Object> chromePrefs = new HashMap<String,Object>();
		chromePrefs.put("profile.default_context_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadpath);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs",chromePrefs);
		WebDriver chrome = new ChromeDriver(options);
		
		chrome.get("https://airconvertpdftojpg.com/");
		chrome.findElement(By.xpath("//*[@id='dropzoneInput-label']")).click();
		WebDriverWait wait = new WebDriverWait(chrome,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class*='medium']")));
		Thread.sleep(3000l);
		Runtime.getRuntime().exec("C:\\Users\\guru\\OneDrive\\Desktop\\German Classes\\New folder\\FileUpload.exe");
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[class*='secondary']")));
		chrome.findElement(By.cssSelector("a[class*='secondary']")).click();
		Thread.sleep(5000l);
		File f = new File(downloadpath+"/Result.zip");
		if(f.exists())
		{
			System.out.println("file found");
			Assert.assertTrue(f.exists());
			if(f.delete()) {
				System.out.println("File Deleted");
			}
		}
		

	}

}
