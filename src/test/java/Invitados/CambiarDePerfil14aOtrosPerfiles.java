package Invitados;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.variablesGlobales;
import driverSetup.DriverSetup;
import navPages.AgregarEliminarUsuario;
public class CambiarDePerfil14aOtrosPerfiles {
	WebDriver driver = DriverSetup.setupDriver();
	AgregarEliminarUsuario login = new AgregarEliminarUsuario(driver);
	
	@BeforeTest
	public void starWebDriver() throws InterruptedException {
		driver.get(variablesGlobales.HOME_PAGE);
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
	}
	@Test(priority=1)
	  public void CambiarP14aP8() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
		//driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
		 
		driver.findElement(By.cssSelector("li > a > .selected")).click();
		driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Ley de nacionalización de bienes eclesiasticos.pdf");
		
		driver.findElement(By.id("idInvitedSignerName")).click();
		driver.findElement(By.id("idInvitedSignerName")).sendKeys("Lucía García");
		driver.findElement(By.id("idInvitedSignerEmail")).click();
		driver.findElement(By.id("idInvitedSignerEmail")).sendKeys("lucia@yopmail.com");
		
		driver.findElement(By.cssSelector("#btnSearchInv > #iniciar")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".ui-button:nth-child(2) > .ui-button-text")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).sendKeys("0");
		
		driver.findElement(By.cssSelector(".ui-button:nth-child(2) > .ui-button-text")).click();
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("iniciar")).click();
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
	}
	
	@Test(priority=4)
	public void VerCorreoEnYopmail() throws InterruptedException {
		driver.get(variablesGlobales.LIGA_YOPMAIL);
		driver.findElement(By.id("login")).click();
	    driver.findElement(By.id("login")).sendKeys("luciana.luna@yopmail.com"); // ACTUALIZAR CORREO ELECTRONICO EN CADA NUEVA PRUEBA
	    driver.findElement(By.cssSelector(".f36")).click();
	    Thread.sleep(8000);
	    /*
	     * ---ESPACIO PARA PEGAR DATOS----
	     * 
		 * Estimado: LUCIANA LUNA, le recordamos que tiene en su buzón, un documento pendiente por firmar: Pruebas.pdf
		 * 
		 */
	}	
	
		@Test(priority=2)
		 public void precertificarInvitado14() throws InterruptedException {
		    driver.findElement(By.id("loginForm_user_login")).click();
		    driver.findElement(By.id("loginForm_user_login")).sendKeys("luciana.luna@yopmail.com"); //ACTUALIZAR CON LOGIN DE INVITADO NUEVO
		    driver.findElement(By.id("btnLogin")).click();
		    driver.findElement(By.id("idShowPassword")).click();
		    driver.findElement(By.id("idPasswordOld")).click();
		    driver.findElement(By.id("idPasswordOld")).sendKeys("0V8syTGxCXxux%9"); //ACTUALIZAR CLAVE
		    driver.findElement(By.id("idPassword")).click();
		    driver.findElement(By.id("idPassword")).sendKeys("12121212Qw.");
		    driver.findElement(By.id("idPasswordVerify")).click();
		    driver.findElement(By.id("idPasswordVerify")).sendKeys("12121212Qw.");
		    driver.findElement(By.id("iniciar")).click();
		    
		    driver.findElement(By.xpath("//img[@title=\'Firmar documento\']")).click();//SE VALIDA QUE EL USUARIO SEA PERFIL 14 (USUARIO FLEXIBLE)
		    Thread.sleep(4000);
			
			driver.findElement(By.cssSelector(".toggle")).click();
			driver.findElement(By.cssSelector(".negative > .label")).click();
		}
		
		@Test(priority=3)
		 public void cambiarUsuarioFlexible14aUsuarioServicio8() throws InterruptedException {	//INGRESAR AL PORTAL AGENTE Y REALIZAR EL CAMBIO
		
		   driver.get(variablesGlobales.HOME_PAGE_AGENTE);
	       driver.findElement(By.id("loginAction_authType_user_login")).click();
	       driver.findElement(By.id("loginAction_authType_user_login")).sendKeys("agente@seguridata.com");
	       driver.findElement(By.cssSelector(".label")).click();
	       driver.findElement(By.id("loginAction_authType_user_password")).click();
	       driver.findElement(By.id("loginAction_authType_user_password")).sendKeys("Selena310395.");
	       driver.findElement(By.cssSelector("#btnLogin > .label")).click();
	    
	    
	       driver.findElement(By.cssSelector("li:nth-child(1) > div span")).click();
	       driver.findElement(By.cssSelector("li:nth-child(10) span")).click();
	       driver.findElement(By.id("employeeAction_find_filter_email")).click();
	       driver.findElement(By.id("employeeAction_find_filter_email")).sendKeys("luciana.luna@yopmail.com");//ACTUALIZAR DATOS DE USUARIO
	       driver.findElement(By.id("iniciar")).click();
	       driver.findElement(By.xpath("//img[@title=\'Editar Usuario \']")).click();
	       driver.findElement(By.id("employeeAction_updateEmployee_employee_newIdProfile")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("employeeAction_updateEmployee_employee_newIdProfile"));
	      dropdown.findElement(By.xpath("//option[. = 'USUARIO_SERVICIO']")).click();
	    }
	    driver.findElement(By.id("employeeAction_updateEmployee_employee_newIdProfile")).click();
	    driver.findElement(By.id("iniciar")).click();

	    
	    //SALIR DE PORTAL AGENTE
	    Thread.sleep(2000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
		}
		
		@Test(priority=3)
		 public void ValidarCambioDePerfil14a8() throws InterruptedException {	//INGRESAR AL PORTAL AGENTE Y REALIZAR EL CAMBIO
	       driver.findElement(By.id("loginForm_user_login")).click();
		   driver.findElement(By.id("loginForm_user_login")).sendKeys("luciana.luna@yopmail.com");
		   driver.findElement(By.id("btnLogin")).click();
		   driver.findElement(By.id("idShowPassword")).click();
	       driver.findElement(By.id("idPasswordOld")).click();
	       driver.findElement(By.id("idPasswordOld")).sendKeys("12121212Qw.");
	       driver.findElement(By.id("idPassword")).click();
	       driver.findElement(By.cssSelector(".rowPass:nth-child(6)")).click();
	       driver.findElement(By.id("idPassword")).sendKeys("12121212Qw.");
	       driver.findElement(By.id("idPasswordVerify")).click();
	       driver.findElement(By.id("idPasswordVerify")).sendKeys("12121212Qw.");
	       Thread.sleep(7000);//TIEMPO PARA GRABAR FAB
	       driver.findElement(By.id("iniciar")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
	       Thread.sleep(2000);
	
	}
		
	
	@Test(priority=2)
	  public void CambiarP14aP9() throws InterruptedException {
		//Se-validara-que-el-documento-se-concluya-de-inmediato.
		
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
		 
		driver.findElement(By.cssSelector("li > a > .selected")).click();
		driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Ley de nacionalización de bienes eclesiasticos.pdf");
		
		driver.findElement(By.id("idInvitedSignerName")).click();
		driver.findElement(By.id("idInvitedSignerName")).sendKeys("Invitado CATORCE A NUEVE");
		driver.findElement(By.id("idInvitedSignerEmail")).click();
		//login.login(variablesGlobales.USER_A_ELIMINAR_INVITADO14);
		driver.findElement(By.id("idInvitedSignerEmail")).sendKeys("invitado.14.a.9@yopmail.com");
		
		driver.findElement(By.cssSelector("#btnSearchInv > #iniciar")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".ui-button:nth-child(2) > .ui-button-text")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).sendKeys("3");//VALIDAR SI SI ES EL NUMERO DEL TIPO DE FIRMA
		
		driver.findElement(By.cssSelector(".ui-button:nth-child(2) > .ui-button-text")).click();
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("iniciar")).click();
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
		
		
		//INGRESAR AL PORTAL AGENTE Y REALIZAR EL CAMBIO
		driver.get(variablesGlobales.HOME_PAGE_AGENTE);
	    driver.findElement(By.id("loginAction_authType_user_login")).click();
	    driver.findElement(By.id("loginAction_authType_user_login")).sendKeys("agente@seguridata.com");
	    driver.findElement(By.cssSelector(".label")).click();
	    driver.findElement(By.id("loginAction_authType_user_password")).click();
	    driver.findElement(By.id("loginAction_authType_user_password")).sendKeys("Selena310395.");
	    driver.findElement(By.cssSelector("#btnLogin > .label")).click();
	    
	    
	    
	    //FALTAN PASOS PARA CAMBIAR DE P14 A P19
	    //1. Ir a Editar Usuario
	    //2. Buscar usuario invitado.14.a.8@yopmail.com
	    //3. Seleccionar usuario a editar
	    //4. Seleccionar en el menu desplegable la opción Usuario Servicio
	    //5. Guardar cambios
	    
	    
	    //SALIR DE PORTAL AGENTE
	    Thread.sleep(2000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
		
	  //DESPUES, EL USUARIO FIRMANTE VALIDA QUE LE SOLICITE CONCLUIR LA PRECERTIFICACIÓN DE UN P9
	    driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("invitado.14.a.9@yopmail.com");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.id("idPasswordOld")).click();
	    driver.findElement(By.id("idPasswordOld")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("idPassword")).click();
	    driver.findElement(By.cssSelector(".rowPass:nth-child(6)")).click();
	    driver.findElement(By.id("idPassword")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("idPasswordVerify")).click();
	    driver.findElement(By.id("idPasswordVerify")).sendKeys("12121212Qw.");
	    driver.findElement(By.xpath("//div[2]/input[2]")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Importadas-CTF.cer");
	    driver.findElement(By.id("iniciar")).click();
	    Thread.sleep(3000);
	    
	    
	    //VALIDAR SI SI SALE EL MENSAJE DE NUEVA FORMA DE FIRMA O SIMILAR
	    driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
	    Thread.sleep(2000);
		
	}
	
	
	@Test(priority=2)
	  public void CambiarP14aP13() throws InterruptedException {
		//Se-validara-que-el-documento-se-concluya-de-inmediato.
		
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
		 
		driver.findElement(By.cssSelector("li > a > .selected")).click();
		driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Ley de nacionalización de bienes eclesiasticos.pdf");
		
		driver.findElement(By.id("idInvitedSignerName")).click();
		driver.findElement(By.id("idInvitedSignerName")).sendKeys("Invitado CATORCE A TRECE");
		driver.findElement(By.id("idInvitedSignerEmail")).click();
		//login.login(variablesGlobales.USER_A_ELIMINAR_INVITADO14);
		driver.findElement(By.id("idInvitedSignerEmail")).sendKeys("invitado.14.a.13@yopmail.com");
		
		driver.findElement(By.cssSelector("#btnSearchInv > #iniciar")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".ui-button:nth-child(2) > .ui-button-text")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).sendKeys("2");//VALIDAR SI SI ES EL NUMERO DEL TIPO DE FIRMA
		
		driver.findElement(By.cssSelector(".ui-button:nth-child(2) > .ui-button-text")).click();
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("iniciar")).click();
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
		
		
		//INGRESAR AL PORTAL AGENTE Y REALIZAR EL CAMBIO
		driver.get(variablesGlobales.HOME_PAGE_AGENTE);
	    driver.findElement(By.id("loginAction_authType_user_login")).click();
	    driver.findElement(By.id("loginAction_authType_user_login")).sendKeys("agente@seguridata.com");
	    driver.findElement(By.cssSelector(".label")).click();
	    driver.findElement(By.id("loginAction_authType_user_password")).click();
	    driver.findElement(By.id("loginAction_authType_user_password")).sendKeys("Selena310395.");
	    driver.findElement(By.cssSelector("#btnLogin > .label")).click();
	    
	    
	    
	    //FALTAN PASOS PARA CAMBIAR DE P14 A P13
	    //1. Ir a Editar Usuario
	    //2. Buscar usuario invitado.14.a.13@yopmail.com
	    //3. Seleccionar usuario a editar
	    //4. Seleccionar en el menu desplegable la opción Usuario Servicio
	    //5. Guardar cambios
	    
	    
	    //SALIR DE PORTAL AGENTE
	    Thread.sleep(2000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
		
	  //DESPUES, EL USUARIO FIRMANTE VALIDA QUE LE SOLICITE CONCLUIR LA PRECERTIFICACIÓN DE UN P13
	    driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("invitado.14.a.13@yopmail.com");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.id("idPasswordOld")).click();
	    driver.findElement(By.id("idPasswordOld")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("idPassword")).click();
	    driver.findElement(By.cssSelector(".rowPass:nth-child(6)")).click();
	    driver.findElement(By.id("idPassword")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("idPasswordVerify")).click();
	    driver.findElement(By.id("idPasswordVerify")).sendKeys("12121212Qw.");
	    driver.findElement(By.xpath("//div[2]/input[2]")).sendKeys("C:\\\\Users\\\\cuaht\\\\.eclipse\\\\PortalFirma\\\\src\\\\test\\\\java\\\\Archivos\\\\Importadas-CTF.cer");
	    driver.findElement(By.xpath("(//div[@id='divajuste2']/input[2])[2]")).sendKeys("C:\\\\Users\\\\cuaht\\\\.eclipse\\\\PortalFirma\\\\src\\\\test\\\\java\\\\Archivos\\\\Importadas-CTF.key");
	    driver.findElement(By.id("privateKeyPassword")).sendKeys("12121212Qw.");
	    //driver.findElement(By.id("iniciar")).click();
	    //Thread.sleep(3000);
	    //driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
	    Thread.sleep(1000);
		
	}
@AfterTest
 public void closeDriver() {
 driver.close();	
 }
}	