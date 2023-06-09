package week2.day1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
	
	
		public static void main(String[] args) {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("http://leaftaps.com/opentaps/control/login");
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
			driver.findElement(By.xpath("//input[contains(@class,'Submit')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
			
			driver.findElement(By.xpath("//a[text()='Leads']")).click();
			driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
			driver.findElement(By.xpath("//input[contains(@id,'_companyName')]")).sendKeys("TestLeaf");
			driver.findElement(By.xpath("//input[contains(@id,'_firstName')]")).sendKeys("Ramya");
			driver.findElement(By.xpath("//input[contains(@id,'_lastName')]")).sendKeys("RaviKumar");
			driver.findElement(By.xpath("//input[contains(@id,'_firstNameL')]")).sendKeys("Ramya");
			driver.findElement(By.xpath("//input[contains(@id,'_departmentName')]")).sendKeys("Testing");
			driver.findElement(By.xpath("//textarea[contains(@id,'_description')]")).sendKeys("NON IT TO IT - APR 29 BATCH");
			driver.findElement(By.xpath("//input[contains(@id,'_primaryEmail')]")).sendKeys("ramyareddy1596@gmail.com");
			WebElement element = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			Select option=new Select(element);
			option.selectByVisibleText("New York");
			driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
			System.out.println("Lead has been created");


	}

}
