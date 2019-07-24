package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class My_Demo_05 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://10.232.237.143:443/TestMeApp");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("SignIn")));
		driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("fgmnzx");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mnbvcxz");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'All')]")).click();
		Actions act = new Actions(driver);
		WebElement El1 = driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"));
		act.click(El1).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Head Phone')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Add')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Cart')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Checkout')]")).click();
		driver.findElement(By.xpath("//textarea[@name='ShippingAdd']")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//input[@value = 'Proceed to Pay']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"swit\"]/div[1]/div/label/i")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Continue']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Pass@456");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		driver.findElement(By.xpath("//input[@name='transpwd']")).sendKeys("Trans@456");
		driver.findElement(By.xpath("//input[@value='PayNow']")).click();
	}

}
