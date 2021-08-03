package Invitados;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.variablesGlobales;
import driverSetup.DriverSetup;
import navPages.AgregarEliminarUsuario;
import navPages.AgregarEliminarUsuario2;
public class EliminarInvitado {
	WebDriver driver = DriverSetup.setupDriver();
	AgregarEliminarUsuario login = new AgregarEliminarUsuario(driver);
	AgregarEliminarUsuario2 loginB = new AgregarEliminarUsuario2(driver);
	
	@BeforeTest
	public void starWebDriver() throws InterruptedException {
		
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
	}
	@Test(priority=1)
	  public void AgregarInvitadoAEliminar() throws InterruptedException {
		driver.get(variablesGlobales.HOME_PAGE);
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
	 
		driver.findElement(By.cssSelector("li > a > .selected")).click();
		driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Ley de nacionalización de bienes eclesiasticos.pdf");
		driver.findElement(By.id("idInvitedSignerName")).click();
		driver.findElement(By.id("idInvitedSignerName")).sendKeys("Alejandro Mota Talonia");
		//driver.findElement(By.id("idInvitedSignerEmail")).click();
		login.login(variablesGlobales.USER_A_ELIMINAR_INVITADO14);
		//driver.findElement(By.id("idInvitedSignerEmail")).sendKeys("invitado.a.eliminar@yopmail.com");
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
	@Test(priority=2)
	  public void EliminarUsuarioInvitadoAntesDeFirmar() throws InterruptedException {
		driver.get(variablesGlobales.HOME_PAGE_AGENTE);
	    driver.findElement(By.id("loginAction_authType_user_login")).click();
	    driver.findElement(By.id("loginAction_authType_user_login")).sendKeys("agente@seguridata.com");
	    driver.findElement(By.cssSelector(".label")).click();
	    driver.findElement(By.id("loginAction_authType_user_password")).click();
	    driver.findElement(By.id("loginAction_authType_user_password")).sendKeys("Selena310395.");
	    driver.findElement(By.cssSelector("#btnLogin > .label")).click();
	    
	    
	    driver.findElement(By.cssSelector("li:nth-child(1) > div span")).click();
	    driver.findElement(By.cssSelector("li:nth-child(10) span")).click();
	    driver.findElement(By.id("employeeAction_findInvited_filter_email")).click();
	    driver.findElement(By.id("employeeAction_findInvited_filter_email")).sendKeys("alex-mota@yopmail.com");
	    driver.findElement(By.id("iniciar")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".tooltip")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".ui-button:nth-child(1)")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.cssSelector(".negative > .label")).click();
	    
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////77
	
	@Test(priority=3)
	 public void FirmaDocumentoDespuesDeEliminar() throws InterruptedException {
		driver.get(variablesGlobales.HOME_PAGE);
			driver.findElement(By.id("loginForm_user_login")).click();
			driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");//SQL
			//driver.findElement(By.id("loginForm_user_login")).sendKeys("Jaqueline");
			driver.findElement(By.id("btnLogin")).click();
			driver.findElement(By.id("loginForm_user_password")).click();
			driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
			driver.findElement(By.id("btnLogin")).click();
		    driver.findElement(By.cssSelector(".tooltip")).click();
		    driver.findElement(By.id("idShowPassword")).click();
		    driver.findElement(By.id("txtPass")).click();
		    driver.findElement(By.id("txtPass")).sendKeys("12121212Qw.");
		    driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
		    Thread.sleep(4000);
		    driver.findElement(By.cssSelector(".ui-button-text")).click();
		    Thread.sleep(2000);

		    driver.findElement(By.cssSelector("li:nth-child(4) .selected")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//img[@title=\'Descargar documento \']")).click();
		    Thread.sleep(7000);
			driver.findElement(By.cssSelector(".toggle")).click();
			driver.findElement(By.cssSelector(".negative > .label")).click();
	}
	
	@Test(priority=4)
	  public void PrimeroFirmarYLuegoEliminar() throws InterruptedException {
		driver.get(variablesGlobales.HOME_PAGE);
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");//SQL
		//driver.findElement(By.id("loginForm_user_login")).sendKeys("Jaqueline");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
	 
		driver.findElement(By.cssSelector("li > a > .selected")).click();
		driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Ley de nacionalización de bienes eclesiasticos.pdf");
		driver.findElement(By.id("idInvitedSignerName")).click();
		driver.findElement(By.id("idInvitedSignerName")).sendKeys("Israel Bautista Sanchez");
		login.login(variablesGlobales.USER_A_ELIMINAR_INVITADO14B);
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
//FIRMAR
		driver.findElement(By.cssSelector("li:nth-child(3) .selected")).click();
	    Thread.sleep(3000);
		driver.findElement(By.cssSelector(".tooltip")).click();
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.id("txtPass")).click();
	    driver.findElement(By.id("txtPass")).sendKeys("12121212Qw.");
	    driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
	}
	@Test(priority=5)
	  public void EliminarDespuesDequeYaSeFirmo() throws InterruptedException {
		driver.get(variablesGlobales.HOME_PAGE_AGENTE);
		driver.findElement(By.id("loginAction_authType_user_login")).click();
		driver.findElement(By.id("loginAction_authType_user_login")).sendKeys("agente@seguridata.com");
		driver.findElement(By.cssSelector(".label")).click();
		driver.findElement(By.id("loginAction_authType_user_password")).click();
		driver.findElement(By.id("loginAction_authType_user_password")).sendKeys("Selena310395.");
	    driver.findElement(By.cssSelector("#btnLogin > .label")).click();
		    
		    
		driver.findElement(By.cssSelector("li:nth-child(1) > div span")).click();
		driver.findElement(By.cssSelector("li:nth-child(10) span")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("employeeAction_findInvited_filter_email")).click();
		driver.findElement(By.id("employeeAction_findInvited_filter_email")).sendKeys("israel.bautista@yopmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("iniciar")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".tooltip")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ui-button:nth-child(1)")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
		}
	  
	@Test(priority=6)
	  public void ValidarQUEAunNoConcluyaDocumento() throws InterruptedException {
		driver.get(variablesGlobales.HOME_PAGE);
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");//SQL
		//driver.findElement(By.id("loginForm_user_login")).sendKeys("Jaqueline");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.cssSelector("li:nth-child(4) .selected")).click();
		Thread.sleep(4000);	
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
	}	
	
@AfterTest
 public void closeDriver() {
 driver.close();	
 }
}	