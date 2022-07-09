package org.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class R {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\.metadata\\.plugins\\Hotel\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
			//login page
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys("MANGAI1995");
		WebElement txtpasswrd = driver.findElement(By.id("password"));
		txtpasswrd.sendKeys("vidhya@1972");
		WebElement btnlogin = driver.findElement(By.id("login"));
		btnlogin .click();
		//search hotel
		WebElement dDnLocation = driver.findElement(By.id("location"));
		Select select=new Select(dDnLocation);
		select.selectByIndex(4);//london
		WebElement dDnHotels = driver.findElement(By.id("hotels"));
		Select select1=new Select(dDnHotels);
		select1.selectByIndex(1);//Sunshine
		WebElement dDnRoom = driver.findElement(By.id("room_type"));
		Select select2=new Select(dDnRoom);
		select2.selectByIndex(0);//standard
		WebElement btnsearch = driver.findElement(By.id("Submit"));
	    btnsearch .click();
		 //select hotel
		 WebElement btnlogin1 = driver.findElement(By.id("radiobutton_2"));
		 btnlogin1.click();
		 WebElement btnlogin3 = driver.findElement(By.id("continue"));
		 btnlogin3.click();
		 
		//book a hotel
		 WebElement txtfirst = driver.findElement(By.id("first_name"));
		 txtfirst.sendKeys("Mangai");
		 WebElement txtlast = driver.findElement(By.id("last_name"));
		 txtlast.sendKeys("Andiappan");
		 WebElement txtaddress = driver.findElement(By.id("address"));
		 txtaddress.sendKeys("East 4th street,Pudukkottai");
		 WebElement txtcardno = driver.findElement(By.id("cc_num"));
		 txtcardno.sendKeys("1234578345112345");
		 WebElement dDncardType = driver.findElement(By.id("cc_type"));
		 Select select3=new Select(dDncardType);
		 select3.selectByIndex(2);//visa  id("cc_exp_month")
		 WebElement dDnexpiryDate = driver.findElement(By.id("cc_exp_month"));
		 Select select4=new Select(dDnexpiryDate);
		 select4.selectByIndex(2);//feb
		 WebElement dDnexpiryDate1 = driver.findElement(By.id("cc_exp_year"));
		 Select select5=new Select(dDnexpiryDate1);
		 select5.selectByIndex(2);//2013
		 WebElement txtcvv = driver.findElement(By.id("cc_cvv"));
		 txtcvv.sendKeys("1234");
		 WebElement btnlogin4 = driver.findElement(By.id("book_now"));
		 btnlogin4.click();
		 Thread.sleep(5000);
		 WebElement element= driver.findElement(By.xpath("(//input[@type='text'])[16]"));
		  String text = element.getAttribute("value");
		 System.out.println(text);	 
		
	}

}
