package week2.day1;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	//import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.support.ui.Select;


	import io.github.bonigarcia.wdm.WebDriverManager;

	public class LearnSeleniumAssignment2 {

			public static void main(String[] args) {
				//Creating the path
				WebDriverManager.chromedriver().setup();
				
				//Launch the Browser
				ChromeDriver driver = new ChromeDriver();
				
				//URL Loading(leafTap)
				driver.get("http://leaftaps.com/opentaps/");
				
				//maximize the window
				driver.manage().window().maximize();
				
				//find the User name
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				
				//find the password
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				//3. Click on Login Button using Class Locator
				 driver.findElement(By.className("decorativeSubmit")).click();
				
				 //4. Click on CRM/SFA Link
				 driver.findElement(By.linkText("CRM/SFA")).click();
				  
				 //5. Click on Leads Button
				 driver.findElement(By.linkText("Leads")).click();
				 
				  //6. Click on Create Lead 
				 driver.findElement(By.linkText("Create Lead")).click();
				 
				  //7. Enter CompanyName Field Using id Locator
				 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
				 
				 //8. Enter FirstName Field Using id Locator
				 //driver.findElement(By.id("createLeadForm_parentPartyId")).sendKeys("TestLeaf1");
				  
				//9. Enter FirstName(Local) Field Using id Locator
				 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Usha");
				 
				 //10. Enter LastName Field Using id Locator
				 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kranthi");
				  
				 //11. Enter Department Field Using any Locator of Your Choice
				 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation Testing");
				 
				 //12. Enter Description Field Using any Locator of your choice 
				  driver.findElement(By.id("createLeadForm_description")).sendKeys("Learning Java With Selenium");
				 
				 //13. Enter your email in the E-mail address Field using the locator of your choice
				 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Usha.Kranthi@gmail.com");
				  
				  //14. Select State/Province as NewYork Using Visible Text
				 WebElement dropDown =  driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				  
				 Select source = new Select(dropDown );
				 
				 source.selectByValue("NY");
				  
				 //15. Click on Create Button
				 driver.findElement(By.name("submitButton")).click();
			        
				  //16. Click on edit button
				 driver.findElement(By.linkText("Edit")).click();
				 //17. Clear the Description Field using .clear()
				 driver.findElement(By.id("updateLeadForm_description")).clear();
				 
				//18. Fill ImportantNote Field with Any text
				 driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Learning will change your Life");
				 
				//19. Click on update button 
				 driver.findElement(By.name("submitButton")).click();
				 
				//20. Get the Title of Resulting Page. refer the video  using driver.getTitle()
	

			}

		}

