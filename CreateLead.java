package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		WebElement username = driver.findElementById("username");
		username.sendKeys("Demosalesmanager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Create Lead").click();
		
		
		driver.findElementById("createLeadForm_companyName").sendKeys("Saphire Systems");
		
		driver.findElementById("createLeadForm_firstName").sendKeys("Kalanithi");
		
		driver.findElementById("createLeadForm_lastName").sendKeys("Natarajan");
		
		
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		
		Select dropdown = new Select(source);
		
		dropdown.selectByVisibleText("Employee");
		
		
		WebElement marketing = driver.findElementById("createLeadForm_marketingCampaignId");
		
		Select dropdown1 = new Select(marketing);
		
		dropdown1.selectByValue("9001");
		
		
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		
		Select dropdown2 = new Select(industry);
		
		List<WebElement> industryoptions = dropdown2.getOptions();
		
		int size = industryoptions.size();
				
		dropdown2.selectByIndex(size-2);
		
		
		WebElement ownership = driver.findElementById("createLeadForm_ownershipEnumId");
		
		Select dropdown3 = new Select(ownership);
		
		dropdown3.selectByIndex(5);
		
		
		WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
		
		Select dropdown4 = new Select(country);
		
		dropdown4.selectByVisibleText("India");
		
		
		driver.findElementByName("submitButton").click();
		
		String title = driver.getTitle();
		
		System.out.println("Title of the resulting page is :" + title);	
		
		
		driver.close();
		
		

	}

}
