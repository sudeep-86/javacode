package corejava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlePopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\guru\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		chrome.get("https://admin:admin@the-internet.herokuapp.com/");
		chrome.findElement(By.linkText("Basic Auth")).click();
		
	}

}
