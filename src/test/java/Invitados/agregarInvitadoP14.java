//Casos de prueba:
//1. AgregarUsuarioInvitadoNuevo
//2. AgregarOtroDoc8
//3. FirmarDocInicidor8

//4. PrecertificarInvitado8
//5. FirmarDocUsuarioInvitado8 
//6. ValidarQueSubaDocPerfil8

package Invitados;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.variablesGlobales;
import driverSetup.DriverSetup;
import navPages.addInvitado14;
public class agregarInvitadoP14 {
	WebDriver driver = DriverSetup.setupDriver();
	addInvitado14 login = new addInvitado14(driver);
	
	@BeforeTest
	public void starWebDriver() throws InterruptedException {
		driver.get(variablesGlobales.HOME_PAGE);
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
	}
	@Test(priority=1)
	  public void AgregarUsuarioInvitadoP9Nuevo() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.cssSelector("li > a > .selected")).click();
		driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Ley de nacionalización de bienes eclesiasticos.pdf");
		
		//AGREGAR USUARIO INVITADO CON TIPO DE FIRMA: CUALQUIER TIPO DE FIRMA
		driver.findElement(By.id("idInvitedSignerName")).click();
		driver.findElement(By.id("idInvitedSignerName")).sendKeys("Invitado Perfil Catorce");//ACTUALIZAR USUARIO
		driver.findElement(By.id("idInvitedSignerEmail")).click();
	    driver.findElement(By.id("idInvitedSignerEmail")).sendKeys("invitado.p14@yopmail.com");	
		//login.login(variablesGlobales.NOMBRE_NUEVO_INVITADO14);
		//login.login(variablesGlobales.EMAIL_NUEVO_INVITADO14);
		
		driver.findElement(By.cssSelector("#btnSearchInv > #iniciar")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".ui-button:nth-child(2) > .ui-button-text")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).sendKeys("0");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".ui-button:nth-child(2) > .ui-button-text")).click();
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		Thread.sleep(2000);
		 /*
		driver.findElement(By.id("iniciar")).click();
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		Thread.sleep(2000);
		*/
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click(); 
	}
	
	@Test(priority=2)
	  public void AgregarOtroDoc14() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Jaqueline");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.cssSelector("li > a > .selected")).click();
		driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Ley de nacionalización de bienes eclesiasticos.pdf");
	    
		//AGREGAR USUARIO INVITADO CON TIPO DE FIRMA: CUALQUIER TIPO DE FIRMA
		driver.findElement(By.id("idInvitedSignerName")).click();
		driver.findElement(By.id("idInvitedSignerName")).sendKeys("Invitado Perfil Catorce");//ACTUALIZAR USUARIO
		driver.findElement(By.id("idInvitedSignerEmail")).click();
	    driver.findElement(By.id("idInvitedSignerEmail")).sendKeys("invitado.p14@yopmail.com");	
		//login.login(variablesGlobales.NOMBRE_NUEVO_INVITADO14);
		//login.login(variablesGlobales.EMAIL_NUEVO_INVITADO14);
		
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

	@Test(priority=3)
	 public void FirmarDocumentosDeIniciadorYDespuesPerfil14() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@title=\'Firmar documento\']")).click();
	    driver.findElement(By.id("txtPassword")).click();
		driver.findElement(By.id("txtPassword")).sendKeys("12121212Qw.");
		driver.findElement(By.id("idShowPassword")).click();
		driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@title=\'Firmar documento\']")).click();
		driver.findElement(By.id("txtPassword")).click();
		driver.findElement(By.id("txtPassword")).sendKeys("12121212Qw.");
		driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		Thread.sleep(2000);
		    
	    driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.cssSelector(".negative > .label")).click();
	}
	
	
	@Test(priority=4)
	  public void PrecertificarInvitado14() throws InterruptedException {
	    driver.findElement(By.id("loginForm_user_login")).click();
	    driver.findElement(By.id("loginForm_user_login")).sendKeys("invitado.p14@yopmail.com"); //ACTUALIZAR CON LOGIN DE INVITADO NUEVO
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.id("idPasswordOld")).click();
	    driver.findElement(By.id("idPasswordOld")).sendKeys("lCKeJFYMBym8x@1");//ACTUALIZAR CLAVE
	    driver.findElement(By.id("idPassword")).click();
	    driver.findElement(By.id("idPassword")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("idPasswordVerify")).click();
	    driver.findElement(By.id("idPasswordVerify")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("iniciar")).click();
	    driver.findElement(By.cssSelector(".ui-button-text")).click();

		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
	}
	
	 @Test(priority=5)
	  public void FirmaDeNuevoInvitado14ConLlavesExternas() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("gonzalo.mendez@yopmail.com");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//img[@title='Firmar documento']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("filesystemBtn")).click();
	    
		driver.findElement(By.cssSelector("#keyFile input:nth-child(2)")).click();
	    driver.findElement(By.xpath("//input[@id='privkey_file']")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Importadas-CTF.key");
		    
		driver.findElement(By.cssSelector("#certFile input:nth-child(2)")).click();
		driver.findElement(By.xpath("//input[@id='certificate_file']")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Importadas-CTF.cer");
		  
		driver.findElement(By.id("txtPassword")).click();
		driver.findElement(By.id("txtPassword")).sendKeys("12121212qw");
		driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
	    Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
	}
	
	 @AfterTest
	  public void closeDriver() {
	  driver.close();	
	  }
	 }	