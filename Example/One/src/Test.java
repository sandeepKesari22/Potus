import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
	public static void main(String[] args){
		WebDriver driver=new FirefoxDriver();
		driver.get("https://twitter.com/");
		driver.findElement(By.linkText("Log In")).click();
		driver.findElement(By.xpath("//div[@id='login-dialog-dialog']/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("example.one22@gmail.com");
		driver.findElement(By.xpath("//div[@id='login-dialog-dialog']/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("example12345");
		driver.findElement(By.xpath("//div[@id='login-dialog-dialog']/div[2]/div[2]/div[2]/form/input[1]")).click();
		driver.findElement(By.id("search-query")).sendKeys("POTUS");
		driver.findElement(By.xpath("//form[@id='global-nav-search']/span/button")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[div[p[a[@href='http://t.co/eVVzoATsAR']]]]/div[1]/div/div/div/button")).click();
		
	}
}
