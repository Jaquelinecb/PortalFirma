//Usuarios: Usuario 2, Berenice, Usuario1, Usuario3, Usuario4,Jaqueline

package DocumentosPendientes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.variablesGlobales;
import driverSetup.DriverSetup;
public class Firmar6Firmantes{
	WebDriver driver = DriverSetup.setupDriver();
	
	
	@BeforeTest
	public void starWebDriver() throws InterruptedException {
		driver.get(variablesGlobales.HOME_PAGE);
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		
	}
	@Test(priority=1)
	  public void FirmarDoc() throws InterruptedException {
		
		//Login1
		driver.findElement(By.id("loginForm_user_login")).click();
	    driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario2");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.id("loginForm_user_password")).click();
	    driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("btnLogin")).click();
	    //Firma1
	    driver.findElement(By.xpath("//img[@title=\'Firmar documento\']")).click();
	    driver.findElement(By.id("txtPassword")).click();
	    driver.findElement(By.id("txtPassword")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.linkText("Salir")).click();
	    
	    //Login2
	    driver.findElement(By.id("loginForm_user_login")).click();
	    driver.findElement(By.id("loginForm_user_login")).sendKeys("Berenice");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.id("loginForm_user_password")).click();
	    driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("btnLogin")).click();
	    //Firma2
	    driver.findElement(By.cssSelector(".tooltip")).click();
	    driver.findElement(By.id("txtPassword")).sendKeys("12345678a");
	    driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.linkText("Salir")).click();
	    
	    //Login3
	    driver.findElement(By.id("loginForm_user_login")).click();
	    driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.id("loginForm_user_password")).click();
	    driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("btnLogin")).click();
	    //Firma3
	    driver.findElement(By.cssSelector(".tooltip")).click();
	    driver.findElement(By.id("txtPassword")).click();
	    driver.findElement(By.id("txtPassword")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.linkText("Salir")).click();
	    
	    //Login4
	    driver.findElement(By.id("loginForm_user_login")).click();
	    driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario3");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.id("loginForm_user_password")).click();
	    driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("btnLogin")).click();
	    //Firma4
	    driver.findElement(By.cssSelector(".tooltip")).click();
	    driver.findElement(By.id("txtPassword")).click();
	    driver.findElement(By.id("txtPassword")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.linkText("Salir")).click();
	    
	    //Login5
	    driver.findElement(By.id("loginForm_user_login")).click();
	    driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario4");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.id("loginForm_user_password")).click();
	    driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("btnLogin")).click();
	    //Firma5
	    driver.findElement(By.cssSelector(".tooltip")).click();
	    driver.findElement(By.id("txtPassword")).click();
	    driver.findElement(By.id("txtPassword")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.linkText("Salir")).click();
	    
	    //Login6
	    driver.findElement(By.id("loginForm_user_login")).click();
	    driver.findElement(By.id("loginForm_user_login")).sendKeys("Jaqueline");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.id("loginForm_user_password")).click();
	    driver.findElement(By.id("loginForm_user_password")).sendKeys("15371145Max.");
	    driver.findElement(By.id("btnLogin")).click();
	    //Firma6
	    driver.findElement(By.xpath("//img[@title=\'Firmar documento\']")).click();
	    driver.findElement(By.id("txtPassword")).click();
	    driver.findElement(By.id("txtPassword")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("li:nth-child(4) .selected")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//img[@title=\'Descargar documento \']")).click();
	    Thread.sleep(7000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
		
	}
@AfterTest
 public void closeDriver() {
 driver.close();	
 }
}	