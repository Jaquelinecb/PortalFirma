/**/

package SubirDocumentos;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.variablesGlobales;
import driverSetup.DriverSetup;
public class PruebaConDocumentoEscaneado {
	WebDriver driver = DriverSetup.setupDriver();
	
	
	@BeforeTest
	public void starWebDriver() throws InterruptedException {
		driver.get(variablesGlobales.HOME_PAGE);
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		
	}
	@Test(priority=1)
	  public void Flujo12FirmantesConDocumentoEscaneado() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");//
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("li > a > .selected")).click();
		driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\\\Users\\\\cuaht\\\\.eclipse\\\\PortalFirma\\\\src\\\\test\\\\java\\\\Archivos\\\\Documento_3719.pdf");
		Thread.sleep(1000);
		
		driver.findElement(By.id("idSignerName")).click();
	    driver.findElement(By.id("idSignerName")).sendKeys("Usuario2");
	    driver.findElement(By.cssSelector("#btnSearch > #iniciar")).click();
	    driver.findElement(By.id("jqg_gridSearchSigner_1")).click();
	    driver.findElement(By.cssSelector("#btnAdd > #iniciar")).click();
	    driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).sendKeys("1");
	    driver.findElement(By.cssSelector(".ui-button:nth-child(2) > .ui-button-text")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("#btnClean > #iniciar")).click();
	    Thread.sleep(1000);
	   
		driver.findElement(By.id("idSignerName")).click();
	    driver.findElement(By.id("idSignerName")).sendKeys("Usuario3");
	    driver.findElement(By.cssSelector("#btnSearch > #iniciar")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("jqg_gridSearchSigner_1")).click();
	    driver.findElement(By.cssSelector("#btnAdd > #iniciar")).click();
	    driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).sendKeys("1");
	    driver.findElement(By.cssSelector(".ui-button:nth-child(2) > .ui-button-text")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("#btnClean > #iniciar")).click();
	   
	  
	    driver.findElement(By.id("idSignerName")).click();
	    driver.findElement(By.id("idSignerName")).sendKeys("Usuario4");
	    driver.findElement(By.cssSelector("#btnSearch > #iniciar")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("jqg_gridSearchSigner_1")).click();
	    driver.findElement(By.cssSelector("#btnAdd > #iniciar")).click();
	    driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).sendKeys("1");
	    driver.findElement(By.cssSelector(".ui-button:nth-child(2) > .ui-button-text")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("#btnClean > #iniciar")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.id("idSignerName")).click();
	    driver.findElement(By.id("idSignerName")).sendKeys("Usuario5");//YAIR CARRASCO ORTIZ/
	    driver.findElement(By.cssSelector("#btnSearch > #iniciar")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("jqg_gridSearchSigner_1")).click();
	    driver.findElement(By.cssSelector("#btnAdd > #iniciar")).click();
	    driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).sendKeys("1");
	    driver.findElement(By.cssSelector(".ui-button:nth-child(2) > .ui-button-text")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("#btnClean > #iniciar")).click();
		Thread.sleep(1000);

		
		driver.findElement(By.id("idSignerEmail")).click();
	    driver.findElement(By.id("idSignerEmail")).sendKeys("mireya-camarrillo@yopmail.com");//ALICIA ZEPEDA LÓPEZ
	    driver.findElement(By.cssSelector("#btnSearch > #iniciar")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("jqg_gridSearchSigner_1")).click();
	    driver.findElement(By.cssSelector("#btnAdd > #iniciar")).click();
	    driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).sendKeys("1");
	    driver.findElement(By.cssSelector(".ui-button:nth-child(2) > .ui-button-text")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("#btnClean > #iniciar")).click();
		Thread.sleep(1000);
				
		
		driver.findElement(By.id("idSignerEmail")).click();
	    driver.findElement(By.id("idSignerEmail")).sendKeys("gabriela.zarate@yopmail.com");
	    driver.findElement(By.cssSelector("#btnSearch > #iniciar")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("jqg_gridSearchSigner_1")).click();
	    driver.findElement(By.cssSelector("#btnAdd > #iniciar")).click();
	    driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).sendKeys("1");
	    driver.findElement(By.cssSelector(".ui-button:nth-child(2) > .ui-button-text")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("#btnClean > #iniciar")).click();
		Thread.sleep(1000);

		
		driver.findElement(By.id("idSignerEmail")).click();
	    driver.findElement(By.id("idSignerEmail")).sendKeys("h.segura@yopmail.com");//WANDA MORALES ESCALANTE
	    driver.findElement(By.cssSelector("#btnSearch > #iniciar")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("jqg_gridSearchSigner_1")).click();
	    driver.findElement(By.cssSelector("#btnAdd > #iniciar")).click();
	    driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).sendKeys("1");
	    driver.findElement(By.cssSelector(".ui-button:nth-child(2) > .ui-button-text")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("#btnClean > #iniciar")).click();
		Thread.sleep(1000);	
		
		driver.findElement(By.id("idSignerEmail")).click();
	    driver.findElement(By.id("idSignerEmail")).sendKeys("hortencia@seguridata.com");//WENDY ALEJANDRA BELLO ALCOCER
	    driver.findElement(By.cssSelector("#btnSearch > #iniciar")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("jqg_gridSearchSigner_1")).click();
	    driver.findElement(By.cssSelector("#btnAdd > #iniciar")).click();
	    driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).sendKeys("1");
	    driver.findElement(By.cssSelector(".ui-button:nth-child(2) > .ui-button-text")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("#btnClean > #iniciar")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("idSignerName")).click();
	    driver.findElement(By.id("idSignerName")).sendKeys("Samaria");
	    driver.findElement(By.cssSelector("#btnSearch > #iniciar")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("jqg_gridSearchSigner_1")).click();
	    driver.findElement(By.cssSelector("#btnAdd > #iniciar")).click();
	    driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).sendKeys("1");
	    driver.findElement(By.cssSelector(".ui-button:nth-child(2) > .ui-button-text")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("#btnClean > #iniciar")).click();
		Thread.sleep(1000);
		
		

			driver.findElement(By.id("iniciar")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".ui-button-text")).click();
			Thread.sleep(3000);
			
			//ENVIAR DOCUMENTO
		    driver.findElement(By.cssSelector("li:nth-child(3) .selected")).click();
		    Thread.sleep(3000);

		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
	}
	
	@Test(priority=2)
	  public void FirmaDeDocumento12Firmantes() throws InterruptedException {
		/*
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");//ORACLE
		//driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");//SQL
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
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.cssSelector(".negative > .label")).click();


	    
	    driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario2");////ORACLE
		//driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");//SQL
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
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.cssSelector(".negative > .label")).click();
	    
	    driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario3");////ORACLE
		//driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");//SQL
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
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.cssSelector(".negative > .label")).click();
	    
	    driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario4");////ORACLE
		//driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");//SQL
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
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.cssSelector(".negative > .label")).click();
	   
	    driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario5");////ORACLE
		//driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");//SQL
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
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.cssSelector(".negative > .label")).click();
	     
		
		
	    driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("mireya-camarrillo@yopmail.com");////ORACLE
		//driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");//SQL
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
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.cssSelector(".negative > .label")).click();
	    
	    driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("gabriela.zarate@yopmail.com");////ORACLE
		//driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");//SQL
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
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.cssSelector(".negative > .label")).click();
	    
		
	    driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("h.segura@yopmail.com");////ORACLE
		//driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");//SQL
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
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.cssSelector(".negative > .label")).click();

	    */
		
		
	    driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("hortencia@seguridata.com");////ORACLE
		//driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");//SQL
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
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.cssSelector(".negative > .label")).click();
	    
	    
	    
	    
	    
	    driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Samaria");////ORACLE
		//driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");//SQL
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
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    Thread.sleep(2000);

	     driver.findElement(By.cssSelector("li:nth-child(4) .selected")).click(); 
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//img[@title='Descargar documento ']")).click();
		 Thread.sleep(10000);
		 driver.findElement(By.cssSelector(".toggle")).click();
		 driver.findElement(By.cssSelector(".negative > .label")).click();   
	}
	
	    @Test(priority=3)
		  public void FirmanteLlavesExternas() throws InterruptedException {
	    driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("alexa-diaz@yopmail.com");////ORACLE
		//driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");//SQL
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
		

		driver.findElement(By.cssSelector("li > a > .selected")).click();
		driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\\\Users\\\\cuaht\\\\.eclipse\\\\PortalFirma\\\\src\\\\test\\\\java\\\\Archivos\\\\Documento_3719.pdf");
		Thread.sleep(1000);
		
		driver.findElement(By.id("iniciar")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		Thread.sleep(2000);
	    driver.findElement(By.cssSelector("li:nth-child(3) .selected")).click();
	    Thread.sleep(2000);
	    
	    
	    driver.findElement(By.xpath("//img[@title='Firmar documento']")).click();
	    Thread.sleep(2000);
	    
		driver.findElement(By.cssSelector("#keyFile input:nth-child(2)")).click();
	    driver.findElement(By.xpath("//input[@id='privkey_file']")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Angelina.key");
		    
		driver.findElement(By.cssSelector("#certFile input:nth-child(2)")).click();
		driver.findElement(By.xpath("//input[@id='certificate_file']")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Angelina.cer");
		  
		driver.findElement(By.id("txtPassword")).click();
		driver.findElement(By.id("txtPassword")).sendKeys("12121212Qw.");
		driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
	    Thread.sleep(2000);
	   
	    //VALIDAR DOCUMENTO CONCLUIDO
		 driver.findElement(By.cssSelector("li:nth-child(4) .selected")).click(); 
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//img[@title='Descargar documento ']")).click();
		 Thread.sleep(6000);
		 driver.findElement(By.cssSelector(".toggle")).click();
		 driver.findElement(By.cssSelector(".negative > .label")).click();
	    
	}
	
	
	 @AfterTest
	  public void closeDriver() {
		 driver.close();	
	  }
	 }	