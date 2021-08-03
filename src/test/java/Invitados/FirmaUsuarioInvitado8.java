package Invitados;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.variablesGlobales;
import driverSetup.DriverSetup;
public class FirmaUsuarioInvitado8 {
	WebDriver driver = DriverSetup.setupDriver();
	
	
	@BeforeTest
	public void starWebDriver() throws InterruptedException {
		driver.get(variablesGlobales.HOME_PAGE);
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
	}
	@Test(priority=1)
	  public void PrecertificarInvitado8() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("invitado.p8-1@yopmail.com");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.id("idShowPassword")).click();
		driver.findElement(By.id("idPasswordOld")).click();
		driver.findElement(By.id("idPasswordOld")).sendKeys("F8Nc0oqwJviNx$2"); //Actualizar contraseña
		driver.findElement(By.id("idPassword")).click();
	    driver.findElement(By.id("idPassword")).sendKeys("12121212Qw.");
        driver.findElement(By.id("idPasswordVerify")).click();
		driver.findElement(By.id("idPasswordVerify")).sendKeys("12121212Qw.");
	    Thread.sleep(5000);
	    driver.findElement(By.id("iniciar")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
	}
	
	@Test(priority=2)//SOLO CUANDO ESTA LA CONFIGURACIÓN DE VERIFICAR EL NOMBRE
	  public void IngresarNombreIncorrecto() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Diego");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//img[@title=\'Firmar documento\']")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("idSendMail")).click();
		driver.findElement(By.id("signAction_updateDocument_employee_mailToSign")).click();
		driver.findElement(By.id("signAction_updateDocument_employee_mailToSign")).sendKeys("jbastida@seguridata.com");
		driver.findElement(By.id("saveSignCaptureVerify")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("firmanteName")).click();
		driver.findElement(By.id("firmanteName")).sendKeys("INVITADO PERFIL 8-1");
		Thread.sleep(1000);
		 
		driver.findElement(By.xpath("(//button[@type=\'button\'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@type=\'button\'])[6]")).click();
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//body[@id=\'body\']/div[4]/div/button/span")).click();
		Thread.sleep(1000);

	    
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
	}
	
	@Test(priority=3)//SOLO CUANDO ESTA LA CONFIGURACIÓN DE VERIFICAR EL NOMBRE
	  public void IngresarFirmaBiometricaDiferentee() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Diego");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//img[@title=\'Firmar documento\']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("idSendMail")).click();
		driver.findElement(By.id("signAction_updateDocument_employee_mailToSign")).click();
		driver.findElement(By.id("signAction_updateDocument_employee_mailToSign")).sendKeys("jbastida@seguridata.com");
		driver.findElement(By.id("saveSignCaptureVerify")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("firmanteName")).click();
		driver.findElement(By.id("firmanteName")).sendKeys("DIEGO ESPINOZA");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@type=\'button\'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
	}
	
	@Test(priority=4)//SOLO CUANDO ESTA LA CONFIGURACIÓN DE VERIFICAR EL NOMBRE
	  public void FirmarDocumentoCorrectamente() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Diego");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//img[@title=\'Firmar documento\']")).click();
		Thread.sleep(6000);
		driver.findElement(By.id("idSendMail")).click();
		driver.findElement(By.id("signAction_updateDocument_employee_mailToSign")).click();
		driver.findElement(By.id("signAction_updateDocument_employee_mailToSign")).sendKeys("jbastida@seguridata.com");
		driver.findElement(By.id("saveSignCaptureVerify")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("firmanteName")).click();
		driver.findElement(By.id("firmanteName")).sendKeys("DIEGO ESPINOZA");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@type=\'button\'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
	}
	
	
	@Test(priority=5)
	  public void ValidarQueSubaDocPerfil8() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Diego");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.cssSelector("li > a > .selected")).click();
		driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Ley de nacionalización de bienes eclesiasticos.pdf");
		driver.findElement(By.id("iniciar")).click();
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("li:nth-child(3) .selected")).click();   
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@title=\'Firmar documento\']")).click();
		Thread.sleep(6000);
		driver.findElement(By.id("saveSignCapture")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
		 
	}
	 @AfterTest
	  public void closeDriver() {
	  driver.close();	
	  }
	 }	