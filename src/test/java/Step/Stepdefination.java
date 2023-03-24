package Step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefination {

	WebDriver driver;

	@Given("opne the google chrome")
	public void opne_the_google_chrome() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@And("load the orangeHrm url")
	public void load_the_orange_hrm_url() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(2000);

	}

	@When("provide the login ditels")
	public void provide_the_login_ditels() throws InterruptedException {

		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys("Aaiweriyo");

		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("admin12asdgj");

		Thread.sleep(2000);

	}

	@Then("verify the result")

	public void verify_the_result() throws InterruptedException {

		WebElement butt = driver.findElement(By.xpath("//button[@type='submit']"));
		butt.click();

		Thread.sleep(2000);
		String test = driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();
		if (test.equals("Invalid credentials")) {

			System.out.println("successfull");
		} else {
			System.out.println("not successfull");

		}

	}

}
