package LoginPrecertificacionBloqueo;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.variablesGlobales;
import driverSetup.DriverSetup;
import navPages.userPrecertificacion4;
public class precertificacionPerfil4 {
	WebDriver driver = DriverSetup.setupDriver();
	userPrecertificacion4 login = new userPrecertificacion4(driver);
	
	
	@BeforeTest
	public void starWebDriver() {
		driver.get(variablesGlobales.HOME_PAGE);
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
	}
	@Test(priority=7)
	//@Test (enabled = false)
		public void precertificacion4HP() throws InterruptedException {
		driver.get(variablesGlobales.HOME_PAGE);
		login.login(variablesGlobales.USER_LOGIN_PRE_4);
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.id("idPasswordOld")).click();
	    driver.findElement(By.id("idPasswordOld")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("idPassword")).click();
	  	driver.findElement(By.id("idPassword")).sendKeys("12121212Qw.");
	   	driver.findElement(By.id("idPasswordVerify")).click();
	   	driver.findElement(By.id("idPasswordVerify")).sendKeys("12121212Qw.");
	   	driver.findElement(By.id("privateKeyPassword")).click();
	   	driver.findElement(By.id("privateKeyPassword")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("confirmKeyPassword")).click();
	    driver.findElement(By.id("confirmKeyPassword")).sendKeys("12121212Qw.");
	    /*driver.findElement(By.id("iniciar")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.xpath("//span[contains(.,\'Salir\')]")).click();
	   */
	  }
	
		@Test(priority=1)
		public void dejarCamposVacios() throws InterruptedException {
		driver.get(variablesGlobales.HOME_PAGE);
		login.login(variablesGlobales.USER_LOGIN_PRE_4);
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.id("idPasswordOld")).click();
	    driver.findElement(By.id("idPassword")).click();
	  	driver.findElement(By.id("idPasswordVerify")).click();
	   	driver.findElement(By.id("privateKeyPassword")).click();
	   	driver.findElement(By.id("confirmKeyPassword")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("iniciar")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
	    Thread.sleep(1000);
	  }
		
		@Test(priority=2)
		public void ingresarClavesNuevasDiferentes() throws InterruptedException {
		driver.get(variablesGlobales.HOME_PAGE);
		login.login(variablesGlobales.USER_LOGIN_PRE_4);
		driver.findElement(By.id("idShowPassword")).click();
		driver.findElement(By.id("idPasswordOld")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.id("idPassword")).click();
	  	driver.findElement(By.id("idPassword")).sendKeys("ClavesNuevasDiferentes1.");
	   	driver.findElement(By.id("idPasswordVerify")).click();
	   	driver.findElement(By.id("idPasswordVerify")).sendKeys("ClavesDiferentes2.");
	   	driver.findElement(By.id("privateKeyPassword")).click();
	   	driver.findElement(By.id("privateKeyPassword")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("confirmKeyPassword")).click();
	    driver.findElement(By.id("confirmKeyPassword")).sendKeys("12121212Qw.");
	    Thread.sleep(3000);
	     driver.findElement(By.id("iniciar")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
	    Thread.sleep(1000);
	}
		@Test(priority=3)
		public void ingresarClavesDeLlavePrivadaDiferentes() throws InterruptedException {
		driver.get(variablesGlobales.HOME_PAGE);
		login.login(variablesGlobales.USER_LOGIN_PRE_4);	    
		driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.id("idPasswordOld")).click();
	    driver.findElement(By.id("idPasswordOld")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("idPassword")).click();
	  	driver.findElement(By.id("idPassword")).sendKeys("12121212Qw.");
	   	driver.findElement(By.id("idPasswordVerify")).click();
	   	driver.findElement(By.id("idPasswordVerify")).sendKeys("12121212Qw.");
	   	driver.findElement(By.id("privateKeyPassword")).click();
	   	driver.findElement(By.id("privateKeyPassword")).sendKeys("ClavePrivadaDiferente1.");
	    driver.findElement(By.id("confirmKeyPassword")).click();
	    driver.findElement(By.id("confirmKeyPassword")).sendKeys("ClavePrivadaDiferente2.");
	    Thread.sleep(3000);
	    driver.findElement(By.id("iniciar")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
	    Thread.sleep(1000);
	}
		
		@Test(priority=4)
		public void ingresarClaveNuevaSinParametros() throws InterruptedException {
		driver.get(variablesGlobales.HOME_PAGE);
		login.login(variablesGlobales.USER_LOGIN_PRE_4); //Nombre del usuario de prueba
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.id("idPasswordOld")).click();
	    driver.findElement(By.id("idPasswordOld")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("idPassword")).click();
	  	driver.findElement(By.id("idPassword")).sendKeys("clavenueva-sinparametros");
	   	driver.findElement(By.id("idPasswordVerify")).click();
	   	driver.findElement(By.id("idPasswordVerify")).sendKeys("clavenueva-sinparametros");
	   	driver.findElement(By.id("privateKeyPassword")).click();
	   	driver.findElement(By.id("privateKeyPassword")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("confirmKeyPassword")).click();
	    driver.findElement(By.id("confirmKeyPassword")).sendKeys("12121212Qw.");
	    Thread.sleep(3000);
	     driver.findElement(By.id("iniciar")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
	    Thread.sleep(1000);
	}
		
		@Test(priority=5)
		public void ingresarClavePrivadaSinParametros() throws InterruptedException {
		driver.get(variablesGlobales.HOME_PAGE);
		login.login(variablesGlobales.USER_LOGIN_PRE_4);
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.id("idPasswordOld")).click();
	    driver.findElement(By.id("idPasswordOld")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("idPassword")).click();
	  	driver.findElement(By.id("idPassword")).sendKeys("12121212Qw.");
	   	driver.findElement(By.id("idPasswordVerify")).click();
	   	driver.findElement(By.id("idPasswordVerify")).sendKeys("12121212Qw.");
	   	driver.findElement(By.id("privateKeyPassword")).click();
	   	driver.findElement(By.id("privateKeyPassword")).sendKeys("claveprivada-sinparametros");
	    driver.findElement(By.id("confirmKeyPassword")).click();
	    driver.findElement(By.id("confirmKeyPassword")).sendKeys("claveprivada-sinparametros");
	    Thread.sleep(3000);
	    driver.findElement(By.id("iniciar")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
	    Thread.sleep(1000);
	}
		
		@Test(priority=6)
		public void ingresarClaveActualIncorrecta() throws InterruptedException {
		driver.get(variablesGlobales.HOME_PAGE);
		login.login(variablesGlobales.USER_LOGIN_PRE_4);
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.id("idPasswordOld")).click();
	    driver.findElement(By.id("idPasswordOld")).sendKeys("claveActualIncorrecta1.");
	    driver.findElement(By.id("idPassword")).click();
	  	driver.findElement(By.id("idPassword")).sendKeys("12121212Qw.");
	   	driver.findElement(By.id("idPasswordVerify")).click();
	   	driver.findElement(By.id("idPasswordVerify")).sendKeys("12121212Qw.");
	   	driver.findElement(By.id("privateKeyPassword")).click();
	   	driver.findElement(By.id("privateKeyPassword")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("confirmKeyPassword")).click();
	    driver.findElement(By.id("confirmKeyPassword")).sendKeys("12121212Qw.");
	    Thread.sleep(3000);
	    driver.findElement(By.id("iniciar")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
	    Thread.sleep(2000);
	}
		
  @AfterTest
  public void closeDriver() {
   driver.close();	
  }
 }	