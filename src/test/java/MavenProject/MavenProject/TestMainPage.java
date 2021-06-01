package MavenProject.MavenProject;




//import java.lang.System.Logger;
import java.util.List;
import java.util.Random;
//import java.util.concurrent.TimeUnit;
//import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;

//import org.apache.logging.log4j.core.tools.Generate.CustomLogger;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
//import org.openqa.selenium.support.ui.WebDriverWait;





public class TestMainPage {
	
	
	
	public static void main(String[] args) {
        
        
		System.setProperty("webdriver.chrome.driver","C:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		//System.setProperty("webdriver.gecko.driver","C:/geckodriver.exe");
	//	WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://www.gittigidiyor.com");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.manage().deleteAllCookies();
		
		String actualTitle="GittiGidiyor - Türkiye'nin Öncü Alışveriş Sitesi";
       String expectedTitle= driver.getTitle();   
       
       
       Assert.assertEquals(actualTitle, expectedTitle);
       
       System.out.println("Main page has opened. SUCCESS");
       
       
       
//       if(actualTitle.equalsIgnoreCase(expectedTitle))
//       {
//            System.out.println("Main page has opened.");
//        }
//       else
//       {
//            System.out.println("Main Page Test failed");
//       }
		
	
       driver.navigate().to("https://www.gittigidiyor.com/uye-girisi?s=1");
       
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       
     // driver.get("https://www.gittigidiyor.com/uye-girisi?s=1");
        
        String actualUrl1=("https://www.gittigidiyor.com/uye-girisi?s=1");
        
        String expectedUrl1= driver.getCurrentUrl();
        
        
        Assert.assertEquals(actualUrl1, expectedUrl1);
        
        
        System.out.println("Login page has opened. SUCCESS");
        
        
        
//        
//        if(actualUrl1.equalsIgnoreCase(expectedUrl1))
//        {
//            System.out.println("Login page has opened.");
//        }
//        else
//        {
//            System.out.println("Login Page Test failed");
//            
//            
//        }
        
     
        
        WebElement username=driver.findElement(By.id("L-UserNameField"));
        
        username.sendKeys("norhun1995@gmail.com");
      
        WebElement password=driver.findElement(By.id("L-PasswordField"));
        
        password.sendKeys("abc123");
        
        WebElement login=driver.findElement(By.id("gg-login-enter"));
        
          
        
        login.click();
        
        
         
        
        
        
        
        String actualUrl2="https://www.gittigidiyor.com/";
     
        
        String expectedUrl2= driver.getCurrentUrl();
        
        
        Assert.assertEquals(actualUrl2, expectedUrl2);
        
        System.out.println("Login SUCCESS!");
        
        
//        if(actualUrl2.equalsIgnoreCase(expectedUrl2))
//        {
//            System.out.println("Login Success!");
//        }
//        else
//        {
//            System.out.println("Login Test Failed!");
//            
//           
//        }
        
        
       
     
    driver.navigate().to("https://www.gittigidiyor.com/arama");
//        driver.get("https://www.gittigidiyor.com/arama");
        
        WebElement search=driver.findElement(By.xpath("//*[@id=\"search-keyword\"]"));
        
        search.sendKeys("bilgisayar");
      
        WebElement find=driver.findElement(By.xpath("//*[@id=\"tab-con\"]/div[1]/div[1]/div[3]/input"));
        
        find.click();
        

       
        WebElement page2=driver.findElement(By.xpath("//*[@id=\'best-match-right\']/div[5]/ul/li[2]/a"));
        
        
        page2.click();
        
//        JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("arguments[0].click()", page2);   
		
		
		
		System.out.println("Page 2 Has Opened! SUCCESS");
        

		
		
		
      
        
		
		// get all products whose product-index >0
	    List<WebElement> productElems = driver.findElements(By.xpath("//*[@product-index>'0']"));
	    // get the len of productElems
	    int maxProducts = productElems.size();
	    // get random number
	    Random random = new Random();
	    int randomProduct = random.nextInt(maxProducts);
	    // Select the list item
	    productElems.get(randomProduct).click();
	    
	    
		
		
		
	String pagePrice = driver.findElement(By.xpath("//*[@id=\'sp-price-lowPrice\']")).getText();
	
	
	
	//*[@id="submit-cart"]/div/div[2]/div[3]/div/div[1]/div/div[5]/div[1]/div/ul/li[1]/div[1]
	
	    
	 
		
        
        
        WebElement basket=driver.findElement(By.xpath("//*[@id=\'add-to-basket\']"));
        
        JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("arguments[0].click()", basket); 
		
		
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.gittigidiyor.com/sepetim");
		
	  
		
		
		String basketPrice = driver.findElement(By.xpath("//*[@id=\'cart-price-container\']/div[3]/p")).getText();
		

		
		
	    
		
		
		if(pagePrice.equals(basketPrice))
			
			System.out.println("Same Price");
		
		else
			
			System.out.println("Not the same price");
		
		
		
			
		
	
		
		////////////////////////////////////////
		
		//WebDriverWait wait = new WebDriverWait (driver, 15);
		//WebElement itemSelect = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'cart-item-478325207\']/div[1]/div[4]/div/div[2]/select/option[2]")));
		
		//JavascriptExecutor jse5 = (JavascriptExecutor)driver;
	//	jse5.executeScript("arguments[0].click()", itemSelect); 
		
		
		Select drpItem = new Select (driver.findElement(By.xpath("//*[starts-with(@id, 'cart-item')]/div[1]/div[4]/div/div[2]/select")));
		
		drpItem.selectByValue("2");
		
		String currentBasket = driver.findElement(By.xpath("//*[@id=\'submit-cart\']/div/div[2]/div[3]/div/div[1]/div/div[5]/div[1]/div/ul/li[1]")).getText();
		
		
			
	
	System.out.println("There are 2 products in the basket! SUCCESS");
	
  	
	
		
		
		
		
		
		//*[@id="cart-item-477807398"]/div[1]/div[4]/div/div[2]/select
		
//
//		WebElement productNumber=driver.findElement(By.xpath("//*[@id=\'cart-item-477807191\']/div[4]/a[1]"));
//		
//		 JavascriptExecutor jse6 = (JavascriptExecutor)driver;
//			jse6.executeScript("arguments[0].click()", productNumber); 
        
	
		
		WebElement delete=driver.findElement(By.xpath("//*[starts-with(@id, 'cart-item')]/div[1]/div[3]/div/div[2]/div/a[1]"));
		
		 delete.click(); 
			
			//*[@id="submit-cart"]/div/div[2]/div[3]/div/div[1]/div/div[5]/div[1]/div/ul/li[1]/div[2]
			
		
		//String expectedBasket = "0,00 TL";
		
//		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				
			
			
		String emptyBasket = driver.findElement(By.xpath("//*[@id=\'submit-cart\']/div/div[2]/div[3]/div/div[1]/div/div[5]/div[1]/div/ul/li[1]")).getText();
		//*[@id="submit-cart"]/div/div[2]/div[3]/div/div[1]/div/div[5]/div[1]/div/ul/li[1]/div[1]
		
		
		
		Assert.assertFalse(currentBasket.contains(emptyBasket));
		
		System.out.println("The Basket is Empty. SUCCESS ");
		
		
//		Assert.assertNotEquals(currentBasket, emptyBasket);
//		
//		System.out.println("The Basket is Empty ");
		
//		if(emptyBasket.equalsIgnoreCase(currentBasket))
//			
//			System.out.println("The Basket is NOT Empty!");
//		
//		else
//			
//			System.out.println("The Basket is  Empty!");
//		
		
		
			
			
		
			
		
			
        
        
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

	
	
	
	
	



