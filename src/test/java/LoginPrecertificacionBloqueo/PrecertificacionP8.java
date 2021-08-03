package LoginPrecertificacionBloqueo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.variablesGlobales;
import driverSetup.DriverSetup;
import navPages.userPrecertificacion8;
public class PrecertificacionP8 {
	WebDriver driver = DriverSetup.setupDriver();
	userPrecertificacion8 login = new userPrecertificacion8(driver);
	
	@BeforeTest
	public void starWebDriver() {
		driver.get(variablesGlobales.HOME_PAGE);
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
	}
		@Test(priority=6)
		public void precertificacion8HP() throws InterruptedException {
			driver.get(variablesGlobales.HOME_PAGE);
			login.login(variablesGlobales.USER_LOGIN_PRE_8);
		    driver.findElement(By.id("idShowPassword")).click();
		    driver.findElement(By.id("idPasswordOld")).click();
		    driver.findElement(By.id("idPasswordOld")).sendKeys("12345678Qw.");
		    driver.findElement(By.id("idPassword")).click();
		    driver.findElement(By.cssSelector(".rowPass:nth-child(6)")).click();
		    driver.findElement(By.id("idPassword")).sendKeys("12121212Qw.");
		    driver.findElement(By.id("idPasswordVerify")).click();
		    driver.findElement(By.id("idPasswordVerify")).sendKeys("12121212Qw.");
		    Thread.sleep(3000);
		    /*driver.findElement(By.id("iniciar")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
		    Thread.sleep(2000);
		    */
	}
    	
		@Test(priority=1)
		public void dejarCamposVacios() throws InterruptedException {
			driver.get(variablesGlobales.HOME_PAGE);
			login.login(variablesGlobales.USER_LOGIN_PRE_8);
		    driver.findElement(By.id("idShowPassword")).click();
		    driver.findElement(By.id("idPasswordOld")).click();
		    //driver.findElement(By.id("idPasswordOld")).sendKeys("12345678Qw.");
		    driver.findElement(By.id("idPassword")).click();
		    driver.findElement(By.cssSelector(".rowPass:nth-child(6)")).click();
		    //driver.findElement(By.id("idPassword")).sendKeys("12121212Qw.");
		    driver.findElement(By.id("idPasswordVerify")).click();
		    //driver.findElement(By.id("idPasswordVerify")).sendKeys("12121212Qw.");
		    Thread.sleep(2000);
		    driver.findElement(By.id("iniciar")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
		    Thread.sleep(2000);
	}  
		
		
		@Test(priority=2)
		public void clavesNuevasDferentes() throws InterruptedException {
			driver.get(variablesGlobales.HOME_PAGE);
			login.login(variablesGlobales.USER_LOGIN_PRE_8);
		    driver.findElement(By.id("idShowPassword")).click();
		    driver.findElement(By.id("idPasswordOld")).click();
		    driver.findElement(By.id("idPasswordOld")).sendKeys("12121212Qw.");
		    driver.findElement(By.id("idPassword")).click();
		    driver.findElement(By.id("idPassword")).sendKeys("121212e12Qw.");
		    driver.findElement(By.id("idPasswordVerify")).click();
		    driver.findElement(By.id("idPasswordVerify")).sendKeys("1212fe1212Qw.");
		    Thread.sleep(3000);
		    driver.findElement(By.id("iniciar")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
		    Thread.sleep(2000);
	}  
		@Test(priority=3)
		public void ClaveQueNoCumplaParametros() throws InterruptedException {
			driver.get(variablesGlobales.HOME_PAGE);
			login.login(variablesGlobales.USER_LOGIN_PRE_8);
		    driver.findElement(By.id("idShowPassword")).click();
		    driver.findElement(By.id("idPasswordOld")).click();
		    driver.findElement(By.id("idPasswordOld")).sendKeys("12121212Qw.");
		    driver.findElement(By.id("idPassword")).click();
		    driver.findElement(By.cssSelector(".rowPass:nth-child(6)")).click();
		    driver.findElement(By.id("idPassword")).sendKeys("12121212qw");
		    driver.findElement(By.id("idPasswordVerify")).click();
		    driver.findElement(By.id("idPasswordVerify")).sendKeys("12121212qw");
		    Thread.sleep(3000);
		    driver.findElement(By.id("iniciar")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
		    Thread.sleep(2000);
	}    	
		@Test(priority=4)
		public void claveActualIncorrecta() throws InterruptedException {
			driver.get(variablesGlobales.HOME_PAGE);
			login.login(variablesGlobales.USER_LOGIN_PRE_8);
		    driver.findElement(By.id("idShowPassword")).click();
		    driver.findElement(By.id("idPasswordOld")).click();
		    driver.findElement(By.id("idPasswordOld")).sendKeys("ClaveIncorrecta.1Aa");
		    driver.findElement(By.id("idPassword")).click();
		    driver.findElement(By.id("idPassword")).sendKeys("12121212Qw.");
		    driver.findElement(By.id("idPasswordVerify")).click();
		    driver.findElement(By.id("idPasswordVerify")).sendKeys("12121212Qw.");
		    Thread.sleep(3000);
		    driver.findElement(By.id("iniciar")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
		    Thread.sleep(2000);
	}
		@Test(priority=5)
		public void sinFirmaBiometrica() throws InterruptedException {
			driver.get(variablesGlobales.HOME_PAGE);
			login.login(variablesGlobales.USER_LOGIN_PRE_8);
		    driver.findElement(By.id("idShowPassword")).click();
		    driver.findElement(By.id("idPasswordOld")).click();
		    driver.findElement(By.id("idPasswordOld")).sendKeys("12121212Qw.");
		    driver.findElement(By.id("idPassword")).click();
		    driver.findElement(By.id("idPassword")).sendKeys("12121212Qw.");
		    driver.findElement(By.id("idPasswordVerify")).click();
		    driver.findElement(By.id("idPasswordVerify")).sendKeys("12121212Qw.");
		    driver.findElement(By.id("iniciar")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
		    Thread.sleep(2000);
	}    	
	@AfterTest
	public void closeDriver() {
	 driver.close();	
	}

	 }	