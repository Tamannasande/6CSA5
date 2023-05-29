package AssignmentMethod;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class UserInputBrowser {
public static void main(String[] args) {
	System.out.println("Enter Value to open browser 1-ChromeBrowser and 2-EdgeBrowser");
	Scanner sc=new Scanner(System.in);
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--kiosk");
	WebDriver driver;
	int value = sc.nextInt();
	switch(value) {
	case 1:{
		driver= new ChromeDriver(options);
		System.out.println("Opening");
		driver.manage().window().fullscreen();
		driver.get("https://www.amazon.com");
		
		break;
		}
	case 2: {
		driver=new EdgeDriver();
		System.out.println("Opening");
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com");
		break;
	}
	}
	}
}


