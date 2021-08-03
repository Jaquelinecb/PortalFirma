package LoginPrecertificacionBloqueo;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.variablesGlobales;
import driverSetup.DriverSetup;
import navPages.userPrecertificacion13;
public class precertificacionPerfil13 {
	WebDriver driver = DriverSetup.setupDriver();
	userPrecertificacion13 login = new userPrecertificacion13(driver);
	
	
	
	@BeforeTest
	public void starWebDriver() {
		driver.get(variablesGlobales.HOME_PAGE);
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		
	}
	
	@Test(enabled=false)
	//@Test(priority=8)
		public void precertificacion13HP() throws InterruptedException {
		driver.get(variablesGlobales.HOME_PAGE);
		login.login(variablesGlobales.USER_LOGIN_PRE_13);
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.id("idPasswordOld")).click();
	    driver.findElement(By.id("idPasswordOld")).sendKeys("121212ee12Qw.");
	    driver.findElement(By.id("idPassword")).click();
	    driver.findElement(By.cssSelector(".rowPass:nth-child(6)")).click();
	    driver.findElement(By.id("idPassword")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("idPasswordVerify")).click();
	    driver.findElement(By.id("idPasswordVerify")).sendKeys("12121212Qw.");
	    driver.findElement(By.xpath("//div[2]/input[2]")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\LoginPrecertificacionBloqueo\\Javier.cer");
	    driver.findElement(By.xpath("(//div[@id='divajuste2']/input[2])[2]")).sendKeys("C:\\\\Users\\\\cuaht\\\\.eclipse\\\\PortalFirma\\\\src\\\\test\\\\java\\\\LoginPrecertificacionBloqueo\\\\Javier.key");
	    driver.findElement(By.id("privateKeyPassword")).sendKeys("12345678a");
	    driver.findElement(By.id("iniciar")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
	    Thread.sleep(1000);
	 }
	
	@Test(priority=1)
	public void dejarCamposVacios() throws InterruptedException {
	driver.get(variablesGlobales.HOME_PAGE);
	login.login(variablesGlobales.USER_LOGIN_PRE_13);
    driver.findElement(By.id("idShowPassword")).click();
    driver.findElement(By.id("idPasswordOld")).click();
    driver.findElement(By.id("idPassword")).click();
    driver.findElement(By.id("idPasswordVerify")).click();
    driver.findElement(By.id("iniciar")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
    Thread.sleep(1000);
 }
	
	@Test(priority=2)
	public void claveNuevaDiferente() throws InterruptedException {
	driver.get(variablesGlobales.HOME_PAGE);
	login.login(variablesGlobales.USER_LOGIN_PRE_13);
    driver.findElement(By.id("idShowPassword")).click();
    driver.findElement(By.id("idPasswordOld")).click();
    driver.findElement(By.id("idPasswordOld")).sendKeys("12121212Qw.");
    driver.findElement(By.id("idPassword")).click();
    driver.findElement(By.id("idPassword")).sendKeys("ClaveNueva.Diferente1.");
    driver.findElement(By.id("idPasswordVerify")).click();
    driver.findElement(By.id("idPasswordVerify")).sendKeys("ClaveNueva.Diferente2");
    driver.findElement(By.xpath("//div[2]/input[2]")).sendKeys("C:\\\\Users\\\\cuaht\\\\.eclipse\\\\PortalFirma\\\\src\\\\test\\\\java\\\\LoginPrecertificacionBloqueo\\\\Javier.cer");
    driver.findElement(By.xpath("(//div[@id='divajuste2']/input[2])[2]")).sendKeys("C:\\\\Users\\\\cuaht\\\\.eclipse\\\\PortalFirma\\\\src\\\\test\\\\java\\\\LoginPrecertificacionBloqueo\\\\Javier.key");
    driver.findElement(By.id("privateKeyPassword")).sendKeys("12121212Qw.");
    driver.findElement(By.id("iniciar")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
    Thread.sleep(1000);
	}
	
	@Test(priority=3)
	public void clavePrivadaincorrecta() throws InterruptedException {
		driver.get(variablesGlobales.HOME_PAGE);
		login.login(variablesGlobales.USER_LOGIN_PRE_13);
    driver.findElement(By.id("idShowPassword")).click();
    driver.findElement(By.id("idPasswordOld")).click();
    driver.findElement(By.id("idPasswordOld")).sendKeys("12121212Qw.");
    driver.findElement(By.id("idPassword")).click();
    driver.findElement(By.id("idPassword")).sendKeys("12121212Qw.");
    driver.findElement(By.id("idPasswordVerify")).click();
    driver.findElement(By.id("idPasswordVerify")).sendKeys("12121212Qw.");
    driver.findElement(By.xpath("//div[2]/input[2]")).sendKeys("C:\\\\Users\\\\cuaht\\\\.eclipse\\\\PortalFirma\\\\src\\\\test\\\\java\\\\LoginPrecertificacionBloqueo\\\\Javier.cer");
    driver.findElement(By.xpath("(//div[@id='divajuste2']/input[2])[2]")).sendKeys("C:\\\\Users\\\\cuaht\\\\.eclipse\\\\PortalFirma\\\\src\\\\test\\\\java\\\\LoginPrecertificacionBloqueo\\\\Javier.key");
    driver.findElement(By.id("privateKeyPassword")).sendKeys("ClavePrivadaIncorrecta.1");
    driver.findElement(By.id("iniciar")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
    Thread.sleep(1000);
	}
	
	@Test(priority=4)
	public void claveNuevaSinParametros() throws InterruptedException {
	driver.get(variablesGlobales.HOME_PAGE);
	login.login(variablesGlobales.USER_LOGIN_PRE_13);
    driver.findElement(By.id("idShowPassword")).click();
    driver.findElement(By.id("idPasswordOld")).click();
    driver.findElement(By.id("idPasswordOld")).sendKeys("12121212Qw.");
    driver.findElement(By.id("idPassword")).click();
    driver.findElement(By.id("idPassword")).sendKeys("ClaveNuevaSinParametros");
    driver.findElement(By.id("idPasswordVerify")).click();
    driver.findElement(By.id("idPasswordVerify")).sendKeys("ClaveNuevaSinParametros");
    driver.findElement(By.xpath("//div[2]/input[2]")).sendKeys("C:\\\\Users\\\\cuaht\\\\.eclipse\\\\PortalFirma\\\\src\\\\test\\\\java\\\\LoginPrecertificacionBloqueo\\\\Javier.cer");
    driver.findElement(By.xpath("(//div[@id='divajuste2']/input[2])[2]")).sendKeys("C:\\\\Users\\\\cuaht\\\\.eclipse\\\\PortalFirma\\\\src\\\\test\\\\java\\\\LoginPrecertificacionBloqueo\\\\Javier.key");
    driver.findElement(By.id("privateKeyPassword")).sendKeys("12121212Qw.");
    driver.findElement(By.id("iniciar")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
    Thread.sleep(1000);
	}
	
	@Test(priority=5)
	public void claveActualIncorrecta() throws InterruptedException {
	driver.get(variablesGlobales.HOME_PAGE);
	login.login(variablesGlobales.USER_LOGIN_PRE_13);
    driver.findElement(By.id("idShowPassword")).click();
    driver.findElement(By.id("idPasswordOld")).click();
    driver.findElement(By.id("idPasswordOld")).sendKeys("ClaveActualIncorrecta.1Aa.");
    driver.findElement(By.id("idPassword")).click();
    driver.findElement(By.id("idPassword")).sendKeys("12121212Qw.");
    driver.findElement(By.id("idPasswordVerify")).click();
    driver.findElement(By.id("idPasswordVerify")).sendKeys("12121212Qw.");
    driver.findElement(By.xpath("//div[2]/input[2]")).sendKeys("C:\\\\Users\\\\cuaht\\\\.eclipse\\\\PortalFirma\\\\src\\\\test\\\\java\\\\LoginPrecertificacionBloqueo\\\\Javier.cer");
    driver.findElement(By.xpath("(//div[@id='divajuste2']/input[2])[2]")).sendKeys("C:\\\\Users\\\\cuaht\\\\.eclipse\\\\PortalFirma\\\\src\\\\test\\\\java\\\\LoginPrecertificacionBloqueo\\\\Javier.key");
    driver.findElement(By.id("privateKeyPassword")).sendKeys("12121212Qw.");
    driver.findElement(By.id("iniciar")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
    Thread.sleep(1000);
	}
	
	@Test(priority=6)
	public void certificadoyLlaveDeDiferentesUsuarios() throws InterruptedException {
	driver.get(variablesGlobales.HOME_PAGE);
	login.login(variablesGlobales.USER_LOGIN_PRE_13);
    driver.findElement(By.id("idShowPassword")).click();
    driver.findElement(By.id("idPasswordOld")).click();
    driver.findElement(By.id("idPasswordOld")).sendKeys("12121212Qw.");
    driver.findElement(By.id("idPassword")).click();
    driver.findElement(By.id("idPassword")).sendKeys("12121212Qw.");
    driver.findElement(By.id("idPasswordVerify")).click();
    driver.findElement(By.id("idPasswordVerify")).sendKeys("12121212Qw.");
    driver.findElement(By.xpath("//div[2]/input[2]")).sendKeys("C:\\\\Users\\\\cuaht\\\\.eclipse\\\\PortalFirma\\\\src\\\\test\\\\java\\\\LoginPrecertificacionBloqueo\\\\Javier.cer");
    driver.findElement(By.xpath("(//div[@id='divajuste2']/input[2])[2]")).sendKeys("C:\\\\Users\\\\cuaht\\\\.eclipse\\\\PortalFirma\\\\src\\\\test\\\\java\\\\LoginPrecertificacionBloqueo\\\\Maribel.key");
    driver.findElement(By.id("privateKeyPassword")).sendKeys("12121212Qw.");
    driver.findElement(By.id("iniciar")).click();
    Thread.sleep(3000);
   
	}
	
	//@Test(enabled=false)
	@Test(priority=7)
	public void certificadoyLlaveDeOtroUsuarioRegistrado() throws InterruptedException {
	driver.get(variablesGlobales.HOME_PAGE);
	login.login(variablesGlobales.USER_LOGIN_PRE_13);
    driver.findElement(By.id("idShowPassword")).click();
    driver.findElement(By.id("idPasswordOld")).click();
    driver.findElement(By.id("idPasswordOld")).sendKeys("12121212Qw.");
    driver.findElement(By.id("idPassword")).click();
    driver.findElement(By.id("idPassword")).sendKeys("12121212Qw.");
    driver.findElement(By.id("idPasswordVerify")).click();
    driver.findElement(By.id("idPasswordVerify")).sendKeys("12121212Qw.");
    driver.findElement(By.xpath("//div[2]/input[2]")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Importadas-CTF.cer");
    driver.findElement(By.xpath("(//div[@id='divajuste2']/input[2])[2]")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Importadas-CTF.key");
    driver.findElement(By.id("privateKeyPassword")).sendKeys("12121212qw");
    driver.findElement(By.id("iniciar")).click();
    Thread.sleep(3000);
	}
	@AfterTest
	  public void closeDriver() {
	   driver.close();	
	  }
	 }	