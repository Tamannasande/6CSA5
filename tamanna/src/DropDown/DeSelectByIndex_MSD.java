package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectByIndex_MSD {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/HP/Desktop/dropdown.html");
		WebElement city = driver.findElement(By.id("city"));
		Select select = new Select(city);
		Thread.sleep(4000);
		select.selectByIndex(2);
		Thread.sleep(4000);
		select.deselectByIndex(2);


	}

}