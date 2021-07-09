package screenshots;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alerts {

	 static WebDriver driver;
		static	Robot robot;

	 
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {

		driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		Thread.sleep(1000);
		
		//Alert with OK
		driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click(); 
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click(); 
		Thread.sleep(1000);
		
		String msg=driver.switchTo().alert().getText();
		RobotScreenshots.screenshot(robot);
		System.out.println(msg);
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		//Alert with OK and Cancel
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		String msg1=driver.switchTo().alert().getText();
		RobotScreenshots.screenshot(robot);
		Thread.sleep(1000);
		System.out.println(msg1);
		driver.switchTo().alert().accept();//press ok
		
		String ok=driver.findElement(By.xpath("//p[@id='demo']")).getText(); 
		RobotScreenshots.screenshot(robot);
		Thread.sleep(1000);
		System.out.println(ok);
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(1000);
		String msg2=driver.switchTo().alert().getText(); 
		RobotScreenshots.screenshot(robot);
		System.out.println(msg2);
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();//press cancel
		
		String cancel=driver.findElement(By.xpath("//p[@id='demo']")).getText(); 
		RobotScreenshots.screenshot(robot);
		System.out.println(cancel);
		
		//Alert with Textbox
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		String msg3=driver.switchTo().alert().getText(); 
		RobotScreenshots.screenshot(robot);
		Thread.sleep(1000);
		System.out.println(msg3);
		driver.switchTo().alert().sendKeys("Jagadeesh"); 
		RobotScreenshots.screenshot(robot);
		Thread.sleep(1000);
		driver.switchTo().alert().accept();//press ok

		String ok2=driver.findElement(By.xpath("//p[@id='demo1']")).getText(); 
		RobotScreenshots.screenshot(robot);
		System.out.println(ok2);

		Thread.sleep(1000);
		driver.close();

	}

}
