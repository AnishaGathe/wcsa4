package qsp1;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rtp1 {
public static void main(String[] args) throws InterruptedException {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("which browser u want to open !!");
	 String browserValue=sc.next();
	 if(browserValue.equalsIgnoreCase("chrome"));
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.instagram.com");
	Thread.sleep(4000);
	driver.close();
}
}


