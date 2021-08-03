package Invitados;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.variablesGlobales;
import driverSetup.DriverSetup;
import navPages.addInvitado8;
import navPages.usuarioDesbloquear;
  public class PrecertificarInvitado8 {
	WebDriver driver = DriverSetup.setupDriver();
	usuarioDesbloquear bloquearUsuario = new usuarioDesbloquear(driver);
	addInvitado8 login = new addInvitado8(driver);
	addInvitado8 mail = new addInvitado8(driver);
	
	@BeforeTest
	public void starWebDriver() throws InterruptedException {
		driver.get(variablesGlobales.HOME_PAGE);
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
	}
	/*
	
	@Test(priority=1)
	 public void agregarInvitadoPerfil8() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
	    driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.id("loginForm_user_password")).click();
	    driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.cssSelector("li > a > .selected")).click();
	    
	    login.login(variablesGlobales.NOMBRE_NUEVO_INVITADO8);
		//driver.findElement(By.id("idInvitedSignerName")).click();
		//driver.findElement(By.id("idInvitedSignerName")).sendKeys("Invitado Perfil 8-1");
		
		mail.mail(variablesGlobales.EMAIL_NUEVO_INVITADO8);
		//driver.findElement(By.id("idInvitedSignerEmail")).click();
	    //driver.findElement(By.id("idInvitedSignerEmail")).sendKeys("invitado.p8-1@yopmail.com");
	    
	    driver.findElement(By.cssSelector("#btnSearchInv > #iniciar")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).sendKeys("1");
		Thread.sleep(1000);
	    
		driver.findElement(By.cssSelector(".ui-button:nth-child(2) > .ui-button-text")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".ui-button:nth-child(2) > .ui-button-text")).click();
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		Thread.sleep(2000);
	    
		driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Ley de nacionalización de bienes eclesiasticos.pdf");
		driver.findElement(By.id("iniciar")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("li:nth-child(3) .selected")).click();
	    Thread.sleep(2000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
	}
	
	@Test(priority=2)
	  public void FirmarDocUsuarioIniciador() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();

		 driver.findElement(By.xpath("//img[@title='Firmar documento']")).click();  
		 Thread.sleep(3000);
		 driver.findElement(By.id("txtPassword")).click();
		 driver.findElement(By.id("txtPassword")).sendKeys("12121212Qw.");
		 Thread.sleep(3000);
		 driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
		 Thread.sleep(4000);
		 driver.findElement(By.cssSelector(".ui-button-text")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.cssSelector(".toggle")).click();
		 driver.findElement(By.cssSelector(".negative > .label")).click();
	}
	
	@Test(priority=3)
	  public void AgregarOtroDoc8() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.cssSelector("li > a > .selected")).click();
		driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Ley de nacionalización de bienes eclesiasticos.pdf");
		
		 
	    login.login(variablesGlobales.NOMBRE_NUEVO_INVITADO8);
		//driver.findElement(By.id("idInvitedSignerName")).click();
		//driver.findElement(By.id("idInvitedSignerName")).sendKeys("Invitado Perfil 8-1");
		
		mail.mail(variablesGlobales.EMAIL_NUEVO_INVITADO8);
		//driver.findElement(By.id("idInvitedSignerEmail")).click();
	    //driver.findElement(By.id("idInvitedSignerEmail")).sendKeys("invitado.p8-1@yopmail.com");
		
	    driver.findElement(By.cssSelector("#btnSearchInv > #iniciar")).click();
	    driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).click();
	    driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).sendKeys("1");
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".ui-button:nth-child(2) > .ui-button-text")).click();
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("iniciar")).click();
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("li:nth-child(3) .selected")).click();   
	    Thread.sleep(2000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click(); 
	}
	
	

	@Test(priority=4)
	 public void obtenerClaveTemporal() throws InterruptedException {
		driver.get(variablesGlobales.LIGA_YOPMAIL);
		driver.findElement(By.id("login")).click();
	    driver.findElement(By.id("login")).sendKeys("firmante.invitado-8@yopmail.com"); // ACTUALIZAR CORREO ELECTRONICO EN CADA NUEVA PRUEBA
	    driver.findElement(By.cssSelector(".f36")).click();
	    Thread.sleep(5000);
	}
	
*/
	

	
	@Test(priority=1)
	 public void SinIngresarClaves() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("firmante.invitado-8-1@yopmail.com");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("idShowPassword")).click();
		driver.findElement(By.id("idPasswordOld")).click();
		driver.findElement(By.id("idPassword")).click();
	    driver.findElement(By.id("idPasswordVerify")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("iniciar")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
		
	}
	
	@Test(priority=2)
	 public void IngresarClaveTemporalIncorrecta() throws InterruptedException {
		driver.get(variablesGlobales.HOME_PAGE);
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("firmante.invitado-8-1@yopmail.com");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("idShowPassword")).click();
		driver.findElement(By.id("idPasswordOld")).click();
		driver.findElement(By.id("idPasswordOld")).sendKeys("wfgbfgtfMx*5"); //No actualizar contraseña
		driver.findElement(By.id("idPassword")).click();
	    driver.findElement(By.id("idPassword")).sendKeys("12121212Qw.");
        driver.findElement(By.id("idPasswordVerify")).click();
		driver.findElement(By.id("idPasswordVerify")).sendKeys("12121212Qw.");
	    Thread.sleep(5000);//TIME PARA GRABAR FAB
	    driver.findElement(By.id("iniciar")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
	    
	    
	}
	
	@Test(priority=3)
	 public void IngresarClaveNuevaDiferentes() throws InterruptedException {
		driver.get(variablesGlobales.HOME_PAGE);
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("firmante.invitado-8-1@yopmail.com");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("idShowPassword")).click();
		driver.findElement(By.id("idPasswordOld")).click();
		driver.findElement(By.id("idPasswordOld")).sendKeys("wrUFYiO0s3JMx*5"); //Actualizar contraseña
		driver.findElement(By.id("idPassword")).click();
	    driver.findElement(By.id("idPassword")).sendKeys("121212172Qw.");
        driver.findElement(By.id("idPasswordVerify")).click();
		driver.findElement(By.id("idPasswordVerify")).sendKeys("12121212Qwp.");
	    Thread.sleep(5000);//TIME PARA GRABAR FAB
	    driver.findElement(By.id("iniciar")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
	    Thread.sleep(1000);
	   
	}
	
	@Test(priority=4)
	 public void IngresarClaveNuevasinParametros() throws InterruptedException {
		driver.get(variablesGlobales.HOME_PAGE);
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("firmante.invitado-8-1@yopmail.com");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("idShowPassword")).click();
		driver.findElement(By.id("idPasswordOld")).click();
		driver.findElement(By.id("idPasswordOld")).sendKeys("wrUFYiO0s3JMx*5"); //Actualizar contraseña
		driver.findElement(By.id("idPassword")).click();
	    driver.findElement(By.id("idPassword")).sendKeys("12121212qw");
       driver.findElement(By.id("idPasswordVerify")).click();
		driver.findElement(By.id("idPasswordVerify")).sendKeys("12121212qw");
	    Thread.sleep(5000);//TIME PARA GRABAR FAB
	    driver.findElement(By.id("iniciar")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
	    Thread.sleep(1000);
	   
	}
	
	
	@Test(priority=5)
	 public void  sinIngresarFAB() throws InterruptedException {
		driver.get(variablesGlobales.HOME_PAGE);
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("firmante.invitado-8-1@yopmail.com");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("idShowPassword")).click();
		driver.findElement(By.id("idPasswordOld")).click();
		driver.findElement(By.id("idPasswordOld")).sendKeys("wrUFYiO0s3JMx*5"); //No actualizar contraseña
		driver.findElement(By.id("idPassword")).click();
	    driver.findElement(By.id("idPassword")).sendKeys("12121212Qw.");
      driver.findElement(By.id("idPasswordVerify")).click();
		driver.findElement(By.id("idPasswordVerify")).sendKeys("12121212Qw.");
	    Thread.sleep(1000);//TIME PARA GRABAR FAB
	    driver.findElement(By.id("iniciar")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
	    Thread.sleep(1000);
	  
	}
	
	@Test(priority=6)
	 public void PrecertificarInvitadoPerfil8() throws InterruptedException {
		driver.get(variablesGlobales.HOME_PAGE);
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("firmante.invitado-8-1@yopmail.com");
		driver.findElement(By.id("btnLogin")).click();
	
		
		driver.findElement(By.id("idShowPassword")).click();
		driver.findElement(By.id("idPasswordOld")).click();
		driver.findElement(By.id("idPasswordOld")).sendKeys("wrUFYiO0s3JMx*5"); //Actualizar contraseña
		driver.findElement(By.id("idPassword")).click();
	    driver.findElement(By.id("idPassword")).sendKeys("12121212Qw.");
       driver.findElement(By.id("idPasswordVerify")).click();
		driver.findElement(By.id("idPasswordVerify")).sendKeys("12121212Qw.");
	    Thread.sleep(5000);
	    driver.findElement(By.id("iniciar")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
	}
	 
	
	@AfterTest
	 public void closeDriver() {
		driver.close();	
	 
	}
}	