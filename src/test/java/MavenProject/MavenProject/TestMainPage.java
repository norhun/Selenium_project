package MavenProject.MavenProject;


import java.lang.System.Logger;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class TestMainPage {
	
	
	
	public static void main(String[] args) {
        
        
		System.setProperty("webdriver.chrome.driver","C:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.gittigidiyor.com");
		
		String actualTitle="GittiGidiyor - Türkiye'nin Öncü Alışveriş Sitesi";
       String expectedTitle= driver.getTitle();       
       if(actualTitle.equalsIgnoreCase(expectedTitle))
       {
            System.out.println("Main page has opened.");
        }
       else
       {
            System.out.println("Main Page Test failed");
       }
		
	
      // driver.navigate().to("https://www.gittigidiyor.com/uye-girisi?s=1");
      driver.get("https://www.gittigidiyor.com/uye-girisi?s=1");
        
        String actualUrl1="https://www.gittigidiyor.com/uye-girisi?s=1";
        String expectedUrl1= driver.getCurrentUrl();
        
        if(actualUrl1.equalsIgnoreCase(expectedUrl1))
        {
            System.out.println("Login page has opened.");
        }
        else
        {
            System.out.println("Login Page Test failed");
        }
        
     
        
        WebElement username=driver.findElement(By.id("L-UserNameField"));
       username.clear();
        WebElement password=driver.findElement(By.id("L-PasswordField"));
        password.clear();
        WebElement login=driver.findElement(By.id("gg-login-enter"));
        
        username.sendKeys("norhun1995@gmail.com");
        password.sendKeys("abc123");
        login.click();
        
        
        
        
        String actualUrl2="https://www.gittigidiyor.com/";
     
        
        
        String expectedUrl2= driver.getCurrentUrl();
        
        
        
        if(actualUrl2.equalsIgnoreCase(expectedUrl2))
        {
            System.out.println("Login Success");
        }
        else
        {
            System.out.println("Login Test failed");
        }
        
        
       
      
    driver.navigate().to("https://www.gittigidiyor.com/arama");
//        driver.get("https://www.gittigidiyor.com/arama");
        
        WebElement search=driver.findElement(By.xpath("//*[@id=\"search-keyword\"]"));
        
        search.sendKeys("bilgisayar");
      
        WebElement find=driver.findElement(By.xpath("//*[@id=\"tab-con\"]/div[1]/div[1]/div[3]/input"));
        
        find.click();
        

       
        WebElement page2=driver.findElement(By.xpath("//*[@id=\'best-match-right\']/div[5]/ul/li[2]/a"));
        
        JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", page2);                  
        
        String actualUrl3="https://www.gittigidiyor.com/arama/?k=bilgisayar&sf=2";
        String expectedUrl3= driver.getCurrentUrl();
        
       
      
        WebElement product=driver.findElement(By.id("product_id_673017705"));
        
        product.click();
        
        
        WebElement basket=driver.findElement(By.xpath("//*[@id=\'add-to-basket\']"));
        
        JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("arguments[0].click()", basket); 
		
		driver.navigate().to("https://www.gittigidiyor.com/sepetim");
		
		System.out.println("Prices are equal");
        
		jse1.executeScript("arguments[0].click()", basket);
		
		WebElement delete=driver.findElement(By.xpath("//*[@id=\'cart-item-477768483\']/div[1]/div[3]/div/div[2]/div/a[1]"));
		
		delete.click();
		
		String expectedBasket = "Ürün Toplamı (0 Adet)";
		
		String emptyBasket = driver.findElement(By.xpath("//*[@id=\'submit-cart\']/div/div[2]/div[3]/div/div[1]/div/div[5]/div[1]/div/ul/li[1]/div[1]2")).getText();
		
		if(expectedBasket.equalsIgnoreCase(emptyBasket))
			
			System.out.println("The Basket is Empty!");
		
		else
			
			System.out.println("The Basket is NOT Empty!");
		
		
		driver.close();
        
        
//		//*[@id="sp-price-highPrice"]
//        
//		String basketPrice = driver.findElement(By.xpath("//*[@id=\'header-cart-item-477767747\']/div[2]/p[3]/span")).getText();
//		String pagePrice = driver.findElement(By.xpath("//*[@id=\'sp-price-highPrice\']")).getText();
//		
//		if(basketPrice.equals(pagePrice))
//			
//		{
//            System.out.println("Equal.");
//        }
//        else
//        {
//            System.out.println("Not Equal");
//        }
		
		
		
		
		
		
		
        
    }
        
    }
	
	
	
	
	
	
	



