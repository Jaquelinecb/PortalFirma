package SubirDocumentos;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.variablesGlobales;
import driverSetup.DriverSetup;
public class BusquedaUsuarios {
	WebDriver driver = DriverSetup.setupDriver();
	
	
	@BeforeTest
	public void starWebDriver() throws InterruptedException {
		driver.get(variablesGlobales.HOME_PAGE);
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		
	}
	@Test(priority=1)
	  public void buscarUsuarios2Firmantesy1ObservadorHP() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("li > a > .selected")).click();
		driver.findElement(By.id("idSignerName")).click();
	    driver.findElement(By.id("idSignerName")).sendKeys("Usuario2");
	    driver.findElement(By.cssSelector("#btnSearch > #iniciar")).click();
	    driver.findElement(By.id("jqg_gridSearchSigner_1")).click();
	    driver.findElement(By.cssSelector("#btnAdd > #iniciar")).click();
	    driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).sendKeys("1");
	    driver.findElement(By.cssSelector(".ui-button:nth-child(2) > .ui-button-text")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("#btnClean > #iniciar")).click();
	    Thread.sleep(1000);
	   
		driver.findElement(By.id("idSignerName")).click();
	    driver.findElement(By.id("idSignerName")).sendKeys("Usuario3");//ALONDRA AGUILA FLORES
	    driver.findElement(By.cssSelector("#btnSearch > #iniciar")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("jqg_gridSearchSigner_1")).click();
	    driver.findElement(By.cssSelector("#btnAdd > #iniciar")).click();
	    driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).sendKeys("1");
	    driver.findElement(By.cssSelector(".ui-button:nth-child(2) > .ui-button-text")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("#btnClean > #iniciar")).click();
	   
	  
	    driver.findElement(By.id("idSignerName")).click();
	    driver.findElement(By.id("idSignerName")).sendKeys("Usuario4");//
	    driver.findElement(By.cssSelector("#btnSearch > #iniciar")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("jqg_gridSearchSigner_1")).click();
	    driver.findElement(By.cssSelector("#btnAdd > #iniciar")).click();
	    driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).sendKeys("2");
	    driver.findElement(By.cssSelector(".ui-button:nth-child(2) > .ui-button-text")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("#btnClean > #iniciar")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click(); 
	}
	
	@Test(priority=2)
	
	  public void AgregarHastaElLimiteDePermitidos() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");//Karina8
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("li > a > .selected")).click();
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
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).sendKeys("2");
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
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).sendKeys("2");
	    driver.findElement(By.cssSelector(".ui-button:nth-child(2) > .ui-button-text")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("#btnClean > #iniciar")).click();
		Thread.sleep(1000);

		
		driver.findElement(By.id("idSignerName")).click();
	    driver.findElement(By.id("idSignerName")).sendKeys("ALBA XKARAJAM MÉNDEZ");//ALICIA ZEPEDA LÓPEZ
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
	    driver.findElement(By.id("idSignerName")).sendKeys("ALEXA DÍAZ GONZALES");//ALEXA DÍAZ GONZALES
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
	    driver.findElement(By.id("idSignerName")).sendKeys("ALONDRA AGUILA FLORES");//WANDA MORALES ESCALANTE
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
	    driver.findElement(By.id("idSignerName")).sendKeys("ANA CASTILLO");
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
	    driver.findElement(By.id("idSignerName")).sendKeys("BERENICE XIMO QUEZADA");
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
	    driver.findElement(By.id("idSignerName")).sendKeys("BRENDA MÁRQUEZ ESPINO");
	    driver.findElement(By.cssSelector("#btnSearch > #iniciar")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("jqg_gridSearchSigner_1")).click();
	    driver.findElement(By.cssSelector("#btnAdd > #iniciar")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    Thread.sleep(3000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
	}
	
	
	@Test(priority=3)
	//@Test(enabled=false)
	  public void buscarUsuarioEmailExtenso() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("li > a > .selected")).click();
	    driver.findElement(By.id("idSignerEmail")).click();
	    driver.findElement(By.id("idSignerEmail")).sendKeys("dulce-maria-sujhey-hernandez-aguilar-invitado-prueba@yopmail.com");
	    //driver.findElement(By.id("idSignerEmail")).sendKeys("fernando-gutierrez-ramirez@seguridata.com"); //ORACLE
	    driver.findElement(By.cssSelector("#btnSearch > #iniciar")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("jqg_gridSearchSigner_1")).click();
	    driver.findElement(By.cssSelector("#btnAdd > #iniciar")).click();
	    driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).sendKeys("1");
	    driver.findElement(By.cssSelector(".ui-button:nth-child(2) > .ui-button-text")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("#btnClean > #iniciar")).click();
	    
	    Thread.sleep(2000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click(); 
	}
	
	@Test(priority=4)
	  public void buscarUsuarioPorRFC() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
		//driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
		
		driver.findElement(By.cssSelector("li > a > .selected")).click();
	    driver.findElement(By.id("idSignerRfc")).click();
	    driver.findElement(By.id("idSignerRfc")).sendKeys("CIMA860125TAA");
	    
	    
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
	    
	    Thread.sleep(2000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
	}
	

	
	@Test(priority=5)
	  public void buscarUsuarioPorEmail() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("li > a > .selected")).click();
	    driver.findElement(By.id("idSignerEmail")).click();
	    driver.findElement(By.id("idSignerEmail")).sendKeys("alexa-diaz@yopmail.com	"); 
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
	    
	    Thread.sleep(2000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
	}
	
	
	@Test(priority=6)
	  public void buscarUsuarioNoRegistrado() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("li > a > .selected")).click();
		driver.findElement(By.id("idSignerName")).click();
	    driver.findElement(By.id("idSignerName")).sendKeys("USUARIO NO REGISTRADO");
	    driver.findElement(By.cssSelector("#btnSearch > #iniciar")).click();
	    
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    
	    Thread.sleep(2000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();

	
	    
	}
	
	@Test(priority=7)
	  public void sinIngresarDatosBusqueda() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("li > a > .selected")).click();
	    driver.findElement(By.id("idSignerName")).click();
	    driver.findElement(By.cssSelector("#btnSearch > #iniciar")).click();
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