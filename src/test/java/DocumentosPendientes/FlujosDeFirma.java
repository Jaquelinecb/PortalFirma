package DocumentosPendientes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.openqa.selenium.WebElement;
import commonMethods.variablesGlobales;
import driverSetup.DriverSetup;

public class FlujosDeFirma {
	WebDriver driver = DriverSetup.setupDriver();
	
	@BeforeTest
	public void starWebDriver() throws InterruptedException {
		driver.get(variablesGlobales.HOME_PAGE);
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
	}
	
	@Test(priority=1)
	  public void dosFirmantes() throws InterruptedException {
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
		driver.findElement(By.id("idSignerName")).click();
	    driver.findElement(By.id("idSignerName")).sendKeys("Usuario2");
	    driver.findElement(By.cssSelector("#btnSearch > #iniciar")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("jqg_gridSearchSigner_1")).click();
	    driver.findElement(By.cssSelector("#btnAdd > #iniciar")).click();
	    driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).sendKeys("1");
	    driver.findElement(By.cssSelector(".ui-button:nth-child(2) > .ui-button-text")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("#btnClean > #iniciar")).click();
	    
		driver.findElement(By.id("iniciar")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("li:nth-child(3) .selected")).click();
	    Thread.sleep(3000);
	    
	    //FIRMA 1
	    driver.findElement(By.cssSelector(".tooltip")).click();
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.id("txtPass")).click();
	    driver.findElement(By.id("txtPass")).sendKeys("12121212Qw.");
	    driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    Thread.sleep(2000);
	   
	    driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.cssSelector(".negative > .label")).click();
	    
	    
	    //INICIAR SESIÓN DE SEGUNDO FIRMANTE
	    driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario2");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		
		 //FIRMA 
		driver.findElement(By.cssSelector(".tooltip")).click();
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.id("txtPass")).click();
	    driver.findElement(By.id("txtPass")).sendKeys("12121212Qw.");
	    driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.cssSelector("li:nth-child(4) .selected")).click(); 
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//img[@title='Descargar documento ']")).click();
	    Thread.sleep(5000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click(); 	
}
	@Test(priority=2)
	  public void dosFirmantesyObservador() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("li > a > .selected")).click();
		driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Ley de nacionalización de bienes eclesiasticos.pdf");
		driver.findElement(By.id("idSignerName")).click();
	    driver.findElement(By.id("idSignerName")).sendKeys("Usuario2");
	    driver.findElement(By.cssSelector("#btnSearch > #iniciar")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("jqg_gridSearchSigner_1")).click();
	    driver.findElement(By.cssSelector("#btnAdd > #iniciar")).click();
	    driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).sendKeys("1");
	    driver.findElement(By.cssSelector(".ui-button:nth-child(2) > .ui-button-text")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("#btnClean > #iniciar")).click();
	    
	    driver.findElement(By.id("idSignerName")).click();
	    driver.findElement(By.id("idSignerName")).sendKeys("Usuario3");
	    driver.findElement(By.cssSelector("#btnSearch > #iniciar")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("jqg_gridSearchSigner_1")).click();
	    driver.findElement(By.cssSelector("#btnAdd > #iniciar")).click();
	    driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).sendKeys("2");
	    driver.findElement(By.cssSelector(".ui-button:nth-child(2) > .ui-button-text")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("#btnClean > #iniciar")).click();
	    
		driver.findElement(By.id("iniciar")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("li:nth-child(3) .selected")).click();
	    Thread.sleep(3000);
	    
	    //FIRMA 1
	    driver.findElement(By.cssSelector(".tooltip")).click();
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.id("txtPass")).click();
	    driver.findElement(By.id("txtPass")).sendKeys("12121212Qw.");
	    driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    Thread.sleep(2000);
	   
	    driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.cssSelector(".negative > .label")).click();
	    
	    
	    
	  //Se valida que el Observador tambien tenga el documento pendiente
		
	  driver.findElement(By.id("loginForm_user_login")).click();
	  driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario3");
	  driver.findElement(By.id("btnLogin")).click();
	  driver.findElement(By.id("loginForm_user_password")).click();
	  driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
	  driver.findElement(By.id("btnLogin")).click();
	  Thread.sleep(2000);	    
	  driver.findElement(By.cssSelector("li:nth-child(3) .selected")).click();
	  driver.findElement(By.cssSelector(".tooltip")).click();
	  Thread.sleep(5000);  
	  
	  driver.findElement(By.cssSelector(".toggle")).click();
	  driver.findElement(By.cssSelector(".negative > .label")).click();
	    
	    
	  //INICIAR SESIÓN DE SEGUNDO FIRMANTE
	   driver.findElement(By.id("loginForm_user_login")).click();
	   driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario2");
	   driver.findElement(By.id("btnLogin")).click();
	   driver.findElement(By.id("loginForm_user_password")).click();
	   driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
	   driver.findElement(By.id("btnLogin")).click();
		
		//FIRMA 2
	  driver.findElement(By.cssSelector(".tooltip")).click();
	  driver.findElement(By.id("idShowPassword")).click();
	  driver.findElement(By.id("txtPass")).click();
	  driver.findElement(By.id("txtPass")).sendKeys("12121212Qw.");
	  driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.cssSelector(".ui-button-text")).click();
	  Thread.sleep(2000);
	    
	  driver.findElement(By.cssSelector("li:nth-child(4) .selected")).click(); 
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//img[@title='Descargar documento ']")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.cssSelector(".toggle")).click();
	  driver.findElement(By.cssSelector(".negative > .label")).click(); 	
		
		
		//Se valida que el Observador tambien tenga el documento Concluido
	 driver.findElement(By.id("loginForm_user_login")).click();
	 driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario3");
	 driver.findElement(By.id("btnLogin")).click();
	 driver.findElement(By.id("loginForm_user_password")).click();
	 driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
	 driver.findElement(By.id("btnLogin")).click();
	 Thread.sleep(2000);
	    
	 driver.findElement(By.cssSelector("li:nth-child(4) .selected")).click(); 
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//img[@title='Descargar documento ']")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.cssSelector(".toggle")).click();
	 driver.findElement(By.cssSelector(".negative > .label")).click();
}
	
	@Test(priority=3)
	  public void firmaTodosPerfiles() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1"); //FIRMANTE 4
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("li > a > .selected")).click();
		driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Ley de nacionalización de bienes eclesiasticos.pdf");
		driver.findElement(By.id("idSignerName")).click();
	    driver.findElement(By.id("idSignerName")).sendKeys("Usuario2"); //FIRMANTE 8
	    driver.findElement(By.cssSelector("#btnSearch > #iniciar")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("jqg_gridSearchSigner_1")).click();
	    driver.findElement(By.cssSelector("#btnAdd > #iniciar")).click();
	    driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).sendKeys("1");
	    driver.findElement(By.cssSelector(".ui-button:nth-child(2) > .ui-button-text")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("#btnClean > #iniciar")).click();
	    
	    driver.findElement(By.id("idSignerName")).click();
	    driver.findElement(By.id("idSignerName")).sendKeys("Hortencia"); //FIRMANTE 9
	    driver.findElement(By.cssSelector("#btnSearch > #iniciar")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("jqg_gridSearchSigner_1")).click();
	    driver.findElement(By.cssSelector("#btnAdd > #iniciar")).click();
	    driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).sendKeys("1");
	    driver.findElement(By.cssSelector(".ui-button:nth-child(2) > .ui-button-text")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("#btnClean > #iniciar")).click();
	    
	    
	    driver.findElement(By.id("idSignerName")).click();
	    driver.findElement(By.id("idSignerName")).sendKeys("Maribel"); //FIRMANTE 13
	    driver.findElement(By.cssSelector("#btnSearch > #iniciar")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("jqg_gridSearchSigner_1")).click();
	    driver.findElement(By.cssSelector("#btnAdd > #iniciar")).click();
	    driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).sendKeys("1");
	    driver.findElement(By.cssSelector(".ui-button:nth-child(2) > .ui-button-text")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("#btnClean > #iniciar")).click();
	    
	    
	    
	    driver.findElement(By.id("iniciar")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("li:nth-child(3) .selected")).click();
	    Thread.sleep(2000);
	    
	    //FIRMA 1
	    driver.findElement(By.cssSelector(".tooltip")).click();
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.id("txtPass")).click();
	    driver.findElement(By.id("txtPass")).sendKeys("12121212Qw.");
	    driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    Thread.sleep(2000);
	   
	    driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.cssSelector(".negative > .label")).click();
	    
	    //INICIAR SESIÓN DE PERFIL 8
	    driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Carlos");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
		    
	    driver.findElement(By.xpath("//img[@title=\'Firmar documento\']")).click();
	    Thread.sleep(8000); //INGRESAR FIRMA BIOMETRICA
	    
	    driver.findElement(By.id("saveSignCaptureVerify")).click();
	    driver.findElement(By.id("firmanteName")).click();
	    driver.findElement(By.id("firmanteName")).sendKeys("CARLOS LUNA");//VALIDAR NOMBRE
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".ui-button:nth-child(1)")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    Thread.sleep(2000);
	   
	    driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.cssSelector(".negative > .label")).click();
	    
	    //INICIAR SESIÓN DE PERFIL 9 - ALBA
	    driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Alba");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
		 
	    driver.findElement(By.xpath("//img[@title='Firmar documento']")).click();
	    Thread.sleep(3000);
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
	    
	    
	    //INICIAR SESIÓN DE PERFIL 13 - BERENICE
	    driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Berenice");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		
		 //FIRMA 
		driver.findElement(By.cssSelector(".tooltip")).click();
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.id("txtPass")).click();
	    driver.findElement(By.id("txtPass")).sendKeys("12345678a");
	    driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.cssSelector("li:nth-child(4) .selected")).click(); 
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//img[@title='Descargar documento ']")).click();
	    Thread.sleep(5000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click(); 	
}	
	
	@Test(priority=4)
	  public void flujoConcurrente() throws InterruptedException {
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
		driver.findElement(By.id("idSignerName")).click();
	    driver.findElement(By.id("idSignerName")).sendKeys("Usuario dos"); //FIRMANTE
	    driver.findElement(By.cssSelector("#btnSearch > #iniciar")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("jqg_gridSearchSigner_1")).click();
	    driver.findElement(By.cssSelector("#btnAdd > #iniciar")).click();
	    driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).sendKeys("1");
	    driver.findElement(By.cssSelector(".ui-button:nth-child(2) > .ui-button-text")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("#btnClean > #iniciar")).click();
	    
	    driver.findElement(By.id("idSignerName")).click();
	    driver.findElement(By.id("idSignerName")).sendKeys("Usuario tres"); //FIRMANTE
	    driver.findElement(By.cssSelector("#btnSearch > #iniciar")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("jqg_gridSearchSigner_1")).click();
	    driver.findElement(By.cssSelector("#btnAdd > #iniciar")).click();
	    driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).sendKeys("1");
	    driver.findElement(By.cssSelector(".ui-button:nth-child(2) > .ui-button-text")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("#btnClean > #iniciar")).click();
	    
	    
	    driver.findElement(By.id("idSignerName")).click();
	    driver.findElement(By.id("idSignerName")).sendKeys("Usuario cuatro"); //OBSERVADOR
	    driver.findElement(By.cssSelector("#btnSearch > #iniciar")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("jqg_gridSearchSigner_1")).click();
	    driver.findElement(By.cssSelector("#btnAdd > #iniciar")).click();
	    driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).sendKeys("2");
	    driver.findElement(By.cssSelector(".ui-button:nth-child(2) > .ui-button-text")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("#btnClean > #iniciar")).click();
	    
	    driver.findElement(By.id("signConcurrente")).click();
	    
		driver.findElement(By.id("iniciar")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("li:nth-child(3) .selected")).click();
	    Thread.sleep(3000);
	    
	    //FIRMA 1
	    driver.findElement(By.cssSelector(".tooltip")).click();
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.id("txtPass")).click();
	    driver.findElement(By.id("txtPass")).sendKeys("12121212Qw.");
	    driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    Thread.sleep(2000);
	   
	    driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.cssSelector(".negative > .label")).click();
	    
	    
	    //OBSERVADOR
	    //VALIDAR QUE AL OBSERVADOR LE MUESTRE EL DOCUMENTO
	    driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario4");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.cssSelector(".tooltip")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.cssSelector(".negative > .label")).click();
	    
	    
		//FIRMANTE USUARIO3
	    driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario3");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.cssSelector(".tooltip")).click();
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.id("txtPass")).click();
	    driver.findElement(By.id("txtPass")).sendKeys("12121212Qw.");
	    driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
		
		
		//FIRMANTE USUARIO2
	    driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario2");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.cssSelector(".tooltip")).click();
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.id("txtPass")).click();
	    driver.findElement(By.id("txtPass")).sendKeys("12121212Qw.");
	    driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.cssSelector("li:nth-child(4) .selected")).click(); 
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//img[@title='Descargar documento ']")).click();
	    Thread.sleep(5000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click(); 	
		
		
		//VALIDAR QUE AL OBSERVADOR LE MUESTRE EL DOCUMENTO
	    driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario4");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
	    
	    driver.findElement(By.cssSelector("li:nth-child(4) .selected")).click(); 
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//img[@title='Descargar documento ']")).click();
	    Thread.sleep(5000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click(); 	
		
		
}
	
	@Test(priority=5)
	  public void RLalInicio() throws InterruptedException {
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
		
		
		driver.findElement(By.id("routeSelect")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("routeSelect"));
	      dropdown.findElement(By.xpath("//option[. = 'Ruta Solo RL al Inicio]")).click();
	    }
	    driver.findElement(By.id("routeSelect")).click();
	    
		driver.findElement(By.id("iniciar")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("li:nth-child(3) .selected")).click();
	    Thread.sleep(3000);
	    
	    //FIRMA 
	    driver.findElement(By.cssSelector(".tooltip")).click();
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.id("txtPass")).click();
	    driver.findElement(By.id("txtPass")).sendKeys("12121212Qw.");
	    driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    Thread.sleep(2000);
	   
	    driver.findElement(By.cssSelector("li:nth-child(4) .selected")).click(); 
	    Thread.sleep(2000);
	    
	    //VALIDAR QUE EL DOCUMENTO HAYA SUIDO FIRMADO POR EL RL AL INICIO
	    driver.findElement(By.xpath("//img[@title='Descargar documento ']")).click();
	    Thread.sleep(5000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();   
	}
	
	@Test(priority=6)
	  public void RLalFinal() throws InterruptedException {
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
		
		
		driver.findElement(By.id("routeSelect")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("routeSelect"));
	      dropdown.findElement(By.xpath("//option[. = 'Ruta Solo RL al Final']")).click();
	    }
	    driver.findElement(By.id("routeSelect")).click();
	    
		driver.findElement(By.id("iniciar")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("li:nth-child(3) .selected")).click();
	    Thread.sleep(3000);
	    
	    //FIRMA 
	    driver.findElement(By.cssSelector(".tooltip")).click();
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.id("txtPass")).click();
	    driver.findElement(By.id("txtPass")).sendKeys("12121212Qw.");
	    driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    Thread.sleep(2000);
	   
	    //VALIDAR QUE EL DOCUMENTO HAYA SUIDO FIRMADO POR EL RL AL INICIO
	    driver.findElement(By.cssSelector("li:nth-child(4) .selected")).click(); 
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//img[@title='Descargar documento ']")).click();
	    Thread.sleep(5000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();   
	}
	
	@Test(priority=7)
	  public void Ruta_SinRL() throws InterruptedException {
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
		
		
		driver.findElement(By.id("routeSelect")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("routeSelect"));
	      dropdown.findElement(By.xpath("//option[. = 'Ruta solo Usuario2']")).click();
	    }
	    driver.findElement(By.id("routeSelect")).click();
	    
		driver.findElement(By.id("iniciar")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("li:nth-child(3) .selected")).click();
	    Thread.sleep(3000);
	    
	    //FIRMA 
	    driver.findElement(By.cssSelector(".tooltip")).click();
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.id("txtPass")).click();
	    driver.findElement(By.id("txtPass")).sendKeys("12121212Qw.");
	    driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    Thread.sleep(2000);
	    
	    Thread.sleep(5000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click(); 
		
		//FIRMA DEL PARTICIPANTE DE LA RUTA
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario2");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector(".tooltip")).click();
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.id("txtPass")).click();
	    driver.findElement(By.id("txtPass")).sendKeys("12121212Qw.");
	    driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    Thread.sleep(2000);
		
	    //VALIDAR QUE EL DOCUMENTO HAYA CONCLUIDO
	    driver.findElement(By.cssSelector("li:nth-child(4) .selected")).click(); 
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//img[@title='Descargar documento ']")).click();
	    Thread.sleep(5000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();   
	}
	
@AfterTest
public void closeDriver() {
	driver.close();	
 }
}	