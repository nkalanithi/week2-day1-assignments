package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Accounts").click();
		driver.findElementByLinkText("Create Account").click();
		
		driver.findElementById("accountName").sendKeys("Debit Limited Account - S");
		driver.findElementById("groupNameLocal").sendKeys("Chennai");
		driver.findElementById("officeSiteName").sendKeys("Ascendas");
		driver.findElementById("annualRevenue").sendKeys("15000");
		driver.findElementByName("description").sendKeys("Selenium Automation Tester");
		
		WebElement industry = driver.findElementByName("industryEnumId");
		
		Select dropdown = new Select(industry);
		
		dropdown.selectByVisibleText("Computer Software");
		
		
		WebElement ownership = driver.findElementByName("ownershipEnumId");
		
		Select dropdown1 = new Select(ownership);
		
		dropdown1.selectByVisibleText("S-Corporation");
		
		
		WebElement source = driver.findElementById("dataSourceId");
		
		Select dropdown2 = new Select(source);
		
		dropdown2.selectByValue("LEAD_EMPLOYEE");
		
		
		WebElement marketing = driver.findElementById("marketingCampaignId");
		
		Select dropdown3 = new Select(marketing);
		
		dropdown3.selectByIndex(6);
		
		
		WebElement state = driver.findElementById("generalStateProvinceGeoId");
		
		Select dropdown4 = new Select(state);
		
		dropdown4.selectByValue("TX");
		
		driver.findElementByClassName("smallSubmit").click();
		
		driver.close();
			
		

	}

}
