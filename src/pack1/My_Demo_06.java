package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class My_Demo_06 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\Driver\\Chrome Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to("http://10.232.237.143:443/TestMeApp");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("SignUp")));
		driver.findElement(By.xpath("//a[contains(text(),'SignUp')]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("adgjlzcbm");
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Sunil");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sfhkxvn");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("sfhkxvn");
		driver.findElement(By.xpath("//input[@value = 'Male']")).click();
		driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("9908312097");
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("adgjlzcbm@gmail.com");
		driver.findElement(By.xpath("//input[@name='dob']")).sendKeys("05/29/1997");
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("Telangana");
		WebElement question = driver.findElement(By.xpath("//select[@name = 'securityQuestion']"));
		Select ques1 = new Select(question);
		ques1.selectByIndex(1);
		driver.findElement(By.xpath("//input[@name='answer']")).sendKeys("Red");;
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		driver.close();	
	}
}