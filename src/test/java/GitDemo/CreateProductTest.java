package GitDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateProductTest {
	
	@Test
	public void createProduct(){
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://localhost:8888");
		
		String UP = "admin";
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(UP);
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(UP);
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		
		String name = "Samsung A80";
		driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();
		driver.findElement(By.xpath("//input[@name='productname']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		
		WebElement AdminEle = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(AdminEle).perform();
		driver.findElement(By.linkText("Sign Out")).click();
		
		driver.quit();
	}
}
