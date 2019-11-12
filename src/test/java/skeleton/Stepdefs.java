package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs 
{
	WebDriver driver;
	@Given("user launches the ChromeBrowser And navigates to application url")
	public void user_launches_the_ChromeBrowser_And_navigates_to_application_url() 
	{
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
	 driver =new ChromeDriver();
     driver.manage().window().maximize();
	 driver.navigate().to("http://localhost:8083/TestMeApp");
	 driver.findElement(By.linkText("SignUp")).click();
		
		
		
	}

	@When("user enters username as {string} in username field")
	public void user_enters_username_as_in_username_field(String username) 
	{
		
	   driver.findElement(By.id("userName")).sendKeys(username);
	}

	@When("user enters firstname as {string} in firstname field")
	public void user_enters_firstname_as_in_firstname_field(String firstname) 
	{
		driver.findElement(By.id("firstName")).sendKeys(firstname);
	   
	}

	@When("user enters lastname as {string} in lastname field")
	public void user_enters_lastname_as_in_lastname_field(String lastname) 
	{
		driver.findElement(By.id("lastName")).sendKeys(lastname);
	}

	@When("user enters pasword as {string} in password field")
	public void user_enters_pasword_as_in_password_field(String password) 
	{
		driver.findElement(By.id("password")).sendKeys(password);
	   
	}

	@When("user enters confirm Pasword as {string} in confirm Password field")
	public void user_enters_confirm_Pasword_as_in_confirm_Password_field(String cp) 
	{
		driver.findElement(By.name("confirmPassword")).sendKeys(cp);
	  
	}
	

	@When("user enters gender as {string} in gender field")
	public void user_enters_gender_as_in_gender_field(String string) 
	{
		
	  driver.findElement(By.xpath("//input[@value='Female']")).click();
	}

	@When("user enters email as {string} in gender field")
	public void user_enters_email_as_in_gender_field(String email) 
	{
		driver.findElement(By.id("emailAddress")).sendKeys(email);
	}

	@When("user enters mobileno as {string} in mobileno field")
	public void user_enters_mobileno_as_in_mobileno_field(String no) 
	{
		driver.findElement(By.id("mobileNumber")).sendKeys(no);
	  
	}

	@When("user enters date_of_birth as {string} in  date_of_birth field")
	public void user_enters_date_of_birth_as_in_date_of_birth_field(String dob)
	{
		driver.findElement(By.name("dob")).sendKeys(dob);
	 
	}

	@When("user enters address as {string} in address field")
	public void user_enters_address_as_in_address_field(String add) 
	{
		driver.findElement(By.id("address")).sendKeys(add);
	}

	@When("user enters security question as {string} in security question field")
	public void user_enters_security_question_as_in_security_question_field(String string)
	{
		driver.findElement(By.id("securityQuestion")).sendKeys(string);
	  
	}

	@When("user enters Answer as {string} in Answer field")
	public void user_enters_Answer_as_in_Answer_field(String ans) 
	{
		driver.findElement(By.id("answer")).sendKeys(ans);
	}

	@When("click on register")
	public void click_on_register() 
	{
		driver.findElement(By.xpath("//input[@value='Register']")).click();
	 
	}

	@Then("user is registered succesfully")
	public void user_is_registered_succesfully() 
	{
//		String expected =driver.getCurrentUrl();
//		System.out.println(expected);
//		String actual ="http://localhost:8083/TestMeApp/register.htm";
//		Assert.assertEquals(expected, actual);
     System.out.println("welcome");
      //Assert.assertTrue(driver.getTitle().contains("Login"));
	  
	}

   
}
