import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//system.out.println("This is my first program.");
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Projects\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.facebook.com");
		//System.out.println(driver.getTitle());
		//driver.close();
		driver.findElement(By.name("email")).click();
		driver.findElement(By.name("email")).sendKeys("kaushik123@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Karthik@aug8");
		driver.findElement(By.name("firstname")).sendKeys("Kaushik");
		driver.findElement(By.name("lastname")).sendKeys("chinnu");
		driver.findElement(By.name("reg_email__")).sendKeys("kaushikaug8@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("kaushikaug8@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Apr11Rvn");
		//driver.findElement(By.name("birthday_day")).sendKeys("15");
		driver.findElement(By.name("birthday_month")).sendKeys("Aug");
		driver.findElement(By.name("birthday_year")).sendKeys("2010");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		
	}

}

