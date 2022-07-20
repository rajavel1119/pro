package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data {

	private void case1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\FrameWork\\driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.carlsberggroup.com/investor-relations/shares/investment-calculator/");
		wd.manage().window().maximize();
		Thread.sleep(3000);
		WebElement btn = wd.findElement(By.xpath("//button[text()='Allow all']"));
		JavascriptExecutor js = (JavascriptExecutor)wd;
		js.executeScript("arguments[0].click()",btn);
		wd.findElement(By.name("cb_age_year_1")).sendKeys("1");
		wd.findElement(By.name("cb_age_year_2")).sendKeys("9");
		wd.findElement(By.name("cb_age_year_3")).sendKeys("9");
		wd.findElement(By.name("cb_age_year_4")).sendKeys("0");
		wd.findElement(By.id("cbgAge-submit")).click();
		Thread.sleep(4000);
		wd.findElement(By.xpath("//a[text()='Dividend Calculator']")).click();
		wd.findElement(By.xpath("//span[text()='15/07/2017']")).click();
		wd.findElement(By.xpath("//input[@class='EurolandTools-TotalReturnAndDividends-CalculatorTab-Input']")).sendKeys("43");
		wd.findElement(By.xpath("//button[text()='Calculate']")).click();	
	}
	private void add() {
		System.out.println("addition");
	}


	private void sub() {
		System.out.println("subtraction");
	}




}
