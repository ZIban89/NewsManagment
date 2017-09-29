package by.htp.nikonov.task03;

import org.junit.Test;
import org.openqa.selenium.By;

import org.junit.Assert;

public class SeleniumTest extends AbstractSeleniumTest {

	@Test
	public void testFillFields() throws InterruptedException {
		driver.get(URL);
		Thread.sleep(1000);

		int start = driver.findElements(By.xpath("//*[@id=\"newsList\"]/div")).size();

		driver.findElement(By.xpath("//*[@id=\"menuNavigation\"]/div[2]/a")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"title\"]")).sendKeys("testTitle");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"date\"]")).clear();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"date\"]")).sendKeys("10/10/2010");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"brief\"]")).sendKeys("testBrief");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"content\"]")).sendKeys("testTitle");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"newsViewButtons\"]/input[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"menuNavigation\"]/div[1]/a")).click();
		Thread.sleep(500);
		int end = driver.findElements(By.xpath("//*[@id=\"newsList\"]/div")).size();

		Assert.assertEquals(start + 1, end);
	}

	@Test
	public void testEmpryFields() throws InterruptedException {
		driver.get(URL);
		Thread.sleep(1000);

		int start = driver.findElements(By.xpath("//*[@id=\"newsList\"]/div")).size();
		
		driver.findElement(By.xpath("//*[@id=\"menuNavigation\"]/div[2]/a")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"date\"]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"newsViewButtons\"]/input[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"menuNavigation\"]/div[1]/a")).click();	
		Thread.sleep(500);
		int end = driver.findElements(By.xpath("//*[@id=\"newsList\"]/div")).size();

		Assert.assertEquals(start, end);
	}

}
