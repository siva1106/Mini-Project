package miniproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinHotel {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\Eclipse\\Selenium\\MiniProject\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com/index.php");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	Thread.sleep(1000);
	WebElement newuser = driver.findElement(By.xpath("//a[text()='New User Register Here']"));
	newuser.click();
	
	Thread.sleep(1000);
	WebElement username = driver.findElement(By.name("username"));
	username.sendKeys("siva6887");
	
	Thread.sleep(1000);
	WebElement password = driver.findElement(By.name("password"));
	password.sendKeys("123456789");
	
	Thread.sleep(1000);
	WebElement c_password = driver.findElement(By.name("re_password"));
	c_password.sendKeys("123456789");
	
	Thread.sleep(1000);
	WebElement fullName = driver.findElement(By.name("full_name"));
	fullName.sendKeys("Siva");
	
	Thread.sleep(1000);
	WebElement email = driver.findElement(By.name("email_add"));
	email.sendKeys("sivaramasamy12@gmail.com");
	
	Thread.sleep(1000);
	WebElement clickbox = driver.findElement(By.id("tnc_box"));
	clickbox.click();
	
	Thread.sleep(1000);
	WebElement submit = driver.findElement(By.name("Submit"));
	submit.click();
	
	Thread.sleep(1000);
	WebElement login = driver.findElement(By.xpath("//a[text()='Click here to login']"));
	login.click();
	
	Thread.sleep(1000);
	WebElement username1 = driver.findElement(By.xpath("(//input[@class='login_input'])[1]"));
	username1.sendKeys("siva6887");
	
	Thread.sleep(1000);
	WebElement password1 = driver.findElement(By.xpath("(//input[@class='login_input'])[2]"));
	password1.sendKeys("123456789");
	
	Thread.sleep(20000);
	WebElement log_in = driver.findElement(By.name("login"));
	log_in.click();
	
	Thread.sleep(1000);
	WebElement location = driver.findElement(By.name("location"));
	Select s=new Select(location);
	s.selectByValue("Melbourne");
	
	Thread.sleep(1000);
	WebElement hotel = driver.findElement(By.name("hotels"));
	Select s1=new Select(hotel);
	s1.selectByValue("Hotel Cornice");
	
	Thread.sleep(1000);
	WebElement room = driver.findElement(By.name("room_type"));
	Select s2=new Select(room);
	s2.selectByValue("Deluxe");
	
	Thread.sleep(1000);
	WebElement room_no = driver.findElement(By.name("room_nos"));
	Select s3=new Select(room_no);
	s3.selectByValue("3");
	
	Thread.sleep(1000);
	WebElement checkIn = driver.findElement(By.name("datepick_in"));
	checkIn.clear();
	checkIn.sendKeys("07/03/2022");
	
	Thread.sleep(1000);
	WebElement checkOut = driver.findElement(By.name("datepick_out"));
	checkOut.clear();
	checkOut.sendKeys("08/03/2022");
	
	Thread.sleep(1000);
	WebElement adult = driver.findElement(By.name("adult_room"));
	Select s4=new Select(adult);
	s4.selectByValue("2");
	
	Thread.sleep(1000);
	WebElement child = driver.findElement(By.name("child_room"));
	Select s5=new Select(child);
	s5.selectByValue("1");
	
	Thread.sleep(1000);
	WebElement search = driver.findElement(By.xpath("(//input[@class='reg_button'])[1]"));
	search.click();
	
	Thread.sleep(1000);
	WebElement radio_Button = driver.findElement(By.name("radiobutton_0"));
	radio_Button.click();
	
	Thread.sleep(1000);
	WebElement cnt_Click = driver.findElement(By.xpath("(//input[@class='reg_button'])[1]"));
	cnt_Click.click();
	
	Thread.sleep(1000);
	WebElement f_Name = driver.findElement(By.name("first_name"));
	f_Name.sendKeys("Siva");
	
	Thread.sleep(1000);
	WebElement l_name = driver.findElement(By.name("last_name"));
	l_name.sendKeys("R");
	
	Thread.sleep(1000);
	WebElement address = driver.findElement(By.name("address"));
	address.sendKeys("123, 4th exnt, Porur, Chennai-600112");
	
	Thread.sleep(1000);
	WebElement creditCard = driver.findElement(By.name("cc_num"));
	creditCard.sendKeys("1234765489123465");
	
	Thread.sleep(1000);
	WebElement cardType = driver.findElement(By.name("cc_type"));
	Select s6=new Select(cardType);
	s6.selectByValue("VISA");
	
	Thread.sleep(1000);
	WebElement expyDate = driver.findElement(By.name("cc_exp_month"));
	Select s7 = new Select(expyDate);
	s7.selectByValue("6");
	
	Thread.sleep(1000);
	WebElement expyYear = driver.findElement(By.name("cc_exp_year"));
	Select s8=new Select(expyYear);
	s8.selectByValue("2022");
	
	Thread.sleep(1000);
	WebElement cvv = driver.findElement(By.name("cc_cvv"));
	cvv.sendKeys("231");
	
	Thread.sleep(1000);
	WebElement bookNow = driver.findElement(By.name("book_now"));
	bookNow.click();
	
	Thread.sleep(1000);
	WebElement logout = driver.findElement(By.name("logout"));
	logout.click();
	
}
}
